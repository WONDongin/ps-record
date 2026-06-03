package level1;
/*
문제-문자열 내 마음대로 정렬하기

주요 알고리즘
- 문자열 정렬
- 커스텀 정렬 기준
- 사전순 정렬

접근 방법
- 각 문자열의 n번째 문자를 기준으로 오름차순 정렬한다.
- n번째 문자가 같으면 문자열 전체를 기준으로 사전순 정렬한다.

처리 흐름
1. Arrays.sort()에 Comparator를 적용한다.
2. 두 문자열의 n번째 문자를 비교한다.
3. n번째 문자가 다르면 해당 문자 기준으로 정렬한다.
4. n번째 문자가 같으면 compareTo()로 사전순 정렬한다.
5. 정렬된 strings 배열을 반환한다.
*/
import java.util.Arrays;

public class No46 {
    class Solution {
        public String[] solution(String[] strings, int n) {
            Arrays.sort(strings, (s1, s2) -> {
                if (s1.charAt(n) == s2.charAt(n)) {
                    return s1.compareTo(s2);
                }
                return s1.charAt(n) - s2.charAt(n);
            });

            return strings;
        }
    }
}
