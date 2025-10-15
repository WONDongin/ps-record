package no_10845;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
/*
문제(실버4) : 큐
- 정수를 저장하는 큐(Queue) 를 구현하고, 명령어를 처리하는 문제
- 명령어 종류: push, pop, size, empty, front, back
<br>

주요 처리
- `push X` → 큐 뒤에 삽입 (`addLast`)
- `pop` → 큐 앞에서 제거 (`pollFirst`, 없으면 `-1`)
- `front` / `back` → `peekFirst` / `peekLast`
- `size`, `empty` → 각각 `size()` / `isEmpty()` 사용
<br>

주요 메서드
`addLast(E e)` : 큐의 **뒤에 요소 추가** (`push` 명령 처리)
`pollFirst()` : 큐의 **앞에서 제거 후 반환** (`pop`)
`peekFirst()` : 큐의 **앞 요소 조회** (`front`)
`peekLast()` : 큐의 **뒤 요소 조회** (`back`)
`size()` : 큐의 현재 크기 반환
`isEmpty()` : 큐가 비어있는지 여부 반환 (`0` 또는 `1`)
*/
public class No10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Deque<Integer> que = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        while (N-- > 0){
            String[] command = br.readLine().split(" ");
            switch (command[0]){
                case "push" :
                    int X = Integer.parseInt(command[1]);
                    que.addLast(X);
                    break;
                case  "pop" :
                    Integer pop = que.pollFirst();
                    sb.append(pop == null ? -1 : pop).append("\n");
                    break;
                case "size" :
                    sb.append(que.size()).append("\n");
                    break;
                case "empty" :
                    sb.append(que.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "front" :
                    Integer front = que.peekFirst();
                    sb.append(front == null ? -1 : front).append("\n");
                    break;
                case "back" :
                    Integer back = que.peekLast();
                    sb.append(back == null ? -1 : back).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}
