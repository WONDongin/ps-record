package no_24313;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
문제-24313: 알고리즘 수업 - 점근적 표기 1
- f(n) = a1*n + a0 가 O(n)인지 판별하는 문제

주요 메서드
- 조건식 비교

주요 알고리즘
- Big-O 정의 확인

탐색/처리 흐름
1. a1, a0, c, n0 입력
2. f(n) = a1*n + a0
3. Big-O 정의
   → f(n) ≤ c*n (n ≥ n0)
4. n = n0일 때 성립하는지 확인
5. 조건
   → a1*n0 + a0 ≤ c*n0
   → a1 ≤ c
6. 두 조건 만족하면 1, 아니면 0 출력

핵심 포인트
- O(n) 정의를 그대로 구현
- n ≥ n0 조건 때문에 n0만 검사하면 됨
*/
public class No24313 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer ST = new StringTokenizer(br.readLine());
        int a1 =  Integer.parseInt(ST.nextToken());
        int a0 =  Integer.parseInt(ST.nextToken());
        int c =  Integer.parseInt(br.readLine());
        int n0 =  Integer.parseInt(br.readLine());

        if (a1 * n0 + a0 <= c * n0 && a1 <= c) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
