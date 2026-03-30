package no_10826;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
/*
문제-10826 (실버5): 피보나치 수 4
- n번째 피보나치 수를 출력하는 문제
- n의 범위가 매우 커서 일반 자료형으로는 처리 불가능

접근 방법
- 반복문을 이용한 Bottom-Up 방식 사용
- 이전 값 2개를 이용하여 현재 값 계산
- int/long 대신 BigInteger 사용

핵심 아이디어
- 피보나치 수는 n이 커질수록 값이 기하급수적으로 증가
- long 범위를 초과하기 때문에 BigInteger 사용 필수
- 덧셈은 add() 메서드 사용

처리 흐름
- 입력
- BigInteger a=0, b=1 초기화
- n==0이면 0 출력
- 반복문으로 피보나치 계산
- 결과 출력
*/
public class No10826 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;

        if(n == 0){
            System.out.println(0);
            return;
        }

        for(int i = 2; i <= n; i++){
            BigInteger temp = a.add(b);
            a = b;
            b = temp;
        }

        System.out.println(b);

    }
}
