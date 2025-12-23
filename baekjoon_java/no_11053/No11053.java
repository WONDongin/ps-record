package no_11053;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
문제-11053 (실버2): 가장 긴 증가하는 부분 수열
주요 메서드

- arr[i] : 입력 수열
- dp[i] : i번째 원소로 끝나는 LIS 최대 길이

주요 알고리즘

- DP (O(N²))
- 점화식 `dp[i] = max(dp[j] + 1)`
- (단, j < i 이고 arr[j] < arr[i])
*/
public class No11053 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] dp = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            dp[i] = 1; // 초기값: 자기 자신만 선택했을 때 길이 1
        }

        // LIS DP
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        // 결과는 dp 배열의 최댓값
        int answer = 0;
        for (int i = 0; i < N; i++) {
            answer = Math.max(answer, dp[i]);
        }

        System.out.println(answer);
    }
}
