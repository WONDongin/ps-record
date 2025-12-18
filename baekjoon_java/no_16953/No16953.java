package no_16953;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
문제-16953 (실버2): A → B
- 1. A = A * 2
- 2. A = A * 10 + 1
- 최소 연산 횟수를 구하되, 만들 수 없으면 -1 출력

주요 메서드

BufferedReader.readLine()
- 빠른 입력 처리

StringTokenizer
- 공백 기준 입력 분리

Long.parseLong()
- 수 범위가 커 int 대신 long 사용

주요 알고리즘
- Greedy + 역방향 시뮬레이션

동작 흐름

1. B가 A보다 클 동안 반복
2. B의 상태에 따라 가능한 연산만 수행
- 끝자리가 1 → (B - 1) / 10
- 짝수 → B / 2

3. 불가능한 상태면 즉시 종료
4. B == A가 되면 연산 횟수 출력

시간 복잡도 : O(log B)(B가 계속 줄어듦)
공간 복잡도 : O(1)
*/
public class No16953 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());

        int count = 1; // 연산 횟수 (문제 조건상 시작도 포함)

        while (B > A) {
            if (B % 10 == 1) {
                B = (B - 1) / 10;
            } else if (B % 2 == 0) {
                B /= 2;
            } else {
                System.out.println(-1);
                return;
            }
            count++;
        }

        if (B == A) {
            System.out.println(count);
        } else {
            System.out.println(-1);
        }
    }
}
