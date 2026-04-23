package no_1149;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
문제-1149 (실버1): RGB 거리

문제 요약
- N개의 집이 있고, 각 집을 빨강/초록/파랑 중 하나로 칠해야 함
- 인접한 집은 같은 색을 사용할 수 없음
- 각 집마다 색칠 비용이 주어짐
- 전체 최소 비용을 구하는 문제

접근 방법
- DP 배열 사용
- dp[i][color] = i번째 집까지 칠했을 때, i번째 집을 color로 칠한 최소 비용
- 이전 집과 색이 같으면 안되므로, 다른 색 중 최소값 선택

핵심 아이디어
- 현재 색을 기준으로 이전 색 2개 중 최소값 선택
- 점화식:
  dp[i][0] = min(dp[i-1][1], dp[i-1][2]) + cost[i][0]
  dp[i][1] = min(dp[i-1][0], dp[i-1][2]) + cost[i][1]
  dp[i][2] = min(dp[i-1][0], dp[i-1][1]) + cost[i][2]

주요 메서드
- Math.min()을 활용한 최소값 계산

처리 흐름
- 입력
- cost 배열 저장
- dp[0] 초기화
- i = 1 ~ N-1 반복하며 dp 갱신
- 마지막 집에서 최소값 출력

시간 복잡도
- O(N)
*/
public class No1149 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[][] cost = new int[N][3];
        int[][] dp = new int[N][3];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            cost[i][0] = Integer.parseInt(st.nextToken());
            cost[i][1] = Integer.parseInt(st.nextToken());
            cost[i][2] = Integer.parseInt(st.nextToken());
        }

        // 초기값
        dp[0][0] = cost[0][0];
        dp[0][1] = cost[0][1];
        dp[0][2] = cost[0][2];

        for (int i = 1; i < N; i++) {
            dp[i][0] = Math.min(dp[i-1][1], dp[i-1][2]) + cost[i][0];
            dp[i][1] = Math.min(dp[i-1][0], dp[i-1][2]) + cost[i][1];
            dp[i][2] = Math.min(dp[i-1][0], dp[i-1][1]) + cost[i][2];
        }

        int result = Math.min(dp[N-1][0],
                Math.min(dp[N-1][1], dp[N-1][2]));

        System.out.println(result);
    }
}
