package level2;
/*
문제: JadenCase 문자열 만들기

문제 요약
- 문자열 s를 JadenCase 형태로 변환한다.
- 각 단어의 첫 문자는 대문자로 만든다.
- 첫 문자를 제외한 나머지 문자는 소문자로 만든다.
- 공백이 연속해서 나올 수 있다.

접근 방법
- 문자열을 왼쪽부터 한 글자씩 확인한다.
- 현재 문자가 단어의 첫 글자인지 판단하기 위해 isFirst 변수를 사용한다.
- 공백을 만나면 다음 문자가 새 단어의 첫 글자가 되도록 처리한다.
- 공백이 아니면 첫 글자는 대문자, 나머지는 소문자로 변환한다.

핵심 아이디어
- split()을 사용하면 연속 공백이나 마지막 공백 처리가 까다로울 수 있다.
- 문자 단위로 순회하면서 공백도 그대로 answer에 추가한다.
- 공백 이후 첫 번째 문자인지만 판단하면 JadenCase 변환을 쉽게 처리할 수 있다.

주의할 점
- 공백 문자는 결과 문자열에 그대로 유지해야 한다.
- 숫자가 단어의 첫 문자일 경우 숫자는 그대로 두고, 뒤의 알파벳은 소문자로 변환해야 한다.
- 공백이 연속으로 나올 수 있으므로 split()보다는 charAt() 기반 처리가 안전하다.

배운 점
- Character.toUpperCase(), Character.toLowerCase()를 사용하면 문자 대소문자 변환을 쉽게 처리할 수 있다.
- 문자열 문제에서 공백 유지가 중요할 때는 split()보다 직접 순회 방식이 더 안정적이다.
*/
public class No5 {
    class Solution {
        public String solution(String s) {
            String answer = "";
            boolean isFirst = true;

            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);

                if (ch == ' ') {
                    answer += ch;
                    isFirst = true;
                } else {
                    if (isFirst) {
                        answer += Character.toUpperCase(ch);
                        isFirst = false;
                    } else {
                        answer += Character.toLowerCase(ch);
                    }
                }
            }

            return answer;
        }
    }
}
