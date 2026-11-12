package level2;
import java.util.ArrayList;
import java.util.List;
/*
문제: 기능개발

로직
- 각 기능의 개발 완료까지 필요한 날짜를 계산한다.
- 현재 배포일 안에 완료되는 기능은 함께 배포한다.
- 현재 배포일보다 늦게 완료되는 기능은 새로운 배포로 묶는다.

핵심 구현
- (남은 진도 + 개발 속도 - 1) / 개발 속도로 필요한 날짜를 올림 계산한다.
- days가 deployDay보다 크면 기존 배포 개수를 저장하고 배포일을 갱신한다.
- 모든 기능을 확인한 뒤 마지막 배포 개수도 저장한다.

포인트
- 뒤의 기능이 먼저 완료되어도 앞의 기능보다 먼저 배포할 수 없다.
- 현재 배포일과 같거나 일찍 완료되는 기능은 함께 배포한다.

회고
- 날짜를 하루씩 증가시키지 않고 완료 날짜를 계산해 배포 단위를 구했다.
*/
public class No27 {
    class Solution {
        public int[] solution(int[] progresses, int[] speeds) {
            List<Integer> answer = new ArrayList<>();

            int deployDay = 0;
            int count = 0;

            for (int i = 0; i < progresses.length; i++) {
                int remaining = 100 - progresses[i];
                int days = (remaining + speeds[i] - 1) / speeds[i];

                if (days > deployDay) {
                    if (count > 0) {
                        answer.add(count);
                    }

                    deployDay = days;
                    count = 1;
                } else {
                    count++;
                }
            }

            if (count > 0) {
                answer.add(count);
            }

            return answer.stream().mapToInt(Integer::intValue).toArray();
        }
    }
}
