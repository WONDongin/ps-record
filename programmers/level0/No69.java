package level0;
/*
문제: 문자열안에 문자열

로직
- contains() 메서드로 str2가 str1에 포함되어 있는지 확인한다.
- 포함되어 있으면 1을, 그렇지 않으면 2를 반환한다.

핵심 구현
- 핵심 코드
  return str1.contains(str2) ? 1 : 2;

- 핵심 코드 설명
  - contains()는 문자열 포함 여부를 boolean으로 반환한다.
  - 삼항 연산자를 이용해 결과에 따라 1 또는 2를 반환한다.

포인트
- 문자열 탐색을 직접 구현하지 않고 Java에서 제공하는 contains()를 활용했다.
- contains()는 대소문자를 구분하여 비교한다.

회고
- 문자열 포함 여부를 확인하는 문제는 contains()를 사용하면 가장 간단하게 해결할 수 있다.
- Java에서 자주 사용하는 문자열 메서드를 익혀두면 구현 시간을 줄일 수 있다.
*/
public class No69 {
    class Solution {
        public int solution(String str1, String str2) {
            return str1.contains(str2) ? 1 : 2;
        }
    }
}
