package level0;
/*
문제: 주사위 게임 3

로직
- a와 b의 홀수 여부를 각각 확인한다.
- 두 수가 모두 홀수라면 각 수의 제곱을 더한다.
- 두 수 중 하나만 홀수라면 두 수의 합에 2를 곱한다.
- 두 수가 모두 짝수라면 두 수의 차이에 절댓값을 적용한다.

핵심 구현
- number % 2 == 1: 홀수 여부 확인
- &&: 두 조건을 모두 만족하는지 확인
- ||: 두 조건 중 하나 이상을 만족하는지 확인
- Math.abs(a - b): 두 수의 차이를 양수로 반환

포인트
- 두 수가 모두 홀수인 조건을 먼저 검사해야 한다.
- 제곱은 a * a와 같이 계산한다.
- 두 수의 차이는 음수가 될 수 있으므로 Math.abs()를 사용한다.

회고
- 홀수 여부를 boolean 변수에 저장하여 조건식을 읽기 쉽게 작성했다.
- 조건의 우선순위를 정하면 하나만 홀수인 경우도 || 연산자로 간단하게 처리할 수 있다.
*/
public class No112 {
    class Solution {
        public int solution(int a, int b) {
            boolean isAOdd = a % 2 == 1;
            boolean isBOdd = b % 2 == 1;

            if (isAOdd && isBOdd) {
                return a * a + b * b;
            }

            if (isAOdd || isBOdd) {
                return 2 * (a + b);
            }

            return Math.abs(a - b);
        }
    }
}
