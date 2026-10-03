package level0;
import java.util.ArrayList;
import java.util.List;
/*
제목 : [프로그래머스] 소인수분해

문제 설명
- 자연수 n을 소인수분해한 결과를 배열로 반환합니다.
- 소인수는 중복 없이 오름차순으로 담습니다.

풀이 방법
- 2부터 시작해 i * i <= n인 동안 나누어지는 수를 찾습니다.
- n이 i로 나누어지면 i를 리스트에 한 번 추가합니다.
- while문으로 해당 소인수를 모두 나누어 중복 저장을 방지합니다.
- 반복문 종료 후 n이 1보다 크면 남은 n도 소인수이므로 추가합니다.
- 리스트를 int 배열로 변환하여 반환합니다.

시간 및 공간 복잡도
- 시간 복잡도: O(√n)
- 공간 복잡도: O(k), k는 서로 다른 소인수의 개수

입출력 예
- n=12 → [2, 3]
- n=17 → [17]
- n=420 → [2, 3, 5, 7]
*/
public class No224 {
    class Solution {
        public int[] solution(int n) {
            List<Integer> factors = new ArrayList<>();

            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    factors.add(i);

                    while (n % i == 0) {
                        n /= i;
                    }
                }
            }

            if (n > 1) {
                factors.add(n);
            }

            return factors.stream()
                    .mapToInt(Integer::intValue)
                    .toArray();
        }
    }
}
