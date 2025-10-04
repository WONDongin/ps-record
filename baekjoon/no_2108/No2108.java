package no_2108;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 문제 : 통계학
/*
산술평균 (Arithmetic Mean) : N개의 수들의 합을 N으로 나눈 값
중앙값 (Median) : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
최빈값 (Mode) : N개의 수들 중 가장 많이 나타나는 값
범위 (Range) : N개의 수들 중 최댓값과 최솟값의 차이
*/
public class No2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new  InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        // 입력
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        // 산술평균 : (int) 캐스팅으로 -0 방지
        double sum = 0;
        for(int i = 0; i < N; i++){
            sum += arr[i];
        }
        System.out.println((int) Math.round(sum / N));

        // 중앙값 : N이 항상 홀수일때 가정
        Arrays.sort(arr);
        System.out.println(arr[N / 2]);

        // 최빈값
        Map<Integer, Integer> freq = new TreeMap<>();
        for (int i = 0; i < N; i++) {
            int num = arr[i];
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int maxFreq = 0;
        for (int val : freq.values()) {
            if (val > maxFreq) maxFreq = val;
        }

        List<Integer> modes = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() == maxFreq) {
                modes.add(entry.getKey());
            }
        }

        if (modes.size() > 1) {
            System.out.println(modes.get(1));
        } else {
            System.out.println(modes.get(0));
        }

        // 범위
        System.out.println(arr[N-1] - arr[0]);
    }
}
