package no_1260;

import java.util.*;

/*
문제-1260 (실버2): DFS와 BFS
- 첫째 줄에 DFS를 수행한 결과를, 그 다음 줄에는 BFS를 수행한 결과를 출력한다. V부터 방문된 점을 순서대로 출력

주요 메서드
- Collections.sort(graph.get(i)); : 그래프의 인접 리스트를 정렬할 때 사용
- static ArrayList<ArrayList<Integer>> graph = new ArrayList<>(); : 인접 리스트 방식으로 사용
- Queue<Integer> q = new LinkedList<>(); : BFS 탐색에 필요한 자료구조
- boolean[] visited  : DFS/BFS에서 중복 방문을 방지 + 방문 여부 체크 배열


주요 알고리즘
- 그래프(Graph) : 그래프는 정점(Vertex)과 간선(Edge)으로 이루어진 자료구조

그래프 입력
   ↓
인접 리스트 생성
   ↓
인접 리스트 정렬 (정점 번호 작은 순 방문)
   ↓
DFS 탐색 (재귀) : 스택 구조(재귀가 자연스럽게 스택처럼 작동)
   ↓
visited 초기화 : DFS와 BFS는 따로 진행되므로, 각 탐색 전에 방문 배열을 새로 초기화
   ↓
BFS 탐색 (큐) : 인접한 모든 노드를 먼저 방문
*/
public class No1260 {
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static boolean[] visited;
    static int N, M, V;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        V = sc.nextInt();

        // 그래프 초기화
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        // 간선 입력
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        // 번호가 작은 것부터 방문해야 하므로 정렬
        for (int i = 1; i <= N; i++) {
            Collections.sort(graph.get(i));
        }

        visited = new boolean[N + 1];
        dfs(V);
        System.out.println();

        visited = new boolean[N + 1];
        bfs(V);
    }

    // DFS (재귀)
    public static void dfs(int node) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int next : graph.get(node)) {
            if (!visited[next]) {
                dfs(next);
            }
        }
    }

    // BFS (큐)
    public static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = true;

        while (!q.isEmpty()) {
            int node = q.poll();
            System.out.print(node + " ");

            for (int next : graph.get(node)) {
                if (!visited[next]) {
                    visited[next] = true;
                    q.add(next);
                }
            }
        }
    }
}
