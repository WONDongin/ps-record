package no_1924;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
문제-1924: 2007년
- 2007년 x월 y일의 요일을 구하는 문제 (1월 1일 = MON)

주요 메서드
- 월별 일수 배열을 활용한 누적합 계산

주요 알고리즘
- 단순 구현 (누적합 + 나머지 연산)

탐색/처리 흐름
1. x(월), y(일) 입력
2. totalDay를 y로 초기화
3. x-1까지 이전 달의 일수를 누적
4. totalDay % 7로 요일 계산
5. 요일 배열에서 결과 출력

핵심 포인트
- 현재 달이 아닌 "이전 달까지" 누적해야 함
- 2007년 1월 1일 = MON 기준
- day[0] = SUN으로 두고 totalDay % 7 사용
*/
public class No1924 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int[] month = {31,28,31,30,31,30,31,31,30,31,30,31};
        int totalDay = y;

        for(int i = 0 ; i < x - 1; i++){
            totalDay += month[i];
        }

        String[] day = {"SUN","MON","TUE","WED","THU","FRI","SAT"};

        System.out.println(day[totalDay % 7]);
    }
}
