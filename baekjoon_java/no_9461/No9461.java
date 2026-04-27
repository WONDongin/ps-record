package no_9461;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
문제-9461: 파도반 수열

- N번째 파도반 수열 값을 구하는 문제
- 수열은 특정 점화식을 따름
- 테스트 케이스 T개 주어짐

[접근 방법]
- DP 배열을 사용하여 미리 값 계산
- 최대 N이 100이므로 100까지 미리 계산
- 이후 입력값에 따라 바로 출력

[핵심 아이디어]
- 점화식: P[n] = P[n-2] + P[n-3]
- 초기값 설정이 중요
  P[1] = 1, P[2] = 1, P[3] = 1
- 반복 계산으로 모든 값 미리 생성

[처리 흐름]
입력(T) → DP 배열 생성 → 점화식 적용 → 입력값마다 결과 출력

[시간복잡도]
- O(N + T)
  (DP 생성 + 테스트 케이스 처리)
*/
public class No9461 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] P = new long[101];

        P[1] = 1;
        P[2] = 1;
        P[3] = 1;

        for(int i = 4; i <= 100; i++){
            P[i] = P[i - 2] + P[i - 3];
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < N; i++){
            int num = Integer.parseInt(br.readLine());
            sb.append(P[num]).append("\n");
        }

        System.out.println(sb);
    }
}
