package level0;
/*
문제: 홀수 vs 짝수

로직
- num_list를 순회하며 홀수 번째와 짝수 번째 원소를 구분한다.
- 각 위치에 해당하는 원소의 합을 별도로 계산한다.
- 두 합 중 더 큰 값을 반환한다.

핵심 구현
- 배열 인덱스는 0부터 시작하므로 짝수 인덱스가 홀수 번째 원소이다.
- Math.max()를 사용해 두 합 중 큰 값을 반환했다.

포인트
- i % 2 == 0이면 홀수 번째 원소이다.
- 음수가 포함되므로 두 합의 초깃값을 0으로 설정한다.
- 시간 복잡도: O(n)
- 공간 복잡도: O(1)

회고
- 문제의 원소 순서는 1부터, 배열 인덱스는 0부터 시작한다는
  차이를 고려해 홀수 번째와 짝수 번째 원소를 구분했다.
*/
public class No140 {
    class Solution {
        public int solution(int[] num_list) {
            int oddSum = 0;
            int evenSum = 0;

            for (int i = 0; i < num_list.length; i++) {
                if (i % 2 == 0) {
                    oddSum += num_list[i];
                } else {
                    evenSum += num_list[i];
                }
            }

            return Math.max(oddSum, evenSum);
        }
    }
}