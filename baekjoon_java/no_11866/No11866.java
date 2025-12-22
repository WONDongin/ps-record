package no_11866;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
문제-11866 (실버4): 요세푸스 문제0
- 입력: N, K가 주어지며, 1번부터 N번까지 사람들이 원을 이루고 앉아있음.
- 출력: K번째 사람을 제거하는 과정을 반복하여 제거된 순서를 출력.

주요 알고리즘

- Queue(큐)를 사용해서 원형 순열을 구현
- 매 K번째 요소를 제거하면서 결과에 추가
- 큐를 K-1번 rotate (poll 후 add)한 후, K번째 poll은 제거 (출력 대상)
*/
public class No11866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 사람 수
        int K = sc.nextInt(); // 제거할 순서

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            queue.offer(i); // 초기 큐에 1~N 삽입
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        while (!queue.isEmpty()) {
            // K-1번 앞으로 돌리기
            for (int i = 0; i < K - 1; i++) {
                queue.offer(queue.poll());
            }

            // K번째 사람 제거
            sb.append(queue.poll());
            if (!queue.isEmpty()) {
                sb.append(", ");
            }
        }

        sb.append(">");
        System.out.println(sb);
    }
}
