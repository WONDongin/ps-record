package level2;
import java.util.HashSet;
import java.util.Set;

/*
문제: 영어 끝말잇기

로직
- 단어를 순서대로 확인하며 사용한 단어를 HashSet에 저장한다.
- 이전 단어의 마지막 문자와 현재 단어의 첫 문자를 비교한다.
- 끝말잇기 규칙을 어기거나 이미 사용한 단어이면 탈락 정보를 반환한다.
- 모든 단어가 규칙을 만족하면 [0, 0]을 반환한다.

핵심 구현
- HashSet으로 단어의 중복 여부를 확인한다.
- charAt()으로 이전 단어의 마지막 문자와 현재 단어의 첫 문자를 비교한다.
- i % n + 1로 사람 번호, i / n + 1로 차례를 계산한다.

포인트
- 첫 번째 단어는 이전 단어와 비교하지 않는다.
- 가장 먼저 탈락하는 사람을 찾아야 하므로 규칙 위반 시 즉시 반환한다.
- 배열 인덱스는 0부터 시작하므로 번호와 차례 계산 시 1을 더한다.

회고
- HashSet으로 사용한 단어를 관리하여 중복을 확인했다.
- 나머지와 몫을 활용해 탈락자의 번호와 차례를 계산했다.
*/
public class No20 {
    class Solution {
        public int[] solution(int n, String[] words) {
            Set<String> usedWords = new HashSet<>();

            for (int i = 0; i < words.length; i++) {
                String word = words[i];

                if (i > 0) {
                    String previous = words[i - 1];

                    if (previous.charAt(previous.length() - 1) != word.charAt(0)) {
                        return new int[]{i % n + 1, i / n + 1};
                    }
                }

                if (!usedWords.add(word)) {
                    return new int[]{i % n + 1, i / n + 1};
                }
            }

            return new int[]{0, 0};
        }
    }
}
