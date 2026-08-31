package level0;
/*
문제: 연속된 수의 합

로직
- 연속된 수의 첫 번째 값을 공식으로 계산한다.
- 첫 번째 값부터 1씩 증가시키며 배열에 저장한다.

핵심 구현
- 연속된 num개의 수를 start, start + 1, ..., start + num - 1로 표현했다.
- 0부터 num - 1까지의 합은 num * (num - 1) / 2이다.
- start = (total - num * (num - 1) / 2) / num 공식으로 시작값을 구했다.

포인트
- 시작값은 음수가 될 수도 있다.
- 가능한 입력만 주어지므로 계산한 시작값은 항상 정수로 나누어진다.

회고
- 값을 하나씩 탐색하지 않고 등차수열의 합을 이용해 시작값을 바로 구할 수 있었다.
*/
public class No158 {
    class Solution {
        public int[] solution(int num, int total) {
            int[] answer = new int[num];

            int sequenceSum = num * (num - 1) / 2;
            int start = (total - sequenceSum) / num;

            for (int i = 0; i < num; i++) {
                answer[i] = start + i;
            }

            return answer;
        }
    }
}
