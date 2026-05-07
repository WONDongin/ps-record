package level1;

import java.util.HashMap;
import java.util.Map;
/*
문제-달리기 경주: 순위 변경 시뮬레이션

- players 배열은 현재 선수 순위를 의미
- callings 배열에 호출된 선수는 바로 앞 선수와 자리를 교체
- 모든 호출이 끝난 뒤 최종 순위를 반환하는 문제

[접근 방법]
- 선수 이름과 현재 등수를 HashMap에 저장
- 호출된 선수의 현재 위치를 O(1)로 조회
- 배열에서 앞 선수와 swap
- 변경된 등수를 Map에도 즉시 반영

[핵심 아이디어]
- 단순 탐색으로 현재 위치를 찾으면 O(N × M)
- HashMap<String, Integer> 사용 시
  선수 위치 조회를 O(1)로 최적화 가능
- 배열은 실제 순위 저장
- Map은 선수 현재 위치 저장 역할

[처리 흐름]
초기 선수 위치 Map 저장
→ 호출 선수 현재 위치 조회
→ 앞 선수와 swap
→ Map 위치 갱신
→ 반복

[시간복잡도]
- O(M)
- 호출마다 O(1) 처리
*/
public class No20 {
    public String[] solution(String[] players, String[] callings) {

        Map<String, Integer> rankMap = new HashMap<>();

        // 선수 현재 위치 저장
        for (int i = 0; i < players.length; i++) {
            rankMap.put(players[i], i);
        }

        for (String calling : callings) {

            int currentRank = rankMap.get(calling);

            // 앞 선수
            String frontPlayer = players[currentRank - 1];

            // 자리 교체
            players[currentRank - 1] = calling;
            players[currentRank] = frontPlayer;

            // 등수 갱신
            rankMap.put(calling, currentRank - 1);
            rankMap.put(frontPlayer, currentRank);
        }

        return players;
    }
}
