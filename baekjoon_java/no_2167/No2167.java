package no_2167;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
문제-2167: 2차원 배열의 합
- N x M 배열이 주어지고, 여러 개의 (i,j) ~ (x,y) 구간 합을 구하는 문제.

주요 메서드
- 행 누적합 배열(prefix) 생성
- 구간 합 계산 시 prefix[row][y] - prefix[row][j-1] 사용

주요 알고리즘
- Prefix Sum (행 누적합)
- 시간복잡도: O(N*M + K*N)

탐색/처리 흐름
1. N, M 입력 후 배열 arr 생성
2. 배열 값 입력
3. 각 행에 대해 누적합 prefix 생성
   prefix[i][j] = prefix[i][j-1] + arr[i][j]
4. K개의 구간 입력
5. 좌표는 1-index → 0-index 변환
6. i ~ x 행을 순회하면서
   prefix[row][y] - prefix[row][j-1] 계산
7. j == 0이면 prefix[row][y] 그대로 사용
8. 합 출력

핵심 포인트
- 좌표는 문제에서 1-index
- 배열은 0-index라서 -1 보정 필요
- j==0일 때 prefix[row][j-1] 접근 방지
*/
public class No2167 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());

        int r = Integer.parseInt(st1.nextToken());
        int c = Integer.parseInt(st1.nextToken());

        int[][] arr = new int[r][c];

        for(int i = 0; i < r; i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            for(int j = 0; j < c; j++){
                arr[i][j] = Integer.parseInt(st2.nextToken());
            }
        }

        int[][] prefix = new int[r][c];

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if (j == 0) {
                    prefix[i][j] = arr[i][j];
                } else {
                    prefix[i][j] = prefix[i][j - 1] + arr[i][j];
                }
            }
        }

        int num = Integer.parseInt(br.readLine());

        for(int k = 0; k < num; k++){

            int sum = 0;

            StringTokenizer st3 = new StringTokenizer(br.readLine());

            int i = Integer.parseInt(st3.nextToken()) - 1;
            int j = Integer.parseInt(st3.nextToken()) - 1;
            int x = Integer.parseInt(st3.nextToken()) - 1;
            int y = Integer.parseInt(st3.nextToken()) - 1;

            for(int w = i; w <= x; w++){

                if(j == 0){
                    sum += prefix[w][y];
                }else{
                    sum += prefix[w][y] - prefix[w][j - 1];
                }

            }

            System.out.println(sum);
        }
    }
}