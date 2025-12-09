package no_15650;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
문제-15650 (실버3): N과 M(2)
- 1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열 출력
- 고른 수열은 증가하는 순서(오름차순)이어야 한다.

주요 메서드
`BufferedReader.readLine()`
- 입력을 빠로고 효율적으로 처리
- 공백으로 split하여 N, M을 정수로 변환

`sb.append(result[i]).append(" ")`
- list로 된 배열을 sb에 저장하여 "[],[]" 양식 제거 후 한번에 출력

`dfs(int start, int depth)`
- 백트래킹(dfs-깊이탐색우선) 방식으로 수열 생성
- starat: 다음 숫자를 고를 시작 위치
- dept: 현제까지 선택한 숫자의 개숫

주요 알고리즘
1. 백트래킹(DFS)
- 숫자를 하나 선택하고 다음 단계로 이동
- M개의 숫자를  모두 선택하면 최종 출력

2. 오름차순 유지 기법
- 다음 선택할 숫자는 현재 선택한 숫자보다 큰 숫자(start~N)
- 이를 통해 중복 제거 및 정렬 유지 동시 해결

시간 복잡도
- O(NPM) 수준 (조합 수에 비례)
*/
public class No15650 {
    static int N, M;
    static int[] result;
    public static void main(String[] args) throws IOException {
        // 입력처리 : N, M 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        N = Integer.parseInt(str[0]);
        M = Integer.parseInt(str[1]);

        result = new int[M];
        dfs(1, 0); // 1부터 탐색 시작, 현재 탐색수 0
    }
    // 백트래킹(dfs)
    static void dfs(int start, int depth){
        // M개 선택 완료시 최종출력
        if(depth == M){
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < result.length; i++){
                sb.append(result[i]).append(" ");
            }
            System.out.println(sb);
            return;
        }
        // 오름차순 유지 : start부터 N만 탐색
        for(int i = start; i <= N; i++){
            result[depth] = i;
            dfs(i + 1, depth + 1);
        }
    }
}
