package level0;
import java.util.Arrays;
/*
문제: 가까운 수

로직
- array를 오름차순으로 정렬한다.
- 배열의 첫 번째 원소를 가장 가까운 수의 초기값으로 설정한다.
- 각 원소와 n의 차이를 절댓값으로 계산한다.
- 현재 원소의 차이가 기존 정답의 차이보다 작으면 정답을 변경한다.

핵심 구현
- Arrays.sort()를 사용해 배열을 오름차순으로 정렬한다.
- Math.abs(number - n)으로 n과 각 원소 사이의 거리를 계산한다.
- 더 가까운 수를 발견한 경우에만 answer를 변경한다.

포인트
- 배열을 오름차순으로 정렬했기 때문에 거리가 같은 수가 여러 개라면 작은 수가 먼저 선택된다.
- 거리가 같은 경우에는 answer를 변경하지 않아 더 작은 수가 유지된다.

회고
- 정렬과 절댓값 비교를 사용해 n과 가장 가까운 수를 구했다.
- 같은 거리에 있는 수 중 작은 수를 반환하는 조건도 자연스럽게 처리할 수 있었다.
*/
public class No202 {
    class Solution {
        public int solution(int[] array, int n) {
            Arrays.sort(array);

            int answer = array[0];

            for (int number : array) {
                if (Math.abs(number - n) < Math.abs(answer - n)) {
                    answer = number;
                }
            }

            return answer;
        }
    }
}
