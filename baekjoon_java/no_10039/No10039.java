package no_10039;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
문제-10039 (브론즈4): 평균 점수
- 입력된 5개의 점수 중 40점 미만은 40점으로 보정
- 보정된 점수들의 평균을 출력

주요 메서드

`BufferedReader.readLine()`
- 5명의 점수를 한 줄씩 입력받기 위해 사용

`Integer.parseInt()`
- 문자열 입력을 정수로 변환

`Math.max(a, b)`
- 점수가 40 미만일 경우 자동으로 40으로 보정

주요 알고리즘

1. 점수 5개 입력
2. 각 점수에 대해 최소 점수(40점) 보정
3. 총합을 누적
4. 총합 ÷ 5로 평균 계산 후 출력
*/
public class No10039 {

    private static final int STUDENT_COUNT = 5;
    private static final int MIN_SCORE = 40;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;

        for (int i = 0; i < STUDENT_COUNT; i++) {
            int score = Integer.parseInt(br.readLine());
            sum += Math.max(score, MIN_SCORE);
        }

        System.out.println(sum / STUDENT_COUNT);
    }
}
