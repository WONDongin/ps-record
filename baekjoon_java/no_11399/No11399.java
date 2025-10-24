package no_11399;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
문제: ATM 인출 시간 최소화
- 각 사람이 인출하는 데 걸리는 시간을 고려하여 전체 대기 시간을 최소화하는 정렬 기반 문제.
*/
public class No11399 {
    public static void main(String[] args) {
        try {
            int[] times = readInput();
            int minimumTotalWaitTime = calculateMinimumWaitTime(times);
            System.out.println(minimumTotalWaitTime);
        } catch (IOException e) {
            System.err.println("입력 처리 중 오류가 발생했습니다: " + e.getMessage());
        }
    }

    // 입력 + 배열 생성
    private static int[] readInput() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine().trim());
        int[] arr = new int[n];

        String[] input = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        return arr;
    }

    // 인출 최소시간
    private static int calculateMinimumWaitTime(int[] times) {
        Arrays.sort(times);

        int sum = 0;
        int total = 0;

        for (int time : times) {
            sum += time;   // 현재 사람까지의 누적 시간
            total += sum;  // 각 사람의 대기 시간 총합 + 총합
        }
        return total;
    }
}