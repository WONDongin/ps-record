package level2;

import java.util.ArrayDeque;
import java.util.Deque;
/*
문제: 올바른 괄호

문제 요약
- '('와 ')'로만 이루어진 문자열이 주어진다.
- 괄호의 짝이 올바르게 맞으면 true를 반환한다.
- 괄호의 순서가 잘못되었거나 짝이 맞지 않으면 false를 반환한다.

접근 방법
- 스택을 사용하여 열린 괄호를 관리한다.
- '('가 나오면 스택에 저장한다.
- ')'가 나오면 스택에서 '('를 제거한다.
- 제거할 '('가 없는데 ')'가 나오면 올바르지 않은 괄호이므로 false를 반환한다.
- 문자열 순회가 끝난 뒤 스택이 비어있으면 true, 남아있으면 false를 반환한다.

핵심 아이디어
- '('는 push, ')'는 pop으로 짝을 맞춘다.
- ')'가 나왔을 때 스택이 비어있다면 올바르지 않은 괄호이다.
- 모든 괄호를 처리한 후 스택이 비어있어야 올바른 괄호 문자열이다.

주의할 점
- 문자열이 ')'로 시작하는 경우를 처리해야 한다.
- 순회가 끝난 뒤 '('가 남아있는 경우 false를 반환해야 한다.
- 스택이 비어있는 상태에서 pop을 호출하면 예외가 발생하므로 먼저 확인해야 한다.

배운 점
- 괄호 짝 맞추기 문제는 스택의 대표적인 활용 예제이다.
- 현재 문제는 괄호 종류가 하나뿐이라 카운터 변수만으로도 해결 가능하다.
- 스택을 사용하면 다양한 괄호 종류가 추가되어도 쉽게 확장할 수 있다.
*/
public class No7 {
    class Solution {
        boolean solution(String s) {
            Deque<Character> stack = new ArrayDeque<>();

            for(int i = 0; i < s.length(); i++){
                char ch = s.charAt(i);

                if(ch == '('){
                    stack.push(ch);
                } else {
                    if(stack.isEmpty()){
                        return false;
                    }
                    stack.pop();
                }
            }

            return stack.isEmpty();
        }
    }
}
