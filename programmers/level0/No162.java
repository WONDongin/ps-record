package level0;
/*
문제: 피자 나눠 먹기 (2)

로직
- 피자 판 수를 1판부터 하나씩 증가시킨다.
- 전체 피자 조각 수가 사람 수로 나누어떨어지는지 확인한다.
- 처음으로 나누어떨어지는 피자 판 수를 반환한다.

핵심 구현
- 피자 한 판의 조각 수는 6개이므로 전체 조각 수는 pizza * 6이다.
- (pizza * 6) % n이 0이 될 때까지 pizza를 증가시킨다.

포인트
- 모든 사람이 같은 수의 조각을 먹으려면 전체 조각 수가 사람 수의 배수여야 한다.
- 처음 조건을 만족한 pizza가 주문해야 하는 최소 피자 판 수이다.

회고
- 전체 피자 조각 수가 사람 수로 나누어떨어지는 조건을 이용해 최소 판 수를 구했다.
*/
public class No162 {
    class Solution {
        public int solution(int n) {
            int pizza = 1;

            while ((pizza * 6) % n != 0) {
                pizza++;
            }

            return pizza;
        }
    }
}
