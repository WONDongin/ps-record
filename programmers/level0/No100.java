package level0;
/*
문제: 개미 군단

로직
- 공격력이 가장 높은 장군개미부터 최대한 배치한다.
- 남은 체력에는 병정개미를 최대한 배치한다.
- 마지막으로 남은 체력만큼 일개미를 배치한다.

핵심 구현
- 장군개미 수: hp / 5
- 장군개미 배치 후 남은 체력: hp % 5
- 병정개미 수: 남은 체력 / 3
- 병정개미 배치 후 남은 체력만큼 일개미를 추가한다.

포인트
- 최소 병력을 구해야 하므로 공격력이 높은 개미부터 선택하는 그리디 방식으로 해결한다.
- 나눗셈으로 필요한 개미 수를 구하고 나머지 연산으로 남은 체력을 계산한다.
- 일개미의 공격력이 1이므로 마지막 남은 체력과 필요한 일개미 수가 같다.

회고
- 큰 공격력부터 차례대로 선택하는 그리디 방식과 나눗셈, 나머지 연산을 활용해 간단하게 해결했다.
*/
public class No100 {
    public static void main(String[] args) {
        class Solution {
            public int solution(int hp) {
                int answer = 0;

                answer += hp / 5;
                hp %= 5;

                answer += hp / 3;
                hp %= 3;

                answer += hp;

                return answer;
            }
        }

        Solution solution = new Solution();
        System.out.println(solution.solution(23));
    }
}
