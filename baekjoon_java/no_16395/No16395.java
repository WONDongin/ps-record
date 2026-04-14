package no_16395;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
문제-16395 (브론즈1): 파스칼의 삼각형

문제 요약
- 파스칼 삼각형에서 N번째 줄의 K번째 값을 구하는 문제
- 각 값은 위 두 값의 합으로 구성됨

접근 방법
- 2차원 배열을 사용하여 파스칼 삼각형을 직접 생성
- 점화식을 이용해 값 채우기

핵심 아이디어
- 양 끝 값은 항상 1
- 내부 값은 arr[i-1][j-1] + arr[i-1][j]
- (N-1)C(K-1) 조합으로도 풀이 가능

처리 흐름
- 입력
→ 배열 생성
→ i=1 ~ N 반복
   → j=1 ~ i 반복
      → 양끝이면 1
      → 아니면 위 두 값 더하기
→ arr[N][K] 출력
*/
public class No16395 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[][] arr = new int[31][31];

        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= i; j++){
                if(j == 1 || j == i){
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
                }
            }
        }

        System.out.println(arr[N][K]);
    }
}