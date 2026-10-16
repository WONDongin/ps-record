package level1;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/*
문제: 신고 결과 받기

로직
- 유저 ID와 결과 배열의 인덱스를 연결한다.
- 신고당한 유저별로 신고자 목록을 Set에 저장한다.
- 신고자 수가 k 이상인 유저를 찾아 신고자들의 메일 수신 횟수를 증가시킨다.

핵심 구현
- Map<String, Integer>로 유저 ID에 해당하는 인덱스를 조회한다.
- Map<String, Set<String>>으로 신고당한 유저별 신고자를 관리한다.
- Set을 사용해 동일한 유저에 대한 중복 신고를 제거한다.

포인트
- 신고 횟수는 중복을 제외한 신고자 수로 계산한다.
- 모든 신고를 취합한 후 이용 정지 여부를 판단한다.
- 결과는 id_list에 담긴 유저 순서대로 반환한다.

회고
- Map과 Set을 조합해 중복 신고 처리와 유저별 결과 집계를 구현했다.
*/
public class No78 {
    class Solution {
        public int[] solution(String[] id_list, String[] report, int k) {
            int[] answer = new int[id_list.length];

            Map<String, Integer> userIndex = new HashMap<>();
            Map<String, Set<String>> reporters = new HashMap<>();

            for (int i = 0; i < id_list.length; i++) {
                userIndex.put(id_list[i], i);
                reporters.put(id_list[i], new HashSet<>());
            }

            for (String record : report) {
                String[] ids = record.split(" ");
                String reporter = ids[0];
                String reportedUser = ids[1];

                reporters.get(reportedUser).add(reporter);
            }

            for (Set<String> reporterSet : reporters.values()) {
                if (reporterSet.size() >= k) {
                    for (String reporter : reporterSet) {
                        answer[userIndex.get(reporter)]++;
                    }
                }
            }

            return answer;
        }
    }
}
