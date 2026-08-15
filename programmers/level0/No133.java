package level0;
/*
문제: 소문자로 바꾸기

로직
- myString의 모든 알파벳을 소문자로 변환한다.
- 변환된 문자열을 반환한다.

핵심 구현
- toLowerCase()를 사용해 모든 대문자를 소문자로 변경한다.

포인트
- 이미 소문자인 문자는 그대로 유지된다.
- String은 불변 객체이므로 원본 문자열이 변경되는 것이 아니라
  변환된 새로운 문자열이 반환된다.

회고
- Java의 문자열 메서드인 toLowerCase()를 사용하여
  반복문 없이 간단하게 해결할 수 있었다.
*/
public class No133 {
    class Solution {
        public String solution(String myString) {
            return myString.toLowerCase();
        }
    }
}
