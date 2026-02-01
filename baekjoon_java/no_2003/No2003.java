package no_2003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
문제-2003 (실버4): 수들의 합 2
- 길이 N의 자연수 배열에서
- 연속된 부분 수열의 합이 M이 되는 경우의 수를 구한다.

주요 메서드
- BufferedReader / StringTokenizer : 입력 처리
- 투 포인터(left, right) : 연속 부분 수열 범위 관리

주요 알고리즘
- 투 포인터 (슬라이딩 윈도우)
- 자연수 배열이므로 포인터는 단방향 이동
- 시간 복잡도: O(N)
- 공간 복잡도: O(1)

탐색 흐름
sum < M  → right 이동하며 값 추가
sum >= M → left 이동하며 값 제거
sum == M → 경우의 수 증가
*/

public class No2003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        int left = 0;
        int right = 0;
        int sum = 0;
        int count = 0;

        while (true) {
            if (sum >= M) {
                if (sum == M) count++;
                sum -= arr[left];
                left++;
            } else {
                if (right == N) break;
                sum += arr[right];
                right++;
            }
        }

        System.out.println(count);
    }
}
