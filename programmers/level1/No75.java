package level1;
/*
문제: 공원 산책

로직
- 공원을 탐색하여 시작 지점 S의 좌표를 찾는다.
- 각 명령의 방향과 이동 거리를 확인한다.
- 임시 좌표에서 한 칸씩 이동하며 공원 범위와 장애물을 검사한다.
- 모든 칸을 이동할 수 있을 때만 실제 위치를 변경한다.

핵심 구현
- 방향에 따라 행과 열의 이동 값을 설정한다.
- 임시 좌표를 사용하여 명령 수행 가능 여부를 확인한다.
- 공원을 벗어나거나 장애물을 만나면 해당 명령을 무시한다.

포인트
- 도착 지점뿐만 아니라 이동 경로의 모든 칸을 확인해야 한다.
- 이동 중 문제가 발생하면 일부 이동도 반영하지 않는다.
- 결과는 [행, 열] 순서로 반환한다.

회고
- 실제 좌표와 임시 좌표를 분리하여 잘못된 이동이 반영되지 않도록 구현했다.
- 한 칸씩 이동하는 시뮬레이션으로 경계와 장애물을 함께 확인했다.
*/
public class No75 {
    class Solution {
        public int[] solution(String[] park, String[] routes) {
            int height = park.length;
            int width = park[0].length();

            int row = 0;
            int col = 0;

            // 시작 지점 찾기
            for (int i = 0; i < height; i++) {
                int startCol = park[i].indexOf('S');

                if (startCol != -1) {
                    row = i;
                    col = startCol;
                    break;
                }
            }

            for (String route : routes) {
                String[] command = route.split(" ");
                int distance = Integer.parseInt(command[1]);

                int dr = 0;
                int dc = 0;

                switch (command[0]) {
                    case "N":
                        dr = -1;
                        break;
                    case "S":
                        dr = 1;
                        break;
                    case "W":
                        dc = -1;
                        break;
                    case "E":
                        dc = 1;
                        break;
                }

                int nextRow = row;
                int nextCol = col;
                boolean canMove = true;

                // 이동 경로를 한 칸씩 검사
                for (int step = 0; step < distance; step++) {
                    nextRow += dr;
                    nextCol += dc;

                    if (nextRow < 0 || nextRow >= height
                            || nextCol < 0 || nextCol >= width) {
                        canMove = false;
                        break;
                    }

                    if (park[nextRow].charAt(nextCol) == 'X') {
                        canMove = false;
                        break;
                    }
                }

                // 전체 경로가 유효한 경우에만 실제 위치 변경
                if (canMove) {
                    row = nextRow;
                    col = nextCol;
                }
            }

            return new int[]{row, col};
        }
    }
}
