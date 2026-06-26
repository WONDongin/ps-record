package level1;

import java.util.Arrays;
import java.util.HashMap;
/*
문제: 대충 만든 자판

로직
- keymap을 순회하며 각 문자의 최소 입력 횟수를 HashMap에 저장한다.
- 같은 문자가 여러 번 등장하면 더 작은 입력 횟수만 유지한다.
- targets를 순회하며 각 문자의 입력 횟수를 누적한다.
- 입력할 수 없는 문자가 존재하면 -1을 저장한다.

핵심 구현
- 핵심 코드
  map.merge(ch, j + 1, Math::min);

- 핵심 코드 설명
  같은 문자가 여러 키 또는 같은 키에 여러 번 존재할 수 있으므로 merge()와 Math.min()을 사용해 최소 입력 횟수만 저장했다.

- 핵심 코드
  if (!map.containsKey(ch)) {
      sum = -1;
      break;
  }

- 핵심 코드 설명
  현재 문자가 자판에 존재하지 않으면 해당 문자열은 입력할 수 없으므로 -1을 저장하고 탐색을 종료했다.

포인트
- HashMap을 이용해 문자별 최소 입력 횟수를 미리 저장했다.
- merge()를 사용해 최소값 갱신 로직을 간결하게 구현했다.
- target 문자열은 HashMap 조회만 수행하므로 빠르게 계산할 수 있다.

회고
- 같은 문자가 여러 위치에 존재할 수 있다는 조건을 고려해 최소 입력 횟수를 저장하는 것이 핵심이었다.
- HashMap의 merge() 메서드를 활용하면 중복 처리 로직을 간단하게 작성할 수 있다는 점을 배웠다.
*/
public class No63 {
    public static void main(String[] args) {
        String[] keymap = {"AGZ", "BSSS"};
        String[] targets = {"ASA","BGZ"};

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < keymap.length; i++){
            for(int j = 0; j < keymap[i].length(); j++){
                char ch = keymap[i].charAt(j);
                map.merge(ch, j + 1, Math::min);
            }
        }

        int[] result = new int[targets.length];

        for(int i = 0; i < targets.length; i++){
            int sum = 0;

            for(int j = 0; j < targets[i].length(); j++){
                char ch = targets[i].charAt(j);

                if(!map.containsKey(ch)){
                    sum = -1;
                    break;
                }
                sum += map.get(ch);
            }
            result[i] = sum;
        }

        System.out.println(Arrays.toString(result));
    }
}
