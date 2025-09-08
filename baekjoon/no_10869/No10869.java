package no_10869;

import java.util.Scanner;
// 문제 : 두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성
public class No10869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int add_numbers = a + b;
        int subtract_numbers = a - b;
        int multiply_numbers = a * b;
        int divide_numbers =  a / b;
        int modulo_numbers =  a % b;

        System.out.println(add_numbers);
        System.out.println(subtract_numbers);
        System.out.println(multiply_numbers);
        System.out.println(divide_numbers);
        System.out.println(modulo_numbers);
    }
}
