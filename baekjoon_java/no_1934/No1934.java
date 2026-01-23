package no_1934;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
문제-1934 (브론즈1): 최소 공배수
- 두 자연수 A, B가 주어질 때 **최소공배수(LCM)**를 구하는 문제
- 테스트 케이스가 여러 개 주어짐

주요 메서드

`BufferedReader.readLine()`
- 테스트 케이스 및 숫자 입력 처리

`StringTokenizer`
- 한 줄에 입력된 두 정수 분리

`gcd(int a, int b)`
- 유클리드 호제법을 이용한 최대공약수 계산

`StringBuilder`
- 출력 성능 최적화

주요 알고리즘

- 유클리드 호제법
- 최소공배수 공식
`LCM(a, b) = a × b / GCD(a, b)`

처리 흐름

입력
↓
각 테스트 케이스마다 A, B 입력
↓
GCD 계산 (유클리드 호제법)
↓
LCM 계산
↓
출력
*/
public class No1934 {

    // 유클리드 호제법을 이용한 최대공약수
    static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int g = gcd(a, b);
            int lcm = a * b / g;

            sb.append(lcm).append('\n');
        }

        System.out.print(sb);
    }
}
