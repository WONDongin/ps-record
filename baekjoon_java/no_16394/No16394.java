package no_16394;

import java.io.IOException;
import java.util.Scanner;
/*
문제-16394: 홍익대학교

[문제 요약]
- 연도 N이 주어짐
- 홍익대학교 개교 연도는 1946년
- N - 1946 값을 출력

[접근 방법]
- 입력 받은 연도에서 1946을 빼기

[핵심 아이디어]
- 단순 산술 연산 문제
- 기준 연도(1946)를 빼면 정답

[처리 흐름]
입력 → 연도 계산(N - 1946) → 출력

[시간복잡도]
- O(1)
*/
public class No16394 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(n - 1946);
    }
}