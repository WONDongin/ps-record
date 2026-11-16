package level2;
/*
문제: 롤케이크 자르기

로직
- 모든 토핑이 오른쪽 조각에 있다고 가정하고 토핑별 개수를 센다.
- 토핑을 왼쪽 조각으로 하나씩 옮기며 양쪽의 토핑 종류 수를 갱신한다.
- 양쪽의 토핑 종류 수가 같으면 공평하게 자르는 방법의 수를 증가시킨다.

핵심 구현
- rightCount 배열로 오른쪽에 남아 있는 토핑별 개수를 관리한다.
- leftSeen 배열로 왼쪽에 등장한 토핑인지 확인한다.
- 왼쪽에 처음 등장한 토핑이면 leftKinds를 증가시킨다.
- 오른쪽에서 개수가 0이 된 토핑은 rightKinds를 감소시킨다.

포인트
- 토핑의 개수가 아닌 서로 다른 토핑의 종류 수를 비교한다.
- 두 조각이 모두 비어 있지 않도록 마지막 토핑 앞까지만 확인한다.
- 토핑 번호의 최댓값이 10000이므로 배열로 등장 여부와 개수를 관리한다.

회고
- 자르는 위치마다 토핑을 다시 세지 않고 기존 개수와 종류 수를 갱신하여 해결했다.
*/
public class No30 {
    class Solution {
        public int solution(int[] topping) {
            int[] rightCount = new int[10001];
            boolean[] leftSeen = new boolean[10001];

            int leftKinds = 0;
            int rightKinds = 0;
            int answer = 0;

            for (int number : topping) {
                if (rightCount[number] == 0) {
                    rightKinds++;
                }
                rightCount[number]++;
            }

            for (int i = 0; i < topping.length - 1; i++) {
                int number = topping[i];

                if (!leftSeen[number]) {
                    leftSeen[number] = true;
                    leftKinds++;
                }

                rightCount[number]--;

                if (rightCount[number] == 0) {
                    rightKinds--;
                }

                if (leftKinds == rightKinds) {
                    answer++;
                }
            }

            return answer;
        }
    }
}
