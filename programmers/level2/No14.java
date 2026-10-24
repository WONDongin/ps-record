package level2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/*
문제: 귤 고르기

로직
- 귤을 크기별로 분류하여 각 크기의 개수를 센다.
- 크기별 개수를 내림차순으로 정렬한다.
- 개수가 많은 크기부터 선택하면서 k개를 채우는 데 필요한 종류 수를 구한다.

핵심 구현
- HashMap으로 크기별 귤의 개수를 저장한다.
- Map의 값들을 ArrayList로 옮겨 내림차순 정렬한다.
- 선택한 크기의 개수만큼 k에서 빼고 종류 수를 증가시킨다.

포인트
- 귤의 크기가 아닌 크기별 개수를 기준으로 정렬한다.
- 개수가 많은 크기부터 선택해야 서로 다른 종류 수를 최소화할 수 있다.
- 마지막 크기의 귤은 필요한 만큼만 선택할 수 있다.

회고
- HashMap을 활용해 크기별 빈도를 계산했다.
- 빈도가 높은 종류부터 선택하는 그리디 방식으로 해결했다.
*/
public class No14 {
    class Solution {
        public int solution(int k, int[] tangerine) {
            Map<Integer, Integer> countMap = new HashMap<>();

            for (int size : tangerine) {
                countMap.put(size, countMap.getOrDefault(size, 0) + 1);
            }

            List<Integer> counts = new ArrayList<>(countMap.values());
            counts.sort(Collections.reverseOrder());

            int answer = 0;

            for (int count : counts) {
                k -= count;
                answer++;

                if (k <= 0) {
                    break;
                }
            }

            return answer;
        }
    }
}
