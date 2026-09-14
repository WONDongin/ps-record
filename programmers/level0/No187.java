package level0;
import java.util.ArrayList;
import java.util.List;
/*
문제: 세 개의 구분자

로직
- 문자열의 문자를 앞에서부터 확인한다.
- 현재 문자가 'a', 'b', 'c' 중 하나라면 구분자로 처리한다.
- 구분자가 아닐 경우 StringBuilder에 문자를 추가한다.
- 구분자를 만났을 때 저장된 문자열이 있다면 결과 리스트에 추가한다.
- 결과가 비어 있다면 ["EMPTY"]를 반환한다.

핵심 구현
- ch == 'a' || ch == 'b' || ch == 'c'로 구분자를 판별한다.
- word.length() > 0일 때만 결과에 추가하여 빈 문자열을 제외한다.
- word.setLength(0)으로 다음 문자열을 저장할 수 있도록 초기화한다.
- 마지막 문자열이 구분자로 끝나지 않는 경우 반복문 이후 별도로 추가한다.

포인트
- 구분자가 연속해서 등장해도 빈 문자열은 결과에 추가하지 않는다.
- 문자열 전체가 구분자로만 구성된 경우 ["EMPTY"]를 반환해야 한다.
- 문자열의 길이가 최대 1,000,000이므로 한 번의 순회로 처리한다.

회고
- StringBuilder를 사용하여 구분자 사이의 문자열을 효율적으로 만들었다.
- 연속된 구분자와 마지막 문자열 처리에 주의했다.
*/
public class No187 {
    class Solution {
        public String[] solution(String myStr) {
            List<String> answer = new ArrayList<>();
            StringBuilder word = new StringBuilder();

            for (char ch : myStr.toCharArray()) {
                if (ch == 'a' || ch == 'b' || ch == 'c') {
                    if (word.length() > 0) {
                        answer.add(word.toString());
                        word.setLength(0);
                    }
                } else {
                    word.append(ch);
                }
            }

            if (word.length() > 0) {
                answer.add(word.toString());
            }

            if (answer.isEmpty()) {
                return new String[]{"EMPTY"};
            }

            return answer.toArray(new String[0]);
        }
    }
}
