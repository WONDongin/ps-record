package kakaco;

import java.util.ArrayList;
import java.util.List;
import java.util.*;
/*
문제: 실패율

로직

- 스테이지별 사용자 수를 count 배열에 저장
- 각 스테이지의 실패율 계산
- 실패율 기준 내림차순 정렬 후 결과 반환

핵심 구현

- 실패율 계산
  ex) rate = (double) count[i] / players;
- 현재 스테이지 실패 인원 제외
  ex) players -= count[i];

포인트

- 도달한 사용자가 없는 경우 실패율 0 처리
- 실패율이 같으면 스테이지 번호 오름차순 정렬

회고

- 카운팅 배열을 활용한 집계 방식에 익숙해질 수 있었다.
- 정렬 조건이 여러 개인 경우 Comparator 활용이 중요하다는 것을 다시 확인했다.
*/
public class No4 {
    class Solution {

        static class Stage {
            int number;
            double rate;

            Stage(int number, double rate) {
                this.number = number;
                this.rate = rate;
            }
        }

        public int[] solution(int N, int[] stages) {

            int[] count = new int[N + 2];

            for (int stage : stages) {
                count[stage]++;
            }

            List<Stage> list = new ArrayList<>();

            int players = stages.length;

            for (int i = 1; i <= N; i++) {

                double rate = 0;

                if (players != 0) {
                    rate = (double) count[i] / players;
                }

                list.add(new Stage(i, rate));

                players -= count[i];
            }

            list.sort((a, b) -> {
                if (a.rate == b.rate) {
                    return a.number - b.number;
                }
                return Double.compare(b.rate, a.rate);
            });

            int[] answer = new int[N];

            for (int i = 0; i < N; i++) {
                answer[i] = list.get(i).number;
            }

            return answer;
        }
    }
}
