package no_7576;

import java.util.*;
import java.io.*;
/*
문제 (골드5) : 토마토

2차원 배열 상자에서 토마토의 익는 과정을 시뮬레이션하는 BFS 알고리즘 구현.
익은 토마토(1)에서 인접한 익지 않은 토마토(0)로 하루씩 확산되며, 모든 토마토가 익을 때까지의 최소 일수를 계산.

- `box[][]`: 토마토 상태를 저장하는 2차원 배열 추가
- `queue`: BFS 탐색용 `LinkedList<int[]>` 활용
- `bfs()` 메서드 구현 — 토마토 익힘 과정 시뮬레이션
- 경계값 및 익지 않은 토마토 예외 처리 추가
- 전체 배열을 탐색하여 결과(최대 일수 또는 -1) 반환

주요 알고리즘
BFS (Breadth-First Search)
1. 모든 익은 토마토(1)를 BFS의 시작점으로 큐에 삽입
2. 인접 칸(상, 하, 좌, 우)에 대해 익히며 날짜 증가
3. 모든 칸 탐색 완료 후, 최댓값 - 1이 최소 일수
4. 익지 않은 토마토(0)가 남으면 -1 반환

주요 메서드
`bfs()` : 큐를 사용한 너비 우선 탐색으로 토마토 익히기 시뮬레이션
`queue.offer()` : 익은 토마토 좌표 삽입
`box[ny][nx] = box[y][x] + 1` : 이전 토마토로부터 하루 추가 기록
*/
public class No7576 {
    static int M, N;                // M: 가로 크기, N: 세로 크기
    static int[][] box;             // 토마토 상자 배열
    static int[] dx = {1, -1, 0, 0}; // x 방향 (동서남북)
    static int[] dy = {0, 0, 1, -1}; // y 방향 (동서남북)
    static Queue<int[]> queue = new LinkedList<>(); // BFS용 큐

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        box = new int[N][M];

        // 입력 받기 및 익은 토마토(1) 큐에 저장
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                box[i][j] = Integer.parseInt(st.nextToken());
                if (box[i][j] == 1) queue.offer(new int[]{i, j});
            }
        }
        System.out.println(bfs()); // BFS 수행 후 결과 출력
    }

    // BFS 탐색으로 최소 일수 계산
    static int bfs() {
        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            int y = now[0];
            int x = now[1];

            // 상하좌우 인접 칸 확인
            for (int i = 0; i < 4; i++) {
                int ny = y + dy[i];
                int nx = x + dx[i];

                // 범위 체크 + 익지 않은 토마토(0)만 익히기
                if (nx >= 0 && ny >= 0 && nx < M && ny < N) {
                    if (box[ny][nx] == 0) {
                        box[ny][nx] = box[y][x] + 1; // 날짜 기록
                        queue.offer(new int[]{ny, nx}); // 큐에 추가
                    }
                }
            }
        }

        int days = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (box[i][j] == 0) return -1; // 익지 않은 토마토 남음
                days = Math.max(days, box[i][j]);
            }
        }

        return days - 1; // 첫 익은 토마토가 1이었으므로 1일 차 보정
    }
}
