package no_1652;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
문제-1652 (실버5): 누울 자리를 찾아라
- N x N 방에서 '.'은 빈칸, 'X'는 벽
- 가로/세로로 누울 수 있는 자리 개수 구하기
- 연속된 '.'이 2칸 이상이면 누울 수 있음

접근 방법
- 가로 탐색: 각 행을 기준으로 연속된 '.' 개수 체크
- 세로 탐색: 각 열을 기준으로 동일하게 처리
- 'X'를 만나면 구간 종료 → 길이 2 이상이면 카운트

핵심 아이디어
- 연속된 '.' 구간을 찾는 문제
- 구간 길이가 2 이상일 때만 유효
- 가로와 세로를 독립적으로 계산

처리 흐름
- 입력
- 가로 탐색
  → '.' count 증가
  → 'X' 만나면 count >= 2 확인 후 초기화
- 세로 탐색 (동일 로직)
- 결과 출력
*/
public class No1652 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        char[][] map = new char[N][N];

        for(int i = 0; i < N; i++){
            map[i] = br.readLine().toCharArray();
        }

        int rowCnt = 0;
        int colCnt = 0;

        // 가로 탐색
        for(int i = 0; i < N; i++){
            int cnt = 0;
            for(int j = 0; j < N; j++){
                if(map[i][j] == '.'){
                    cnt++;
                } else {
                    if(cnt >= 2) rowCnt++;
                    cnt = 0;
                }
            }
            if(cnt >= 2) rowCnt++; // 마지막 처리
        }

        // 세로 탐색
        for(int j = 0; j < N; j++){
            int cnt = 0;
            for(int i = 0; i < N; i++){
                if(map[i][j] == '.'){
                    cnt++;
                } else {
                    if(cnt >= 2) colCnt++;
                    cnt = 0;
                }
            }
            if(cnt >= 2) colCnt++; // 마지막 처리
        }

        System.out.println(rowCnt + " " + colCnt);
    }
}