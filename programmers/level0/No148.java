package level0;
/*
문제: 접두사인지 확인하기

로직
- is_prefix가 my_string의 시작 부분과 일치하는지 확인한다.
- 접두사이면 1, 아니면 0을 반환한다.

핵심 구현
- startsWith()를 사용해 문자열의 시작 부분을 비교한다.

포인트
- is_prefix가 my_string보다 길어도 startsWith()가 자동으로 false를 반환한다.

회고
- 문자열의 접두사를 확인할 때 startsWith()를 활용하면 간단하게 구현할 수 있다.
*/
public class No148 {
    class Solution {
        public int solution(String my_string, String is_prefix) {
            return my_string.startsWith(is_prefix) ? 1 : 0;
        }
    }
}
