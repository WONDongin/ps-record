package no_5800;

import java.io.*;
import java.util.*;
/*
문제-5800 (실버5): 성적 통계
- 각 반의 학생 점수가 주어진다
- 반마다 다음을 출력
  - 최대값
  - 최소값
  - 인접 점수 간 최대 차이 (Largest gap)

접근 방법
- 각 반마다 점수 배열을 입력받는다
- 점수를 정렬하여 순서를 맞춘다
- 정렬 후
  - 첫 번째 값 → 최소값
  - 마지막 값 → 최대값
- 인접한 점수 차이를 순회하며 최대 gap을 구한다

핵심 아이디어
- Largest gap은 단순 max-min이 아니라
  **정렬 후 인접한 원소 차이의 최대값**
- 전체 gap을 저장하지 않고
  maxGap 하나로 갱신하며 해결

처리 흐름
- 입력 (K: 반 개수)
- 반복 (각 반)
  → 점수 입력
  → 정렬
  → min/max 계산
  → 인접 차이 최대값 계산
  → 출력
*/
public class No5800 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int K = Integer.parseInt(br.readLine());

        for (int cnt = 1; cnt <= K; cnt++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int studentCount = Integer.parseInt(st.nextToken());

            int[] scores = new int[studentCount];
            for (int i = 0; i < studentCount; i++) {
                scores[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(scores);

            int min = scores[0];
            int max = scores[studentCount - 1];
            int maxGap = 0;

            for (int i = 0; i < studentCount - 1; i++) {
                int gap = scores[i + 1] - scores[i];
                maxGap = Math.max(maxGap, gap);
            }

            sb.append("Class ").append(cnt).append("\n");
            sb.append("Max ").append(max)
                    .append(", Min ").append(min)
                    .append(", Largest gap ").append(maxGap)
                    .append("\n");
        }

        System.out.print(sb);
    }
}