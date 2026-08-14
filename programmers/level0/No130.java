package level0;
/*
문제: 공백으로 구분하기 1

로직
- my_string을 공백을 기준으로 분리한다.
- 분리된 단어들을 문자열 배열로 반환한다.

핵심 구현
- split(" ")을 사용하여 공백을 기준으로 문자열을 나눈다.

포인트
- 문제에서 단어는 공백 한 개로 구분된다고 명시되어 있다.
- 문자열의 맨 앞과 뒤에는 공백이 없으므로 trim()이 필요하지 않다.
- split()의 반환 타입은 String[]이므로 바로 반환할 수 있다.

회고
- split()을 활용하여 반복문 없이 문자열을 간단하게 분리할 수 있었다.
*/
public class No130 {
    class Solution {
        public String[] solution(String my_string) {
            return my_string.split(" ");
        }
    }
}
