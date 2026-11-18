package level2;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;
/*
문제: 프로세스

로직
- 프로세스의 초기 위치와 우선순위를 실행 대기 큐에 저장한다.
- 우선순위 큐에 모든 우선순위를 내림차순으로 저장한다.
- 대기 큐에서 꺼낸 프로세스보다 우선순위가 높은 프로세스가 있으면 다시 뒤에 넣는다.
- 현재 프로세스가 최고 우선순위라면 실행하고 실행 횟수를 증가시킨다.
- 실행한 프로세스의 초기 위치가 location이면 실행 순서를 반환한다.

핵심 구현
- Queue<int[]>에 초기 위치와 우선순위를 함께 저장한다.
- PriorityQueue를 내림차순으로 구성하여 남은 최고 우선순위를 확인한다.
- 실행할 때 우선순위 큐에서도 원소 하나를 제거한다.

포인트
- 우선순위가 같으면 대기 큐에서 먼저 꺼낸 프로세스를 실행한다.
- 큐에서 위치가 바뀌어도 초기 인덱스로 목표 프로세스를 구분한다.
- 실행 순서는 1부터 계산한다.

회고
- 대기 순서는 일반 큐로, 최고 우선순위는 우선순위 큐로 관리하여 실행 규칙을 구현했다.
*/
public class No32 {
    class Solution {
        public int solution(int[] priorities, int location) {
            Queue<int[]> queue = new ArrayDeque<>();
            PriorityQueue<Integer> priorityQueue =
                    new PriorityQueue<>(Collections.reverseOrder());

            for (int i = 0; i < priorities.length; i++) {
                queue.offer(new int[]{i, priorities[i]});
                priorityQueue.offer(priorities[i]);
            }

            int count = 0;

            while (!queue.isEmpty()) {
                int[] current = queue.poll();

                if (current[1] < priorityQueue.peek()) {
                    queue.offer(current);
                    continue;
                }

                priorityQueue.poll();
                count++;

                if (current[0] == location) {
                    return count;
                }
            }

            return -1;
        }
    }
}
