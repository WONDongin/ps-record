package level0;
import java.util.Arrays;
/*
문제: 외계어 사전

로직
- spell 배열을 사전순으로 정렬한 뒤 하나의 문자열로 만든다.
- dic의 각 단어를 문자 배열로 변환하고 사전순으로 정렬한다.
- 정렬한 단어가 spell을 정렬한 문자열과 같은지 비교한다.
- 같은 단어가 존재하면 1을, 존재하지 않으면 2를 반환한다.

핵심 구현
- Arrays.sort(spell)을 사용해 spell 배열을 정렬한다.
- String.join("", spell)을 사용해 비교할 기준 문자열을 만든다.
- 사전의 단어도 문자 배열로 변환하여 정렬한 뒤 기준 문자열과 비교한다.

포인트
- 정렬 결과가 같다면 spell의 모든 알파벳을 정확히 한 번씩 사용한 단어이다.
- 알파벳의 종류뿐만 아니라 단어의 길이와 각 알파벳의 개수도 함께 비교할 수 있다.
- 조건을 만족하는 단어를 찾는 즉시 1을 반환한다.

회고
- 알파벳의 순서와 관계없이 같은 문자로 이루어졌는지 확인하기 위해 정렬을 활용했다.
*/

public class No201 {
    class Solution {
        public int solution(String[] spell, String[] dic) {
            Arrays.sort(spell);
            String target = String.join("", spell);

            for (String word : dic) {
                char[] characters = word.toCharArray();
                Arrays.sort(characters);

                if (target.equals(new String(characters))) {
                    return 1;
                }
            }

            return 2;
        }
    }
}
