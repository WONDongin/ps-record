package no_11721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
문제-11721 (브론즈3): 열 개씩 끊어 출력하기
- 한 줄에 10글자씩 끊어서 출력하는 프로그램
*/
public class No11721 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            // i가 10의 배수이면서 i > 0일 때만 줄바꿈
            if (i > 0 && i % 10 == 0) {
                System.out.println();
            }
            System.out.print(str.charAt(i));
        }
    }
}
