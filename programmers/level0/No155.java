package level0;
/*
문제: 주사위 게임 2

로직
- 세 숫자가 모두 다르면 세 숫자의 합을 반환한다.
- 두 숫자만 같으면 1제곱의 합과 2제곱의 합을 곱한다.
- 세 숫자가 모두 같으면 3제곱의 합까지 추가로 곱한다.

핵심 구현
- a != b && b != c && a != c 조건으로 모두 다른 경우를 확인했다.
- a == b && b == c 조건으로 모두 같은 경우를 확인했다.
- 제곱은 Math.pow 대신 정수의 직접 곱셈으로 계산했다.

포인트
- 모두 다른 경우에는 세 쌍을 전부 비교해야 한다.
- 모두 같은 경우를 제외하고 하나라도 같은 숫자가 있다면 두 숫자만 같은 경우다.

회고
- 숫자의 일치 개수에 따라 필요한 식을 단계적으로 계산했다.
*/
public class No155 {
    class Solution {
        public int solution(int a, int b, int c) {
            int sum1 = a + b + c;

            if (a != b && b != c && a != c) {
                return sum1;
            }

            int sum2 = a * a + b * b + c * c;

            if (a == b && b == c) {
                int sum3 = a * a * a
                        + b * b * b
                        + c * c * c;

                return sum1 * sum2 * sum3;
            }

            return sum1 * sum2;
        }
    }
}
