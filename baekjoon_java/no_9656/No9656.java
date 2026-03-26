package no_9656;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
문제-9656: 돌 게임 2
- 돌 N개
- 1개 또는 3개 가져갈 수 있음
- 마지막 돌 가져가는 사람이 승리

[주요 메서드]
- main()

[주요 알고리즘]
- 게임 이론 (패턴 분석)

[탐색 / 처리 흐름]
1. N 입력
2. N이 짝수인지 확인
3. 짝수 → SK 출력
4. 홀수 → CY 출력

[핵심 아이디어]
- 직접 경우를 나열하면 승패가 반복되는 패턴 발견
- 홀수: CY 승 / 짝수: SK 승
- 상대를 항상 홀수 상태로 넘기면 이기는 구조

[시간복잡도]
- O(1)
*/
public class No9656 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        System.out.println(N % 2 == 0 ? "SK" : "CY");
    }
}
