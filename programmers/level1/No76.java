package level1;
/*
문제: [PCCE 기출문제] 10번 / 공원

로직
- 공원을 순회하며 빈칸으로 이루어진 정사각형의 최대 크기를 구한다.
- 최대 크기 이하인 돗자리 중 가장 큰 한 변의 길이를 반환한다.
- 깔 수 있는 돗자리가 없으면 -1을 반환한다.

핵심 구현
- dp[i][j]는 현재 칸을 오른쪽 아래 꼭짓점으로 하는
  빈 정사각형의 최대 한 변 길이를 의미한다.
- 현재 칸이 빈칸이면 위, 왼쪽, 왼쪽 위 DP 값의 최솟값에 1을 더한다.
- DP 배열을 공원보다 한 칸 크게 만들어 경계 처리를 단순화한다.

포인트
- 사람이 있는 칸의 DP 값은 0으로 유지한다.
- 공원의 최대 빈 공간 크기가 아닌 실제 보유한 돗자리 크기를 반환한다.
- 문자열 비교에는 equals()를 사용한다.

회고
- DP를 활용해 각 위치에서 정사각형 내부를 반복 검사하지 않고
  공원을 한 번 순회하여 최대 빈 정사각형의 크기를 구했다.
*/
public class No76 {
    class Solution {
        public int solution(int[] mats, String[][] park) {
            int rows = park.length;
            int cols = park[0].length;

            int[][] dp = new int[rows + 1][cols + 1];
            int maxSize = 0;

            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= cols; j++) {
                    if ("-1".equals(park[i - 1][j - 1])) {
                        dp[i][j] = Math.min(
                                dp[i - 1][j - 1],
                                Math.min(dp[i - 1][j], dp[i][j - 1])
                        ) + 1;

                        maxSize = Math.max(maxSize, dp[i][j]);
                    }
                }
            }

            int answer = -1;

            for (int mat : mats) {
                if (mat <= maxSize) {
                    answer = Math.max(answer, mat);
                }
            }

            return answer;
        }
    }
}
