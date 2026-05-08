package level1;
/*
문제-12943: 콜라츠 추측

[문제 요약]
- 주어진 수가 짝수이면 2로 나누고,
  홀수이면 3을 곱한 뒤 1을 더하는 작업을 반복한다.
- 수가 1이 될 때까지 반복 횟수를 구하는 문제
- 단, 500번 반복해도 1이 되지 않으면 -1 반환

[접근 방법]
- while 문을 사용해 num이 1이 될 때까지 반복
- 반복 횟수를 count 변수로 관리
- count가 500을 초과하면 -1 반환

[핵심 아이디어]
- 짝수 판별 : num % 2 == 0
- 홀수 처리 : num = num * 3 + 1
- 연산 과정에서 int 범위를 넘을 수 있으므로 long 사용

[처리 흐름]
입력값 저장
→ num이 1이 아닐 동안 반복
→ 짝수/홀수 조건 처리
→ count 증가
→ 500 초과 시 -1 반환
→ 1이 되면 count 반환

[시간복잡도]
- O(500)
- 최대 500번까지만 반복
*/
public class No21 {
    class Solution {
        public int solution(int num) {

            long n = num;
            int count = 0;

            while (n != 1) {

                if (n % 2 == 0) {
                    n /= 2;
                } else {
                    n = n * 3 + 1;
                }

                count++;

                if (count == 500) {
                    return -1;
                }
            }

            return count;
        }
    }
}
