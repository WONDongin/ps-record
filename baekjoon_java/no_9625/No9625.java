package no_9625;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
문제-9625 (실버5): BABBA
- 처음 화면에는 A만 1개 존재
- 버튼을 누를 때마다
  - A -> B
  - B -> BA
- K번 눌렀을 때 A와 B의 개수를 출력하는 문제

접근 방법
- 문자열을 직접 만들면 길이가 계속 증가하므로 비효율적
- 대신 각 단계에서 A와 B의 개수만 추적
- 규칙을 보면
  - 다음 A 개수 = 현재 B 개수
  - 다음 B 개수 = 현재 A 개수 + 현재 B 개수
- 점화식을 이용한 DP(피보나치 형태)로 해결

핵심 아이디어
- A는 다음 단계에서 모두 B가 되므로 새 A 개수는 이전 B 개수와 같음
- B는 다음 단계에서 BA가 되므로 새 B 개수는 이전 A + 이전 B
- 즉,
  - nextA = B
  - nextB = A + B
- 초기값은
  - A = 1
  - B = 0

처리 흐름
- K 입력
- A = 1, B = 0 으로 시작
- K번 반복하면서
  - nextA = B
  - nextB = A + B
  - A, B 갱신
- 최종 A, B 출력
*/
public class No9625 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int A = 1;
        int B = 0;

        for (int i = 0; i < N; i++) {
            int nextA = B;
            int nextB = A + B;
            A = nextA;
            B = nextB;
        }

        System.out.println(A + " " + B);
    }
}