package level2;
/*
문제: 이웃한 칸

문제 요약
- 2차원 보드에서 선택한 위치 board[h][w]의 색을 기준으로 한다.
- 위, 아래, 왼쪽, 오른쪽에 있는 칸 중 같은 색의 개수를 구한다.

접근 방법
- 상하좌우 이동을 위한 방향 배열 dh, dw를 사용한다.
- 현재 위치에서 네 방향으로 이동한 좌표를 계산한다.
- 이동한 좌표가 보드 범위 안에 있는지 확인한다.
- 범위 안에 있고 색이 같다면 count를 증가시킨다.

핵심 아이디어
- 2차원 배열에서 상하좌우 탐색은 방향 배열로 처리할 수 있다.
- 보드 밖으로 나가는 좌표는 검사하면 안 된다.
- 문자열 비교는 ==가 아니라 equals()를 사용한다.

주의할 점
- h_check와 w_check가 0 이상 n 미만인지 확인해야 한다.
- Java에서 문자열 값 비교는 board[h][w].equals(board[h_check][w_check]) 형태로 작성해야 한다.

배운 점
- 방향 배열을 사용하면 상하좌우 탐색 코드를 간결하게 작성할 수 있다.
- 배열 범위 체크를 먼저 하고 값을 비교해야 오류를 방지할 수 있다.
*/
public class No3 {
    class Solution {
        public int solution(String[][] board, int h, int w) {
            int n = board.length;
            int count = 0;

            int[] dh = {0, 1, -1, 0};
            int[] dw = {1, 0, 0, -1};

            String color = board[h][w];

            for (int i = 0; i < 4; i++) {
                int hCheck = h + dh[i];
                int wCheck = w + dw[i];

                if (hCheck >= 0 && hCheck < n && wCheck >= 0 && wCheck < n) {
                    if (color.equals(board[hCheck][wCheck])) {
                        count++;
                    }
                }
            }

            return count;
        }
    }
}
