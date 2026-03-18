package no_2161;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
/*
문제-2161: 카드1
- 1부터 N까지 카드가 있을 때,
  맨 위 카드를 버리고, 다음 카드를 맨 아래로 보내는 과정을 반복하여
  버리는 카드 순서를 출력하는 문제.

주요 메서드
- Queue를 활용한 FIFO 처리
- poll()로 제거, add()로 뒤에 추가

주요 알고리즘
- 자료구조: Queue (LinkedList)
- 시뮬레이션

탐색/처리 흐름
1. 1 ~ N까지 Queue에 삽입
2. Queue 크기가 1보다 클 때까지 반복
   → 맨 앞 카드 poll() 후 출력 (버리기)
   → 다음 카드 poll() 후 add() (뒤로 보내기)
3. 마지막 남은 카드 출력

핵심 포인트
- peek()가 아닌 poll()을 사용해야 실제 제거됨
- Queue의 FIFO 특성을 그대로 활용
- 문제 그대로 구현하는 시뮬레이션 문제
*/
public class No2161 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> que = new LinkedList<>();

        for(int i = 0 ; i < N; i++){
            que.add(i + 1);
        }

        StringBuilder sb = new StringBuilder();

        while (que.size() > 1){
            sb.append(que.poll()).append(" "); // 버리기
            que.add(que.poll()); // 다음 카드 뒤로 보내기
        }

        // 마지막 카드
        sb.append(que.poll());

        System.out.println(sb);
    }
}
