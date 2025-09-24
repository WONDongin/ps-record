package no_11654;

import java.util.Scanner;
// 문제 : 아스키 코드
// 알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성
public class No11654 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 첫 토큰의 첫 문자
        char ch = sc.next().charAt(0);
        System.out.println((int)ch);
        sc.close();
    }
}
