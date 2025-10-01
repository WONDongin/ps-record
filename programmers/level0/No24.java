package level0;

import java.util.Scanner;
// 문제 : [PCCE 기출문제] 4번 / 저축
/*
70만 원 이상 모일 때까지 매월 저축하는 금액을 나타내는 정수 before,
100만 원 이상 모일 때 까지 매월 저축하는 금액을 나타내는 정수 after가 주어질 때,
100만 원 이상을 모을 때까지 걸리는 개월 수를 출력
*/
public class No24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int before = sc.nextInt();
        int after = sc.nextInt();

        int money = start;
        int month = 1;
        while (money < 70) {
            money += before;
            month++;
        }
        while ( money < 100) {
            money += after;
            month++;
        }

        System.out.println(month);
    }
}
