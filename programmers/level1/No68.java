package level1;

import java.util.HashMap;
/*
문제: 완주하지 못한 선수

로직
- 참가자 이름을 HashMap에 저장하며 이름별 등장 횟수를 카운트한다.
- 완주자 이름을 순회하며 해당 이름의 개수를 1씩 감소시킨다.
- HashMap을 순회하면서 값이 0이 아닌 이름을 찾아 반환한다.

핵심 구현
- 핵심 코드
  map.put(participant[i], map.getOrDefault(participant[i], 0) + 1);
- 참가자의 이름별 등장 횟수를 저장하여 동명이인까지 처리한다.

- 핵심 코드
  map.put(completion[j], map.get(completion[j]) - 1);
- 완주한 선수의 개수를 차감하여 완주하지 못한 선수만 남도록 한다.

포인트
- HashMap을 이용해 이름과 등장 횟수를 관리한다.
- getOrDefault()를 사용하면 존재하지 않는 Key도 쉽게 초기화할 수 있다.
- 동명이인이 존재하는 경우에도 정확하게 처리할 수 있다.
- 시간복잡도는 O(N)으로 효율적이다.

회고
- 처음에는 contains()와 getOrDefault()의 용도를 혼동했지만, getOrDefault()는 값을 가져오는 메서드이며 put()과 함께 사용해야 한다는 점을 익혔다.
- HashMap을 이용한 빈도수 카운팅 패턴을 다시 한번 학습할 수 있었다.
*/
public class No68 {
    class Solution {
        public String solution(String[] participant, String[] completion) {
            String answer = "";

            HashMap<String, Integer> map = new HashMap<>();

            for(int i = 0; i < participant.length; i++){
                map.put(participant[i], map.getOrDefault(participant[i],0) + 1);
            }

            for(int j = 0; j < completion.length; j++){
                map.put(completion[j], map.get(completion[j]) - 1);
            }

            for(String key : map.keySet()){
                if(map.get(key) != 0){
                    answer = key;
                }
            }

            return answer;
        }
    }
}
