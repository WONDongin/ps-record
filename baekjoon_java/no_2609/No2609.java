package no_2609;

import java.util.Scanner;
/*
문제-2609 (브론즈1): 최대공약수와 최소공배수
- 두 개의 자연수를 입력받아 최대 공약수와 최소 공배수를 출력하는 프로그램을 작성
*/
public class No2609 {
    // 최대공약수 (유클리드 호제법)
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    // 최소공배수
    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();  // 첫 번째 자연수 입력
        int b = sc.nextInt();  // 두 번째 자연수 입력

        System.out.println(gcd(a, b));  // 최대공약수 출력
        System.out.println(lcm(a, b));  // 최소공배수 출력
    }
}
