package kakaco;
import java.util.Locale;
/*
문제: 신규 아이디 추천

로직
- 입력된 아이디의 대문자를 소문자로 변경한다.
- 허용되지 않는 문자를 제거한다.
- 연속된 마침표를 하나로 줄이고 양 끝의 마침표를 제거한다.
- 빈 문자열이면 "a"를 대입한다.
- 길이가 15자를 초과하면 자르고 끝의 마침표를 제거한다.
- 길이가 3보다 짧으면 마지막 문자를 반복해서 붙인다.

핵심 구현
- toLowerCase()로 대문자를 소문자로 변환한다.
- replaceAll()과 정규식을 활용해 문자 제거 및 마침표 처리를 수행한다.
- substring()으로 최대 길이를 제한한다.
- while문으로 최소 길이 3을 맞춘다.

포인트
- 문제에서 제시한 7단계의 처리 순서를 지킨다.
- 정규식에서 마침표는 일반 문자로 인식하도록 처리한다.
- 15자로 자른 뒤 끝에 마침표가 생길 수 있으므로 다시 제거한다.
- 빈 문자열 처리를 먼저 수행하여 마지막 문자 접근을 안전하게 한다.

회고
- 문자열 메서드와 정규식을 활용하여 각 단계를 간결하게 구현했다.
- 문자열 변경 후 새롭게 발생할 수 있는 조건까지 확인했다.
*/
public class No9 {
    class Solution {
        public String solution(String new_id) {
            // 1단계: 대문자를 소문자로 변환
            String answer = new_id.toLowerCase(Locale.ROOT);

            // 2단계: 허용되지 않는 문자 제거
            answer = answer.replaceAll("[^a-z0-9._-]", "");

            // 3단계: 연속된 마침표를 하나로 변환
            answer = answer.replaceAll("\\.{2,}", ".");

            // 4단계: 처음과 끝의 마침표 제거
            answer = answer.replaceAll("^\\.|\\.$", "");

            // 5단계: 빈 문자열이면 "a" 대입
            if (answer.isEmpty()) {
                answer = "a";
            }

            // 6단계: 최대 15자로 제한하고 끝의 마침표 제거
            if (answer.length() > 15) {
                answer = answer.substring(0, 15);
            }
            answer = answer.replaceAll("\\.$", "");

            // 7단계: 마지막 문자를 반복하여 최소 3자로 설정
            while (answer.length() < 3) {
                answer += answer.charAt(answer.length() - 1);
            }

            return answer;
        }
    }
}
