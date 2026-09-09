package level0;
/*
문제: 글자 지우기

로직
- 문자열 길이만큼 boolean 배열을 생성한다.
- indices에 포함된 인덱스를 삭제 대상으로 표시한다.
- 문자열을 순회하면서 삭제 대상이 아닌 문자만 이어 붙인다.

핵심 구현
- deleted[index]를 true로 설정하여 삭제할 위치를 기록한다.
- deleted[i]가 false인 경우에만 StringBuilder에 문자를 추가한다.

포인트
- 문자열에서 문자를 직접 삭제하면 이후 인덱스가 변경될 수 있다.
- 삭제할 위치를 먼저 표시하면 기존 인덱스를 그대로 사용할 수 있다.

회고
- boolean 배열을 사용하여 인덱스 변경 문제 없이 필요한 문자만 추출했다.
*/
public class No173 {
    class Solution {
        public String solution(String my_string, int[] indices) {
            boolean[] deleted = new boolean[my_string.length()];

            for (int index : indices) {
                deleted[index] = true;
            }

            StringBuilder answer = new StringBuilder();

            for (int i = 0; i < my_string.length(); i++) {
                if (!deleted[i]) {
                    answer.append(my_string.charAt(i));
                }
            }

            return answer.toString();
        }
    }
}
