package no_1167;

import java.io.*;
import java.util.*;
/*
문제-1167 (골드2): 트리의 지름
- 트리에서 가장 긴 경로(지름)의 길이를 구하는 문제
- 무방향 트리, 임의 노드에서 가장 먼 노드를 찾고, 그 노드에서 다시 가장 먼 노드를 찾는 방식 활용

주요 메서드
`BufferedReader.readLine()`
- 빠르게 입력 처리
- 각 줄을 split 또는 StringTokenizer로 파싱하여 노드/거리 정보 저장

`ArrayList<Node>[] graph`
- 인접 리스트 방식 그래프 표현
- 각 정점에 연결된 노드와 가중치 저장

`boolean[] visited`
- DFS/BFS 수행 시 방문 체크

`DFS` 또는 `BFS` 탐색
- (정점, 누적 거리) 기반으로 가장 먼 노드 탐색

`Math.max()`
- 현재 경로 길이 비교하여 최댓값 저장
*/
public class No1167 {

    static class Node {
        int to, weight;
        Node(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }
    }

    static ArrayList<Node>[] tree;
    static boolean[] visited;
    static int maxDist = 0;
    static int farNode = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int V = Integer.parseInt(br.readLine());
        tree = new ArrayList[V + 1];

        for (int i = 1; i <= V; i++) {
            tree[i] = new ArrayList<>();
        }

        for (int i = 0; i < V; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());

            while (true) {
                int to = Integer.parseInt(st.nextToken());
                if (to == -1) break;

                int weight = Integer.parseInt(st.nextToken());
                tree[from].add(new Node(to, weight));
            }
        }

        // 1차 DFS: 1번 노드에서 가장 먼 노드 찾기
        visited = new boolean[V + 1];
        dfs(1, 0);

        // 2차 DFS: 찾은 farNode에서 가장 먼 거리 계산
        visited = new boolean[V + 1];
        maxDist = 0;
        dfs(farNode, 0);

        System.out.println(maxDist);
    }

    static void dfs(int node, int dist) {
        visited[node] = true;

        if (dist > maxDist) {
            maxDist = dist;
            farNode = node;
        }

        for (Node next : tree[node]) {
            if (!visited[next.to]) {
                dfs(next.to, dist + next.weight);
            }
        }
    }
}
