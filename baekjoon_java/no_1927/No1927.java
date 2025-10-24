package no_1927;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
/*
문제 (실버2) : 최소 힙

입력으로 주어지는 연산에 따라 최소 힙(PriorityQueue) 을 이용해 기능을 수행하는 프로그램 구현.
- 자연수 삽입 (x > 0)
- 최소값 출력 및 제거 (x == 0)
- 큐가 비어 있을 때 0을 출력하도록 예외 처리

주요 알고리즘
`PriorityQueue<Integer>` : Java 기본 최소 힙 구현체. 자동으로 오름차순 정렬.
`offer()` : 힙에 새로운 원소 삽입 (O(log N))
`poll()` : 최소값 반환 및 제거 (O(log N))
`isEmpty()` : 힙이 비어 있는지 확인 (O(1))
`StringBuilder` : 다수의 출력 결과를 효율적으로 모아 한 번에 출력 (O(N))

최소 힙 : new PriorityQueue<>()
- poll() 결과 : 최솟값 반환

최대 힙 : new PriorityQueue<>(Comparator.reverseOrder())
- poll() 결과 : 최댓값 반환


단일 스레드 → `ArrayDeque`
우선순위 필요 → `PriorityQueue`
멀티스레드 → `BlockingQueue` or `ConcurrentLinkedQueue`
*/
public class No1927 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> que = new PriorityQueue<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < N; i++){
            int x = Integer.parseInt(br.readLine());

            if(x == 0){
                sb.append(que.isEmpty() ? 0 : que.poll()).append('\n');
            } else {
                que.offer(x);
            }
        }
        System.out.println(sb);
    }
}
