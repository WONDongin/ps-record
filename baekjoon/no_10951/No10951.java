package no_10951;

import java.util.Scanner;
// 문제 : 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성
public class No10951 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // hasNextInt()는 다음 정수 입력이 있는지 확인
        while (sc.hasNextInt()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a + b);
        }

        sc.close();
    }
}