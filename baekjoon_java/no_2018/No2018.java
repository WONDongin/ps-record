package no_2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
문제-2018: 수들의 합 5
- 자연수 N을 연속된 자연수의 합으로 나타낼 수 있는 경우의 수를 구한다.

주요 메서드
- while (start <= N)
- sum += end
- sum -= start

주요 알고리즘
- 투 포인터 (Two Pointer)

탐색/처리 흐름
1. N 입력
2. start=1, end=1, sum=1 초기화
3. sum < N 이면 end 증가 후 sum에 더함 (구간 확장)
4. sum > N 이면 start 값을 sum에서 빼고 start 증가 (구간 축소)
5. sum == N 이면 result 증가 후 start 이동
6. start <= N 동안 반복

핵심 포인트
- 연속된 자연수 구간을 투포인터로 관리
- start, end 포인터는 한 방향으로만 이동
- 모든 연속 구간을 O(N) 시간에 탐색 가능
*/
public class No2018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int start = 1;
        int end = 1;
        int sum = 1;
        int result = 0;

        while (start <= N){
            if(sum == N){
                result++;
                sum -= start;
                start++;
            } else if(sum < N){
                end++;
                sum += end;
            } else {
                sum -= start;
                start++;
            }
        }
        System.out.println(result);
    }
}
