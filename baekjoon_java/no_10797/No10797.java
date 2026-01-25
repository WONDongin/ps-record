package no_10797;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
문제-10797 (브론즈 1): 10부제
- 특정 날짜의 차량 번호 끝자리(1자리)가 주어짐
- 5대의 차량 번호 끝자리가 주어짐
- 날짜와 동일한 끝자리를 가진 차량의 개수를 출력

해결 전략

- 기준 값과 입력값을 비교하여 조건에 맞는 경우만 카운트
- 배열 저장 없이 입력 즉시 처리

핵심 포인트

- 단순 비교 문제지만 조건 필터링 로직 연습에 적합
- 실무에서 WHERE 조건, 필터링 로직과 동일한 구조
 */
public class No10797 {
    public static void main(String[] args) throws IOException {

        // 빠른 입력 처리를 위한 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 10부제 기준이 되는 날짜의 차량 번호 끝자리
        int day = Integer.parseInt(br.readLine());

        // 5대 차량 번호 입력
        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = 0; // 조건에 맞는 차량 수

        // 차량 5대 반복 처리
        for (int i = 0; i < 5; i++) {
            int carNumber = Integer.parseInt(st.nextToken());

            // 기준 값과 동일하면 카운트 증가
            if (carNumber == day) {
                count++;
            }
        }

        // 결과 출력
        System.out.println(count);
    }
}
