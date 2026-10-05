package level0;
/*
문제: 문자열 계산하기

로직
- 수식 문자열을 공백 기준으로 분리한다.
- 첫 번째 숫자로 결과값을 초기화한다.
- 이후 연산자와 숫자를 순서대로 확인하여 더하거나 뺀다.

핵심 구현
- split(" ")으로 숫자와 연산자를 분리한다.
- 인덱스를 2씩 증가시켜 연산자와 다음 숫자를 한 쌍씩 처리한다.
- equals("+")로 연산자를 비교하여 덧셈과 뺄셈을 수행한다.

포인트
- 덧셈과 뺄셈은 우선순위가 같으므로 왼쪽부터 계산한다.
- 중간 계산 결과가 음수여도 int로 처리할 수 있다.

회고
- 숫자와 연산자가 번갈아 등장하는 구조를 활용해 순차적으로 계산했다.
*/
public class No230 {
    class Solution {
        public int solution(String my_string) {
            String[] tokens = my_string.split(" ");
            int answer = Integer.parseInt(tokens[0]);

            for (int i = 1; i < tokens.length; i += 2) {
                String operator = tokens[i];
                int number = Integer.parseInt(tokens[i + 1]);

                if (operator.equals("+")) {
                    answer += number;
                } else {
                    answer -= number;
                }
            }

            return answer;
        }
    }
}
