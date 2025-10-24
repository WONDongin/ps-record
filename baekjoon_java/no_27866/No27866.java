package no_27866;

import java.util.Scanner;
// 문제 : 문자와 문자열
// 출력 : S의 i번째 글자를 출력한다.
public class No27866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int i = sc.nextInt();

        System.out.println(S.charAt(i - 1));
    }
}
