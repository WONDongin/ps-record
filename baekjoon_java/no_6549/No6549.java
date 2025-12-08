package no_6549;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

/*
문제-6549 (플레티넘5): 히스토그램에서 가장 큰 직사각형
- 히스토그램에서 만들 수 있는 가장 큰 직사각형의 넓이를 구하는 문제
- 빌딩 높이가 최대 100,000개까지 있으므로 완전 탐색은 불가능
- 스택을 이용해 O(N) 시간 내에 해결

주요 메서드

`BufferedReader.readLine()`
- 테스트 케이스 반복 입력 처리
- 각 줄에서 첫 값은 n, 이후 n개의 히스토그램 높이 입력

`StringTokenizer`
- 별도의 줄 없이 같은 줄에서 n과 높이들을 효율적으로 분리

`Stack<Integer>`
- 증가하는 높이의 인덱스를 저장하는 자료구조
- 현재 높이보다 높은 막대를 만나면 스택에서 꺼내며
- 해당 높이를 기준으로 만들 수 있는 최대 영역 계산

`Math.max()`
- 각 위치에서 직사각형 넓이의 최댓값을 갱신

`StringBuilder`
- 다중 테스트 케이스 결과 출력 성능 최적화

주요 알고리즘

1. 입력 반복 처리
- 첫 수 n이 0이면 종료
- 높이를 배열에 저장

2. 스택 기반 단조 증가 처리
- 히스토그램을 왼쪽→오른쪽으로 순회
- 스택이 비지 않고, 현재 높이가 스택 top보다 작으면
    → pop하여 해당 막대가 확장 가능한 최대 구간 폭 계산
- pop될 때마다 영역 = height × width 계산

3. 남아 있는 막대 처리
- 순회 종료 후에도 스택에 남은 높이들 처리
- 오른쪽 끝(n)을 기준으로 폭 계산

4. 정답 출력
- 최대 넓이를 StringBuilder에 누적 후 한 번에 출력
*/
public class No6549 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            if (n == 0) break;

            long[] h = new long[n];
            for (int i = 0; i < n; i++) {
                h[i] = Long.parseLong(st.nextToken());
            }

            Stack<Integer> stack = new Stack<>();
            long maxArea = 0;

            for (int i = 0; i < n; i++) {
                while (!stack.isEmpty() && h[stack.peek()] > h[i]) {
                    long height = h[stack.pop()];
                    int width = stack.isEmpty() ? i : (i - stack.peek() - 1);
                    maxArea = Math.max(maxArea, height * width);
                }
                stack.push(i);
            }

            // 남아 있는 막대 처리
            while (!stack.isEmpty()) {
                long height = h[stack.pop()];
                int width = stack.isEmpty() ? n : (n - stack.peek() - 1);
                maxArea = Math.max(maxArea, height * width);
            }

            sb.append(maxArea).append("\n");
        }

        System.out.print(sb);
    }
}
