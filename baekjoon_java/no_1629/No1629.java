package no_1629;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
문제-1629 (실버1): 곱셈
- 자연수 A를 B번 곱한 수를 알고 싶다. 단 구하려는 수가 매우 커질 수 있으므로 이를 C로 나눈 나머지를 구하는 프로그램을 작성

주요 메서드

`BufferedReader.readLine()`
- 입력을 빠르게 처리
- 공백 기준으로 split하여 A, B, C를 숫자로 변환

`pow(long A, long B)`
- 분할정복 방식의 거듭제곱 함수
- (A^B) % C 를 O(log B) 로 계산
- 재귀 호출 구조
- B가 짝수/홀수인지에 따라 연산 분기

`System.out.println()`
- 최종 계산된 값을 출력

`static int C`
- 모듈러 연산을 위한 전역 변수
- 재귀 호출 시 매번 전달하지 않고 접근 가능

주요 알고리즘

1. 입력 처리
- A, B, C 값을 각각 long, long, int 자료형으로 저장
- 오버플로우 방지

2. 분할 정복 기반 거듭제곱
- 지수 B를 절반으로 줄여가며 계산
- 중복된 연산 제거 → 성능 향상

3. 모듈러 연산
- 매 단계에서 % C 수행
- 값의 범위를 제한하고 overflow 방지

4. 짝수/홀수 분기
- B가 짝수 → (A^(B/2))² 형태
- B가 홀수 → 짝수 처리 결과에 A 추가 곱
*/
public class No1629 {

    static int C;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        long A = Long.parseLong(str[0]);
        long B = Long.parseLong(str[1]);
        C = Integer.parseInt(str[2]);

        System.out.println(pow(A, B));
    }

    static long pow(long A, long B) {
        if (B == 0) return 1;

        long half = pow(A, B / 2);

        if (B % 2 == 0) {
            return (half * half) % C;
        } else {
            return ((half * half) % C * A % C) % C;
        }
    }
}
