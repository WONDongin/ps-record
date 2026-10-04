package level0;
/*
문제: 공 던지기

로직
- 첫 번째로 공을 던지는 사람은 인덱스 0에 있다.
- 공을 던질 때마다 다음 사람의 인덱스는 2씩 증가한다.
- k번째로 던지는 사람의 인덱스를 계산하여 번호를 반환한다.

핵심 구현
- k번째로 던질 때까지의 이동 횟수는 k - 1이다.
- 2 * (k - 1)을 배열 길이로 나눈 나머지를 인덱스로 사용한다.

포인트
- k번째로 공을 받는 사람이 아닌 던지는 사람을 구한다.
- 나머지 연산을 활용해 원형으로 이어진 배열의 인덱스를 계산한다.

회고
- 반복문 없이 이동 횟수와 나머지 연산으로 정답을 구했다.
*/
public class No228 {
    class Solution {
        public int solution(int[] numbers, int k) {
            int index = (2 * (k - 1)) % numbers.length;

            return numbers[index];
        }
    }
}
