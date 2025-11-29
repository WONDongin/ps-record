package no_9095;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
문제-9095 (실버3): 1,2,3 더하기
- 정수 4를 1, 2, 3의 합으로 나타내는 방법은 총 7가지가 있다.
- 각 테스트 케이스마다, n을 1, 2, 3의 합으로 나타내는 방법의 수를 출력

주요 메서드
`dp[i] = dp[i-1] + dp[i-2] + dp[i-3]`
- `dp[i]`: 정수 i를 1, 2, 3의 합으로 나타내는 경우의 수
- 각 `dp[i]`는 이전 3개의 값을 더한 결과
예시: `dp[4] = dp[3] + dp[2] + dp[1] = 4 + 2 + 1 = 7`
- 점화식 기반의 Bottom-Up DP

주요 알고리즘

사전 계산 (Precomputation)
- 입력 제한이 작기 때문에 (1 ≤ n ≤ 11) 모든 경우를 미리 계산
- 테스트 케이스 입력마다 반복 계산 없이 바로 결과 출력 가능
*/
public class No9095 {
    public static void main(String[] args) throws IOException {
        // 입력을 빠르게 받기 위한 BufferedReader 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 테스트 케이스 개수
        int T = Integer.parseInt(br.readLine());

        // 최대 11까지 미리 dp 계산 (1 ≤ n ≤ 11)
        int[] dp = new int[12];
        dp[0] = 1; // 기본값
        dp[1] = 1; // 1
        dp[2] = 2; // 1+1, 2
        dp[3] = 4; // 1+1+1, 1+2, 2+1, 3

        for (int i = 4; i <= 11; i++) {
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }

        // 각 테스트 케이스에 대해 결과 출력
        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            System.out.println(dp[n]);
        }
    }
}
