package no_18429;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
문제-18429 (실버3): 근손실
- N개의 운동 키트가 주어진다.
- 하루에 하나의 키트를 선택하여 N일 동안 운동한다.
- 시작 근력은 500이며, 매일 (키트 효과 - K) 만큼 근력이 변한다.
- 어느 날이든 근력이 500 미만이 되면 실패한다.
- 끝까지 조건을 만족하는 경우의 수를 구한다.

주요 메서드
- BufferedReader / StringTokenizer : 입력 처리
- dfs(day, power) : 백트래킹 탐색

주요 알고리즘
- 백트래킹 (순열)
- 모든 키트의 사용 순서를 탐색
- 근력이 500 미만이 되는 순간 가지치기(pruning)

시간 복잡도
- O(N!) (최대 N ≤ 8)

공간 복잡도
- O(N) (used 배열, 재귀 스택)

탐색 흐름
1. 하루에 사용할 키트를 하나 선택
2. 근력 갱신
3. 500 미만이면 즉시 중단
4. N일까지 도달하면 경우의 수 증가
*/

public class No18429 {
    static int N, K;
    static int[] kit;
    static boolean[] used;
    static int answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        kit = new int[N];
        used = new boolean[N];

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            kit[i] = Integer.parseInt(st2.nextToken());
        }

        // 시작: 0일차, 초기 근력 500
        dfs(0, 500);

        System.out.println(answer);
    }

    static void dfs(int day, int power) {
        // 가지치기: 근력이 기준 미만이면 중단
        if (power < 500) return;

        // 종료 조건: N일 모두 성공
        if (day == N) {
            answer++;
            return;
        }

        // 다음 날 사용할 키트 선택 (순열)
        for (int i = 0; i < N; i++) {
            if (used[i]) continue;

            used[i] = true;
            dfs(day + 1, power + kit[i] - K);
            used[i] = false; // 되돌리기
        }
    }
}
