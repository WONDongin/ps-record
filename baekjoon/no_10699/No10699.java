package no_10699;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

/*
문제 : 서울의 오늘 날짜를 출력하는 프로그램을 작성하시오.
출력 : 서울의 오늘 날짜를 "YYYY-MM-DD" 형식으로 출력한다.
*/

public class No10699 {
    public static void main(String[] args) {
        // 서울 시간대를 설정 (한국 표준시)
        ZoneId seoulZone = ZoneId.of("Asia/Seoul");
        // 현재 날짜를 서울 시간대로 가져옴
        LocalDate today = LocalDate.now(seoulZone);
        // 출력할 날짜 형식 지정 ("yyyy-MM-dd")
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        // 날짜를 지정한 형식으로 포맷
        String formattedDate = today.format(formatter);

        // 포맷된 날짜 출력  : 2025-09-02
        System.out.println(formattedDate);
    }
}