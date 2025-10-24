package no_1546;

import java.util.Arrays;
import java.util.Scanner;
// 문제 : 평균
// 출력 : 최고점이 70이고, 수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다.
public class No1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] scores = new int[N];
        for (int i = 0; i < N; i++) scores[i] = sc.nextInt();
        // 최댓값
        int max = Arrays.stream(scores).max().orElse(1);
        // 평균값
        double avg = Arrays.stream(scores).mapToDouble(s -> (double) s / max * 100).average().orElse(0);

        System.out.println(avg);
    }
}