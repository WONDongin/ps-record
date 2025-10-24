package no_10828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
/*
문제(실버4) : 정수를 저장하는 스택을 직접 구현하고, 입력된 명령어(push, pop, size, empty, top)를 처리하는 프로그램

1. N 읽기
2. 스택 생성 (`Deque<Integer>`)
3. N번 반복:
   - 명령어 입력받기
   - `switch` 문으로 분기:
       push X → `addLast(X)`
       pop    → `pollLast()` (없으면 -1)
       size   → `size()`
       empty  → `isEmpty() ? 1 : 0`
       top    → `peekLast()` (없으면 -1)
4. `StringBuilder`에 결과 저장
5. 마지막에 한 번에 출력

- 스택 원리: FILO (마지막에 들어온 게 먼저 나감)
- 핵심 메서드: `addLast()`, `pollLast()`, `peekLast()`
- 알고리즘 복잡도: 모든 연산 O(1)
- 실무 스타일: Deque<Integer> + ArrayDeque + 입출력 최적화

Deque(Double Ended Queue) 란?
- 앞(front)과 뒤(back) 양쪽에서 삽입과 삭제가 가능한 자료구조

스택(Stack): 한쪽에서만 넣고 빼는 구조 (LIFO)
큐(Queue): 한쪽에서 넣고 반대쪽에서 빼는 구조 (FIFO)
Deque: 둘 다 가능
- Deque는 Stack과 Queue를 모두 표현할 수 있는 “상위 개념”입니다.
*/
public class No10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> stack = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        while (N-- > 0){
            String[] command = br.readLine().split(" ");

            switch (command[0]){
                case "push" :
                    int x = Integer.parseInt(command[1]);
                    stack.addLast(x);
                    break;
                case "pop" :
                    Integer pop = stack.pollLast();
                    sb.append(pop == null ? -1 : pop).append("\n");
                    break;
                case "size" :
                    sb.append(stack.size()).append("\n");
                    break;
                case "empty" :
                    sb.append(stack.isEmpty() ? 1 : 0).append("\n");
                    break;
                case  "top" :
                    Integer top = stack.peekLast();
                    sb.append(top == null ? -1 : top).append("\n");
                    break;
            }
        }

        System.out.println(sb);
    }
}
