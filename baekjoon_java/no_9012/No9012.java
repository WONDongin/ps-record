package no_9012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
/*
문제-9012 (실버4): 괄호
- 만일 입력 괄호 문자열이 올바른 괄호 문자열(VPS)이면 “YES”, 아니면 “NO”를 한 줄에 하나씩 차례대로 출력

주요 메소드 및 알고리즘
`Stack<Character>`
- 여는 괄호 '('가 나오면 스택에 push
- 닫는 괄호 ')'가 나오면:
- 스택이 비어 있으면 → 잘못된 괄호 → NO
- 비어있지 않으면 → pop()으로 짝을 맞춤
*/
public class No9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++){
            String str = br.readLine();
            Stack<Character> stack = new Stack<>();
            boolean isVPS = true;

            for(int j = 0; j < str.length(); j++){
                char ch = str.charAt(j);
                if(ch == '('){
                    stack.push(ch);
                }else if (ch == ')'){
                    if(stack.isEmpty()){
                        isVPS = false;
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }

            // 반복 끝나고도 스택에 남아있는 괄호가 있다면 → NO
            if(!stack.isEmpty()) isVPS = false;

            if(isVPS){
                sb.append("YES\n");
            } else {
                sb.append("NO\n");
            }
        }

        System.out.println(sb);
    }
}
