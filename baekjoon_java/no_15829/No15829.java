package no_15829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
문제-15829 (브론즈2): Hashing
- 문자열이 주어질 때, 해시 함수를 이용해 값을 계산
- r = 31
- 𝑀 = 1234567891
- 문자열 길이 최대 50 → long 타입 필수

주요 메서드

- `main()` : 입력 처리 및 해시 계산 전체 로직
- `charAt(i)` : 문자열에서 i번째 문자 추출
- % MOD : 오버플로 방지를 위한 모듈러 연산

주요 알고리즘

- Rolling Hash

- 매 문자마다:
    문자 → 숫자 변환 (a=1, b=2, ...)
    현재 거듭제곱 값과 곱함
    누적 후 mod 연산
    다음 거듭제곱 준비 (power *= r)

- 시간복잡도: O(N)
- 공간복잡도: O(1)
*/
public class No15829 {
    static final long MOD = 1234567891L;
    static final long R = 31L;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int L = Integer.parseInt(br.readLine());
        String str = br.readLine();

        long hash = 0;
        long power = 1;

        for (int i = 0; i < L; i++) {
            int value = str.charAt(i) - 'a' + 1;
            hash = (hash + value * power) % MOD;
            power = (power * R) % MOD;
        }

        System.out.println(hash);
    }
}
