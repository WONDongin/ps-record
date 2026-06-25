package level1;
/*
문제: 신호등 정전

로직
- 각 신호등의 한 주기(G + Y + R)를 계산한다.
- 모든 신호등의 주기의 최소공배수(LCM)를 구해 탐색 범위를 결정한다.
- 1초부터 LCM까지 모든 시간을 확인한다.
- 각 시간마다 모든 신호등이 노란불 구간인지 확인한다.
- 처음으로 모든 신호등이 동시에 노란불인 시간을 반환하고, 끝까지 없으면 -1을 반환한다.

핵심 구현
- 핵심 코드
  ex)
  int cycle = G + Y + R;
  int time = (t - 1) % cycle + 1;

- 핵심 코드 설명
  현재 시간을 각 신호등의 한 주기 안의 시간으로 변환한다.

- 핵심 코드
  ex)
  if (time > G && time <= G + Y)

- 핵심 코드 설명
  현재 시간이 노란불이 유지되는 구간인지 판별한다.

- 핵심 코드
  ex)
  lcm = lcm(lcm, cycle);

- 핵심 코드 설명
  모든 신호등의 상태는 최소공배수 주기마다 반복되므로 LCM까지만 탐색하면 된다.

포인트
- 시간을 주기 내부 시간으로 변환하는 것이 핵심이다.
- 모든 신호등의 상태는 LCM 이후 반복된다.
- 탐색 범위가 최대 LCM이므로 완전 탐색으로도 충분하다.

회고
- 반복되는 상태를 발견하면 최소공배수를 이용해 탐색 범위를 줄일 수 있다는 점을 배웠다.
- 시간 시뮬레이션 문제는 현재 시간을 주기 내부 시간으로 변환하는 방식이 자주 사용된다.
*/
public class No62 {
    class Solution {

        public int solution(int[][] signals) {
            int lcm = 1;

            // 모든 신호등 주기의 최소공배수 계산
            for (int[] signal : signals) {
                int cycle = signal[0] + signal[1] + signal[2];
                lcm = lcm(lcm, cycle);
            }

            // 1초부터 LCM까지 탐색
            for (int t = 1; t <= lcm; t++) {
                boolean allYellow = true;

                for (int[] signal : signals) {
                    int g = signal[0];
                    int y = signal[1];
                    int cycle = g + y + signal[2];

                    // 현재 주기에서 몇 번째 초인지 계산
                    int time = (t - 1) % cycle + 1;

                    // 노란불이 아니면 종료
                    if (!(time > g && time <= g + y)) {
                        allYellow = false;
                        break;
                    }
                }

                if (allYellow) {
                    return t;
                }
            }

            return -1;
        }

        // 최대공약수
        private int gcd(int a, int b) {
            while (b != 0) {
                int temp = a % b;
                a = b;
                b = temp;
            }
            return a;
        }

        // 최소공배수
        private int lcm(int a, int b) {
            return a / gcd(a, b) * b;
        }
    }
}
