package level0;
/*
문제: 숨어있는 숫자의 덧셈 (2)

로직
- 문자열을 앞에서부터 한 문자씩 확인한다.
- 숫자인 경우 기존 숫자에 이어 붙여 하나의 자연수를 만든다.
- 문자를 만나면 완성된 자연수를 정답에 더하고 숫자를 초기화한다.
- 반복문이 끝난 후 마지막 자연수를 한 번 더 더한다.

핵심 구현
- number = number * 10 + (ch - '0')을 사용해 연속된 숫자를 하나의 정수로 만든다.
- Character.isDigit()을 사용해 숫자인지 확인한다.
- 문자열이 숫자로 끝나는 경우를 처리하기 위해 반복문 밖에서 number를 더한다.

포인트
- 연속된 숫자는 각각 더하지 않고 하나의 자연수로 처리해야 한다.
- 문자열에 자연수가 없으면 number와 answer가 모두 0이므로 0을 반환한다.
- 마지막 문자가 숫자일 수 있으므로 반복문 종료 후 누적된 값을 반드시 더해야 한다.

회고
- 별도의 문자열 분리 없이 숫자를 직접 누적하여 자연수들의 합을 구했다.
*/
public class No200 {
    class Solution {
        public int solution(String my_string) {
            int answer = 0;
            int number = 0;

            for (char ch : my_string.toCharArray()) {
                if (Character.isDigit(ch)) {
                    number = number * 10 + (ch - '0');
                } else {
                    answer += number;
                    number = 0;
                }
            }

            answer += number;

            return answer;
        }
    }
}
