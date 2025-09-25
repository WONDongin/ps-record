package no_2743;

import java.util.Scanner;
// 문제 : 단어 길이 재기
// 알파벳으로만 이루어진 단어를 입력받아, 그 길이를 출력하는 프로그램을 작성
public class No2743 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        System.out.println(line.length());
    }
}