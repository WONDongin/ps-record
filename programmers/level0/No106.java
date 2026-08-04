package level0;

import java.util.Arrays;
/*
문제: 369게임

로직
- 정수 order를 문자열로 변환한다.
- 문자열의 각 문자를 순서대로 확인한다.
- 문자가 3, 6, 9 중 하나라면 박수 횟수를 증가시킨다.
- 모든 자리 확인 후 누적된 박수 횟수를 반환한다.

핵심 구현
- String.valueOf(order)로 정수를 문자열로 변환한다.
- charAt()으로 각 자리의 문자를 가져온다.
- digit == '3' || digit == '6' || digit == '9'로 박수 대상인지 확인한다.
- 조건을 만족할 때마다 answer를 1씩 증가시킨다.

포인트
- 369게임은 숫자 자체가 아닌 각 자릿수에 포함된 3, 6, 9의 개수를 구해야 한다.
- 숫자 문자를 비교하므로 작은따옴표를 사용해 '3', '6', '9'와 비교한다.
- order가 29423이라면 9와 3이 포함되어 있으므로 결과는 2이다.

회고
- 정수를 문자열로 변환해 각 자릿수를 쉽게 확인할 수 있었다.
- 여러 조건 중 하나를 만족하는지 논리 연산자 ||를 사용해 처리했다.
*/
public class No106 {
    public static void main(String[] args) {
        class Solution {
            public int solution(int order) {
                int answer = 0;
                String number = String.valueOf(order);

                for (int i = 0; i < number.length(); i++) {
                    char digit = number.charAt(i);

                    if (digit == '3' || digit == '6' || digit == '9') {
                        answer++;
                    }
                }

                return answer;
            }
        }

        Solution solution = new Solution();

        System.out.println(solution.solution(29423)); // 2
    }
}
