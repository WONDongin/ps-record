package no_2753;

import java.util.Scanner;
//문제 : 연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력
//출력 : 첫째 줄에 윤년이면 1, 아니면 0을 출력한다.
public class No2753 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}