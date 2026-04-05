package no_1236;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
문제-1236 (브론즈1): 성 지키기
- N x M 크기의 성이 주어진다
- 'X'는 경비원이 있는 위치, '.'는 없는 위치
- 모든 행과 열에 최소 1명의 경비원이 있어야 함
- 추가로 배치해야 하는 최소 경비원 수를 구하는 문제

접근 방법
- 각 행을 순회하며 경비원이 없는 행 개수 계산
- 각 열을 순회하며 경비원이 없는 열 개수 계산
- 둘 중 더 큰 값을 선택

핵심 아이디어
- 한 명의 경비원은 행과 열을 동시에 커버 가능
- 따라서 부족한 행/열 중 더 많은 쪽 기준으로 배치해야 함
- 결과 = max(행 부족 개수, 열 부족 개수)

처리 흐름
- 입력
- map 배열 저장
- 행 검사 → 경비원 없는 행 count
- 열 검사 → 경비원 없는 열 count
- max(rowCount, colCount) 출력
*/
public class No1236 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        char[][] map = new char[N][M];

        for (int i = 0; i < N; i++) {
            map[i] = br.readLine().toCharArray();
        }

        int rowCount = 0;
        int colCount = 0;

        // 행 검사
        for (int i = 0; i < N; i++) {
            boolean hasGuard = false;
            for (int j = 0; j < M; j++) {
                if (map[i][j] == 'X') {
                    hasGuard = true;
                    break;
                }
            }
            if (!hasGuard) rowCount++;
        }

        // 열 검사
        for (int j = 0; j < M; j++) {
            boolean hasGuard = false;
            for (int i = 0; i < N; i++) {
                if (map[i][j] == 'X') {
                    hasGuard = true;
                    break;
                }
            }
            if (!hasGuard) colCount++;
        }

        System.out.println(Math.max(rowCount, colCount));
    }
}
