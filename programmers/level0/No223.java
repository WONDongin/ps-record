package level0;
/*
제목 : [프로그래머스] 조건 문자열 Java 풀이

문제 설명
- `ineq`와 `eq`에 따라 두 정수 `n`, `m`을 비교합니다.
- 비교 조건을 만족하면 1, 만족하지 않으면 0을 반환합니다.

풀이 방법
- `ineq`가 `">"`이면 크다 비교, `"<"`이면 작다 비교를 수행합니다.
- `eq`가 `"="`이면 같은 값도 포함합니다.
- 삼항 연산자로 비교 결과를 1 또는 0으로 변환합니다.

시간 및 공간 복잡도
- 시간 복잡도: O(1)
- 공간 복잡도: O(1)

입출력 예
- `ineq="<"`, `eq="="`, `n=20`, `m=50` → `1`
- `ineq=">"`, `eq="!"`, `n=41`, `m=78` → `0`
*/
public class No223 {
    class Solution {
        public int solution(String ineq, String eq, int n, int m) {
            boolean result;

            if (ineq.equals(">")) {
                result = eq.equals("=") ? n >= m : n > m;
            } else {
                result = eq.equals("=") ? n <= m : n < m;
            }

            return result ? 1 : 0;
        }
    }
}
