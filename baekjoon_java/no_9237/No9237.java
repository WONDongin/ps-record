package no_9237;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
문제-9237 (실버4): 이장님 초대
- N개의 나무가 있고, 각 나무는 자라는 데 걸리는 시간이 주어진다
- 하루에 나무 1개씩 심을 수 있다
- 모든 나무가 다 자란 다음 날 이장님을 초대할 수 있다
- 가장 빠른 초대 날짜를 구하는 문제

접근 방법
- 나무를 심는 순서가 중요함
- 오래 걸리는 나무를 먼저 심어야 전체 시간이 최소가 됨
- 따라서 나무 성장 시간을 내림차순 정렬

핵심 아이디어
- i번째 나무는 (i+1)일에 심는다
- 해당 나무의 완료일 = tree[i] + (i + 1)
- 모든 나무 중 가장 늦게 끝나는 날을 기준으로 결정
- 초대는 다음 날이므로 +1

처리 흐름
- 입력
- 나무 성장 시간 배열 저장
- 내림차순 정렬
- 반복문으로 (tree[i] + i + 1) 계산
- 최대값 갱신
- 결과 +1 출력
*/
public class No9237 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] tree = new int[N];

        String[] input = br.readLine().split(" ");
        for(int i = 0; i < N; i++){
            tree[i] = Integer.parseInt(input[i]);
        }

        Arrays.sort(tree);

        int max = 0;

        for(int i = 0; i < N; i++){
            int day = tree[N - 1 - i] + (i + 1); // 내림차순 처리
            max = Math.max(max, day);
        }

        System.out.println(max + 1);
    }
}
