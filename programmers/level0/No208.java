package level0;
/*
문제: 캐릭터의 좌표

로직
- 캐릭터의 시작 좌표를 (0, 0)으로 설정한다.
- board의 가로와 세로 크기로 이동 가능한 범위를 계산한다.
- 방향키를 순서대로 확인하며 범위 안에서만 좌표를 변경한다.

핵심 구현
- x의 범위는 -board[0] / 2부터 board[0] / 2까지이다.
- y의 범위는 -board[1] / 2부터 board[1] / 2까지이다.
- 각 방향으로 이동하기 전에 해당 좌표가 경계에 도달했는지 확인한다.

포인트
- board[0]은 가로 크기이므로 x좌표의 범위를 결정한다.
- board[1]은 세로 크기이므로 y좌표의 범위를 결정한다.
- 범위를 벗어나는 입력은 무시하고 다음 방향키를 처리한다.

회고
- 각 방향의 경계를 먼저 확인해 좌표가 맵 밖으로 이동하지 않도록 구현했다.
*/
public class No208 {
    class Solution {
        public int[] solution(String[] keyinput, int[] board) {
            int x = 0;
            int y = 0;
            int maxX = board[0] / 2;
            int maxY = board[1] / 2;

            for (String key : keyinput) {
                switch (key) {
                    case "up":
                        if (y < maxY) y++;
                        break;
                    case "down":
                        if (y > -maxY) y--;
                        break;
                    case "left":
                        if (x > -maxX) x--;
                        break;
                    case "right":
                        if (x < maxX) x++;
                        break;
                }
            }

            return new int[] {x, y};
        }
    }
}
