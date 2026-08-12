package level0;
/*
문제: 간단한 식 계산하기

로직
- binomial을 공백을 기준으로 분리한다.
- 첫 번째와 세 번째 값을 정수로 변환한다.
- 두 번째 연산자에 따라 계산한 결과를 반환한다.

핵심 구현
- split(" ")을 사용해 식을 숫자, 연산자, 숫자로 분리한다.
- Integer.parseInt()로 문자열을 정수로 변환한다.
- switch 표현식으로 +, -, * 연산을 구분한다.

포인트
- 입력값은 항상 "a op b" 형태이므로 공백을 기준으로 분리할 수 있다.
- 곱셈의 최댓값은 40,000 × 40,000으로 int 범위 안에 포함된다.

회고
- 문자열로 주어진 식을 분리한 뒤 switch 표현식을 사용하여
  연산자에 맞는 계산을 간결하게 구현할 수 있었다.
*/
public class No127 {
    class Solution {
        public int solution(String binomial) {
            String[] expression = binomial.split(" ");

            int a = Integer.parseInt(expression[0]);
            String op = expression[1];
            int b = Integer.parseInt(expression[2]);

            return switch (op) {
                case "+" -> a + b;
                case "-" -> a - b;
                case "*" -> a * b;
                default -> 0;
            };
        }
    }
}
