package level1;
import java.util.HashMap;
import java.util.Map;
/*
문제: 가장 많이 받은 선물

로직
- 친구 이름과 배열 인덱스를 연결한다.
- 선물을 주고받은 횟수와 친구별 선물 지수를 계산한다.
- 두 사람의 선물 기록을 비교해 다음 달에 선물을 받을 사람을 결정한다.
- 다음 달에 받을 선물 수 중 최댓값을 반환한다.

핵심 구현
- Map으로 친구 이름에 해당하는 인덱스를 조회한다.
- 2차원 배열로 친구 사이의 선물 전달 횟수를 저장한다.
- 선물을 준 사람의 선물 지수는 증가시키고 받은 사람은 감소시킨다.
- 이중 반복문에서 j = i + 1로 시작해 각 친구 쌍을 한 번만 비교한다.

포인트
- 주고받은 선물 수가 같을 때만 선물 지수를 비교한다.
- 선물 지수까지 같으면 선물을 주고받지 않는다.
- 다음 달에 받을 선물은 기존 선물 기록과 지수에 반영하지 않는다.

회고
- 이름을 인덱스로 변환해 친구 사이의 관계를 배열로 관리했다.
- 비교 조건의 우선순위를 나누어 선물 예측 규칙을 구현했다.
*/
public class No79 {
    class Solution {
        public int solution(String[] friends, String[] gifts) {
            int n = friends.length;

            Map<String, Integer> friendIndex = new HashMap<>();
            int[][] giftCount = new int[n][n];
            int[] giftIndex = new int[n];
            int[] nextGifts = new int[n];

            for (int i = 0; i < n; i++) {
                friendIndex.put(friends[i], i);
            }

            for (String gift : gifts) {
                String[] names = gift.split(" ");
                int from = friendIndex.get(names[0]);
                int to = friendIndex.get(names[1]);

                giftCount[from][to]++;
                giftIndex[from]++;
                giftIndex[to]--;
            }

            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (giftCount[i][j] > giftCount[j][i]) {
                        nextGifts[i]++;
                    } else if (giftCount[i][j] < giftCount[j][i]) {
                        nextGifts[j]++;
                    } else {
                        if (giftIndex[i] > giftIndex[j]) {
                            nextGifts[i]++;
                        } else if (giftIndex[i] < giftIndex[j]) {
                            nextGifts[j]++;
                        }
                    }
                }
            }

            int answer = 0;

            for (int count : nextGifts) {
                answer = Math.max(answer, count);
            }

            return answer;
        }
    }
}
