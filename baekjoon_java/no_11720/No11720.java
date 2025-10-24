package no_11720;

import java.util.Scanner;
// 문제 : N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성
public class No11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String numbers = sc.next();

        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += numbers.charAt(i) - '0';
        }
        System.out.println(sum);
    }
}