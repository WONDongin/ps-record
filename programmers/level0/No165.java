package level0;
/*
문제: 최빈값 구하기

로직
- 크기가 1000인 빈도 배열을 생성한다.
- 주어진 배열을 순회하며 각 숫자의 등장 횟수를 저장한다.
- 빈도 배열을 순회하며 가장 많이 등장한 숫자를 찾는다.
- 최대 등장 횟수가 같은 숫자가 여러 개라면 -1을 반환한다.

핵심 구현
- count[number]를 증가시켜 숫자별 등장 횟수를 기록한다.
- 현재 빈도가 maxCount보다 크면 최빈값과 최대 빈도를 갱신한다.
- 현재 빈도가 maxCount와 같으면 최빈값이 여러 개인 것으로 처리한다.

포인트
- 배열의 원소가 0 이상 1000 미만이므로 크기가 1000인 빈도 배열을 사용할 수 있다.
- 더 큰 빈도를 발견하면 중복 여부를 다시 false로 초기화해야 한다.
- 등장하지 않은 숫자의 빈도 0은 최빈값 비교에서 제외한다.

회고
- 빈도 배열을 활용하여 각 숫자의 등장 횟수를 간단하게 계산했다.
- 최빈값뿐만 아니라 최빈값의 중복 여부도 함께 확인했다.
*/

public class No165 {
    class Solution {
        public int solution(int[] array) {
            int[] count = new int[1000];

            for (int number : array) {
                count[number]++;
            }

            int maxCount = 0;
            int answer = 0;
            boolean duplicate = false;

            for (int i = 0; i < count.length; i++) {
                if (count[i] > maxCount) {
                    maxCount = count[i];
                    answer = i;
                    duplicate = false;
                } else if (count[i] == maxCount && count[i] != 0) {
                    duplicate = true;
                }
            }

            return duplicate ? -1 : answer;
        }
    }
}
