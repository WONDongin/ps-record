package level0;
/*
문제: 배열 만들기 1

로직
- n 이하에 존재하는 k의 배수 개수를 구한다.
- k의 배수를 오름차순으로 배열에 저장한다.
- 완성된 배열을 반환한다.

핵심 구현
- n / k를 사용하여 배열의 길이를 구한다.
- k * (i + 1)을 사용하여 k의 배수를 차례대로 저장한다.

포인트
- 1부터 n까지 검사하지 않고 k의 배수만 직접 계산할 수 있다.
- n 이하의 k의 배수 개수는 n / k개이다.
- 반복문의 인덱스는 0부터 시작하므로 i + 1을 곱해야 한다.

회고
- 모든 숫자를 확인하는 대신 배수의 개수를 먼저 계산하여 더 간단하고 효율적으로 구현할 수 있었다.
*/
public class No145 {
    class Solution {
        public int[] solution(int n, int k) {
            int[] answer = new int[n / k];

            for (int i = 0; i < answer.length; i++) {
                answer[i] = k * (i + 1);
            }

            return answer;
        }
    }
}
