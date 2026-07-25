package level0;

import java.util.Scanner;

/*
문제: 직각삼각형 출력하기

로직
- Scanner를 이용해 삼각형의 높이 n을 입력받는다.
- 첫 번째 줄부터 n번째 줄까지 반복한다.
- 각 줄의 번호만큼 별을 출력한다.

핵심 구현
- "*".repeat(i)를 이용해 별을 i개 생성한다.
- println()을 사용해 각 줄의 별을 출력한 후 줄을 바꾼다.

포인트
- i가 증가할 때마다 출력되는 별의 개수도 하나씩 증가한다.
- String.repeat()은 자바 11 이상에서 사용할 수 있다.

회고
- 반복문의 현재 순서와 별의 개수를 연결해 직각 이등변 삼각형을 출력했다.
*/
public class No95 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("*".repeat(i));
        }

        scanner.close();
    }
}