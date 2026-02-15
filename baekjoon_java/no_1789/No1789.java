package no_1789;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
문제-1789(실버5): 수들의 합
- 서로 다른 자연수들의 합으로 S를 만들 때
- 사용할 수 있는 자연수의 최대 개수를 구하는 문제

주요 메서드

- `while (sum + i <= N)` : 누적합이 N을 넘지 않을 때까지 반복
- `sum += i` : 1부터 차례대로 더하는 그리디 방식
- `i - 1` 출력 : 마지막에 초과되기 직전 개수가 정답

주요 알고리즘

- 그리디(Greedy)
- 1부터 순차적으로 더하기
- 시간 복잡도: O(√N)
    `(k(k+1)/2 ≤ N` 이므로 `k`는 약 `√N` 수준)
- 공간 복잡도: O(1)
*/
public class No1789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());
        long sum = 0;
        long i = 1;

        while (sum + i <= N){
            sum += i;
            i++;
        }
        System.out.println(i - 1);
    }
}
