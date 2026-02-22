package no_11004;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
/*
문제-11004(실버5): K번째 수
주요 알고리즘: 정렬 `(Dual-Pivot QuickSort - Arrays.sort)`

[문제 요약]
- N개의 수가 주어졌을 때 K번째로 작은 수를 구하는 문제
- N 최대 5,000,000

[접근 방법]
- 배열 전체를 정렬한 뒤
- 인덱스 k-1 위치의 값을 출력

[핵심 아이디어]
- 자바의 `Arrays.sort(int[])`는 `Dual-Pivot QuickSort`기반
- 매우 최적화되어 있어 대용량에서도 빠르게 동작
- `QuickSelect`보다 자바에서는 더 안정적

[처리 흐름]
입력
  → 배열 저장
  → `Arrays.sort()`
  → `arr[k-1]` 출력
*/
public class No11004 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        System.out.println(arr[k - 1]);
    }
}
