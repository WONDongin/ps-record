package level0;
/*
문제: OX퀴즈

로직
- 각 수식을 공백을 기준으로 분리한다.
- X, 연산자, Y, Z를 각각 가져온다.
- 연산자에 따라 X와 Y를 계산한다.
- 계산 결과가 Z와 같으면 O, 다르면 X를 저장한다.

핵심 구현
- split(" ")을 사용해 수식을 문자열 배열로 분리한다.
- Integer.parseInt()를 사용해 숫자 문자열을 정수로 변환한다.
- 연산자가 +이면 덧셈하고, -이면 뺄셈한다.
- 삼항 연산자를 사용해 O 또는 X를 저장한다.

포인트
- 수식의 공백과 형식이 일정하므로 정해진 인덱스로 각 값을 가져올 수 있다.
- 음수 문자열도 Integer.parseInt()로 변환할 수 있다.
- 문자열 연산자는 ==이 아닌 equals()로 비교해야 한다.

회고
- 일정한 수식 형식을 split()으로 분리하여 각 수식의 정답 여부를 간단하게 판단했다.
*/
public class No164 {
    class Solution {
        public String[] solution(String[] quiz) {
            String[] answer = new String[quiz.length];

            for (int i = 0; i < quiz.length; i++) {
                String[] expression = quiz[i].split(" ");

                int x = Integer.parseInt(expression[0]);
                String operator = expression[1];
                int y = Integer.parseInt(expression[2]);
                int z = Integer.parseInt(expression[4]);

                int result;

                if (operator.equals("+")) {
                    result = x + y;
                } else {
                    result = x - y;
                }

                answer[i] = result == z ? "O" : "X";
            }

            return answer;
        }
    }
}
