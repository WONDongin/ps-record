package no_11050;

import java.util.Scanner;
/*
문제-11050 (브론즈1): 이항 계수
- 자연수 N과 정수 K가 주어졌을 때 이항 계수
*/
public class No11050 {
    public static int factorial(int n){
        if(n <= 1) return 1;
        return n * factorial(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int result = factorial(n) / (factorial(k) * factorial(n - k));
        System.out.println(result);
    }
}
