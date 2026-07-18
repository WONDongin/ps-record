package level0;
/*
문제: 수 조작하기 1

로직
- control 문자열을 앞에서부터 한 문자씩 순회한다.
- 각 문자에 해당하는 연산을 n에 적용한다.
- 모든 문자를 처리한 후 최종 n을 반환한다.

핵심 구현
- 향상된 for문을 사용해 control의 각 문자를 확인한다.
  ex) for (char command : control.toCharArray())

- switch문으로 문자별 연산을 구분한다.
  'w' → n을 1 증가
  's' → n을 1 감소
  'd' → n을 10 증가
  'a' → n을 10 감소

포인트
- 문자열의 문자 순서대로 연산을 적용해야 한다.
- control의 길이가 최대 100,000이므로 한 번만 순회한다.
- 시간 복잡도는 O(control의 길이)이다.

회고
- 문자의 종류에 따라 수행할 연산이 명확하게 구분되므로
  switch문을 사용해 간결하고 읽기 쉽게 구현할 수 있었다.
*/
public class No87 {
    class Solution {
        public int solution(int n, String control) {
            for (char command : control.toCharArray()) {
                switch (command) {
                    case 'w':
                        n++;
                        break;
                    case 's':
                        n--;
                        break;
                    case 'd':
                        n += 10;
                        break;
                    case 'a':
                        n -= 10;
                        break;
                }
            }

            return n;
        }
    }
}
