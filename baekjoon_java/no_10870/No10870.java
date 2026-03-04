/*
문제-10870: 피보나치 수 5
- 피보나치 수열의 n번째 수를 구하는 문제
- 피보나치 정의
    F(0) = 0
    F(1) = 1
    F(n) = F(n-1) + F(n-2)

주요 알고리즘: 반복문 기반 피보나치

접근 방법

- 재귀 대신 반복문(`Iterative`) 방식 사용
- 이전 두 값을 저장하면서 누적 계산
- 시간복잡도 O(n)

핵심 아이디어

- 피보나치는 직전 두 값만 필요
- `prev2`, `prev1` 두 변수만 유지하면서 계산
- 불필요한 재귀 호출 방지 → 성능 안정적

주요 메서드

- `BufferedReader` → 입력 처리
- 반복문 (for)
- 변수 누적 갱신 방식
*/

package no_10870;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No10870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        if (n == 0) {
            System.out.println(0);
            return;
        }
        if (n == 1) {
            System.out.println(1);
            return;
        }

        int prev2 = 0;
        int prev1 = 1;
        int current = 0;

        for (int i = 2; i <= n; i++) {
            current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }

        System.out.println(current);
    }
}