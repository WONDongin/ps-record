package no_11653;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
문제-번호: 11653번 : 소인수분해
주요 알고리즘: 수학, 소인수분해 (√N 반복)

[문제 요약]
자연수 N이 주어졌을 때, N의 소인수를 오름차순으로 출력하는 문제.

[접근 방법]
1. 2부터 시작하여 N이 나누어지는지 확인한다.
2. 나누어지면 해당 값을 출력하고 N을 계속 나눈다.
3. i * i <= N 까지만 반복한다.
4. 반복 종료 후 N > 1 이면 남은 값은 소수이므로 출력한다.

[핵심 아이디어]
- 소인수는 중복될 수 있으므로 while로 계속 나눈다.
- i*i <= N까지만 검사하면 된다.
- 마지막에 N이 1보다 크면 그 자체가 소수이다.
*/
public class No11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i = 2; i * i <= n; i++){
            while (n % i == 0){
                System.out.println(i);
                n /= i;
            }
        }

        if (n > 1) {
            System.out.println(n);
        }
    }
}
