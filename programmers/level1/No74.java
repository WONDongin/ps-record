package level1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
문제: 개인정보 수집 유효기간 KAKAO BLIND RECRUITMENT

로직
- 약관 종류별 유효기간을 Map에 저장한다.
- 오늘 날짜와 개인정보 수집 날짜를 일수로 변환한다.
- 수집 날짜에 유효기간을 더해 파기 시작일을 계산한다.
- 오늘 날짜가 파기 시작일 이상이면 개인정보 번호를 저장한다.

핵심 구현
- 모든 달이 28일이므로 1년을 12 * 28일로 계산한다.
- 유효기간에 28을 곱해 보관 기간을 일수로 변환한다.
- 개인정보 번호는 배열 인덱스에 1을 더해 저장한다.

포인트
- 유효기간이 끝나는 날짜부터 파기해야 하므로 >= 조건으로 비교한다.
- 날짜를 일수로 변환하면 월과 연도가 바뀌는 경우도 쉽게 처리할 수 있다.
- 개인정보를 순서대로 확인하므로 결과는 자동으로 오름차순이 된다.

회고
- 문제에서 정한 날짜 규칙을 활용해 날짜 계산을 단순화했다.
- 마지막 보관 가능일과 파기 시작일을 구분하는 것이 중요했다.
*/
public class No74 {
    class Solution {
        public int[] solution(String today, String[] terms, String[] privacies) {
            Map<String, Integer> termMap = new HashMap<>();

            for (String term : terms) {
                String[] parts = term.split(" ");
                termMap.put(parts[0], Integer.parseInt(parts[1]));
            }

            int todayDays = toDays(today);
            List<Integer> answer = new ArrayList<>();

            for (int i = 0; i < privacies.length; i++) {
                String[] parts = privacies[i].split(" ");

                int collectedDays = toDays(parts[0]);
                int expirationDays = collectedDays + termMap.get(parts[1]) * 28;

                if (todayDays >= expirationDays) {
                    answer.add(i + 1);
                }
            }

            return answer.stream()
                    .mapToInt(Integer::intValue)
                    .toArray();
        }

        private int toDays(String date) {
            String[] parts = date.split("\\.");

            int year = Integer.parseInt(parts[0]);
            int month = Integer.parseInt(parts[1]);
            int day = Integer.parseInt(parts[2]);

            return year * 12 * 28 + (month - 1) * 28 + (day - 1);
        }
    }
}
