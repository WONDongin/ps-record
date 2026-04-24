package no_11444;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
문제-11444 (골드2): 피보나치 수 6

문제 요약
- N번째 피보나치 수를 구하는 문제
- N이 매우 커서 일반 DP로는 해결 불가능
- 결과를 1,000,000,007로 나눈 값을 출력

접근 방법
- 피보나치를 행렬로 표현
- 기본 행렬:
  |1 1|
  |1 0|
- 이 행렬을 N번 거듭제곱하면
  |F(n+1) F(n)|
  |F(n)   F(n-1)| 형태가 됨
- 따라서 결과 행렬의 [0][1] 값이 F(N)

핵심 아이디어
- 분할 정복을 이용한 빠른 거듭제곱 (O(log N))
- A^N을 구할 때
  - 짝수: A^(N/2) × A^(N/2)
  - 홀수: A^(N/2) × A^(N/2) × A
- 행렬 곱셈은 직접 구현

주요 메서드
- pow(matrix, exp): 행렬 빠른 거듭제곱
- multiply(a, b): 2x2 행렬 곱셈

처리 흐름
- 입력
- 기본 행렬 생성
- pow(base, N) 수행
- 결과 행렬의 [0][1] 출력

시간 복잡도
- O(log N)
*/
public class No11444 {
    static final long MOD = 1000000007L;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());

        // 피보나치 상자
        long[][] base = {
                {1, 1},
                {1, 0}
        };

        // 피보나치 상자를 N번 사용한 결과
        long[][] result = pow(base, N);

        // 그 결과에서 F(N)이 들어있는 칸을 출력
        System.out.println(result[0][1]);
    }

    // 상자를 빠르게 여러 번 사용하는 방법
    static long[][] pow(long[][] matrix, long exp) {
        // 1번이면 그냥 자기 자신
        if (exp == 1) {
            return matrix;
        }

        // 빠른 방식 (분할 정복) - A^8 = (A^4) × (A^4)
        long[][] half = pow(matrix, exp / 2);
        long[][] result = multiply(half, half);

        // 홀수 처리 - A^5 = A^2 × A^2 × A
        if(exp % 2 == 1){
            result = multiply(result, matrix);
        }

        return result;
    }

    // 상자 2개를 합쳐서 더 큰 상자 만드는 것
    static long[][] multiply(long[][] a, long[][] b){
        long[][] result = new long[2][2];
        // 규칙 : 가로줄 × 세로줄 해서 더한다
        // [1 1]   [1 1]   [2 1]
        // [1 0] x [1 0] = [1 1]
        result[0][0] = (a[0][0] * b[0][0] + a[0][1] * b[1][0]) % MOD;
        result[0][1] = (a[0][0] * b[0][1] + a[0][1] * b[1][1]) % MOD;
        result[1][0] = (a[1][0] * b[0][0] + a[1][1] * b[1][0]) % MOD;
        result[1][1] = (a[1][0] * b[0][1] + a[1][1] * b[1][1]) % MOD;

        return result;
    }
}
