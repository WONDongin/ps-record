package level1;
/*
문제: 유연근무제

로직
- 직원별 출근 희망 시각을 분 단위로 변환하고 10분을 더한다.
- 이벤트 시작 요일을 기준으로 각 출근 기록의 요일을 계산한다.
- 토요일과 일요일을 제외한 평일의 출근 기록을 확인한다.
- 평일에 한 번도 지각하지 않은 직원의 수를 반환한다.

핵심 구현
- 시각 / 100 * 60 + 시각 % 100으로 분 단위 시각을 계산한다.
- (startday - 1 + j) % 7 + 1로 각 날짜의 요일을 구한다.
- 평일 출근 시각이 허용 시각을 초과하면 해당 직원의 검사를 종료한다.

포인트
- 시각에 단순히 10을 더하면 분이 60 이상이 되는 경우를 처리할 수 없다.
- 토요일과 일요일의 출근 기록은 지각 여부에 영향을 주지 않는다.
- 허용 시각과 정확히 같은 시각에 출근한 경우도 인정한다.

회고
- 시간을 분 단위로 통일해 시간 올림 처리 없이 비교했다.
- 나머지 연산으로 시작 요일에 관계없이 주말을 구분했다.
*/
public class No73 {
    class Solution {
        public int solution(int[] schedules, int[][] timelogs, int startday) {
            int answer = 0;

            for (int i = 0; i < schedules.length; i++) {
                int limit = toMinutes(schedules[i]) + 10;
                boolean eligible = true;

                for (int j = 0; j < 7; j++) {
                    int day = (startday - 1 + j) % 7 + 1;

                    if (day == 6 || day == 7) {
                        continue;
                    }

                    if (toMinutes(timelogs[i][j]) > limit) {
                        eligible = false;
                        break;
                    }
                }

                if (eligible) {
                    answer++;
                }
            }

            return answer;
        }

        private int toMinutes(int time) {
            return time / 100 * 60 + time % 100;
        }
    }
}
