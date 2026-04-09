package no_15688;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
/*
문제-15688 (실버5): 수 정렬하기 5
- N개의 정수가 주어진다
- 이를 오름차순으로 정렬하여 출력하는 문제
- N이 최대 1,000,000이라서 입력/출력 최적화가 중요

접근 방법
- 배열에 입력값 저장
- Arrays.sort()로 정렬
- StringBuilder를 이용해 출력 최적화

핵심 아이디어
- 단순 정렬 문제지만, 출력이 병목이 될 수 있음
- System.out.println 반복 → 시간초과 가능
- StringBuilder로 한번에 출력해야 함

주요 알고리즘
- 정렬 (Arrays.sort)
- 시간복잡도: O(N log N)

처리 흐름
- 입력
- 배열 저장
- Arrays.sort() 정렬
- StringBuilder에 결과 저장
- 출력
*/
public class No15688 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();

        for(int num : arr){
            sb.append(num).append("\n");
        }

        System.out.print(sb);
    }
}