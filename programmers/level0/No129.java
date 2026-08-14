package level0;

import java.util.Arrays;
/*
문제: x 사이의 개수

로직
- myString을 문자 "x"를 기준으로 분리한다.
- 분리된 각 문자열의 길이를 구한다.
- 길이를 입력 순서대로 int 배열에 저장하여 반환한다.

핵심 구현
- split("x", -1)을 사용해 문자열 끝의 빈 문자열까지 유지한다.
- mapToInt(String::length)로 각 문자열의 길이를 구한다.
- toArray()로 int 배열을 생성한다.

포인트
- "x"가 연속되면 그 사이에는 길이가 0인 빈 문자열이 생긴다.
- 문자열이 "x"로 끝나면 마지막 값으로 0이 포함되어야 한다.
- split("x")는 마지막 빈 문자열을 제거하므로 split("x", -1)을 사용해야 한다.

회고
- split()의 limit 값을 -1로 지정하면 마지막 빈 문자열까지
  유지할 수 있다는 점을 학습했다.
*/
public class No129 {
    class Solution {
        public int[] solution(String myString) {
            return Arrays.stream(myString.split("x", -1))
                    .mapToInt(String::length)
                    .toArray();
        }
    }
}
