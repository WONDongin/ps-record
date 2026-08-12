package level0;
/*
문제: 공백으로 구분하기 2

로직
- 문자열 앞뒤에 있는 공백을 제거한다.
- 한 개 이상의 연속된 공백을 기준으로 문자열을 분리한다.
- 분리된 단어들을 문자열 배열로 반환한다.

핵심 구현
- trim()으로 문자열 양쪽 끝의 공백을 제거한다.
- split("\\s+")를 사용해 연속된 공백을 하나의 구분자로 처리한다.

포인트
- "\\s+"에서 \\s는 공백 문자를 의미하고, +는 한 개 이상을 의미한다.
- split(" ")만 사용하면 연속된 공백 사이에 빈 문자열이 생길 수 있다.

회고
- 정규 표현식을 활용해 공백의 개수와 관계없이 단어를 분리할 수 있었다.
*/
public class No126 {
    class Solution {
        public String[] solution(String my_string) {
            return my_string.trim().split("\\s+");
        }
    }
}
