package no_2563;

import java.util.Scanner;
/*
문제-2563 (실버5): 색종이
-  가로, 세로의 크기가 각각 100인 정사각형 모양의 흰색 도화지가 있다. 이 도화지 위에 가로, 세로의 크기가 각각 10인 정사각형 모양의 검은색 색종이를 색종이의 변과 도화지의 변이 평행하도록 붙인다.
  이러한 방식으로 색종이를 한 장 또는 여러 장 붙인 후 색종이가 붙은 검은 영역의 넓이를 구하는 프로그램

주요 메서드 및 알고리즘
- boolean 2차원 배열 사용하여 도화지 모델링
-- 100×100 크기의 `boolean[][]` 생성
-- true = 검은색(색종이로 덮인 영역)

- 색종이 좌표 입력 후 10×10 구간을 true 로 채움
-- 이중 for문으로 색종이가 덮는 영역 표시
-- 이미 true인 부분은 다시 칠해도 중복이 제거되어 넓이 자동 처리됨

- 전체 도화지를 순회하여 `true` 개수를 세어 넓이 계산
-- 이중 for문으로 배열 전체 탐색
-- `true count` = 검은색 영역 넓이

핵심 메서드:
- 이중 for문 (영역 채우기 및 넓이 계산)
- `boolean` 배열 사용
- `Scanner.nextInt()` 입력 처리
*/
public class No2563 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        // 가로 x 세로(100*100)
        boolean[][] paper = new boolean[100][100];

        // 입력 받기
        for(int k = 0; k < N; k++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            // 색종이 10*10 영역 true 채우기
            for(int i = x; i < x + 10; i++){
                for(int j = y; j < y + 10; j++){
                    paper[i][j] = true;
                }
            }
        }

        // 색종이 채워진 부분 카운트
        int result = 0;
        for(int i = 0; i < 100; i++){
            for(int j = 0; j < 100; j++){
                if(paper[i][j]) result++;
            }
        }

        // 결과출력
        System.out.println(result);
    }
}
