package no_2559;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
문제-2559 (실버3): 수열
- 길이 N의 정수 배열에서
- 연속된 K개의 합 중 최댓값을 구하는 문제

주요 메서드
- BufferedReader / StringTokenizer : 입력 처리
- 단일 for문 : 슬라이딩 윈도우 이동

주요 알고리즘
- 슬라이딩 윈도우 (고정 길이)
- 첫 K개의 합을 기준값으로 설정
- 이후 한 칸씩 이동하며 최대값 갱신

시간 복잡도
- O(N)

공간 복잡도
- O(1)

처리 흐름
1. 배열 입력
2. 처음 K개의 합 계산 → 초기 sum, max 설정
3. 윈도우를 한 칸씩 이동
   - 왼쪽 값 제거
   - 오른쪽 값 추가
   - max 갱신
*/

public class No2559 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        int sum = 0;
        int max;

        // 초기 K개 합 계산
        for (int i = 0; i < K; i++) {
            sum += arr[i];
        }
        max = sum;

        // 슬라이딩 윈도우 이동
        for (int i = K; i < N; i++) {
            sum = sum - arr[i - K] + arr[i];
            max = Math.max(max, sum);
        }

        System.out.println(max);
    }
}
