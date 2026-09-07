package level0;
/*
문제: 1로 만들기

로직
- num_list의 각 원소를 순서대로 확인한다.
- 현재 숫자가 짝수이면 2로 나눈다.
- 현재 숫자가 홀수이면 1을 뺀 뒤 2로 나눈다.
- 숫자가 1이 될 때까지 반복하며 연산 횟수를 증가시킨다.

핵심 구현
- while문을 사용하여 각 숫자가 1이 될 때까지 연산한다.
- 한 번 나누기 연산을 수행할 때마다 answer를 1 증가시킨다.

포인트
- 이미 1인 원소는 연산할 필요가 없다.
- 홀수는 (num - 1) / 2를 계산한다.
- 모든 원소의 연산 횟수를 하나의 answer에 누적한다.

회고
- 각 원소에 문제의 조건을 그대로 반복 적용하여 전체 연산 횟수를 구했다.
*/
public class No170 {
    class Solution {
        public int solution(int[] num_list) {
            int answer = 0;

            for (int num : num_list) {
                while (num > 1) {
                    if (num % 2 == 0) {
                        num /= 2;
                    } else {
                        num = (num - 1) / 2;
                    }

                    answer++;
                }
            }

            return answer;
        }
    }
}
