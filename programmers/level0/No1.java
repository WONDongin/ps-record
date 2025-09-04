package level0;

import java.util.Scanner;
/*
문제 : 정수 a와 b가 주어집니다. 각 수를 입력받아 입출력 예와 같은 형식으로 출력하는 코드를 작성해 보세요.
제한사항 : -100,000 ≤ a, b ≤ 100,00
*/
public class No1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 정수 a, b 입력 받기
        int a = sc.nextInt();
        int b = sc.nextInt();

        // 제약 조건 검사
        if (a < -100000 || a > 100000 || b < -100000 || b > 100000) {
            System.out.println("입력값은 -100,000 이상 100,000 이하만 가능합니다.");
            sc.close();
            return; // 프로그램 종료
        }

        // 정상 범위면 출력
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        sc.close();
    }
}
