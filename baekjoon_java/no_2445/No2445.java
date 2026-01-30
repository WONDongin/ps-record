package no_2445;

import java.util.Scanner;

/*
문제-2445 (브론즈3): 별 찍기 - 8

문제 요약
- 입력된 정수 N에 대해 별(*)과 공백을 이용해 대칭적인 패턴을 출력한다.
- 전체 출력 줄 수는 2 * N - 1 이다.
- 가운데 줄을 기준으로 위와 아래가 서로 대칭 구조를 이룬다.

접근 방법
- 출력 패턴을 위쪽 절반과 아래쪽 절반으로 나누어 처리한다.
- 각 줄마다 다음 요소를 계산하여 출력한다.
  - 왼쪽 별 개수
  - 가운데 공백 개수
  - 오른쪽 별 개수

핵심 아이디어
- 위쪽 줄 (i = 1 ~ N)
  - 별 개수   : i
  - 공백 개수 : 2 * (N - i)
- 아래쪽 줄 (i = N - 1 ~ 1)
  - 위쪽과 동일한 규칙을 역순으로 적용
- 가운데 줄은 한 번만 출력되도록 아래쪽 반복 범위를 조정한다.

주요 메서드
- Scanner.nextInt() : 정수 N 입력
- 중첩 for문 : 별과 공백 개수 제어
- System.out.print() : 줄 단위 출력 제어
*/

public class No2445 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 위쪽 패턴 출력
        for (int i = 1; i <= N; i++) {

            // 왼쪽 별 출력
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            // 가운데 공백 출력
            for (int j = 0; j < 2 * (N - i); j++) {
                System.out.print(" ");
            }

            // 오른쪽 별 출력
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // 아래쪽 패턴 출력 (가운데 줄 제외)
        for (int i = N - 1; i >= 1; i--) {

            // 왼쪽 별 출력
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            // 가운데 공백 출력
            for (int j = 0; j < 2 * (N - i); j++) {
                System.out.print(" ");
            }

            // 오른쪽 별 출력
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
