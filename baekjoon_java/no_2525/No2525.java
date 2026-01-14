package no_2525;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
문제-2525 (브론즈3): 오븐 시계
- 현재 시각과 요리 시간을 더한 뒤 종료 시각 출력
- 24시간(0~23) 기준
*/
public class No2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 현재 시각 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());

        // 요리 시간(분) 입력
        int cookTime = Integer.parseInt(br.readLine());

        // 분 단위로 변환 후 요리 시간 추가
        int totalMinutes = hour * 60 + minute + cookTime;

        // 하루(1440분) 기준 보정
        totalMinutes %= 1440;

        // 종료 시각 계산
        int endHour = totalMinutes / 60;
        int endMinute = totalMinutes % 60;

        // 출력
        System.out.println(endHour + " " + endMinute);
    }
}
