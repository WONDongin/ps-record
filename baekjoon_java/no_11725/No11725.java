package no_11725;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
/*
문제-11725(실버2): 트리의 부모 찾기
- 루트 노드(1번)부터 시작하여 각 노드의 부모 노드를 구하는 문제
- 트리는 무방향 그래프이며 간선은 N-1개

주요 메서드

- graph : 인접 리스트 (ArrayList<Integer>[])
- dfs(int node) : 깊이 우선 탐색을 통해 부모 노드 기록
- parent[] : 각 노드의 부모 저장
- visited[] : 방문 여부 체크

주요 알고리즘

- 인접 리스트 기반 DFS
- 루트(1번)에서 시작
- 방문하지 않은 노드 탐색 시 parent[next] = node 저장
- 시간 복잡도: O(N)
  → 모든 노드와 간선을 한 번씩 방문
- 공간 복잡도: O(N)
  → 인접 리스트 + parent + visited 배열
*/
public class No11725 {
    static ArrayList<Integer>[] graph;
    static int[] parent;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        graph = new ArrayList[n + 1];
        for(int i = 1; i <= n; i++){
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < n - 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a].add(b);
            graph[b].add(a);
        }


        parent = new int[n + 1];
        visited = new boolean[n + 1];

        dfs(1);

        for (int i = 2; i <= n; i++) {
            System.out.println(parent[i]);
        }
    }

    static void dfs(int node){
        visited[node] = true;

        for(int next : graph[node]){
            if(!visited[next]){
                parent[next] = node;
                dfs(next);
            }
        }
    }
}
