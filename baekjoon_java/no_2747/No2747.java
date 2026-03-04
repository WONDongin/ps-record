package no_2747;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
문제-2747: 피보나치 수
- n이 주어졌을 때 n번째 피보나치 수를 출력한다.

주요 메서드
- 변수 2개(a, b)로 피보나치 갱신

주요 알고리즘
- 반복문 기반 DP (Bottom-up), 공간 최적화 O(1)

탐색/처리 흐름
1. n 입력
2. a=0(F0), b=1(F1) 초기화
3. i=2~n 까지 temp=a+b로 다음 피보나치 생성
4. a=b, b=temp로 갱신
5. n==0이면 0 출력, 그 외 b 출력

핵심 포인트
- 배열 없이 O(1) 메모리로 해결
- 출력은 과정이 아니라 최종 Fn만 출력
*/
public class No2747 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int a = 0;
        int b = 1;

        if (n == 0) {
            System.out.println(0);
            return;
        }

        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }

        System.out.println(b);
    }
}