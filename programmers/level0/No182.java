package level0;
/*
문제: 중복된 문자 제거

로직
- my_string의 문자를 앞에서부터 하나씩 확인한다.
- 현재 문자가 결과 문자열에 없는 경우에만 추가한다.
- 이미 추가된 문자는 건너뛴다.

핵심 구현
- StringBuilder를 사용하여 중복되지 않은 문자를 저장한다.
- indexOf()의 반환값이 -1인지 확인하여 문자의 중복 여부를 판단한다.

포인트
- 문자열을 앞에서부터 확인하므로 중복 문자 중 가장 먼저 등장한 문자가 남는다.
- 대문자와 소문자, 공백을 서로 다른 문자로 처리한다.

회고
- 문자의 등장 순서를 유지하면서 indexOf()로 중복을 간단하게 제거했다.
*/
public class No182 {
    class Solution {
        public String solution(String my_string) {
            StringBuilder answer = new StringBuilder();

            for (char c : my_string.toCharArray()) {
                if (answer.indexOf(String.valueOf(c)) == -1) {
                    answer.append(c);
                }
            }

            return answer.toString();
        }
    }
}
