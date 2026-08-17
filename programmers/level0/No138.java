package level0;
/*
문제: n보다 커질 때까지 더하기

로직
- numbers의 원소를 앞에서부터 answer에 더한다.
- 누적 합이 n보다 커지는 순간 반복문을 종료한다.
- 현재까지 계산한 누적 합을 반환한다.

핵심 구현
- 원소를 더한 후 answer > n 조건을 검사했다.
- 조건을 만족하면 break를 사용해 반복을 종료했다.

포인트
- 합이 n과 같을 때가 아니라 n보다 커질 때 종료해야 한다.
- 시간 복잡도: O(n)
- 공간 복잡도: O(1)

회고
- 누적 합을 계산하면서 종료 조건을 확인하는 방식으로
  필요한 구간까지만 효율적으로 순회할 수 있었다.
*/
public class No138 {
    class Solution {
        public int solution(int[] numbers, int n) {
            int answer = 0;

            for (int number : numbers) {
                answer += number;

                if (answer > n) {
                    break;
                }
            }

            return answer;
        }
    }
}