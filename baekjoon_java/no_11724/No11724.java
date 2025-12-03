package no_11724;

import java.util.*;
import java.io.*;

/*
문제-11724 (실버2): 연결 요소의 개수
- 방향 없는 그래프가 주어졌을 때, 연결 요소 (Connected Component)의 개수를 구하는 프로그램을 작성하시오.

주요 알고리즘

- 그래프 탐색(DFS 또는 BFS)으로 연결 요소 개수 세기

1. 그래프를 인접 리스트로 표현

2. 방문 배열(visited)로 방문한 정점 체크

3. 1번 정점부터 N번 정점까지 반복
- 방문하지 않은 정점을 발견하면, 새로운 연결 요소 시작
- 즉시 DFS/BFS로 연결된 모든 정점 탐색

4. DFS/BFS 한 번 끝날 때마다 연결 요소 수 +1
5. 마지막에 연결 요소 개수 출력
*/
public class No11724 {
    static ArrayList<Integer>[] graph;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        graph = new ArrayList[N + 1];
        visited = new boolean[N + 1];

        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        // 간선 입력
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            graph[u].add(v);
            graph[v].add(u); // 무방향 그래프
        }

        int count = 0;

        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                dfs(i);
                count++;
            }
        }

        System.out.println(count);
    }

    static void dfs(int x) {
        visited[x] = true;

        for (int next : graph[x]) {
            if (!visited[next]) {
                dfs(next);
            }
        }
    }
}
