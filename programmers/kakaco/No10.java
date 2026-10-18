package kakaco;
import java.util.HashSet;
import java.util.Set;
/*
문제: 스포 방지

로직
- 스포 방지 구간에 포함된 문자 위치를 표시한다.
- 메시지를 단어 단위로 순회하며 스포 방지 단어인지 확인한다.
- 일반 단어와 스포 방지 단어를 각각 Set에 저장한다.
- 스포 방지 단어 중 일반 단어에 없는 단어의 수를 반환한다.

핵심 구현
- boolean 배열로 각 문자의 스포 방지 적용 여부를 관리한다.
- 단어의 문자 중 하나라도 가려져 있다면 스포 방지 단어로 분류한다.
- HashSet으로 같은 문자열의 중복을 제거한다.
- 모든 일반 단어를 수집한 후 중요한 단어를 집계한다.

포인트
- 단어 일부만 가려져 있어도 단어 전체를 스포 방지 단어로 취급한다.
- 메시지 뒤쪽의 일반 단어도 중복 판단에 포함한다.
- 같은 스포 방지 단어가 여러 번 등장해도 최대 한 번만 집계한다.
- 개수만 구하므로 공개 순서를 직접 구현하지 않아도 된다.

회고
- 공개 과정을 시뮬레이션하는 대신 집합의 차이로 문제를 해결했다.
- 중요한 단어의 조건을 정리해 구현에 필요한 정보를 줄였다.
*/
public class No10 {
    class Solution {
        public int solution(String message, int[][] spoiler_ranges) {
            int length = message.length();
            boolean[] hidden = new boolean[length];

            for (int[] range : spoiler_ranges) {
                for (int i = range[0]; i <= range[1]; i++) {
                    hidden[i] = true;
                }
            }

            Set<String> normalWords = new HashSet<>();
            Set<String> spoilerWords = new HashSet<>();

            int index = 0;

            while (index < length) {
                if (message.charAt(index) == ' ') {
                    index++;
                    continue;
                }

                int start = index;
                boolean isSpoiler = false;

                while (index < length && message.charAt(index) != ' ') {
                    if (hidden[index]) {
                        isSpoiler = true;
                    }

                    index++;
                }

                String word = message.substring(start, index);

                if (isSpoiler) {
                    spoilerWords.add(word);
                } else {
                    normalWords.add(word);
                }
            }

            int answer = 0;

            for (String word : spoilerWords) {
                if (!normalWords.contains(word)) {
                    answer++;
                }
            }

            return answer;
        }
    }
}
