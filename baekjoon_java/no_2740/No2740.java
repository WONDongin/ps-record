package no_2740;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
문제-2740: 행렬 곱셈

- N x M 행렬 A와 M x K 행렬 B가 주어질 때, 두 행렬의 곱을 구하는 문제

주요 메서드

- 3중 반복문을 이용한 행렬 곱셈 구현

주요 알고리즘

- 행렬 곱셈 (Matrix Multiplication)
- C[i][j] = Σ (A[i][x] * B[x][j])

탐색/처리 흐름

1. 행렬 A (N x M) 입력
2. 행렬 B (M x K) 입력
3. 결과 행렬 result[N][K] 생성
4. 3중 반복문 수행
    → i: 결과 행
    → j: 결과 열
    → x: 곱셈 누적
    → result[i][j] += A[i][x] * B[x][j]
5. 결과 행렬 출력

핵심 포인트

- A의 열 개수(M)와 B의 행 개수(M)가 같아야 곱셈 가능
- 각 원소는 "행 × 열" 방식으로 계산
- 시간복잡도: O(N × M × K)
*/
public class No2740 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st1.nextToken());
        int M = Integer.parseInt(st1.nextToken());
        int[][] A = new int[N][M];

        for(int i = 0; i < N; i++){
            StringTokenizer anum = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++){
                A[i][j] = Integer.parseInt(anum.nextToken());
            }
        }

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st2.nextToken());
        int K = Integer.parseInt(st2.nextToken());
        int[][] B = new int[M][K];

        for(int i = 0; i < M; i++){
            StringTokenizer bnum = new StringTokenizer(br.readLine());
            for(int j = 0; j < K; j++){
                B[i][j] = Integer.parseInt(bnum.nextToken());
            }
        }

        int[][] result = new int[N][K];

        for(int i = 0; i < N; i++){
            for(int j = 0; j < K; j++){
                for(int x = 0; x < M; x++){
                    result[i][j] += A[i][x] * B[x][j];
                }
            }
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < K; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
