package level2;
import java.util.ArrayDeque;
import java.util.Deque;
/*
문제: 괄호 회전하기

로직
- 문자열의 모든 위치를 시작점으로 잡고 괄호를 검사한다.
- 여는 괄호는 스택에 넣는다.
- 닫는 괄호는 스택의 마지막 괄호와 짝이 맞는지 확인한다.
- 끝까지 검사한 뒤 스택이 비어 있으면 정답을 1 증가시킨다.

핵심 구현
- (start + i) % s.length()로 회전한 문자열의 인덱스를 계산한다.
- ArrayDeque를 스택으로 사용해 괄호의 순서를 확인한다.
- 닫는 괄호의 짝이 없거나 종류가 다르면 검사를 종료한다.

포인트
- 괄호의 개수가 같아도 순서가 다르면 올바른 문자열이 아니다.
- 회전하지 않은 원본 문자열도 검사에 포함한다.
- 문자열 길이가 홀수이면 모든 괄호의 짝을 맞출 수 없다.

회고
- 문자열을 직접 회전시키지 않고 인덱스로 순서를 바꿔 확인했다.
- 스택을 사용하면 괄호의 종류와 중첩 순서를 함께 검사할 수 있다.
*/
public class No23 {
    class Solution {
        public int solution(String s) {
            if (s.length() % 2 != 0) {
                return 0;
            }

            int answer = 0;

            for (int start = 0; start < s.length(); start++) {
                if (isValid(s, start)) {
                    answer++;
                }
            }

            return answer;
        }

        private boolean isValid(String s, int start) {
            Deque<Character> stack = new ArrayDeque<>();

            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt((start + i) % s.length());

                if (ch == '(' || ch == '[' || ch == '{') {
                    stack.push(ch);
                    continue;
                }

                if (stack.isEmpty()) {
                    return false;
                }

                char open = stack.pop();

                if ((ch == ')' && open != '(')
                        || (ch == ']' && open != '[')
                        || (ch == '}' && open != '{')) {
                    return false;
                }
            }

            return stack.isEmpty();
        }
    }
}
