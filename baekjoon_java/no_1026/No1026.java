package no_1026;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
문제-1026 (실버4): 보물
- 길이 N의 배열 A, B가 주어진다.
- 배열 A의 순서를 재배열하여
  S = A[0]*B[0] + A[1]*B[1] + ... + A[N-1]*B[N-1]
  의 값을 최소로 만들어야 한다.

주요 메서드
- BufferedReader / StringTokenizer : 입력 처리
- Arrays.sort() : 배열 정렬

주요 알고리즘
- 그리디 알고리즘
- 가장 작은 수 × 가장 큰 수를 곱하도록 매칭
  → A는 오름차순 정렬
  → B는 내림차순 정렬 효과로 사용

시간 복잡도
- O(N log N) (정렬)

공간 복잡도
- O(N)
*/

public class No1026 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] A = new int[n];
        int[] B = new int[n];

        StringTokenizer stA = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(stA.nextToken());
        }

        StringTokenizer stB = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            B[i] = Integer.parseInt(stB.nextToken());
        }

        Arrays.sort(A); // 오름차순
        Arrays.sort(B); // 오름차순

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += A[i] * B[n - 1 - i]; // B를 뒤에서부터 사용 → 내림차순 효과
        }

        System.out.println(sum);
    }
}
