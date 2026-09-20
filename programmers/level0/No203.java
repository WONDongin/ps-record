package level0;
/*
문제: 7의 개수

로직
- array의 각 정수를 문자열로 변환한다.
- 문자열의 문자를 하나씩 확인한다.
- 문자가 '7'이면 answer를 1 증가시킨다.
- 모든 원소를 확인한 후 7의 총개수를 반환한다.

핵심 구현
- String.valueOf(number)를 사용해 정수를 문자열로 변환한다.
- toCharArray()를 사용해 문자열의 각 문자를 순회한다.
- 현재 문자가 '7'인지 비교하여 개수를 센다.

포인트
- 배열에서 값이 7인 원소의 개수가 아니라 모든 숫자에 포함된 7의 개수를 구해야 한다.
- 77에는 7이 두 개 있으므로 answer가 2 증가한다.

회고
- 숫자를 문자열로 변환하여 각 자릿수를 간단하게 확인했다.
- 문자열 순회를 사용해 여러 자릿수에 포함된 7도 정확하게 셀 수 있었다.
*/
public class No203 {
    class Solution {
        public int solution(int[] array) {
            int answer = 0;

            for (int number : array) {
                String value = String.valueOf(number);

                for (char ch : value.toCharArray()) {
                    if (ch == '7') {
                        answer++;
                    }
                }
            }

            return answer;
        }
    }
}
