package level0;
import java.util.ArrayList;
import java.util.List;
/*
문제: 콜라츠 수열 만들기

로직
- 현재 숫자를 리스트에 저장한다.
- 짝수라면 2로 나누고, 홀수라면 3을 곱한 뒤 1을 더한다.
- 숫자가 1이 될 때까지 과정을 반복한다.

핵심 구현
- while 문을 사용해 n이 1이 될 때까지 반복했다.
- 마지막 숫자인 1도 수열에 포함되도록 반복문이 끝난 후 추가했다.
- 리스트를 int 배열로 변환해 반환했다.

포인트
- 초기값부터 계산 과정에서 만들어지는 모든 숫자를 저장해야 한다.
- n이 처음부터 1인 경우에도 [1]을 반환할 수 있다.

회고
- 반복 횟수를 미리 알 수 없으므로 ArrayList를 활용했다.
*/
public class No153 {
    class Solution {
        public int[] solution(int n) {
            List<Integer> sequence = new ArrayList<>();

            while (n != 1) {
                sequence.add(n);

                if (n % 2 == 0) {
                    n /= 2;
                } else {
                    n = 3 * n + 1;
                }
            }

            sequence.add(1);

            int[] answer = new int[sequence.size()];

            for (int i = 0; i < sequence.size(); i++) {
                answer[i] = sequence.get(i);
            }

            return answer;
        }
    }
}
