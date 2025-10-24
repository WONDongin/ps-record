package no_2178;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 문제 : 미로찾기(미로는 N x M 크기의 2차원 배열)
/*
BFS(Breadth-First Search) : 최단 거리 탐색에 최적, 너비 우선 탐색
- 큐(Queue)를 사용하여 인접한 노드를 차례로 탐색

 Breadth-First Search (BFS) 알고리즘
- 큐(Queue)를 사용하여 인접한 노드들을 너비 우선으로 탐색
- 시작점부터 목표지점까지의 최단 거리 계산에 최적
- 방문 체크는 distance 배열로 대체 (0이면 미방문)
- 4방향 (상하좌우) 탐색을 통해 인접 좌표로 이동

BFS
최단 거리
Queue
인접 노드
distance 누적
벽 or 방문 체크
2차원 배열 탐색
상하좌우 이동
Maze (미로 탐색)
Java 알고리즘
*/
class Point{
    int x, y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}
public class No2178 {
    static int N,M;
    static int[][] maze;
    static int[][] distance;
    // 상하좌우
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 미로 사이즈 입력받기
        N = sc.nextInt();
        M = sc.nextInt();
        sc.nextLine(); // 개행제거

        maze = new int[N][M];
        distance = new int[N][M];

        // 미로 정보 입력 받기
        for(int i = 0; i < N; i++){
            String line = sc.nextLine();
            for(int j = 0; j < M; j++){
                // String -> int 형변환
                maze[i][j] = line.charAt(j) - '0';
            }
        }

        bfs(0, 0);
        System.out.println(distance[N - 1][M - 1]);
    }
    // BFS 메서드
    static void bfs(int x, int y){
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(x, y));
        distance[x][y] = 1; // 시작 지점거리 = 1

        while (!queue.isEmpty()){
            Point p = queue.poll();

            for(int i = 0; i < 4; i++){
                int nx = p.x + dx[i];
                int ny = p.y + dy[i];
                // 범위 검사
                if(nx < 0 || ny < 0 || nx >= N || ny >= M) continue;
                // 벽이거나, 이미 방문했으면 건너뜀
                if(maze[nx][ny] == 0 || distance[nx][ny] != 0) continue;

                distance[nx][ny] = distance[p.x][p.y] + 1; // 거리 누적
                queue.add(new Point(nx, ny)); // 다음 탐색 지점 등록
            }
        }
    }
}
