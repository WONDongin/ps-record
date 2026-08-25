package level0;
/*
문제: 세로 읽기

로직
- c번째 열의 첫 번째 문자인 c - 1 인덱스부터 탐색한다.
- 인덱스를 m씩 증가시키며 같은 열의 문자를 찾는다.

핵심 구현
- for (int i = c - 1; i < my_string.length(); i += m)
- 찾은 문자를 StringBuilder에 추가한다.

포인트
- 문제의 열 번호는 1부터 시작하지만 문자열 인덱스는 0부터 시작한다.

회고
- 일정한 간격의 문자를 추출할 때 인덱스를 간격만큼 증가시키는 방법을 활용했다.
*/
public class No147 {
    class Solution {
        public String solution(String my_string, int m, int c) {
            StringBuilder answer = new StringBuilder();

            for (int i = c - 1; i < my_string.length(); i += m) {
                answer.append(my_string.charAt(i));
            }

            return answer.toString();
        }
    }
}
