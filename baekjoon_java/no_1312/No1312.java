package no_1312;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
문제-1312 (실버5): 소수
- A / B의 소수점 아래 N번째 숫자를 구하는 문제
- 실수 연산 없이 정수 연산으로 해결해야 한다.

주요 메서드
- 나머지(remainder) 기반 소수 계산
- 반복문을 통해 소수 자릿수 생성

주요 알고리즘
- A % B로 초기 나머지 계산
- N번 반복하면서:
  1) remainder *= 10
  2) digit = remainder / B
  3) remainder %= B
- 마지막에 계산된 digit이 소수점 N번째 값

시간 복잡도
- O(N)

공간 복잡도
- O(1)
*/

public class No1312 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int digit = 0;

        int remainder = a % b;

        for(int i = 0; i < n; i++){
            remainder *= 10;
            digit = remainder / b;
            remainder %= b;
        }

        System.out.println(digit);
    }
}
