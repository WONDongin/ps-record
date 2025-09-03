package no_1001;

import java.util.Scanner;
/*
문제 : 두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.
출력 : 첫째 줄에 A-B를 출력한다.
*/
public class No1001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.println(A - B);
    }
}