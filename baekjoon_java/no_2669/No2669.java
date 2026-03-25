package no_2669;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
문제-2669: 직사각형 네 개의 합집합의 면적 구하기

주요 메서드
- boolean 2차원 배열을 사용하여 좌표를 직접 채우는 방식

주요 알고리즘
- 브루트포스 (2차원 배열 시뮬레이션)

탐색/처리 흐름
1. 100x100 크기의 boolean 배열 생성
2. 4개의 직사각형 좌표 입력
3. 각 직사각형 영역을 map[x][y] = true로 채움
4. 전체 배열을 순회하면서 true 개수 카운트
5. 결과 출력

핵심 포인트
- 겹치는 영역은 true 덮어쓰기로 자동 처리
- (x2, y2)는 포함하지 않도록 < 조건 사용
- 좌표 문제는 직접 채우는 방식이 가장 안정적
*/
public class No2669 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[][] map = new boolean[101][101];

        for (int i = 0; i < 4; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            for(int x = x1; x < x2; x++){
                for(int y = y1; y < y2; y++){
                    map[x][y] = true;
                }
            }
        }

        int count = 0;

        for(int i = 0; i <= 100; i++){
            for(int j = 0; j <= 100; j++){
                if(map[i][j]) count++;
            }
        }

        System.out.println(count);
    }
}
