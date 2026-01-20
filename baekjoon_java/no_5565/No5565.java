package no_5565;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
문제-5565 (브론즈4): 영수증
- 총 금액과 9권의 책 가격이 주어진다.
- 총 10권 중 한 권의 가격이 누락되어 있다.
- 누락된 책 1권의 가격을 출력한다.

주요 메서드

`BufferedReader.readLine()`
- 입력값을 빠르게 처리

`Integer.parseInt()`
- 문자열 → 정수 변환

for 반복문
- 9권의 가격 누적 합 계산
*/
public class No5565 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int total = Integer.parseInt(br.readLine());
        int sum = 0;

        for (int i = 0; i < 9; i++) {
            sum += Integer.parseInt(br.readLine());
        }

        System.out.println(total - sum);
    }
}
