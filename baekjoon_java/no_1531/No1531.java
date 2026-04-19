package no_1531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
문제-1531 (실버1): 투명
- N개의 색종이를 붙인다
- 각 색종이는 직사각형 영역을 덮는다
- 어떤 칸이 M번 초과로 덮이면 보이지 않음
- 보이지 않는 칸의 개수를 구하는 문제

접근 방법
- 2차원 배열을 사용하여 각 칸이 몇 번 덮였는지 저장
- 색종이 범위를 순회하며 해당 영역을 +1씩 증가
- 전체 배열을 순회하며 값이 M 초과인 칸 개수 카운트

핵심 아이디어
- 좌표 범위가 작기 때문에 완전 탐색(브루트포스) 가능
- 각 칸의 "겹친 횟수"를 직접 계산하는 방식
- 최종적으로 count > M 인 칸만 세면 됨

처리 흐름
- 입력
- 2차원 배열 생성 (크기 충분히 설정)
- 색종이 N개 반복
    → (x1, y1) ~ (x2, y2) 범위 순회하며 +1
- 전체 배열 순회
    → 값이 M 초과인 칸 count
- 결과 출력
*/
public class No1531 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] map = new int[101][101];

        for(int i = 0; i < N; i++){
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st1.nextToken());
            int y1 = Integer.parseInt(st1.nextToken());
            int x2 = Integer.parseInt(st1.nextToken());
            int y2 = Integer.parseInt(st1.nextToken());

            for(int x = x1; x <= x2; x++){
                for(int y = y1; y <= y2; y++){
                    map[x][y]++;
                }
            }
        }

        int count = 0;

        for(int i = 0; i <= 100; i++){
            for(int j = 0; j <= 100; j++){
                if(map[i][j] > M){
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
