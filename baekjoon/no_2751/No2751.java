package no_2751;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
// 문제 : 수 정렬하기
// 출력 : 첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력
public class No2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 배열 생성
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        // 배열 정렬
        Arrays.sort(arr);
        // StringBuilder로 결과 출력 (빠른 출력)
        StringBuilder sb = new StringBuilder();
        for(int num : arr){
            sb.append(num).append('\n');
        }
        System.out.println(sb);
    }
}
