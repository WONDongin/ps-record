package no_13909;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
문제-13909: 창문 닫기

문제 요약
- N개의 창문이 있고, 1번부터 N번까지 번호가 붙어 있음
- 처음에는 모든 창문이 닫혀 있음
- i번째 사람은 i의 배수 번호 창문 상태를 모두 변경
- 모든 과정이 끝난 후 열려 있는 창문의 개수를 구하는 문제

주요 메서드
- Math.sqrt(N)
  → N 이하의 완전제곱수 개수를 구하기 위해 사용
- (int) Math.sqrt(N)
  → 소수점 제거 (정수 개수)

주요 알고리즘
- 수학 (약수, 완전제곱수)
- i번 창문은 i의 약수 개수만큼 토글됨
- 약수 개수가 홀수인 수만 마지막에 열림
- 완전제곱수만 약수 개수가 홀수

탐색/처리 흐름
1. i번 창문은 i의 약수 개수만큼 상태 변경
2. 약수 개수가 짝수 → 닫힘 / 홀수 → 열림
3. 완전제곱수만 약수 개수가 홀수
4. N 이하 완전제곱수 개수 구하기
   → 1², 2², 3² ... ≤ N
5. 결과 = (int) Math.sqrt(N)
*/
public class No13909 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println((int)Math.sqrt(N));
    }
}
