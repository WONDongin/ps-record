package level0;
import java.util.Arrays;
/*
문제: 한 번만 등장한 문자

로직
- 알파벳별 등장 횟수를 저장할 배열을 만든다.
- 문자열을 순회하면서 각 문자의 등장 횟수를 계산한다.
- 문자열의 문자들을 사전 순으로 정렬한다.
- 한 번만 등장한 문자만 결과 문자열에 추가한다.

핵심 구현
- count[ch - 'a']를 사용해 각 알파벳의 등장 횟수를 저장한다.
- Arrays.sort()를 사용해 문자 배열을 사전 순으로 정렬한다.
- StringBuilder를 사용해 조건을 만족하는 문자를 연결한다.

포인트
- 문자열은 소문자로만 이루어져 있으므로 크기가 26인 배열을 사용할 수 있다.
- 한 번만 등장하는 문자가 없으면 빈 문자열을 반환한다.
- 정렬된 문자 배열을 순회하므로 결과도 자동으로 사전 순이 된다.

회고
- 알파벳의 등장 횟수를 배열로 관리해 한 번만 등장하는 문자를 쉽게 구할 수 있었다.
- 등장 횟수 계산과 정렬을 분리하여 문제를 간단하게 해결했다.
*/
public class No195 {
    class Solution {
        public String solution(String s) {
            int[] count = new int[26];

            for (char ch : s.toCharArray()) {
                count[ch - 'a']++;
            }

            char[] chars = s.toCharArray();
            Arrays.sort(chars);

            StringBuilder answer = new StringBuilder();

            for (char ch : chars) {
                if (count[ch - 'a'] == 1) {
                    answer.append(ch);
                }
            }

            return answer.toString();
        }
    }
}
