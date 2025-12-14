package no_15666;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
/*
문제-15666 (실버2): N과 M (12)
-  N개의 자연수 중에서 M개를 고른 수열
- 같은 수를 여러 번 골라도 된다.
- 고른 수열은 비내림차순

주요 메서드
`Arrays.sort(arr)`
- 입력된 자연수 배열을 오름차순 정렬
- DFS 결과를 사전 순으로 출력하기 위한 전처리 단계

`dfs(int depth, int start)`
- 길이 M의 수열을 생성하기 위한 백트래킹 메서드
- start 인덱스를 사용해 비내림차순 조건을 유지
- 같은 숫자를 여러 번 선택할 수 있도록 다음 DFS에서도 동일 인덱스(i) 전달

`StringBuilder`
- 완성된 수열을 문자열로 만들어 출력
- 반복 출력 성능 최적화를 위해 사용

주요 알고리즘
1) 정렬 기반 조합 탐색
- 입력 배열을 정렬한 후 DFS 수행
- 사전 순 출력 조건 자동 만족

2) 백트래킹(DFS)
- depth가 M이 될 때까지 수열을 구성
- 각 단계에서 현재 위치 이후의 값만 탐색하여 비내림차순 유지

3) 중복 수열 제거 (prev 방식)
- 같은 depth에서 이전에 사용한 값(prev)과 현재 값 비교
- 동일한 값이면 스킵하여 중복 수열 생성 방지
- Set 사용 없이 메모리 효율적인 중복 제거

4) 중복 허용 처리
- dfs 호출 시 dfs(depth + 1, i) 형태로 재귀
- 동일 숫자를 여러 번 선택 가능하도록 설계
*/
public class No15666 {
    static int N, M;
    static int[] arr, result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N];
        result = new int[M];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr); // 사전 순 출력을 위한 정렬
        dfs(0, 0);
    }

    static void dfs(int depth, int start) {
        if (depth == M) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < M; i++) {
                sb.append(result[i]).append(" ");
            }
            System.out.println(sb);
            return;
        }

        int prev = -1; // 같은 depth에서 중복 방지
        for (int i = start; i < N; i++) {
            if (arr[i] == prev) continue;

            result[depth] = arr[i];
            prev = arr[i];
            dfs(depth + 1, i); // 같은 숫자 다시 사용 가능
        }
    }
}
