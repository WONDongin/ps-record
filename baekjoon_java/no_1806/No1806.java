package no_1806;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
문제-1806 (골드4): 부분합
- 길이 N의 자연수 배열이 주어질 때
- 연속된 부분 배열의 합이 S 이상이 되는 경우 중
- 가장 짧은 길이를 구한다.
- 조건을 만족하는 부분 배열이 없으면 0 출력

주요 메서드
- BufferedReader / StringTokenizer : 입력 처리
- 투 포인터(left, right) : 연속 구간 관리

주요 알고리즘
- 투 포인터 (슬라이딩 윈도우)
- sum >= S 인 경우:
  - 현재 구간 길이 기록
  - left 이동하여 더 짧은 구간 탐색
- sum < S 인 경우:
  - right 이동하여 구간 확장

시간 복잡도
- O(N) (left, right 포인터 각각 최대 N번 이동)

공간 복잡도
- O(1)

탐색 흐름
sum < S  → right 확장
sum >= S → 길이 갱신 + left 축소
확장 불가 && sum < S → 종료
*/

public class No1806 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        int left = 0;
        int right = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;

        while (true) {
            if (sum >= S) {
                minLen = Math.min(minLen, right - left);
                sum -= arr[left];
                left++;
            } else {
                if (right == N) break;
                sum += arr[right];
                right++;
            }
        }

        System.out.println(minLen == Integer.MAX_VALUE ? 0 : minLen);
    }
}
