package no_11726;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
문제-11726 (실버3): 2×n 타일링
- 크기 2×n 직사각형을
- 2×1, 1×2 타일로 채우는 경우의 수를 구한다.
- 결과는 10007로 나눈 나머지를 출력한다.

주요 메서드
- BufferedReader : 입력 처리
- DP 배열(dp) : 각 길이별 경우의 수 저장

주요 알고리즘
- 동적 계획법 (DP)
- 오른쪽 끝을 기준으로 경우를 분리
  1) 세로 타일 1개로 끝나는 경우 → dp[n-1]
  2) 가로 타일 2개로 끝나는 경우 → dp[n-2]

점화식
- dp[n] = dp[n-1] + dp[n-2]

초기값
- dp[1] = 1
- dp[2] = 2

시간 복잡도
- O(n)

공간 복잡도
- O(n)
*/

public class No11726 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] dp = new int[n + 1];
        dp[1] = 1;
        if (n >= 2) dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 10007;
        }

        System.out.println(dp[n]);
    }
}
