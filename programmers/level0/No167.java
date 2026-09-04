package level0;
/*
문제: 코드 처리하기

로직
- mode를 0으로 설정하고 code를 앞에서부터 확인한다.
- 현재 문자가 '1'이면 mode를 0과 1 사이에서 전환한다.
- '1'이 아니라면 현재 인덱스의 홀짝과 mode가 같은 경우에만 문자를 추가한다.
- 완성된 문자열이 비어 있으면 "EMPTY"를 반환한다.

핵심 구현
- mode = 1 - mode를 사용하여 mode를 전환한다.
- idx % 2 == mode 조건으로 mode에 맞는 인덱스를 확인한다.
- 문자열 연결에는 StringBuilder를 사용한다.

포인트
- 문자 '1'은 결과에 추가하지 않고 mode만 변경한다.
- mode가 0이면 짝수 인덱스, mode가 1이면 홀수 인덱스의 문자를 추가한다.
- code의 길이가 최대 100,000이므로 StringBuilder를 사용한다.

회고
- mode별 로직을 하나의 조건으로 정리하여 중복 코드를 줄이고 간결하게 구현했다.
*/
public class No167 {
    class Solution {
        public String solution(String code) {
            StringBuilder ret = new StringBuilder();
            int mode = 0;

            for (int idx = 0; idx < code.length(); idx++) {
                char current = code.charAt(idx);

                if (current == '1') {
                    mode = 1 - mode;
                    continue;
                }

                if (idx % 2 == mode) {
                    ret.append(current);
                }
            }

            return ret.length() == 0 ? "EMPTY" : ret.toString();
        }
    }
}
