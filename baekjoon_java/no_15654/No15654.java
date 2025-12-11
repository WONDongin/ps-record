package no_15654;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
문제-15654 (실버3): N과 M(5)
- N개의 자연수와 자연수 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성
- 개의 자연수 중에서 M개를 고른 수열

주요 메서드
`BufferedReader.readLine()`
- 입력을 빠르게 받기 위한 표준 메서드
- 공백 기준으로 split하여 N, M, 배열 값을 파싱함

`Arrays.sort(arr)`
- 입력받은 자연수 배열을 정렬하여 사전 순으로 출력되도록 보장함

`dfs(int depth)`
- 백트래킹(DFS)으로 길이 M의 순열을 생성하는 핵심 재귀 메서드
- 방문 체크(visited[])를 통해 중복 선택을 방지
- depth가 M이 되면 result 배열을 출력하고 종료

주요 알고리즘
1) 정렬 기반 순열 생성
- 입력된 N개의 자연수를 정렬한 뒤 순서대로 탐색하여 사전 순 정렬 조건을 만족하는 순열 생성

2) 백트래킹(Backtracking)
- 이미 선택한 숫자는 visited[i] = true 로 표시해 중복 선택을 방지
- 다음 depth로 진입했다가 돌아올 때 visited[i] = false 로 복구
- 이 과정을 반복하여 가능한 모든 길이 M의 수열을 탐색

3) DFS 기반 재귀 탐색
- depth == M인 경우 현재까지 선택한 수열(result[]) 출력
- 아니라면 arr[] 전체를 순회하며 방문되지 않은 숫자를 선택하여 재귀 호출
*/
public class No15654 {
    static int N, M;
    static int result[];
    static int arr[];
    static boolean visited[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        N = Integer.parseInt(str[0]);
        M = Integer.parseInt(str[1]);
        result = new int[M];
        visited = new boolean[N];
        arr = new int[N];

        String[] line = br.readLine().split(" ");

        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(line[i]);;
        }

        Arrays.sort(arr);

        dfs( 0);
    }
    static void dfs(int depth){
        if(depth == M){
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < M; i++){
                sb.append(result[i]).append(" ");
            }
            System.out.println(sb);
            return;
        }

        for(int i = 0; i < N ; i++){
            if(!visited[i]){
                visited[i] = true;
                result[depth] = arr[i];
                dfs(depth + 1);
                visited[i] = false;
            }
        }
    }
}
