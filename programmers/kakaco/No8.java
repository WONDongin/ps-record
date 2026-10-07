package kakaco;
/*
문제: 키패드 누르기

로직
- 왼손은 *, 오른손은 # 위치에서 시작한다.
- 1, 4, 7은 왼손으로, 3, 6, 9는 오른손으로 누른다.
- 2, 5, 8, 0은 현재 위치에서 더 가까운 손으로 누른다.
- 거리가 같으면 주로 사용하는 손으로 누른다.
- 번호를 누른 손의 현재 위치를 갱신한다.

핵심 구현
- 각 키패드의 위치를 행과 열 좌표로 저장한다.
- 행 차이의 절댓값과 열 차이의 절댓값을 더해 거리를 계산한다.
- StringBuilder에 사용한 손을 L 또는 R로 기록한다.

포인트
- 숫자값의 차이가 아닌 키패드 좌표를 기준으로 거리를 계산한다.
- 0은 마지막 행의 가운데에 위치한다.
- 번호를 누른 손의 위치만 변경한다.

회고
- 키패드를 좌표로 표현하여 이동 거리를 간단하게 계산했다.
- 두 손의 현재 위치를 관리하며 입력 순서대로 규칙을 적용했다.
*/
public class No8 {
    class Solution {
        public String solution(int[] numbers, String hand) {
            int[][] positions = {
                    {3, 1}, // 0
                    {0, 0}, // 1
                    {0, 1}, // 2
                    {0, 2}, // 3
                    {1, 0}, // 4
                    {1, 1}, // 5
                    {1, 2}, // 6
                    {2, 0}, // 7
                    {2, 1}, // 8
                    {2, 2}, // 9
                    {3, 0}, // *: 인덱스 10
                    {3, 2}  // #: 인덱스 11
            };

            int left = 10;
            int right = 11;

            StringBuilder answer = new StringBuilder();

            for (int number : numbers) {
                if (number == 1 || number == 4 || number == 7) {
                    answer.append('L');
                    left = number;
                } else if (number == 3 || number == 6 || number == 9) {
                    answer.append('R');
                    right = number;
                } else {
                    int leftDistance = distance(positions, left, number);
                    int rightDistance = distance(positions, right, number);

                    if (leftDistance < rightDistance
                            || (leftDistance == rightDistance
                            && hand.equals("left"))) {
                        answer.append('L');
                        left = number;
                    } else {
                        answer.append('R');
                        right = number;
                    }
                }
            }

            return answer.toString();
        }

        private int distance(int[][] positions, int from, int to) {
            return Math.abs(positions[from][0] - positions[to][0])
                    + Math.abs(positions[from][1] - positions[to][1]);
        }
    }
}
