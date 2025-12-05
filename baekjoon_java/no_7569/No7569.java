package no_7569;

import java.io.*;
import java.util.*;
/*
문제-7569 (골드5): 토마토
- 여러분은 토마토가 모두 익을 때까지 최소 며칠이 걸리는지를 계산해서 출력
- 토마토가 익어있는 상태이면 0
- 토마토가 모두 익지는 못하는 상황이면 -1

주요 메서드
`BufferedReader.readLine()`
- 빠르고 효율적인 입력 처리를 위해 사용
- 한 줄 단위 문자열 입력 후 StringTokenizer 또는 split()으로 분리하여 정수로 변환

`Queue<Node> (BFS 큐)`
- 익은 토마토의 위치를 저장하고 BFS(너비 우선 탐색) 수행
- 여러 시작점을 동시에 처리하기 위해 초기부터 익은 토마토를 모두 삽입

`LinkedList`
- BFS 큐 구현체로 사용
- 삽입/삭제가 빠름

`Math.max()`
- 전체 토마토가 익는 데 걸린 최대 일수를 계산하는 데 사용
- BFS 수행 후 배열에서 가장 큰 값을 찾기 위해 활용

주요 알고리즘

1. 3차원 배열 초기화 및 입력 처리
- H층, N행, M열의 3차원 배열 생성
- 값이 1(익은 토마토)인 위치는 모두 큐에 넣어 BFS의 시작점으로 설정
- 값이 0(익지 않은 토마토), -1(빈 칸)은 그대로 저장

2. 3차원 BFS 수행 (6방향 탐색)
- 방향 벡터(dx, dy, dz)를 사용하여 상·하·좌·우·앞·뒤 총 6방향 탐색
- 값이 0인 위치를 발견하면 현재 날짜 + 1로 갱신하고 큐에 추가
- 갱신된 값은 "며칠째에 익었는지"를 의미

3. BFS 종료 후 결과 계산
- 배열 전체를 순회하여 0이 하나라도 존재하면 -1 반환(익힐 수 없음)
- 0이 없으면 배열 내 최댓값을 찾고, 초기값이 1이므로 결과는 (최댓값 - 1)
*/
public class No7569 {
    static int M, N, H;
    static int[][][] box;
    static int[] dx = {1, -1, 0, 0, 0, 0};
    static int[] dy = {0, 0, 1, -1, 0, 0};
    static int[] dz = {0, 0, 0, 0, 1, -1};

    static class Node {
        int x, y, z;
        Node(int z, int y, int x) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());

        box = new int[H][N][M];
        Queue<Node> q = new LinkedList<>();

        for (int h = 0; h < H; h++) {
            for (int n = 0; n < N; n++) {
                st = new StringTokenizer(br.readLine());
                for (int m = 0; m < M; m++) {
                    box[h][n][m] = Integer.parseInt(st.nextToken());
                    if (box[h][n][m] == 1) { // 익은 토마토는 BFS 시작점
                        q.add(new Node(h, n, m));
                    }
                }
            }
        }

        // BFS
        while (!q.isEmpty()) {
            Node cur = q.poll();

            for (int i = 0; i < 6; i++) {
                int nz = cur.z + dz[i];
                int ny = cur.y + dy[i];
                int nx = cur.x + dx[i];

                if (nx >= 0 && ny >= 0 && nz >= 0 &&
                        nx < M && ny < N && nz < H) {

                    if (box[nz][ny][nx] == 0) {
                        box[nz][ny][nx] = box[cur.z][cur.y][cur.x] + 1;
                        q.add(new Node(nz, ny, nx));
                    }
                }
            }
        }

        // 결과 계산
        int days = 0;
        for (int h = 0; h < H; h++) {
            for (int n = 0; n < N; n++) {
                for (int m = 0; m < M; m++) {
                    if (box[h][n][m] == 0) {
                        System.out.println(-1);
                        return;
                    }
                    days = Math.max(days, box[h][n][m]);
                }
            }
        }

        System.out.println(days - 1); // 첫 날이 1이므로 -1
    }
}
