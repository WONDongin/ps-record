package level0;
/*
문제: 원하는 문자열 찾기

로직
- myString의 모든 문자를 순서대로 확인한다.
- 문자가 'A'라면 'B'로, 'B'라면 'A'로 변환한다.
- 변환한 문자열에 pat이 포함되어 있는지 확인한다.

핵심 구현
- c == 'A' ? 'B' : 'A'로 문자를 반대로 변환한다.
- contains(pat)을 사용해 연속된 부분 문자열의 존재 여부를 확인한다.

포인트
- contains()는 문자가 연속해서 일치하는 부분 문자열이 있는지 확인한다.
- 포함되어 있으면 1, 포함되어 있지 않으면 0을 반환한다.

회고
- 삼항 연산자와 contains()를 사용해 문자 변환과 부분 문자열 검사를
  간결하게 구현할 수 있었다.
*/
public class No124 {
    class Solution {
        public int solution(String myString, String pat) {
            StringBuilder converted = new StringBuilder();

            for (char c : myString.toCharArray()) {
                converted.append(c == 'A' ? 'B' : 'A');
            }

            return converted.toString().contains(pat) ? 1 : 0;
        }
    }
}
