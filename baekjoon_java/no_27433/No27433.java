package no_27433;

import java.util.Scanner;
/*
문제-27433 (브론즈5): 팩토리얼2
- 0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성

주요 알고리즘
- int의 최대값: 2,147,483,647
- 13!부터는 int 범위를 초과 -> long
*/
public class No27433 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        long sum = 1;

        for(int i = 1; i <= num; i++){
            sum *= i;
        }

        System.out.println(sum);
    }
}
