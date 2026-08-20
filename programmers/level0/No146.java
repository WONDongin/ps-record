package level0;
/*
문제: 안전지대

로직
- 지뢰와 지뢰 주변의 8칸을 위험지역으로 표시한다.
- board의 모든 칸을 순회하며 지뢰가 있는 위치를 찾는다.
- 위험지역으로 표시되지 않은 칸의 개수를 구해 반환한다.

핵심 구현
- boolean 타입의 danger 배열을 만들어 위험지역 여부를 관리한다.
- dx와 dy 배열을 사용하여 현재 위치를 포함한 주변 9칸을 탐색한다.
- 이동한 위치가 배열의 범위 안에 있을 때만 위험지역으로 표시한다.

포인트
- 지뢰가 배열의 가장자리에 있을 수 있으므로 범위 검사가 필요하다.
- 지뢰가 있는 칸도 위험지역에 포함해야 한다.
- 여러 지뢰의 위험지역이 겹치더라도 boolean 배열을 사용하면 중복으로 계산되지 않는다.
- 원본 board를 변경하지 않고 별도의 danger 배열에서 위험지역을 관리한다.

회고
- 방향 배열을 사용하면 지뢰 주변의 8방향과 현재 위치를 반복문 하나로 간단하게 탐색할 수 있었다.
- 2차원 배열을 탐색할 때는 행과 열의 범위를 벗어나지 않도록 확인하는 과정이 중요하다는 것을 알 수 있었다.
*/
public class No146 {
    class Solution {
        public int solution(int[][] board) {
            int n = board.length;
            boolean[][] danger = new boolean[n][n];

            int[] dx = {-1, -1, -1, 0, 0, 0, 1, 1, 1};
            int[] dy = {-1, 0, 1, -1, 0, 1, -1, 0, 1};

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (board[i][j] == 1) {
                        for (int k = 0; k < 9; k++) {
                            int nextX = i + dx[k];
                            int nextY = j + dy[k];

                            if (nextX >= 0 && nextX < n
                                    && nextY >= 0 && nextY < n) {
                                danger[nextX][nextY] = true;
                            }
                        }
                    }
                }
            }

            int answer = 0;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (!danger[i][j]) {
                        answer++;
                    }
                }
            }

            return answer;
        }
    }
}
