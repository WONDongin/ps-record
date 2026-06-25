package level0;
/*
문제: 문자열 뒤집기

로직
- StringBuilder에 문자열을 저장한다.
- reverse()를 사용해 문자열을 뒤집는다.
- toString()으로 문자열로 변환하여 반환한다.

핵심 구현
- 핵심 코드
  ex)
  new StringBuilder(my_string).reverse().toString();

- 핵심 코드 설명
  StringBuilder의 reverse() 메서드를 이용해 문자열을 간단하게 뒤집고, toString()으로 최종 문자열을 반환한다.

포인트
- StringBuilder의 reverse()를 사용하면 반복문 없이 문자열을 뒤집을 수 있다.
- 코드가 간결하고 가독성이 좋다.

회고
- 문자열을 직접 순회하지 않아도 StringBuilder의 내장 메서드를 활용하면 더욱 효율적으로 구현할 수 있다는 점을 배웠다.
*/
public class No38 {
    class Solution {
        public String solution(String my_string) {
            return new StringBuilder(my_string).reverse().toString();
        }
    }
}
