package no_2444;

import java.util.Scanner;

/*
문제 2444 (브론즈3): 별 찍기 - 7
- 입력 n이 주어질 때
- 높이 2*n - 1 인 마름모 형태의 별을 출력

주요 접근 방법
- 전체 모양을 위쪽 삼각형 + 아래쪽 역삼각형으로 분리
- 각 줄마다 공백과 별의 개수를 규칙적으로 계산하여 출력

주요 알고리즘
- i번째 줄 (0-based 기준)
  - 공백 개수: n - 1 - i
  - 별 개수: 2 * i + 1
*/

public class No2444 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int n = sr.nextInt();

        // 위쪽 삼각형 출력 (0 ~ n-1)
        for (int i = 0; i < n; i++) {

            // 왼쪽 공백 출력
            for (int j = 0; j < n - 1 - i; j++) {
                System.out.print(" ");
            }

            // 별 출력 (홀수 개)
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            // 줄바꿈
            System.out.println();
        }

        // 아래쪽 역삼각형 출력 (n-2 ~ 0)
        for (int i = n - 2; i >= 0; i--) {

            // 왼쪽 공백 출력
            for (int j = 0; j < n - 1 - i; j++) {
                System.out.print(" ");
            }

            // 별 출력 (홀수 개)
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            // 줄바꿈
            System.out.println();
        }
    }
}
