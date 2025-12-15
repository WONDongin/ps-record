package no_10350;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
문제-10350 (루비5): Banks

문제 요약
- n개의 은행이 원형으로 배치되어 있다.
- 각 은행에는 정수 자본이 있으며, 전체 자본의 합은 양수이다.
- 누적 과정에서 자본이 음수가 되는 경우, 마법을 사용해 보정할 수 있다.
- 목표는 모든 경우에 대해 자본이 음수가 되지 않도록 만드는 데 필요한
  최소 마법 횟수를 구하는 것이다.

주요 메서드

- `BufferedReader` / `StringTokenizer`: 대량 입력 처리
- `Prefix` Sum 배열: 구간 합 O(1) 계산

주요 알고리즘

- 원형 배열을 선형 배열로 확장하여 모든 시작점 처리
- 누적합을 이용해 자본 변화 추적
- 음수 누적합 발생 시, 전체 자본 합을 기준으로
  필요한 마법 횟수를 계산하여 누적
- 시뮬레이션 없이 수학적 관찰로 해결
*/

public class No10350 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 전체 자본 합 (문제 조건상 항상 양수)
        long total = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            total += arr[i];
        }

        // 원형 배열 → 선형 배열로 변환 (배열 2배 확장)
        int[] doubled = new int[2 * n];
        for (int i = 0; i < n; i++) {
            doubled[i] = arr[i];
            doubled[i + n] = arr[i];
        }

        // Prefix Sum (누적합)
        long[] prefix = new long[2 * n + 1];
        for (int i = 1; i <= 2 * n; i++) {
            prefix[i] = prefix[i - 1] + doubled[i - 1];
        }

        /* 핵심 계산 로직
        - 모든 시작점 start (0 ~ n-1)에 대해
        - 길이 n만큼 한 바퀴를 도는 동안의 누적합을 확인
        - 누적합이 음수가 되는 순간마다
          해당 누적합을 0 이상으로 만들기 위해 필요한
          마법 횟수를 계산하여 누적

        - 마법 1회는 전체 자본 합(total)만큼의 보정 효과를 가진다고 해석
        */
        long answer = 0;

        for (int start = 0; start < n; start++) {
            for (int i = start + 1; i <= start + n; i++) {
                long currentSum = prefix[i] - prefix[start];

                if (currentSum < 0) {
                    long need = -currentSum;
                    // ceil(need / total)
                    answer += (need + total - 1) / total;
                }
            }
        }

        System.out.println(answer);
    }
}