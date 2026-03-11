package no_1417;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
/*
문제-1417: 국회의원 선거
- 다솜이가 선거에서 이기기 위해 다른 후보의 표를 매수할 수 있다.
- 한 번 매수할 때마다 다른 후보의 표는 1 감소하고 다솜의 표는 1 증가한다.
- 다솜이가 단독 1등이 되기 위해 필요한 최소 매수 횟수를 구하는 문제.

주요 메서드
- PriorityQueue<Integer> : 후보 표를 관리 (최대 힙)
- pq.peek() : 현재 가장 많은 표를 가진 후보 확인
- pq.poll() : 가장 많은 표를 가진 후보 제거
- pq.add() : 표를 줄인 후보 다시 삽입

주요 알고리즘
- 우선순위 큐 (PriorityQueue, 최대 힙)
- 그리디 / 시뮬레이션

탐색/처리 흐름
1. 후보 수 N 입력
2. 첫 번째 후보(다솜)의 표 입력
3. 나머지 후보들의 표를 PriorityQueue에 저장
4. 현재 최다 득표자가 다솜보다 크거나 같으면 반복
5. 최다 득표자의 표를 1 감소시키고 다솜의 표를 1 증가
6. 매수 횟수 count 증가
7. 수정된 후보 표를 다시 PriorityQueue에 삽입
8. 다솜이 단독 1등이 되면 반복 종료 후 count 출력

핵심 포인트
- PriorityQueue를 최대 힙으로 설정하여 항상 최다 득표자를 빠르게 찾는다.
- pq.peek() >= dasom 조건으로 다솜이 단독 1등이 될 때까지 반복한다.
- poll → 표 감소 → add 과정으로 후보 표를 계속 갱신한다.
*/
public class No1417 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        int dasom = Integer.parseInt(br.readLine());

        for(int i = 0; i < N - 1; i++){
            pq.add(Integer.parseInt(br.readLine()));
        }

        int count = 0;

        while (!pq.isEmpty() && pq.peek() >= dasom){
            int top = pq.poll();
            top--;
            dasom++;
            count++;

            pq.add(top);
        }

        System.out.println(count);
    }
}
