package no_4008;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/*
문제-4008 (플래티넘1): 특공대

문제 요약
- 병사들을 연속된 구간으로 나누어 특공대를 구성
- 각 구간의 합 x에 대해 점수 f(x) = ax^2 + bx + c
- 전체 점수의 최댓값을 구하는 문제

접근 방법
- 구간 합 계산을 위해 누적합 S[i] 사용
- dp[i] = 1 ~ i까지 고려했을 때 최대 점수
- dp[i] = max(dp[j] + f(S[i] - S[j])) 형태
- 식을 전개하여 S[i] 기준 직선 최대값 문제로 변환
- Convex Hull Trick (CHT) 적용

핵심 아이디어
- 점화식 전개
  dp[i] = aS[i]^2 + bS[i] + c + max( (-2aS[j]) * S[i] + (dp[j] + aS[j]^2 - bS[j]) )
- 직선 정의
  기울기 m = -2aS[j]
  절편 k = dp[j] + aS[j]^2 - bS[j]
- x = S[i]에서 최댓값을 빠르게 구하기 위해 CHT 사용
- a < 0 → 기울기 단조 증가 → deque + pointer 최적화 가능

주요 메서드
- add(m, k): 새로운 직선 추가 (불필요 직선 제거)
- query(x): 현재 x에서 최댓값 반환

처리 흐름
- 입력
- 누적합 배열 생성
- 초기 직선 (j=0) 추가
- i = 1 ~ N 반복
  → CHT에서 최적값 조회
  → dp[i] 계산
  → 새로운 직선 추가
- dp[N] 출력

시간 복잡도
- O(N)
*/
import java.io.*;
import java.util.*;

public class No4008 {

    static class Line {
        long m, b;
        Line(long m, long b) {
            this.m = m;
            this.b = b;
        }
    }

    static class CHT {
        ArrayList<Line> lines = new ArrayList<>();
        int ptr = 0;

        // l2가 필요 없는지 판단 (double 없이 처리)
        boolean isBad(Line l1, Line l2, Line l3) {
            return (l3.b - l1.b) * (l1.m - l2.m)
                    <= (l2.b - l1.b) * (l1.m - l3.m);
        }

        void add(long m, long b) {
            Line newLine = new Line(m, b);

            while (lines.size() >= 2 &&
                    isBad(lines.get(lines.size() - 2),
                            lines.get(lines.size() - 1),
                            newLine)) {
                lines.remove(lines.size() - 1);
            }

            lines.add(newLine);

            if (ptr >= lines.size()) ptr = lines.size() - 1;
        }

        long query(long x) {
            if (ptr >= lines.size()) ptr = lines.size() - 1;

            while (ptr + 1 < lines.size() &&
                    lines.get(ptr + 1).m * x + lines.get(ptr + 1).b
                            >= lines.get(ptr).m * x + lines.get(ptr).b) {
                ptr++;
            }

            return lines.get(ptr).m * x + lines.get(ptr).b;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long c = Long.parseLong(st.nextToken());

        long[] S = new long[N + 1];
        long[] dp = new long[N + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            S[i] = S[i - 1] + Long.parseLong(st.nextToken());
        }

        CHT cht = new CHT();

        // 초기 직선 (j = 0)
        cht.add(0, 0);

        for (int i = 1; i <= N; i++) {
            long x = S[i];

            long best = cht.query(x);

            dp[i] = a * x * x + b * x + c + best;

            long m = -2 * a * x;
            long k = dp[i] + a * x * x - b * x;

            cht.add(m, k);
        }

        System.out.println(dp[N]);
    }
}