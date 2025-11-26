package no_1874;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/*
문제-1874 (실버2): 스택 수열
- 주어진 수열을 스택 연산(push, pop)을 이용해 만들 수 있는지 확인
- 가능하면 연산 순서 출력 (+, -), 불가능하면 "NO" 출력

주요 메서드

`Stack<Integer> stack` = new Stack<>(); : 수열을 만들기 위한 스택 초기화
`stack.push(current)`; : 현재 숫자를 스택에 넣는 연산 (+ 출력 대상)
`stack.pop();` : 스택에서 숫자를 꺼내는 연산 (- 출력 대상)
`stack.peek();` : 스택 맨 위의 숫자가 목표 수와 일치하는지 확인
`StringBuilder sb = new StringBuilder();` : 연산 결과를 빠르게 저장 및 출력

주요 알고리즘

스택 시뮬레이션 (Stack Simulation) :
- 오름차순으로 push하면서, 주어진 수열을 만들기 위해 pop을 수행하는 과정을 그대로 시뮬레이션

제한된 조건 하의 순차 처리 :
- 1부터 N까지 오름차순으로만 push 가능하다는 조건 하에 수열을 완성할 수 있는지 판단

실패 조건 조기 탈출 :
- 목표 수가 스택의 top에 없을 경우, 더 이상 진행이 불가능하므로 "NO" 출력 후 프로그램 종료
*/
public class No1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 만들고자하는 수열
        int[] target = new int[N];
        for(int i = 0; i < N; i++){
            target[i] = Integer.parseInt(br.readLine());
        }

        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int current = 1; // 다음에 push할 수

        for(int i = 0; i < N; i++){
            int num = target[i]; // 수열의 현재 숫자

            // 스택에 현재 숫자까지 push (오름차순)
            while (current <= num){
                stack.push(current);
                sb.append("+").append("\n");
                current++;
            }

            // 스택의 top이 목표 숫자라면 pop
            if(stack.peek() == num){
                stack.pop();
                sb.append("-").append("\n");
            } else {
                // 만들 수 없는 수열인 경우
                System.out.println("No");
                return;
            }
        }

        System.out.println(sb);
    }
}
