package level1;
/*
문제: 추억 점수

문제 요약
- 사진 속 인물들의 그리움 점수를 합산해서 각 사진의 추억 점수를 구하는 문제
- 그리움 점수가 없는 인물은 0점으로 처리한다

접근 방법
- name 배열과 yearning 배열을 이용해 이름별 점수를 HashMap에 저장한다
- photo 배열을 순회하면서 사진마다 등장한 인물의 점수를 더한다
- HashMap에 없는 이름은 점수에 포함하지 않는다

핵심 아이디어
- 이름으로 점수를 빠르게 찾기 위해 HashMap을 사용한다
- containsKey로 존재 여부를 확인한 뒤 점수를 누적한다

주의할 점
- photo에 등장하는 모든 사람이 name에 있는 것은 아니다
- 점수가 없는 사람은 0점으로 처리해야 한다

배운 점
- 배열 두 개를 하나의 Map 구조로 묶으면 조회 로직을 단순하게 만들 수 있다
*/
import java.util.HashMap;

public class No55 {
    class Solution {
        public int[] solution(String[] name, int[] yearning, String[][] photo) {
            HashMap<String, Integer> map = new HashMap<>();

            for (int i = 0; i < name.length; i++) {
                map.put(name[i], yearning[i]);
            }

            int[] answer = new int[photo.length];

            for (int i = 0; i < photo.length; i++) {
                int score = 0;

                for (int j = 0; j < photo[i].length; j++) {
                    String person = photo[i][j];

                    if (map.containsKey(person)) {
                        score += map.get(person);
                    }
                }

                answer[i] = score;
            }

            return answer;
        }
    }
}
