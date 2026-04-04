package no_2828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
문제-2828 (실버5): 사과 담기 게임
- N개의 칸이 있고, 크기 M의 바구니가 있다
- 사과가 떨어지는 위치가 주어질 때, 바구니를 이동하여 모두 받아야 한다
- 바구니 이동 거리의 최솟값을 구하는 문제

접근 방법
- 바구니를 [left, right] 구간으로 관리
- 사과 위치가 바구니 안이면 이동 X
- 바구니 밖이면 최소 거리만큼 이동
- 이동 후에도 바구니 크기(M)는 유지

핵심 아이디어
- 바구니 범위 유지하면서 최소 이동만 수행
- 왼쪽 밖 → left - pos 만큼 이동
- 오른쪽 밖 → pos - right 만큼 이동
- 이동 거리 누적

처리 흐름
- 입력
- 바구니 초기 위치 [1, M]
- 사과 위치 반복 처리
    → 범위 안: continue
    → 왼쪽 밖: 왼쪽 이동
    → 오른쪽 밖: 오른쪽 이동
- 이동 거리 누적
- 출력
*/
public class No2828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] first = br.readLine().split(" ");
        int N = Integer.parseInt(first[0]);
        int M = Integer.parseInt(first[1]);

        int J = Integer.parseInt(br.readLine());

        int left = 1;
        int right = M;

        int move = 0;

        for(int i = 0; i < J; i++){
            int pos = Integer.parseInt(br.readLine());

            // 바구니 안
            if(pos >= left && pos <= right){
                continue;
            }

            // 왼쪽 밖
            else if(pos < left){
                move += (left - pos);
                left = pos;
                right = pos + M - 1;
            }

            // 오른쪽 밖
            else if(pos > right){
                move += (pos - right);
                right = pos;
                left = pos - M + 1;
            }
        }

        System.out.println(move);
    }
}