package no_3046;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
문제-3046 (브론즈4): R2
- 두 수 R1, S가 주어진다.
- S는 (R1 + R2) / 2 의 값이다.
- 이를 이용해 R2의 값을 구한다.

주요 메서드
- BufferedReader / StringTokenizer : 입력 처리

주요 알고리즘
- 수식 변형
  S = (R1 + R2) / 2
  R2 = 2 * S - R1

시간 복잡도
- O(1)

공간 복잡도
- O(1)
*/

public class No3046 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int R1 = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());

        int R2 = 2 * S - R1;

        System.out.println(R2);
    }
}
