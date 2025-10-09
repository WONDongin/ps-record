package no_1978;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
[BOJ 1978] 소수 찾기 풀이

- 입력받은 N개의 정수 중 소수의 개수를 출력
- 소수 판정: 2부터 √n까지 나눗셈 검사
- 1은 소수가 아니므로 제외
- 시간복잡도: O(N√M) (M은 입력 중 최대값)

핵심 메서드 및 문법:
- Integer.parseInt()
- BufferedReader / split()
- for 반복문과 제곱근 조건 (j * j <= num)
*/
public class No1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int cnt = 0;

        // 배열저장
        for(int i = 0; i < N; i++){
            int num = Integer.parseInt(input[i]);

            // 1은 소수가 아님
            if (num == 1) continue;
            boolean isPrime = true;

            // 2부터 √num 까지만 검사 (효율적)
            for (int j = 2; j * j <= num; j++) {
                if (num % j == 0) {
                    isPrime = false; // 소수 x
                    break;
                }
            }
            if (isPrime) cnt++; // 소수일 때 카운트 증가
        }
        System.out.println(cnt);
    }
}