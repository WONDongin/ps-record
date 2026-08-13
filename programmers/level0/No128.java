package level0;

import java.util.Arrays;
/*
문제: 문자열 잘라서 정렬하기

로직
- myString을 문자 "x"를 기준으로 분리한다.
- 분리된 문자열 중 빈 문자열을 제외한다.
- 남은 문자열을 사전순으로 정렬하여 배열로 반환한다.

핵심 구현
- split("x")를 사용해 문자열을 분리한다.
- filter(str -> !str.isEmpty())로 빈 문자열을 제거한다.
- sorted()로 문자열을 사전순으로 정렬한다.
- toArray(String[]::new)로 String 배열을 생성한다.

포인트
- "x"가 연속으로 나오면 중간에 빈 문자열이 만들어질 수 있다.
- 문자열이 "x"로 시작하는 경우에도 빈 문자열을 제외해야 한다.
- String의 기본 sorted()는 사전순으로 정렬한다.

회고
- Stream을 사용해 문자열 분리, 빈 문자열 제거, 정렬 과정을
  하나의 흐름으로 간결하게 구현할 수 있었다.
*/
public class No128 {
    class Solution {
        public String[] solution(String myString) {
            return Arrays.stream(myString.split("x"))
                    .filter(str -> !str.isEmpty())
                    .sorted()
                    .toArray(String[]::new);
        }
    }
}
