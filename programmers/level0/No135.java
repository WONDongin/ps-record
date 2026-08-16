package level0;
/*
문제: 길이에 따른 연산

로직
- solution 함수는 정수 배열 num_list를 매개변수로 받는다.
- num_list의 길이가 11 이상이면 모든 원소의 합을 계산한다.
- num_list의 길이가 10 이하이면 모든 원소의 곱을 계산한다.
- 계산한 결과를 answer로 반환한다.

핵심 구현
- 핵심 코드
  int answer = num_list.length >= 11 ? 0 : 1;

- 배열의 길이가 11 이상이면 덧셈을 위해 answer를 0으로 초기화한다.
- 배열의 길이가 10 이하이면 곱셈을 위해 answer를 1로 초기화한다.
- 향상된 for문을 사용해 num_list의 모든 원소를 순회한다.
- 배열의 길이에 따라 현재 원소를 answer에 더하거나 곱한다.

포인트
- 덧셈의 초깃값은 0이고 곱셈의 초깃값은 1이다.
- 삼항 연산자를 사용해 배열의 길이에 따라 answer의 초깃값을 결정한다.
- num_list.length >= 11 조건으로 합과 곱 연산을 구분한다.
- 모든 원소의 곱은 int 자료형의 범위를 넘지 않는다.

회고
- 배열의 길이에 따라 서로 다른 연산을 수행하는 방법을 익힐 수 있었다.
- 삼항 연산자로 연산에 필요한 초깃값을 간결하게 설정할 수 있었다.
*/
public class No135 {
    class Solution {
        public int solution(int[] num_list) {
            int answer = num_list.length >= 11 ? 0 : 1;

            for (int num : num_list) {
                if (num_list.length >= 11) {
                    answer += num;
                } else {
                    answer *= num;
                }
            }

            return answer;
        }
    }
}
