package level0;
/*
문제: 팩토리얼

로직
- 1부터 차례대로 수를 증가시키면서 팩토리얼을 계산한다.
- 다음 수를 곱한 값이 n 이하인 동안 반복한다.
- 조건을 만족하는 가장 큰 정수 i를 반환한다.

핵심 구현
- factorial에 현재까지 계산한 팩토리얼 값을 저장한다.
- factorial * (i + 1)이 n 이하인지 확인한 후 i와 factorial을 갱신한다.

포인트
- n의 최댓값은 10!인 3,628,800이므로 int 범위에서 계산할 수 있다.
- 다음 팩토리얼 값을 먼저 확인하면 n을 초과하지 않는 가장 큰 i를 구할 수 있다.

회고
- 팩토리얼을 순차적으로 계산하면서 조건을 만족하는 최댓값을 간단하게 구했다.
*/
public class No199 {
    class Solution {
        public int solution(int n) {
            int factorial = 1;
            int i = 1;

            while (factorial * (i + 1) <= n) {
                i++;
                factorial *= i;
            }

            return i;
        }
    }
}
