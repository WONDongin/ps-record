package level0;
/*
문제: 구슬을 나누는 경우의 수

로직
- balls개 중 share개를 고르는 조합을 계산한다.
- C(balls, share) = C(balls, balls - share)이므로 반복 횟수가 적은 쪽을 사용한다.

핵심 구현
- result에 (balls - count + i)를 곱하고 i로 나누는 과정을 반복한다.
- 계산 과정의 오버플로를 줄이기 위해 long을 사용한다.

포인트
- 팩토리얼을 직접 계산하면 30!에서 오버플로가 발생한다.
- 각 단계의 나눗셈 결과는 정수다.

회고
- 조합의 대칭성을 활용해 적은 횟수로 경우의 수를 계산했다.
*/
public class No218 {
    class Solution {
        public int solution(int balls, int share) {
            int count = Math.min(share, balls - share);
            long result = 1;

            for (int i = 1; i <= count; i++) {
                result = result * (balls - count + i) / i;
            }

            return (int) result;
        }
    }
}
