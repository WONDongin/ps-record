package no_2206;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/*
문제-2206 (골드3): 벽 부수고 이동하기
- N x M 격자에서 최단 거리로 도착점까지 이동
- 이동 중 벽(1)을 단 1번 부술 수 있음
- 벽을 부수고 이동한 상태와, 부수지 않은 상태를 구분하여 BFS 진행
- 도달할 수 없다면 -1 출력

주요 메서드

`BufferedReader.readLine()`
- 효율적인 입력 처리
- 문자열로 입력받은 뒤 각 문자를 숫자로 변환하여 지도 저장

`Queue<Node>`
- BFS 구현을 위한 큐
- (x, y, broken) 상태를 저장하여 이동 처리
    - broken: 0 → 아직 벽을 안 부숨
    - broken: 1 → 벽을 한 번 부숨

`int[][][] dist`
- 방문 및 거리 기록 배열
- dist[x][y][broken] → 해당 위치 + 벽 처리 여부에 따른 거리 저장

`StringTokenizer`
- 첫 줄(N, M) 입력 토큰 분리

주요 알고리즘

1. 입력 처리 및 상태 배열 초기화
- 지도 정보를 0(빈칸), 1(벽)으로 입력
- dist 배열은 미방문을 의미하기 위해 0으로 초기화

2. BFS 수행 (4방향 탐색)
- 시작 위치 (0,0)에서 broken=0으로 시작
- 다음 위치로 이동 시 두 가지 경우로 나뉨
2-1. 빈 칸: 기존 broken 값 유지
2-2. 벽: broken == 0일 때만 부수고 broken=1로 이동
- dist 배열에 거리 기록하면서 큐에 추가

3. 목적지 도달 조건 확인
(- N-1, M-1) 위치 도달 시 현재 dist 값 반환(최단 거리 보장)

4. BFS 종료 후 결과 판단
- 도달하지 못하면 -1 출력
*/
public class No2206 {
    static class Node{
        int x, y, broken;
        public Node(int x, int y, int broken){
            this.x = x;
            this.y = y;
            this.broken = broken;
        }
    }
    static int N, M;
    static int[][] map;
    static int[][][] dist;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        dist = new int[N][M][2];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = line.charAt(j) - '0';
            }
        }

        System.out.println(bfs());
    }

    static int bfs() {
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(0, 0, 0));
        dist[0][0][0] = 1;

        while (!q.isEmpty()) {
            Node now = q.poll();
            int x = now.x;
            int y = now.y;
            int broken = now.broken;

            // 목적지 도달
            if (x == N - 1 && y == M - 1) {
                return dist[x][y][broken];
            }

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || ny < 0 || nx >= N || ny >= M) continue;

                // 빈 칸일 때
                if (map[nx][ny] == 0 && dist[nx][ny][broken] == 0) {
                    dist[nx][ny][broken] = dist[x][y][broken] + 1;
                    q.add(new Node(nx, ny, broken));
                }

                // 벽일 때 + 아직 부수지 않은 경우
                if (map[nx][ny] == 1 && broken == 0 && dist[nx][ny][1] == 0) {
                    dist[nx][ny][1] = dist[x][y][0] + 1;
                    q.add(new Node(nx, ny, 1));
                }
            }
        }

        return -1; // 도달 불가
    }
}
