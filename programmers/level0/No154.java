package level0;
/*
문제: 수 조작하기 2

로직
- 현재 값과 이전 값의 차이를 계산한다.
- 차이가 1이면 w, -1이면 s, 10이면 d, -10이면 a를 저장한다.
- 모든 조작 문자를 연결해 문자열로 반환한다.

핵심 구현
- numLog[i] - numLog[i - 1]로 각 조작의 변화를 확인했다.
- switch 문을 사용해 변화량에 해당하는 문자를 구분했다.
- StringBuilder로 문자를 효율적으로 연결했다.

포인트
- numLog의 첫 번째 원소는 초기값이므로 인덱스 1부터 비교해야 한다.
- 배열의 길이가 최대 100,000이므로 문자열 반복 연결보다 StringBuilder가 적합하다.

회고
- 각 조작이 만든 변화량을 반대로 해석해 원래 입력 문자열을 복원했다.
*/
public class No154 {
    class Solution {
        public String solution(int[] numLog) {
            StringBuilder answer = new StringBuilder();

            for (int i = 1; i < numLog.length; i++) {
                int difference = numLog[i] - numLog[i - 1];

                switch (difference) {
                    case 1:
                        answer.append("w");
                        break;
                    case -1:
                        answer.append("s");
                        break;
                    case 10:
                        answer.append("d");
                        break;
                    case -10:
                        answer.append("a");
                        break;
                }
            }

            return answer.toString();
        }
    }
}
