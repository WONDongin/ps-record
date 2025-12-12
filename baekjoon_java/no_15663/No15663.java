package no_15663;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
/*
문제-15663 (실버2): N과 M (9)
- N개의 자연수와 자연수 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램
- 중복되는 수열을 여러 번 출력하면 안되며, 각 수열은 공백으로 구분해서 출력

주요 메서드
`BufferedReader`, `StringTokenizer`
- 입력 속도를 고려해 표준 입력 처리에 사용
- N, M 및 N개의 자연수를 공백 단위로 파싱

`Arrays.sort(arr)`
- 입력된 자연수 배열을 오름차순 정렬
- DFS 탐색 결과가 사전 순으로 출력되도록 보장

`dfs(int depth)`
- 길이가 M인 수열을 생성하기 위한 백트래킹(DFS) 메서드
- visited[] 배열을 사용해 동일 인덱스의 중복 선택을 방지
- depth가 M에 도달하면 현재 수열을 문자열로 변환하여 Set에 저장

`LinkedHashSet<String>`
- 중복 수열 제거를 위한 자료구조
- 입력 순서를 유지하므로 사전 순 출력이 깨지지 않음

주요 알고리즘
- 정렬 + `DFS` + `visited` 배열을 이용해 순열 생성
- `Set` 자료구조를 활용하여 중복 수열을 제거
- 문제의 사전 순 및 중복 제거 조건을 안정적으로 만족하는 구현
*/
public class No15663 {
    static int N, M;
    static int[] arr, result;
    static boolean[] visited;
    static Set<String> set = new LinkedHashSet<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N];
        result = new int[M];
        visited = new boolean[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr); // 사전 순 출력을 위한 정렬
        dfs(0);

        for (String s : set) {
            System.out.println(s);
        }
    }

    static void dfs(int depth) {
        if (depth == M) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < M; i++) {
                sb.append(result[i]).append(" ");
            }
            set.add(sb.toString().trim());
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                result[depth] = arr[i];
                dfs(depth + 1);
                visited[i] = false;
            }
        }
    }
}
