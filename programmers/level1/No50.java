package level1;
/*
문제: 소수 찾기

문제 요약
- 1부터 n 사이에 있는 소수의 개수를 구하는 문제
- 1은 소수가 아니며, 2부터 n까지의 수 중 소수만 카운트한다

접근 방법
- 모든 수를 하나씩 나누어 검사하면 n이 최대 1,000,000이라 비효율적이다
- 에라토스테네스의 체를 사용해 소수가 아닌 수를 미리 제거한다

핵심 아이디어
- 처음에는 모든 수를 소수라고 가정한다
- 0과 1은 소수가 아니므로 false 처리한다
- 2부터 시작해서 해당 수가 소수이면 그 수의 배수를 false 처리한다
- 마지막에 true로 남아 있는 수의 개수를 센다

주의할 점
- 배수 제거는 i * i부터 시작해도 된다
- i * i <= n 조건을 사용하면 불필요한 반복을 줄일 수 있다
- 1은 소수가 아니므로 반드시 제외해야 한다

배운 점
- 소수 개수를 구할 때는 에라토스테네스의 체를 사용하면 효율적이다
- boolean 배열을 활용하면 소수 여부를 빠르게 관리할 수 있다
*/
public class No50 {
    class Solution {
        public int solution(int n) {
            boolean[] prime = new boolean[n + 1];

            for (int i = 2; i <= n; i++) {
                prime[i] = true;
            }

            for (int i = 2; i * i <= n; i++) {
                if (prime[i]) {
                    for (int j = i * i; j <= n; j += i) {
                        prime[j] = false;
                    }
                }
            }

            int answer = 0;

            for (int i = 2; i <= n; i++) {
                if (prime[i]) {
                    answer++;
                }
            }

            return answer;
        }
    }
}
