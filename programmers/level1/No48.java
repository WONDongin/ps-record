package level1;

import java.util.PriorityQueue;
/*
문제: 명예의 전당 (1)

- 매일 가수의 점수가 주어진다.
- 명예의 전당에는 항상 상위 k개의 점수만 유지한다.
- 매일 명예의 전당에 포함된 점수 중 최하위 점수를 기록한다.

접근 방법
- PriorityQueue(최소 힙)를 사용한다.
- 점수를 하나씩 추가한다.
- 힙의 크기가 k를 초과하면 가장 작은 점수를 제거한다.
- 힙의 최솟값(peek)이 현재 명예의 전당의 최하위 점수가 된다.

핵심 아이디어
- 최소 힙에는 항상 상위 k개의 점수만 유지한다.
- 힙 크기가 k를 넘어가면 가장 작은 점수를 제거하여 상위 k개만 남긴다.
- peek() 값이 매일 발표되는 명예의 전당 최하위 점수이다.

주의할 점
- k일 이전에는 모든 점수가 명예의 전당에 포함된다.
- 동일한 점수도 각각 하나의 점수로 처리해야 한다.
- 정답 배열의 길이는 score 배열의 길이와 같다.

배운 점
- PriorityQueue를 이용하면 상위 K개 유지 문제를 효율적으로 해결할 수 있다.
- 최소 힙을 활용하면 현재 최하위 점수를 O(1)에 확인할 수 있다.
*/
public class No48 {
    class Solution {
        public int[] solution(int k, int[] score) {

            int[] answer = new int[score.length];

            PriorityQueue<Integer> pq = new PriorityQueue<>();

            for (int i = 0; i < score.length; i++) {

                pq.offer(score[i]);

                if (pq.size() > k) {
                    pq.poll();
                }

                answer[i] = pq.peek();
            }

            return answer;
        }
    }
}
