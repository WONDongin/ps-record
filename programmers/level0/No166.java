package level0;
/*
문제: 합성수 찾기

로직
- 4부터 n까지의 자연수를 차례대로 확인한다.
- 각 숫자를 2부터 제곱근까지 나누어본다.
- 나누어떨어지는 수가 있으면 합성수이므로 개수를 증가시킨다.

핵심 구현
- divisor * divisor <= number 범위까지만 약수를 확인한다.
- 약수가 발견되면 즉시 true를 반환한다.

포인트
- 합성수는 1과 자기 자신 이외의 약수를 가진 자연수이다.
- 가장 작은 합성수는 4이므로 4부터 검사한다.

회고
- 모든 약수를 구하지 않고 제곱근까지만 검사하여 합성수를 효율적으로 판별했다.
*/
public class No166 {
    class Solution {
        public int solution(int n) {
            int answer = 0;

            for (int number = 4; number <= n; number++) {
                if (isComposite(number)) {
                    answer++;
                }
            }

            return answer;
        }

        private boolean isComposite(int number) {
            for (int divisor = 2; divisor * divisor <= number; divisor++) {
                if (number % divisor == 0) {
                    return true;
                }
            }

            return false;
        }
    }
}
