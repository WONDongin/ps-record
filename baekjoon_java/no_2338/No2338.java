package no_2338;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
/*
문제-2338 (긴자리 계산)
- 두 수 A, B를 입력받아, A+B, A-B, A×B를 구하는 프로그램

주요 메서드
- `BigInteger(String val)` : 문자열 입력을 기반으로 큰 정수 객체 생성
- `add(BigInteger b)` : 두 큰 정수의 덧셈
- subtract(BigInteger b) : 두 큰 정수의 뺄셈
- multiply(BigInteger b)  :두 큰 정수의 곱셈

주요 알고리즘
- Big Integer Arithmetic : Java 기본 정수 타입 범위를 초과하는 수를 처리하기 위해 BigInteger 사용
*/

public class No2338 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BigInteger a = new BigInteger(br.readLine());
        BigInteger b = new BigInteger(br.readLine());

        BigInteger add = a.add(b);
        BigInteger subtract = a.subtract(b);
        BigInteger multiply = a.multiply(b);


        System.out.println(add);
        System.out.println(subtract);
        System.out.println(multiply);
    }
}
