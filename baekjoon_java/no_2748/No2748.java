package no_2748;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
문제-2748 (실버2): 피보나치 수 2
- N번째 피보나치 수를 구하는 문제
- N의 범위는 90 이하

접근 방법
- 피보나치 수는 이전 두 값을 더해서 구함
- 배열 대신 변수 2개로 공간 최적화
- 반복문으로 N번째까지 계산

핵심 아이디어
- F(n) = F(n-1) + F(n-2)
- 이전 값(one)과 현재 값(two)을 이용해서 다음 값 계산
- 계산 후 값 이동:
  one ← two
  two ← one + two

처리 흐름
- 입력
- N == 0이면 0 출력
- one = 0, two = 1 초기화
- 반복문으로 피보나치 계산
  → temp = one + two
  → one = two
  → two = temp
- 결과 출력
*/
public class No2748 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        long one = 0;
        long two = 1;

        if(N == 0){
            System.out.println(0);
            return;
        }

        for(int i = 1; i < N; i++){
            long t = one + two;
            one = two;
            two = t;
        }

        System.out.println(two);
    }
}
