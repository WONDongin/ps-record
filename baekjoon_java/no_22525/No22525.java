package no_22525;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

/*
문제: Brave Force Story

로직
- 육각형 격자에서 BFS를 수행하여 이동 가능한 칸의 개수를 계산한다.
- 이동 횟수가 주어진 턴 수에 도달하면 탐색을 종료한다.

핵심 구현
- 육각형 격자의 인접한 6개 방향을 배열로 정의한다.
- 시작점을 기준으로 상대 좌표를 계산한다.
- 장애물과 방문한 칸을 boolean 배열로 관리한다.

포인트
- 시작 위치도 도달 가능한 칸에 포함한다.
- 이동 가능한 범위를 턴 수에 따라 설정한다.
- 큐에 삽입할 때 방문 처리하여 중복 탐색을 방지한다.

회고
- 육각형 격자에서도 이동 방향을 정의하면 BFS를 적용할 수 있다.
- 상대 좌표를 활용하여 탐색에 필요한 공간을 줄일 수 있었다.
*/
public class No22525 {
    public class Main {
        static final int[] DX = {1, 1, 0, -1, -1, 0};
        static final int[] DY = {0, 1, 1, 0, -1, -1};

        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();

            while (true) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int turns = Integer.parseInt(st.nextToken());
                int obstacleCount = Integer.parseInt(st.nextToken());

                if (turns == 0 && obstacleCount == 0) {
                    break;
                }

                int[][] obstacles = new int[obstacleCount][2];
                for (int i = 0; i < obstacleCount; i++) {
                    st = new StringTokenizer(br.readLine());
                    obstacles[i][0] = Integer.parseInt(st.nextToken());
                    obstacles[i][1] = Integer.parseInt(st.nextToken());
                }

                st = new StringTokenizer(br.readLine());
                int startX = Integer.parseInt(st.nextToken());
                int startY = Integer.parseInt(st.nextToken());

                sb.append(countReachable(turns, obstacles, startX, startY)).append('\n');
            }

            System.out.print(sb);
        }

        static int countReachable(int turns, int[][] obstacles, int startX, int startY) {
            int size = 2 * turns + 1;
            boolean[][] visited = new boolean[size][size];

            for (int[] obstacle : obstacles) {
                int x = obstacle[0] - startX + turns;
                int y = obstacle[1] - startY + turns;

                if (x >= 0 && x < size && y >= 0 && y < size) {
                    visited[x][y] = true;
                }
            }

            ArrayDeque<int[]> queue = new ArrayDeque<>();
            queue.offer(new int[]{turns, turns, 0});
            visited[turns][turns] = true;
            int reachableCount = 1;

            while (!queue.isEmpty()) {
                int[] current = queue.poll();
                if (current[2] == turns) {
                    continue;
                }

                for (int i = 0; i < 6; i++) {
                    int nextX = current[0] + DX[i];
                    int nextY = current[1] + DY[i];

                    if (nextX < 0 || nextX >= size || nextY < 0 || nextY >= size
                            || visited[nextX][nextY]) {
                        continue;
                    }

                    visited[nextX][nextY] = true;
                    queue.offer(new int[]{nextX, nextY, current[2] + 1});
                    reachableCount++;
                }
            }

            return reachableCount;
        }
    }
}
