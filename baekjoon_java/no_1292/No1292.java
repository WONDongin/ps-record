package no_1292;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
문제-1292: 쉽게 푸는 문제
- 1, 2, 2, 3, 3, 3, 4, 4, 4, 4 ... 와 같은 수열에서
  A번째부터 B번째까지의 합을 구하는 문제

주요 메서드
- 배열에 수열을 순서대로 채우기
- A~B 구간 합 계산

주요 알고리즘
- 구현 / 시뮬레이션

탐색/처리 흐름
1. A, B 입력
2. 1부터 시작해서 숫자 i를 i번 배열에 채움
3. 배열의 인덱스를 1부터 사용하여 수열 구성
4. A번째부터 B번째까지 반복하며 합 계산
5. 결과 출력

핵심 포인트
- 숫자 i는 정확히 i번 등장
- 문제의 범위가 작아서 수열을 직접 만들어도 충분함
- 인덱스를 1부터 맞추면 구간 합 계산이 편해짐
*/
public class No1292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int[] arr = new int[1001];
        int index = 1;

        for (int i = 1; index <= 1000; i++) {
            for (int j = 0; j < i && index <= 1000; j++) {
                arr[index++] = i;
            }
        }

        int sum = 0;
        for (int i = A; i <= B; i++) {
            sum += arr[i];
        }

        System.out.println(sum);
    }
}
