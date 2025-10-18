package no_1463;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
문제 (실버4) : 1로 만들기
- 정수 X를 1로 만들기 위해 다음 세 가지 연산 중 최소 횟수 구하기
- X가 3으로 나누어 떨어지면 3으로 나눈다
- X가 2로 나누어 떨어지면 2로 나눈다

DP (Dynamic Programming, Bottom-Up) 사용
dp[i]: 정수 i를 1로 만드는 최소 연산 횟수

점화식 : 이전 결과(dp)를 이용해서, 더 큰 수의 최소 연산 횟수 구하기
dp[i] = dp[i - 1] + 1
if (i % 2 == 0) dp[i] = min(dp[i], dp[i / 2] + 1)
if (i % 3 == 0) dp[i] = min(dp[i], dp[i / 3] + 1)
*/
public class No1463 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());

        int[] dp = new int[X + 1];
        dp[1] = 0; // 1을 만들기 위해 필요한 연산 횟수는 0

        for (int i = 2; i <= X; i++) {
            dp[i] = dp[i - 1] + 1; // 기본: 1을 빼는 경우
            if (i % 2 == 0)
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            if (i % 3 == 0)
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
        }

        System.out.println(dp[X]);
    }
}