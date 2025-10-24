package no_10872;

import java.util.Scanner;
// 문제 : 0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성
// 출력 : 첫째 줄에 N!을 출력
public class No10872 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 1;

        for(int i = 2; i <= a; i++){
            sum *= i;
        }
        System.out.println(sum);
        sc.close();
    }
}
