package no_11659;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
문제-11659 (실버3): 구간 합 구하기 4
- 길이 N의 수열이 주어지고,
- M개의 구간 (i, j)에 대해 i번째 수부터 j번째 수까지의 합을 출력한다.

주요 메서드
- BufferedReader / StringTokenizer : 빠른 입력 처리
- prefix 배열 : 누적합 저장
- 구간 합 공식 : prefix[j] - prefix[i-1]

주요 알고리즘
- 1차원 누적합 (Prefix Sum)
- 누적합 생성 : O(N)
- 구간 합 계산 : O(M)
- 전체 시간 복잡도 : O(N + M)
- 공간 복잡도 : O(N)

핵심 개념
- prefix[i] = 1번부터 i번까지의 합
- i ~ j 구간 합 = prefix[j] - prefix[i-1]
*/

public class No_11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st1.nextToken());
        int M = Integer.parseInt(st1.nextToken());
        int[] arr = new int[N];

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        int[] prefix = new int[N + 1];
        for(int p = 1; p < N + 1; p++){
            prefix[p] = prefix[p - 1] + arr[p - 1];
        }


        for(int j = 0; j < M; j++){
            StringTokenizer st3 = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st3.nextToken());
            int num2 = Integer.parseInt(st3.nextToken());
            System.out.println(prefix[num2] - prefix[num1 - 1]);
        }
    }
}
