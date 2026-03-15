package no_2846;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
문제-2846: 오르막길
- 길의 높이가 순서대로 주어질 때, 연속해서 높이가 증가하는 구간(오르막길) 중
  가장 큰 높이 차이를 구하는 문제.

주요 메서드
- 배열을 순회하면서 연속 증가 구간의 시작 높이(start)를 관리
- 증가 구간이 끝날 때 높이 차이 계산

주요 알고리즘
- 배열 탐색
- 연속 증가 구간 처리

탐색/처리 흐름
1. N 입력
2. 높이 배열 arr 입력
3. start = arr[0] 으로 오르막 시작 높이 설정
4. i = 1 ~ N-1 까지 순회
   → arr[i] > arr[i-1] 이면 오르막 계속
      → 현재 높이 - start 로 높이 차이 계산
      → max 값 갱신
   → arr[i] <= arr[i-1] 이면 오르막 종료
      → start = arr[i] 로 새 오르막 시작

5. 최대 높이 차이 출력

핵심 포인트
- 연속 증가 구간만 오르막으로 인정
- 감소하거나 같아지면 오르막 종료
- 가장 큰 (끝 높이 - 시작 높이) 값 찾기
- 시간복잡도 O(N)
*/
public class No2846 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int start = arr[0];
        int max = 0;

        for(int i = 1; i < N; i++){

            if(arr[i] > arr[i-1]) {
                max = Math.max(max, arr[i] - start);
            } else {
                start = arr[i];
            }

        }

        System.out.println(max);
    }
}