package level0;

import java.util.Arrays;
/*
문제: 최댓값 만들기 (2)

로직
- numbers 배열을 오름차순으로 정렬한다.
- 가장 작은 두 수를 곱한다.
- 가장 큰 두 수를 곱한다.
- 두 곱 중 더 큰 값을 반환한다.

핵심 구현
- Arrays.sort(numbers)로 배열을 오름차순 정렬한다.
- 음수끼리의 곱: numbers[0] * numbers[1]
- 큰 양수끼리의 곱:
  numbers[numbers.length - 1] * numbers[numbers.length - 2]
- Math.max()로 두 결과 중 최댓값을 구한다.

포인트
- 음수 두 개를 곱하면 양수가 되므로 가장 큰 두 수만 확인하면 안 된다.
- 정렬된 배열에서 최댓값 후보는 양쪽 끝에 존재한다.
- 가장 작은 두 수의 곱과 가장 큰 두 수의 곱만 비교하면 된다.

회고
- 음수가 포함된 배열에서는 가장 작은 두 수의 곱이 최댓값이 될 수 있다는 점을 고려했다.
- 정렬과 Math.max()를 이용해 최댓값 후보를 간단하게 비교할 수 있었다.
*/
public class No105 {
    class Solution {
        public int solution(int[] numbers) {
            Arrays.sort(numbers);

            int left = numbers[0] * numbers[1];
            int right = numbers[numbers.length - 1]
                    * numbers[numbers.length - 2];

            return Math.max(left, right);
        }
    }
}
