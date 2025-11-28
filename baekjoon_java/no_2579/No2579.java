package no_2579;

import java.util.Scanner;

/*
문제-2579 (실버3): 계단 오르기
- 게임에서 얻을 수 있는 총 점수의 최댓값을 출력
- 연속된 3계단 밟기 금지
- 마지막 계단은 반드시 밟아야 함

주요 메서드

- `getMaxScore(int[] score)`
  - 입력된 계단 점수 배열에 대해 DP 배열을 구성
  - 점화식: `dp[i] = max(dp[i-2], dp[i-3] + score[i-1]) + score[i]`

주요 알고리즘

- 초기값 처리 : 계단이 1, 2, 3개일 경우는 직접 처리
```
dp[0] = score[0]
dp[1] = score[0] + score[1]
dp[2] = max(score[0] + score[2], score[1] + score[2])
```
*/
public class No2579 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 계단의 수
        int[] score = new int[n]; // 각 계단의 점수

        for(int i = 0; i < n; i++){ // 배열 점수 추가
            score[i] = sc.nextInt();
        }

        System.out.println(getMaxScore(score));
    }

    // DP를 이용하여 최대 점수계산 메서드
    private static int getMaxScore(int[] score) {
        int n = score.length;
        if (n == 1) return score[0];
        if (n == 2) return score[0] + score[1];

        int[] dp = new int[n];

        // 초기값 설정
        dp[0] = score[0];
        dp[1] = score[0] + score[1];
        dp[2] = Math.max(score[0] + score[2], score[1] + score[2]);

        // DP 점화식 적용
        for (int i = 3; i < n; i++) {
            dp[i] = Math.max(dp[i - 2], dp[i - 3] + score[i - 1]) + score[i];
        }

        return dp[n - 1]; // 마지막 계단을 반드시 밟아야 하므로 dp[n-1] 반환
    }
}
