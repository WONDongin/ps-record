package no_1021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;
/*
문제-1021 (실버3): 회전하는 큐
- 큐에 처음에 포함되어 있던 수 N이 주어진다. 그리고 지민이가 뽑아내려고 하는 원소의 위치가 주어진다. (이 위치는 가장 처음 큐에서의 위치이다.) 이때, 그 원소를 주어진 순서대로 뽑아내는데 드는 2번, 3번 연산의 최솟값을 출력하는 프로그램

주요 메서드

- `Deque<Integer> deque = new LinkedList<>();` : 양방향 회전을 위해 Deque 사용
- `deque.addLast(deque.pollFirst());` : 왼쪽으로 한 칸 회전 (2번 연산)
- `deque.addFirst(deque.pollLast());` : 오른쪽으로 한 칸 회전 (3번 연산)
- `deque.pollFirst();` : 맨 앞 원소 제거 (1번 연산: 뽑기)

주요 알고리즘

- 시뮬레이션 (Simulation) : 큐 회전과 삭제를 실제로 구현하여 문제를 해결
- 그리디 (Greedy) : 각 숫자를 뽑을 때마다, 회전 방향을 최소 연산 횟수 기준으로 선택
- Deque 자료구조 활용 : 양방향 회전을 빠르게 처리하기 위해 Deque 사용
*/
public class No1021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]); // 큐의 크기
        int M = Integer.parseInt(str[1]); // 뽑아낼 숫자 개수

        // 뽑아낼 숫자 배열
        int[] targets = new int[M];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            targets[i] = Integer.parseInt(st.nextToken());
        }

        // 1~N까지 양방향 큐에 삽입
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 1; i <= N; i++) deque.add(i);

        int cnt = 0; // 회전 횟수 누적

        for (int target : targets) {
            // target이 현재 deque에서 몇 번째 위치에 있는지 찾기
            int idx = 0;
            for (int val : deque) {
                if (val == target) break;
                idx++;
            }

            // 중간 지점(왼쪽/오른쪽 중 어떤 방향이 더 가까운지 판단)
            int halfIdx = deque.size() / 2;

            if (idx <= halfIdx) {
                // 왼쪽 회전이 더 가까움
                for (int i = 0; i < idx; i++) {
                    deque.addLast(deque.pollFirst());
                    cnt++;
                }
            } else {
                // 오른쪽 회전이 더 가까움
                for (int i = 0; i < deque.size() - idx; i++) {
                    deque.addFirst(deque.pollLast());
                    cnt++;
                }
            }

            // target을 맨 앞에서 제거
            deque.pollFirst();
        }

        // 총 회전 횟수 출력
        System.out.println(cnt);
    }
}
