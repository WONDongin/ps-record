package no_9086;

import java.util.Scanner;
// 문제 : 문자열
// 출력 : 각 테스트 케이스에 대해서 주어진 문자열의 첫 글자와 마지막 글자를 연속하여 출력
public class No9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < T; i++){
            String str = sc.nextLine();
            char first = str.charAt(0);
            char last = str.charAt(str.length() - 1);
            // +"" 를 추가하여 문자열로 변경
            System.out.println(first + "" + last);
        }
    }
}
