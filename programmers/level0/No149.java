package level0;
/*
문제: 다항식 더하기

로직
- 다항식을 " + " 기준으로 분리한다.
- x가 포함된 일차항과 숫자로만 이루어진 상수항을 구분한다.
- 일차항의 계수와 상수항을 각각 더한 후 하나의 식으로 만든다.

핵심 구현
- term.endsWith("x")로 일차항을 구분한다.
- "x"의 계수는 1로 처리한다.
- "3x"와 같은 항은 x를 제외한 숫자 부분을 정수로 변환한다.

포인트
- 계수가 1인 경우 "1x"가 아닌 "x"로 출력한다.
- 일차항이나 상수항이 없는 경우 불필요한 " + "가 출력되지 않도록 처리한다.

회고
- 문자열을 항 단위로 분리한 후 항의 종류에 따라 누적하는 방법을 연습했다.
*/
public class No149 {
    class Solution {
        public String solution(String polynomial) {
            int xCoefficient = 0;
            int constant = 0;

            String[] terms = polynomial.split(" \\+ ");

            for (String term : terms) {
                if (term.endsWith("x")) {
                    if (term.equals("x")) {
                        xCoefficient++;
                    } else {
                        xCoefficient += Integer.parseInt(
                                term.substring(0, term.length() - 1)
                        );
                    }
                } else {
                    constant += Integer.parseInt(term);
                }
            }

            if (xCoefficient > 0 && constant > 0) {
                String xTerm = xCoefficient == 1 ? "x" : xCoefficient + "x";
                return xTerm + " + " + constant;
            }

            if (xCoefficient > 0) {
                return xCoefficient == 1 ? "x" : xCoefficient + "x";
            }

            return String.valueOf(constant);
        }
    }
}
