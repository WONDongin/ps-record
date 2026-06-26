package level0;

import java.util.Arrays;
/*
문제: 정수를 나선형으로 배치하기

로직
- 현재 위치에 1부터 n²까지 순서대로 저장한다.
- 현재 방향을 기준으로 다음 위치를 계산한다.
- 다음 위치가 범위를 벗어나거나 이미 방문한 칸이면 시계방향으로 방향을 변경한다.
- 방향이 결정되면 다음 위치로 이동하며 반복한다.

핵심 구현
- 핵심 코드
  int nx = x + dx[dir];
  int ny = y + dy[dir];

- 핵심 코드 설명
  현재 방향(dir)을 이용해 다음 이동할 좌표를 계산한다.

- 핵심 코드
  if (nx >= n || ny >= n || nx < 0 || ny < 0 || answer[nx][ny] != 0) {
      dir = (dir + 1) % 4;
      nx = x + dx[dir];
      ny = y + dy[dir];
  }

- 핵심 코드 설명
  다음 위치가 배열 범위를 벗어나거나 이미 숫자가 채워진 칸이면 방향을 시계방향으로 변경한 뒤 다음 좌표를 다시 계산한다.

포인트
- 방향은 오른쪽 → 아래 → 왼쪽 → 위 순으로 순환한다.
- dx, dy 배열을 사용해 이동 로직을 간결하게 구현했다.
- 방문 여부는 배열 값이 0인지 여부로 판단했다.

회고
- 구현 문제에서는 방향 배열(dx, dy)을 활용하면 이동 로직을 쉽게 작성할 수 있다는 점을 배웠다.
- 다음 좌표를 먼저 계산한 뒤 이동 가능 여부를 판단하는 방식이 다양한 시뮬레이션 문제에도 활용될 수 있다는 것을 익혔다.
*/
public class No41 {
    public static void main(String[] args) {
        int n = 4;
        int num = 1;

        int[][] answer = new int[n][n];

        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        int x = 0;
        int y = 0;
        int dir = 0;

        while (num <= n * n){
            answer[x][y] = num++;

            int nx = x + dx[dir];
            int ny = y + dy[dir];

            if(nx >= n || ny >= n || nx < 0 || ny < 0 || answer[nx][ny] != 0){
                dir = (dir + 1) % 4;
                nx = x + dx[dir];
                ny = y + dy[dir];
            }

            x = nx;
            y = ny;

        }

        System.out.println(Arrays.deepToString(answer));
    }
}
