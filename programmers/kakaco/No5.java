package kakaco;
/*
문제: 다트 게임

로직
- 다트 결과 문자열을 왼쪽부터 순회한다.
- 숫자는 0~10까지 가능하므로 10은 예외적으로 두 자리 숫자로 처리한다.
- 보너스 S, D, T에 따라 점수를 1제곱, 2제곱, 3제곱으로 계산한다.
- 옵션 *은 현재 점수와 이전 점수를 2배로 만든다.
- 옵션 #은 현재 점수를 음수로 바꾼다.

핵심 구현
- 핵심 코드
  ex) if (dartResult.charAt(i) == '1' && dartResult.charAt(i + 1) == '0')
- 10점은 두 자리 숫자이므로 별도로 처리해야 한다.
- 핵심 코드
  ex) scores[idx - 1] *= 2;
- 스타상(*)은 현재 점수뿐 아니라 이전 점수에도 영향을 주므로 이전 인덱스를 확인해야 한다.

포인트
- 점수는 총 3번 나오므로 int 배열을 사용하면 각 회차 점수를 관리하기 쉽다.
- 옵션은 없을 수도 있으므로 문자를 확인하면서 조건 처리해야 한다.
- * 옵션은 첫 번째 기회에서는 현재 점수만 2배가 된다.

회고
- 문자열 파싱 문제에서는 한 글자씩 처리하되, 10처럼 예외적인 입력을 먼저 고려해야 한다.
- 이전 값에 영향을 주는 조건은 배열로 점수를 저장해두면 쉽게 처리할 수 있다.
*/
public class No5 {
    class Solution {
        public int solution(String dartResult) {
            int[] scores = new int[3];
            int idx = 0;

            for (int i = 0; i < dartResult.length(); i++) {
                char ch = dartResult.charAt(i);

                if (Character.isDigit(ch)) {
                    int score;

                    if (ch == '1' && i + 1 < dartResult.length() && dartResult.charAt(i + 1) == '0') {
                        score = 10;
                        i++;
                    } else {
                        score = ch - '0';
                    }

                    char bonus = dartResult.charAt(++i);

                    if (bonus == 'S') {
                        score = (int) Math.pow(score, 1);
                    } else if (bonus == 'D') {
                        score = (int) Math.pow(score, 2);
                    } else if (bonus == 'T') {
                        score = (int) Math.pow(score, 3);
                    }

                    scores[idx++] = score;

                    if (i + 1 < dartResult.length()) {
                        char option = dartResult.charAt(i + 1);

                        if (option == '*') {
                            scores[idx - 1] *= 2;

                            if (idx - 2 >= 0) {
                                scores[idx - 2] *= 2;
                            }

                            i++;
                        } else if (option == '#') {
                            scores[idx - 1] *= -1;
                            i++;
                        }
                    }
                }
            }

            return scores[0] + scores[1] + scores[2];
        }
    }
}
