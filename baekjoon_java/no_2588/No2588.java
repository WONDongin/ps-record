package no_2588;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
문제-2588 (브론즈3): 곱셈
- 세 자리 수 A와 B를 입력받아
- B의 각 자리 수와 A를 곱한 결과를 순서대로 출력
- 마지막에 A × B의 전체 결과 출력
*/
public class No2588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine()); // 첫 번째 수 A
        String b = br.readLine();                // 두 번째 수 B (문자열)
        int bInt = Integer.parseInt(b);          // 전체 곱 계산용

        // B의 각 자릿수(1의 자리 → 10의 자리 → 100의 자리)
        for (int i = b.length() - 1; i >= 0; i--) {
            int digit = b.charAt(i) - '0';
            System.out.println(a * digit);
        }

        // A × B 전체 결과
        System.out.println(a * bInt);
    }
}
