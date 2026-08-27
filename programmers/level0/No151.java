package level0;
/*
문제: 부분 문자열 이어 붙여 문자열 만들기

로직
- 각 문자열과 대응하는 parts의 시작·끝 인덱스를 확인한다.
- 지정된 범위의 부분 문자열을 추출한다.
- 추출한 문자열을 순서대로 이어 붙인다.

핵심 구현
- parts[i][0]: 부분 문자열의 시작 인덱스
- parts[i][1]: 부분 문자열의 마지막 인덱스
- append(문자열, 시작, 끝): 끝 인덱스는 포함하지 않으므로 end + 1을 사용

포인트
- 문제의 끝 인덱스 e는 포함되는 범위이다.
- substring이나 append의 끝 인덱스는 포함되지 않으므로 e + 1로 처리한다.

회고
- 문자열 범위에서 마지막 인덱스의 포함 여부를 주의해야 하는 문제였다.
*/
public class No151 {
    class Solution {
        public String solution(String[] my_strings, int[][] parts) {
            StringBuilder answer = new StringBuilder();

            for (int i = 0; i < my_strings.length; i++) {
                int start = parts[i][0];
                int end = parts[i][1];

                answer.append(my_strings[i], start, end + 1);
            }

            return answer.toString();
        }
    }
}
