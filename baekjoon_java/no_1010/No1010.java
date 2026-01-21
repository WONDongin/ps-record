package no_1010;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
문제-1010 (실버5): 다리 놓기
- 각 테스트 케이스에 대해 주어진 조건하에 다리를 지을 수 있는 경우의 수를 출력
- 서쪽 N개, 동쪽 M개 사이트가 주어지며 다리는 서로 교차할 수 없음

주요 메서드

- `BufferedReader.readLine()` : 테스트 케이스 수 및 N, M 입력 처리
- `StringTokenizer` : 한 줄에 입력된 두 정수 분리
- `int[][] dp` : 조합 값을 저장하기 위한 DP 테이블
- 이중 for문 : 파스칼 삼각형 기반 DP 테이블 구성

주요 알고리즘

- 조합(Combination)
- 서쪽의 N개 다리는 반드시 모두 연결되어야 함
- 동쪽의 M개 중에서 N개를 선택하면 교차하지 않는 연결 방법은 항상 1가지로 고정됨
- 따라서 문제는 조합 문제로 단순화됨

그래프 입력
↓
DP 테이블 생성 (31 × 31)
↓
DP 초기값 설정

dp[0][i] = 1

dp[i][i] = 1
↓
DP 점화식 적용 (파스칼 삼각형)

dp[n][m] = dp[n][m-1] + dp[n-1][m-1]
↓
각 테스트 케이스마다 dp[N][M] 출력
*/
public class No1010 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        int[][] dp = new int[31][31];

        // 초기값 설정
        for (int i = 0; i <= 30; i++) {
            dp[0][i] = 1;  // 아무것도 선택하지 않는 경우
            dp[i][i] = 1; // 모두 선택하는 경우
        }

        // DP 테이블 채우기 (파스칼 삼각형)
        for (int n = 1; n <= 30; n++) {
            for (int m = n + 1; m <= 30; m++) {
                dp[n][m] = dp[n][m - 1] + dp[n - 1][m - 1];
            }
        }

        // 테스트 케이스 처리
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            System.out.println(dp[n][m]);
        }
    }
}
