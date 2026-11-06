package level2;
import java.util.HashMap;
import java.util.Map;
/*
문제: 의상

로직
- 의상의 종류별로 개수를 센다.
- 각 종류에서 하나를 입거나 입지 않는 경우를 선택한다.
- 종류별 선택지 수를 모두 곱한다.
- 아무것도 입지 않는 경우 1개를 제외한다.

핵심 구현
- HashMap에 의상 종류를 키로, 개수를 값으로 저장한다.
- getOrDefault()로 기존 개수를 가져와 1을 더한다.
- 각 종류의 개수에 1을 더한 값을 answer에 곱한다.

포인트
- 같은 종류의 의상은 최대 하나만 입을 수 있다.
- 특정 종류를 입지 않는 것도 하나의 선택이다.
- 최소 한 개는 입어야 하므로 최종 결과에서 1을 뺀다.

회고
- 조합을 직접 나열하지 않고 종류별 선택지 수를 곱해 계산했다.
- 입지 않는 경우를 포함하면 일부 종류만 입는 조합도 함께 셀 수 있다.
*/
public class No25 {
    class Solution {
        public int solution(String[][] clothes) {
            Map<String, Integer> counts = new HashMap<>();

            for (String[] clothing : clothes) {
                String type = clothing[1];
                counts.put(type, counts.getOrDefault(type, 0) + 1);
            }

            int answer = 1;

            for (int count : counts.values()) {
                answer *= count + 1;
            }

            return answer - 1;
        }
    }
}
