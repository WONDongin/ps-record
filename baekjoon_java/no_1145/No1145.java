package no_1145;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
문제-1145 (브론즈1): 적어도 대부분의 배수
- 5개의 자연수가 주어짐
- 이 중 "적어도 3개 이상"으로 나누어 떨어지는 수 중
- 가장 작은 수를 출력

핵심 포인트

- 브루트포스 탐색
- 3개는 '임의의 3개' → 특정 수(최댓값 포함)로 제한되지 않음
- 따라서 입력값 기준이 아닌, 1부터 완전 탐색이 필요
*/

public class No1145 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] num = new int[5];
        for (int i = 0; i < 5; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        // 조건을 만족하는 가장 작은 수를 찾기 위해 1부터 증가
        int min = 1;

        while (true) {

            int cnt = 0;

            // 현재 수(min)가 5개 중 몇 개로 나누어 떨어지는지 계산
            for (int i = 0; i < 5; i++) {
                if (min % num[i] == 0) {
                    cnt++;
                }
            }

            // 3개 이상으로 나누어 떨어지면 즉시 정답 출력
            if (cnt >= 3) {
                System.out.println(min);
                return;
            }

            // 다음 수로 증가
            min++;
        }
    }
}
