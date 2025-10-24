package no_1008;

import java.util.Scanner;
// 문제 : 두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성
public class No1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double result = (double) a / (double) b;

        System.out.println(result);
    }
}
