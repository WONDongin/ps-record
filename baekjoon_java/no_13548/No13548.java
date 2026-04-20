package no_13548;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
/*
문제-13548 (에메랄드): 수열과 쿼리 6
- 수열이 주어지고 여러 구간 [L, R]에 대해
- 해당 구간에서 가장 많이 등장한 수의 "등장 횟수"를 구하는 문제

접근 방법
- 매 쿼리마다 구간을 직접 계산하면 O(N*M) → 시간 초과
- Mo's Algorithm을 사용하여 구간을 효율적으로 이동하면서 처리
- 구간 이동 시 add/remove 연산으로 상태를 유지

핵심 아이디어
- count[x] = 값 x의 등장 횟수
- freq[k] = k번 등장하는 값의 개수
- maxFreq = 현재 구간에서의 최빈값 등장 횟수

- add(x)
  → count 증가
  → freq 갱신
  → maxFreq 갱신

- remove(x)
  → count 감소
  → freq 갱신
  → maxFreq 필요 시 감소

처리 흐름
- 입력
- Query 객체 배열 생성 (l, r, idx)
- Mo 기준으로 쿼리 정렬 (L 블록 → R 오름차순)
- curL, curR로 구간 유지하면서 이동
    → add / remove 수행
- 각 쿼리 결과를 answer[idx]에 저장
- 결과 출력

주요 메서드
- add(int x): 값 추가 시 count, freq, maxFreq 갱신
- remove(int x): 값 제거 시 count, freq, maxFreq 갱신
- Mo 정렬: sqrt(N) 기준 블록 정렬

주요 알고리즘
- Mo's Algorithm (오프라인 쿼리 처리)
- 배열 기반 빈도 관리

처리 흐름 (화살표)
입력
→ Query 배열 생성
→ Mo 정렬
→ curL, curR 초기화
→ 쿼리 순회
    → 구간 이동 (add / remove)
    → maxFreq 저장
→ 출력
*/
public class No13548 {

    static class Query {
        int l, r, idx;

        public Query(int l, int r, int idx) {
            this.l = l;
            this.r = r;
            this.idx = idx;
        }
    }

    static int[] arr;
    static int[] count;   // 값별 등장 횟수
    static int[] freq;    // 등장 횟수별 개수
    static int maxFreq;
    static int sqrtN;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int m = Integer.parseInt(br.readLine());
        Query[] queries = new Query[m];
        int[] answer = new int[m];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken()) - 1;
            int r = Integer.parseInt(st.nextToken()) - 1;
            queries[i] = new Query(l, r, i);
        }

        sqrtN = (int) Math.sqrt(n);
        count = new int[1000001];
        freq = new int[n + 1];
        maxFreq = 0;

        Arrays.sort(queries, (a, b) -> {
            int blockA = a.l / sqrtN;
            int blockB = b.l / sqrtN;

            if (blockA != blockB) {
                return blockA - blockB;
            }
            return a.r - b.r;
        });

        int curL = 0;
        int curR = -1;

        for (Query q : queries) {
            while (curL > q.l) add(arr[--curL]);
            while (curR < q.r) add(arr[++curR]);
            while (curL < q.l) remove(arr[curL++]);
            while (curR > q.r) remove(arr[curR--]);

            answer[q.idx] = maxFreq;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            sb.append(answer[i]).append("\n");
        }

        System.out.print(sb);
    }

    static void add(int x) {
        int c = count[x];
        freq[c]--;
        count[x]++;
        freq[c + 1]++;

        maxFreq = Math.max(maxFreq, count[x]);
    }

    static void remove(int x) {
        int c = count[x];
        freq[c]--;
        count[x]--;
        freq[c - 1]++;

        if (freq[maxFreq] == 0) {
            maxFreq--;
        }
    }
}