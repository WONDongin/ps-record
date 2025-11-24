package no_4949;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
/*
문제-4949 (실버4): 균형잡힌 세상
- 각 줄마다 해당 문자열이 균형을 이루고 있으면 "yes"를, 아니면 "no"를 출력한다.
- 입력의 종료조건으로 맨 마지막에 온점 하나(".")가 들어온다.

주요 메서드

- `stack.push(char)` : 여는 괄호 '(', '['를 스택에 저장
- `stack.peek()` : 닫는 괄호를 만났을 때 스택의 가장 위 괄호가 짝이 맞는지 확인
-`stack.pop()` : 짝이 맞는 경우 스택에서 해당 괄호를 제거
- `stack.isEmpty()` : 닫는 괄호가 등장했는데 스택이 비어 있는지 확인하여 불균형 여부를 판단

주요 알고리즘

- 입력된 문자열을 한 글자씩 순회하며 괄호의 균형 여부를 검사
- 여는 괄호는 스택에 push하고, 닫는 괄호는 스택의 top과 비교하여 짝이 맞을 때만 pop
- 문자열 내부에서 .이 등장하면 해당 줄에 대한 검사를 종료
- 검사 종료 후 스택이 비어 있으면 yes, 값이 남아 있으면 no를 출력
- 입력 한 줄이 "."이면 전체 프로그램을 종료
*/
public class No4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true){
            String str = br.readLine();
            // 입력 종료 조건
            if(str.equals(".")) break;

            Stack<Character> stack = new Stack<>();
            boolean isVPS = true;

            for(int i = 0; i < str.length(); i++){
                char ch = str.charAt(i);
                // 문장 내부(.) -> 검사 종료
                if(ch == '.') break;

                // 여는 괄호
                if(ch == '(' || ch == '['){
                    stack.push(ch);
                }
                // 닫는 괄호
                else if (ch == ')' || ch == ']') {
                    // 스택이 비어 있는지 검사
                    if(stack.isEmpty()) {
                        isVPS = false;
                        break;
                    }
                    // top과 ch가 짝이 맞는지 검사
                    char top = stack.peek();
                    if(ch == ')' && top == '('){
                        stack.pop();
                    } else if (ch == ']' && top == '[') {
                        stack.pop();
                    }
                    // 짝이 안 맞으면 → isVPS = false 후 break
                    else {
                        isVPS = false;
                        break;
                    }
                }
            }
            // 최종 비어있지 않으면 false
            if (!stack.isEmpty()) isVPS = false;

            if (isVPS) sb.append("yes\n");
            else sb.append("no\n");
        }
        // 결과출력
        System.out.println(sb);
    }
}
