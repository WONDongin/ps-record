package no_1152;

import java.util.Scanner;
/*
영어 대소문자와 공백으로 이루어진 문자열이 주어진다.
이 문자열에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오.
단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.
*/
public class No1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // trim() : 앞뒤 공백제거
        String a = sc.nextLine().trim();

        if (a.isEmpty()) {
            System.out.println(0);
        } else {
            // "\\s+" : 하나의 이상의 공백(공백, tab)
            String[] arr = a.split("\\s+");
            System.out.println(arr.length);
        }
    }
}