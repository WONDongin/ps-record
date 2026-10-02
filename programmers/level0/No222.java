package level0;
import java.util.HashSet;
import java.util.Set;
/*
문제: N으로 표현

로직
- N을 1번부터 8번까지 사용해서 만들 수 있는 숫자를 사용 횟수별로 저장한다.
- N을 이어 붙인 숫자(N, NN, NNN 등)를 추가한다.
- 사용 횟수를 두 부분으로 나누고, 각 부분에서 만든 숫자를 사칙연산으로 조합한다.
- number가 처음 등장한 사용 횟수를 반환한다.

핵심 구현
- dp[count]에 N을 count번 사용해서 만들 수 있는 숫자를 저장한다.
- leftCount + rightCount = count가 되도록 모든 분할을 확인한다.
- 두 집합의 숫자에 덧셈, 뺄셈, 곱셈, 나눗셈을 적용한다.
- 나눗셈은 0으로 나누는 경우를 제외한다.

포인트
- 같은 숫자가 여러 수식으로 만들어질 수 있으므로 Set으로 중복을 제거한다.
- 뺄셈과 나눗셈은 순서에 따라 결과가 달라지므로 분할을 모두 확인한다.
- 사용 횟수가 작은 순서대로 탐색하므로 number를 처음 찾은 횟수가 최솟값이다.

회고
- 수식을 직접 구성하려고 하면 괄호와 연산 순서를 관리하기 복잡하다.
- 사용한 N의 개수를 기준으로 가능한 결과를 모으면 작은 문제의 결과를 재사용할 수 있다.
*/
public class No222 {
    class Solution {
        public int solution(int N, int number) {
            if (N == number) {
                return 1;
            }

            @SuppressWarnings("unchecked")
            Set<Integer>[] dp = new HashSet[9];

            for (int count = 1; count <= 8; count++) {
                dp[count] = new HashSet<>();

                // N, NN, NNN처럼 숫자를 이어 붙인 경우
                int repeated = 0;
                for (int i = 0; i < count; i++) {
                    repeated = repeated * 10 + N;
                }
                dp[count].add(repeated);

                // N을 총 count번 사용하도록 두 식을 나눈다.
                for (int leftCount = 1; leftCount < count; leftCount++) {
                    int rightCount = count - leftCount;

                    for (int left : dp[leftCount]) {
                        for (int right : dp[rightCount]) {
                            dp[count].add(left + right);
                            dp[count].add(left - right);
                            dp[count].add(left * right);

                            if (right != 0) {
                                dp[count].add(left / right);
                            }
                        }
                    }
                }

                if (dp[count].contains(number)) {
                    return count;
                }
            }

            return -1;
        }
    }
}
