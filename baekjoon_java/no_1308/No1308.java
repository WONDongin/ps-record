package no_1308;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.StringTokenizer;
/*
문제-1308(실버5): D-Day
- 시작 날짜와 목표 날짜가 주어질 때 두 날짜 사이의 D-Day를 계산하는 문제
- 목표 날짜가 시작 날짜로부터 1000년 이상 차이 나면 "gg" 출력

주요 메서드

- LocalDate.of() : 날짜 객체 생성
- ChronoUnit.DAYS.between() : 두 날짜 사이 일수 계산
- isAfter() : 날짜 비교
- plusYears(1000) : 1000년 뒤 날짜 계산

주요 알고리즘

- 시작 날짜와 목표 날짜를 LocalDate로 변환
- 목표 날짜가 시작 날짜 + 1000년 이상인지 먼저 검사
- 아니라면 두 날짜 사이 일수를 계산
- 시간 복잡도: O(1)
- 공간 복잡도: O(1)

*/
public class No1308 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int y1 = Integer.parseInt(st1.nextToken());
        int m1 = Integer.parseInt(st1.nextToken());
        int d1 = Integer.parseInt(st1.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int y2 = Integer.parseInt(st2.nextToken());
        int m2 = Integer.parseInt(st2.nextToken());
        int d2 = Integer.parseInt(st2.nextToken());

        LocalDate start = LocalDate.of(y1, m1, d1);
        LocalDate end = LocalDate.of(y2, m2, d2);

        // 1000년 이상 차이 검사
        if (!end.isBefore(start.plusYears(1000))) {
            System.out.println("gg");
            return;
        }

        long diff = ChronoUnit.DAYS.between(start, end);
        System.out.println("D-" + diff);
    }
}
