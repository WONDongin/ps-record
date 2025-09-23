package no_2738;

import java.util.Scanner;
// 문제 : 행렬 덧셈
// 출력 : N*M크기의 두 행렬 A와 B가 주어졌을 때, 두 행렬을 더하는 프로그램을 작성
public class No2738 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        // 배열저장
        int[][] result = new int[N][M];
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                int a = sc.nextInt();
                result[i][j] = a;
            }
        }
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                int b = sc.nextInt();
                result[i][j] += b;
            }
        }

        // 배열출력
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}