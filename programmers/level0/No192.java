package level0;
/*
문제: k의 개수

로직
- i부터 j까지의 숫자를 순서대로 확인한다.
- 각 숫자를 문자열로 변환한다.
- 문자열의 각 문자를 확인하여 k와 같으면 개수를 증가시킨다.

핵심 구현
- k에 문자 '0'을 더해 비교할 문자로 변환한다.
- String.valueOf()를 사용해 각 숫자를 문자열로 변환한다.
- charAt()으로 모든 자릿수를 확인한다.

포인트
- 하나의 숫자에 k가 여러 번 포함될 수 있으므로 모든 자릿수를 확인해야 한다.
- 숫자 k가 포함된 숫자의 개수가 아니라 k가 등장한 전체 횟수를 구해야 한다.

회고
- 숫자를 문자열로 변환하여 각 자릿수에 k가 등장하는 횟수를 간단하게 계산했다.
*/
public class No192 {
    class Solution {
        public int solution(int i, int j, int k) {
            int answer = 0;
            char target = (char) (k + '0');

            for (int number = i; number <= j; number++) {
                String value = String.valueOf(number);

                for (int index = 0; index < value.length(); index++) {
                    if (value.charAt(index) == target) {
                        answer++;
                    }
                }
            }

            return answer;
        }
    }
}
