package level0;
/*
문제: 문자열안에 문자열

로직
- String의 contains() 메서드를 사용한다.
- str1에 str2가 포함되어 있으면 1을 반환한다.
- 포함되어 있지 않으면 2를 반환한다.

핵심 구현
- 핵심 코드
  return str1.contains(str2) ? 1 : 2;

- 핵심 코드 설명
  - contains()는 특정 문자열이 포함되어 있는지 여부를 boolean으로 반환한다.
  - 삼항 연산자를 이용해 true면 1, false면 2를 반환한다.

포인트
- 문자열 포함 여부는 contains()를 사용하면 간단하게 확인할 수 있다.
- 대소문자를 구분하여 비교한다.

회고
- 문자열 탐색을 직접 구현하지 않고 Java에서 제공하는 메서드를 활용하면 코드가 훨씬 간결해진다.
- contains()는 문자열 포함 여부를 확인하는 대표적인 메서드이므로 익혀두면 다양한 문제에서 활용할 수 있다.
*/
public class No68 {
    class Solution {
        public int solution(String str1, String str2) {
            return str1.contains(str2) ? 1 : 2;
        }
    }
}
