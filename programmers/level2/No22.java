package level2;
import java.util.HashMap;
import java.util.Map;
/*
문제: 할인 행사

로직
- 원하는 제품과 수량을 Map에 저장한다.
- 연속된 10일 동안 할인하는 제품별 개수를 센다.
- 원하는 제품의 수량과 모두 일치하면 가입 가능한 날짜로 센다.
- 확인할 구간을 하루씩 옮기며 마지막 날짜까지 반복한다.

핵심 구현
- HashMap으로 제품별 수량을 관리한다.
- 구간을 옮길 때 빠지는 제품은 1개 줄이고, 새로 들어오는 제품은 1개 늘린다.
- 원하는 제품을 순회하며 현재 구간의 수량과 비교한다.

포인트
- 원하는 수량의 합이 10이므로 연속된 10일을 확인하면 된다.
- 마지막 10일 구간도 빠뜨리지 않고 확인한다.
- 원하는 제품이 구간에 없으면 수량을 0으로 처리한다.

회고
- 구간이 하루 이동할 때 바뀌는 제품은 두 개뿐이다.
- 이 두 제품의 수량만 갱신하면 매번 10일치를 다시 셀 필요가 없다.
*/
public class No22 {
    class Solution {
        public int solution(String[] want, int[] number, String[] discount) {
            Map<String, Integer> required = new HashMap<>();
            Map<String, Integer> current = new HashMap<>();

            for (int i = 0; i < want.length; i++) {
                required.put(want[i], number[i]);
            }

            for (int i = 0; i < 10; i++) {
                current.put(
                        discount[i],
                        current.getOrDefault(discount[i], 0) + 1
                );
            }

            int answer = matches(required, current) ? 1 : 0;

            for (int i = 10; i < discount.length; i++) {
                String removed = discount[i - 10];
                int remaining = current.get(removed) - 1;

                if (remaining == 0) {
                    current.remove(removed);
                } else {
                    current.put(removed, remaining);
                }

                String added = discount[i];
                current.put(
                        added,
                        current.getOrDefault(added, 0) + 1
                );

                if (matches(required, current)) {
                    answer++;
                }
            }

            return answer;
        }

        private boolean matches(
                Map<String, Integer> required,
                Map<String, Integer> current) {
            for (String product : required.keySet()) {
                if (current.getOrDefault(product, 0).intValue()
                        != required.get(product).intValue()) {
                    return false;
                }
            }

            return true;
        }
    }
}
