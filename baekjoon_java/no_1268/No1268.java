package no_1268;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
문제-1268 (실버5): 임시 반장 정하기
- 각 학생의 1~5학년 반 정보를 입력받아
- 한 번이라도 같은 반이었던 학생 수가 가장 많은 학생을 임시 반장으로 선정
- 동점일 경우 번호가 가장 작은 학생을 선택

주요 메서드

- `BufferedReader` / `StringTokenizer`
- 중첩 반복문을 통한 학생 및 학년 비교
- continue / break를 활용한 조건 제어

주요 알고리즘

- 완전 탐색(Brute Force)
- OR 조건 기반 비교
- 최대값 갱신 방식
 */

public class No1268 {
    public static void main(String[] args) throws IOException {

        // 학생 수 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // cls[i][j] : i번 학생의 (j+1)학년 반 정보
        int[][] cls = new int[N][5];

        // 반 정보 입력
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                cls[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int max = -1;      // 최대 같은 반 학생 수
        int answer = 0;    // 임시 반장 학생 번호

        // 기준 학생 i
        for (int i = 0; i < N; i++) {
            int count = 0; // i번 학생과 같은 반이었던 학생 수

            // 비교 학생 j
            for (int j = 0; j < N; j++) {
                if (i == j) continue; // 자기 자신 제외

                // 1~5학년 중 하나라도 같은 반이면 카운트
                for (int k = 0; k < 5; k++) {
                    if (cls[i][k] == cls[j][k]) {
                        count++;
                        break; // 한 학생당 1번만 카운트
                    }
                }
            }

            // 최대값 갱신 (동점일 경우 번호 작은 학생 유지)
            if (count > max) {
                max = count;
                answer = i + 1; // 학생 번호는 1부터 시작
            }
        }

        // 결과 출력
        System.out.println(answer);
    }
}
