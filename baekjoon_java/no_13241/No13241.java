package no_13241;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
문제-13241: 최소공배수
- 두 자연수 A, B가 주어졌을 때 최소공배수(LCM)를 구하는 문제.

주요 메서드
- gcd(a, b): 유클리드 호제법을 이용하여 최대공약수(GCD) 계산

주요 알고리즘
- 유클리드 호제법 (Euclidean Algorithm)

탐색/처리 흐름
1. 두 수 A, B 입력
2. gcd(a, b) 메서드로 최대공약수 계산
3. 최소공배수 공식 적용
   LCM = (A / GCD) * B
4. 결과 출력

핵심 포인트
- 최소공배수 공식: LCM(a,b) = (a × b) / GCD(a,b)
- 곱셈 오버플로우 방지를 위해 (a / gcd) * b 순서로 계산
- 유클리드 호제법을 사용하면 O(logN)으로 빠르게 계산 가능
*/
public class No13241 {
    static long a, b;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        a = Long.parseLong(st.nextToken());
        b = Long.parseLong(st.nextToken());

        System.out.println(a / gcd(a, b) * b);
    }
    static long gcd (long a, long b){
        while(b != 0){
            long temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

}
