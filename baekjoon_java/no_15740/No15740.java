package no_15740;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;
// 문제 : a + b
/*
StringTokenizer
- 문자열을 "토큰(단어, 숫자 등)" 단위로 잘라주는 도구 (공백, 쉼표, 구분자)
- 기본 구분자 " "(공백)
| 메서드               | 설명                            |
| ----------------- | ----------------------------- |
| `hasMoreTokens()` | 아직 꺼낼 토큰이 있는지 확인 (true/false) |
| `nextToken()`     | 다음 토큰을 꺼냄 (문자열 반환)            |
| `countTokens()`   | 남은 토큰 개수를 반환                  |
*/
public class No15740 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 한 줄 읽고 분리
        StringTokenizer st = new StringTokenizer(br.readLine());
        // BigInteger : 자바에서 매우 큰 정수를 다룰 때 사용하는 클래스
        BigInteger a = new BigInteger (st.nextToken());
        BigInteger  b = new BigInteger (st.nextToken());
        System.out.println(a.add(b));
    }
}
