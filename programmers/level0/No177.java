package level0;
/*
문제: 유한소수 판별하기

로직
- a와 b의 최대공약수를 구해 분수를 기약분수로 만든다.
- 기약분수의 분모에서 소인수 2를 모두 제거한다.
- 이어서 소인수 5를 모두 제거한다.
- 남은 분모가 1이면 유한소수, 다른 값이면 무한소수로 판단한다.

핵심 구현
- 유클리드 호제법으로 a와 b의 최대공약수를 구한다.
- b를 최대공약수로 나누어 기약분수의 분모를 계산한다.
- while문을 사용하여 분모의 인수 2와 5를 모두 제거한다.

포인트
- 원래 분모가 아니라 기약분수로 만든 후의 분모를 검사해야 한다.
- 기약분수의 분모에 2와 5 이외의 소인수가 존재하면 무한소수가 된다.

회고
- 최대공약수로 약분한 뒤 분모의 소인수를 확인하여 유한소수 여부를 판별했다.
*/
public class No177 {
    class Solution {
        public int solution(int a, int b) {
            int gcd = getGcd(a, b);
            int denominator = b / gcd;

            while (denominator % 2 == 0) {
                denominator /= 2;
            }

            while (denominator % 5 == 0) {
                denominator /= 5;
            }

            return denominator == 1 ? 1 : 2;
        }

        private int getGcd(int a, int b) {
            while (b != 0) {
                int temp = a % b;
                a = b;
                b = temp;
            }

            return a;
        }
    }
}
