package level0;

import java.util.Arrays;

/*
문제: 특이한 정렬

로직
- 각 숫자와 n 사이의 절댓값 차이를 구한다.
- n과의 거리가 가까운 숫자가 앞으로 오도록 정렬한다.
- 거리가 같다면 더 큰 숫자가 앞으로 오도록 정렬한다.

핵심 구현
- 사용자 정의 정렬을 사용하기 위해 int[]를 Integer[]로 변환한다.
- Math.abs(숫자 - n)을 이용하여 n과의 거리를 계산한다.
- 거리가 같으면 숫자를 내림차순으로 비교한다.
- 거리가 다르면 거리를 오름차순으로 비교한다.

포인트
- int[]에는 Comparator를 직접 사용할 수 없으므로 Integer[]로 변환해야 한다.
- 거리가 같은 경우 더 큰 수가 먼저 와야 한다.
- 정렬 후 Integer[]의 값을 다시 int[]에 저장한다.

회고
- Comparator에 두 가지 정렬 조건을 적용하여 거리와 숫자 크기를 함께 비교했다.
*/
public class No171 {
    class Solution {
        public int[] solution(int[] numlist, int n) {
            Integer[] numbers = new Integer[numlist.length];

            for (int i = 0; i < numlist.length; i++) {
                numbers[i] = numlist[i];
            }

            Arrays.sort(numbers, (a, b) -> {
                int distanceA = Math.abs(a - n);
                int distanceB = Math.abs(b - n);

                if (distanceA == distanceB) {
                    return Integer.compare(b, a);
                }

                return Integer.compare(distanceA, distanceB);
            });

            for (int i = 0; i < numbers.length; i++) {
                numlist[i] = numbers[i];
            }

            return numlist;
        }
    }
}
