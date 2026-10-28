package level2;
/*
문제: N개의 최소공배수

로직
- 첫 번째 원소를 초기 최소공배수로 설정한다.
- 현재 최소공배수와 다음 원소의 최대공약수를 구한다.
- 최대공약수를 이용해 최소공배수를 갱신한다.
- 모든 원소를 처리한 뒤 결과를 반환한다.

핵심 구현
- 유클리드 호제법으로 두 수의 최대공약수를 구한다.
- 최소공배수 = (a / 최대공약수) * b 공식을 사용한다.
- 배열을 순회하며 두 수의 최소공배수를 누적한다.

포인트
- 여러 수의 최소공배수는 두 수씩 순차적으로 계산할 수 있다.
- 곱하기 전에 최대공약수로 나누어 중간 계산값을 줄인다.
- 배열의 길이가 1이면 첫 번째 원소가 그대로 정답이다.

회고
- 최대공약수와 최소공배수의 관계를 활용했다.
- 유클리드 호제법을 별도 메서드로 분리해 반복 계산에 사용했다.
*/
public class No18 {
    class Solution {
        public int solution(int[] arr) {
            int answer = arr[0];

            for (int i = 1; i < arr.length; i++) {
                answer = (answer / gcd(answer, arr[i])) * arr[i];
            }

            return answer;
        }

        private int gcd(int a, int b) {
            while (b != 0) {
                int remainder = a % b;
                a = b;
                b = remainder;
            }

            return a;
        }
    }
}
