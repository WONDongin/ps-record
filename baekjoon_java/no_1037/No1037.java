package no_1037;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

/*
문제-1037 (브론즈1): 약수
- 어떤 자연수 N의 "진짜 약수"들이 주어진다.
- 진짜 약수는 1과 자기 자신을 제외한 약수이다.
- 이 약수들을 이용해 원래의 수 N을 구한다.

주요 메서드
- BufferedReader / StringTokenizer : 입력 처리
- Arrays.sort() : 약수 정렬

주요 알고리즘
- 약수의 성질 활용
- 가장 작은 약수 × 가장 큰 약수 = 원래 수 N

시간 복잡도
- O(n log n) (정렬)

공간 복잡도
- O(n)
*/

public class No1037 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());

        int[] divisors = new int[cnt];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < cnt; i++) {
            divisors[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(divisors);

        int N = divisors[0] * divisors[cnt - 1];
        System.out.println(N);
    }
}
