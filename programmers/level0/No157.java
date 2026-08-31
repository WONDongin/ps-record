package level0;
/*
문제: 배열 회전시키기

로직
- direction이 right이면 마지막 원소를 배열의 맨 앞으로 이동한다.
- direction이 left이면 첫 번째 원소를 배열의 맨 뒤로 이동한다.
- 나머지 원소는 회전 방향에 맞게 한 칸씩 옮긴다.

핵심 구현
- 오른쪽 회전은 numbers의 마지막 원소를 answer[0]에 저장했다.
- 왼쪽 회전은 numbers의 첫 번째 원소를 answer의 마지막에 저장했다.
- 새로운 배열을 만들어 각 원소의 위치를 변경했다.

포인트
- 문자열 비교에는 ==가 아니라 equals()를 사용해야 한다.
- 배열의 첫 번째 또는 마지막 원소가 회전 후 어느 위치로 이동하는지 먼저 처리한다.

회고
- 회전 방향에 따라 기준 원소를 먼저 배치하면 나머지 원소를 쉽게 복사할 수 있다.
*/
public class No157 {
    class Solution {
        public int[] solution(int[] numbers, String direction) {
            int length = numbers.length;
            int[] answer = new int[length];

            if (direction.equals("right")) {
                answer[0] = numbers[length - 1];

                for (int i = 0; i < length - 1; i++) {
                    answer[i + 1] = numbers[i];
                }
            } else {
                answer[length - 1] = numbers[0];

                for (int i = 1; i < length; i++) {
                    answer[i - 1] = numbers[i];
                }
            }

            return answer;
        }
    }
}
