package level0;
/*
문제: 짝수는 싫어요

문제 요약
- 정수 n 이하의 모든 홀수를 오름차순으로 담은 배열을 반환한다.

접근 방법
- 홀수의 개수만큼 배열을 먼저 생성한다.
- 1부터 2씩 증가하며 홀수만 배열에 저장한다.

핵심 아이디어
- 배열 크기
  (n + 1) / 2
- 반복문
  for (int i = 1; i <= n; i += 2)

주의할 점
- n이 홀수와 짝수인 경우 모두 (n + 1) / 2로 배열 크기를 구할 수 있다.
- 반복문을 2씩 증가시키면 별도의 홀수 판별이 필요 없다.

배운 점
- 반복문의 증감값을 활용하면 조건문 없이 원하는 값만 순회할 수 있다.
- 결과 배열의 크기를 미리 계산하면 효율적으로 구현할 수 있다.
*/
public class No44 {
    class Solution {
        public int[] solution(int n) {
            int[] answer = new int[(n + 1) / 2];
            int idx = 0;

            for (int i = 1; i <= n; i += 2) {
                answer[idx++] = i;
            }

            return answer;
        }
    }
}
