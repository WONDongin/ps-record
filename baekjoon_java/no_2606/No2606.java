package no_2606;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/*
문제-2606 (실버3): 바이러스
- 신종 바이러스인 웜 바이러스는 네트워크를 통해 전파된다. 한 컴퓨터가 웜 바이러스에 걸리면 그 컴퓨터와 네트워크 상에서 연결되어 있는 모든 컴퓨터는 웜 바이러스에 걸리게 된다.
- 1번 컴퓨터가 웜 바이러스에 걸렸을 때, 1번 컴퓨터를 통해 웜 바이러스에 걸리게 되는 컴퓨터의 수를 첫째 줄에 출력

주요 메서드

- Collections.sort(graph[i]) : 인접 리스트를 정렬하여 번호가 작은 정점부터 방문하도록 함
- ArrayList<Integer>[] graph : 인접 리스트 방식의 그래프 저장 구조
- boolean[] visited : DFS/BFS 탐색 시 중복 방문 방지를 위한 체크 배열
- dfs(int node) : DFS(깊이 우선 탐색)를 수행하는 재귀 메서드

주요 알고리즘

그래프(Graph) : 정점(Vertex)과 간선(Edge)으로 이루어진 자료구조
그래프 입력
- 입력된 간선 정보를 바탕으로 각 정점의 연결 관계를 저장

인접 리스트 생성
- 정점 번호에 해당하는 리스트를 만들고 연결된 정점을 추가

인접 리스트 정렬
- 번호가 작은 정점부터 방문하기 위해 각 리스트를 정렬

DFS 탐색 (재귀)
- 재귀 호출을 이용해 깊이 우선으로 그래프를 순회

visited 초기화 (필요 시)
- DFS/BFS를 여러 번 사용할 경우, 탐색 시작 전 방문 배열을 초기화

BFS 탐색(참고용)
- 큐(Queue)를 이용해 가까운 정점부터 순서대로 방문하는 방식

| 기준           | DFS    | BFS   |
| ------------ | ------ | ----- |
| 자료구조         | 스택(재귀) | 큐     |
| 방문 방식        | 깊이 우선  | 너비 우선 |
| 최단 거리 구함     | X      | O     |
| 코드 난이도       | 쉬움(재귀) | 보통    |
| 트리/그래프 깊게 탐색 | 유리     | 불리    |
| 레벨 단위 탐색     | 불리     | 유리    |
| 연결 요소 탐색     | 적합     | 적합    |

*/
public class No2606 {
    static ArrayList<Integer>[] graph; // 자료구조
    static boolean[] visited; // 방문 여부
    static int n, m, count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());  // 컴퓨터의 수
        m = Integer.parseInt(br.readLine()); // 네트워크 상에서 직접 연결되어 있는 컴퓨터 쌍의 수

        // 리스트 + 배열 생성
        graph = new ArrayList[n + 1];
        visited = new boolean[n + 1];

        // 그래프 초기화
        for (int i = 0; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }
        // 그래프 값 넣기
        for(int i = 0; i < m; i++){
            String[] str = br.readLine().split(" ");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);
            graph[a].add(b);
            graph[b].add(a);
        }

        // 번호가 작은 것부터 방문해야 하므로 정렬
        for (int i = 1; i <= n; i++) {
            Collections.sort(graph[i]);
        }
        // 감염 컴퓨터 수
        count = 0;
        // 1부터 시작
        dfs(1);
        System.out.println(count);
    }
    // DFS 탐색(재귀)
    public static void dfs(int node) {
        visited[node] = true;
        // 처음 접근할때
        for (int next : graph[node]) {
            if (!visited[next]) {
                count++;
                dfs(next);
            }
        }
    }
}
