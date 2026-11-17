package level2;
import java.util.LinkedList;
import java.util.Locale;
/*
문제: [1차] 캐시

로직
- 도시 이름을 소문자로 변환하여 대소문자를 구분하지 않는다.
- 캐시에 도시가 있으면 실행시간에 1을 더한다.
- 캐시에 도시가 없으면 실행시간에 5를 더한다.
- 캐시가 가득 차면 가장 오래 사용하지 않은 도시를 제거한다.
- 현재 도시를 캐시의 마지막에 추가하여 최근 사용 순서를 갱신한다.

핵심 구현
- LinkedList의 앞쪽은 가장 오래 사용하지 않은 도시로 관리한다.
- remove(name)의 반환값으로 캐시 적중 여부를 확인한다.
- 캐시 적중 시 기존 위치에서 제거한 뒤 마지막에 다시 추가한다.
- 캐시 미스 시 공간이 부족하면 removeFirst()로 교체한다.

포인트
- 캐시 크기가 0이면 모든 요청이 캐시 미스이므로 도시 수에 5를 곱한다.
- 캐시 적중 시에도 최근 사용 순서를 반드시 갱신한다.
- Locale.ROOT를 사용해 실행 환경에 영향받지 않고 소문자로 변환한다.

회고
- 도시의 사용 순서를 리스트로 관리하여 LRU 캐시 교체 방식을 구현했다.
*/
public class No31 {
    class Solution {
        public int solution(int cacheSize, String[] cities) {
            if (cacheSize == 0) {
                return cities.length * 5;
            }

            LinkedList<String> cache = new LinkedList<>();
            int answer = 0;

            for (String city : cities) {
                String name = city.toLowerCase(Locale.ROOT);

                if (cache.remove(name)) {
                    answer += 1;
                } else {
                    answer += 5;

                    if (cache.size() == cacheSize) {
                        cache.removeFirst();
                    }
                }

                cache.addLast(name);
            }

            return answer;
        }
    }
}
