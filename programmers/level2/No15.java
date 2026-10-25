package level2;
import java.util.Arrays;
/*
문제: 구명보트

로직
- 사람들의 몸무게를 오름차순으로 정렬한다.
- 가장 가벼운 사람과 가장 무거운 사람을 확인한다.
- 두 사람이 함께 탈 수 있으면 같이 태우고, 불가능하면 무거운 사람만 태운다.
- 모든 사람을 태울 때까지 반복하며 보트 개수를 센다.

핵심 구현
- 두 포인터로 아직 타지 않은 사람 중 가장 가벼운 사람과 무거운 사람을 가리킨다.
- 두 사람의 몸무게 합이 limit 이하이면 왼쪽 포인터를 증가시킨다.
- 매번 오른쪽 포인터를 감소시키고 보트 개수를 증가시킨다.

포인트
- 가장 무거운 사람이 가장 가벼운 사람과도 탈 수 없다면 혼자 타야 한다.
- 한 보트에는 최대 2명만 탈 수 있다.
- 사람이 한 명 남은 경우에도 보트 한 대가 필요하다.

회고
- 정렬과 두 포인터를 활용해 탑승할 사람을 결정했다.
- 가장 무거운 사람부터 처리하는 그리디 방식으로 최소 보트 개수를 구했다.
*/
public class No15 {
    class Solution {
        public int solution(int[] people, int limit) {
            Arrays.sort(people);

            int left = 0;
            int right = people.length - 1;
            int answer = 0;

            while (left <= right) {
                if (left < right && people[left] + people[right] <= limit) {
                    left++;
                }

                right--;
                answer++;
            }

            return answer;
        }
    }
}
