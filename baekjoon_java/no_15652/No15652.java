package no_15652;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
문제-15652 (실버3): N과 M (4)
- 1부터 N까지 자연수 중에서 M개를 고른 수열
- 같은 수를 여러 번 골라도 된다.
- 고른 수열은 비내림차순이어야 한다.

주요 메서드

`BufferedReader.readLine()`
- 입력 성능 최적화
- 공백으로 split하여 N, M 값을 정수형으로 변환

`dfs(int start, int depth)`
- 백트래킹 기반 깊이 우선 탐색 메서드
- start: 선택할 수 있는 자연수의 시작 범위
- depth: 현재까지 선택한 숫자의 개수

`StringBuilder`
- 결과 출력 시 문자열 결합 성능 최적화

주요 알고리즘

1. 입력 처리
- N과 M을 입력 받아
- 길이 M의 결과 저장 배열 result 선언

2. DFS(백트래킹) 수행
- depth가 M에 도달하면 현재 선택된 수열 출력
- 그렇지 않으면 start부터 N까지 수를 반복 선택하며 재귀 호출

3. 비내림차순 조건 처리
- 다음 DFS 호출 시 현재 선택한 숫자 i를 그대로 넘김
→ 같은 숫자 선택 허용
→ 결과 수열이 무조건 오름차순 또는 같은 수 유지
→ 오름차순 정렬 및 중복 제거 로직 필요 없음
*/
public class No15652 {
    static int N, M;
    static int[] result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        N = Integer.parseInt(str[0]);
        M = Integer.parseInt(str[1]);

        result = new int[M];
        dfs(1, 0);
    }

    static void dfs(int start, int dept){
        if(dept == M){
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < result.length; j++){
                sb.append(result[j]).append(" ");
            }
            System.out.println(sb);
            return;
        }
        for(int i = start; i <= N; i++){
            result[dept] = i;
            dfs(i, dept + 1);
        }
    }
}
