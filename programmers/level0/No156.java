package level0;
/*
문제: l로 만들기

로직
- 문자열을 앞에서부터 한 글자씩 확인한다.
- 현재 문자가 알파벳 순서상 'l'보다 앞서면 'l'로 변경한다.
- 'l' 이상인 문자는 그대로 저장한다.

핵심 구현
- char 자료형은 비교 연산자를 사용해 알파벳 순서를 비교할 수 있다.
- StringBuilder를 사용해 변환된 문자를 순서대로 저장했다.

포인트
- 'l' 자체는 변경하지 않아도 되므로 ch < 'l' 조건을 사용한다.
- 문자열 길이가 최대 100,000이므로 StringBuilder로 결과를 만든다.

회고
- 문자 비교를 활용하면 별도의 알파벳 목록 없이 간단하게 해결할 수 있다.
*/
public class No156 {
    class Solution {
        public String solution(String myString) {
            StringBuilder answer = new StringBuilder();

            for (int i = 0; i < myString.length(); i++) {
                char ch = myString.charAt(i);

                if (ch < 'l') {
                    answer.append('l');
                } else {
                    answer.append(ch);
                }
            }

            return answer.toString();
        }
    }
}
