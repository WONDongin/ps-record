package no_1966;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
문제-1966 (실버3): 프린터 큐
- 중요도가 있는 문서들이 큐에 들어있다.
- 현재 큐에서 가장 중요도가 높은 문서만 출력 가능하다.
- 그렇지 않으면 문서를 큐의 맨 뒤로 이동시킨다.
- 특정 문서(M)가 몇 번째로 출력되는지 구한다.

접근 방법
- `Queue` : 문서의 현재 출력 순서를 관리
- `PriorityQueue (Max-Heap)` : 현재 출력 가능한 최고 중요도 확인
- 문서가 실제로 출력될 때만 출력 횟수를 증가

핵심 포인트
- 같은 중요도라도 큐의 순서가 유지
- `PriorityQueue`는 비교용으로만 사용
- 테스트 케이스마다 자료구조를 초기화해야 한다.
*/

public class No1966 {

    /*
    문서 정보를 담는 클래스
    - priority : 문서 중요도
    - index    : 입력 시 문서의 위치 (타겟 문서 판별용)
    */
    static class Document {
        int priority;
        int index;

        Document(int priority, int index) {
            this.priority = priority;
            this.index = index;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()); // 테스트 케이스 수

        for (int tc = 0; tc < t; tc++) {

            // 문서 수(n), 찾고 싶은 문서 위치(m)
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            // 문서 순서 관리용 큐
            Queue<Document> queue = new LinkedList<>();

            // 중요도 비교용 최대 힙
            PriorityQueue<Integer> pq =
                    new PriorityQueue<>(Collections.reverseOrder());

            // 입력 처리
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                int priority = Integer.parseInt(st.nextToken());

                // 큐에는 문서 정보 전체 저장
                queue.offer(new Document(priority, i));

                // PQ에는 중요도만 저장
                pq.offer(priority);
            }

            int count = 0; // 출력 횟수

            // 프린터 동작 시뮬레이션
            while (true) {
                Document cur = queue.poll();

                // 현재 문서가 가장 높은 중요도라면 출력
                if (cur.priority == pq.peek()) {
                    pq.poll();      // 중요도 제거
                    count++;        // 출력 횟수 증가

                    // 찾고 있던 문서라면 결과 출력 후 종료
                    if (cur.index == m) {
                        System.out.println(count);
                        break;
                    }
                } else {
                    // 중요도가 더 높은 문서가 존재하면 뒤로 이동
                    queue.offer(cur);
                }
            }
        }
    }
}
