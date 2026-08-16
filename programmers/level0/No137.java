package level0;
/*
문제: 주사위 게임 3

로직
- 크기가 7인 count 배열에 각 주사위 숫자의 등장 횟수를 기록한다.
- 같은 숫자가 나온 횟수에 따라 점수 계산식을 구분한다.
- 모든 숫자가 다르면 네 숫자 중 최솟값을 반환한다.

핵심 구현
- 숫자의 등장 횟수를 활용해 네 개 동일, 세 개 동일,
  두 쌍 동일, 한 쌍 동일인 경우를 구분했다.
- Math.abs()로 두 숫자의 차이에 대한 절댓값을 계산했다.
- 조건이 확인되는 즉시 계산한 점수를 반환했다.

포인트
- 주사위 숫자가 1부터 6까지이므로 크기가 7인 배열을 사용했다.
- 등장 횟수를 기준으로 처리해 주사위 입력 순서에 영향을 받지 않는다.
- 시간 복잡도: O(1)
- 공간 복잡도: O(1)

회고
- 여러 조건을 직접 비교하는 대신 빈도 배열을 사용해
  중복되는 숫자의 개수에 따라 점수를 계산할 수 있었다.
*/
public class No137 {
    class Solution {
        public int solution(int a, int b, int c, int d) {
            int[] count = new int[7];

            count[a]++;
            count[b]++;
            count[c]++;
            count[d]++;

            int p = 0;
            int q = 0;
            int r = 0;

            for (int number = 1; number <= 6; number++) {
                if (count[number] == 4) {
                    return 1111 * number;
                }

                if (count[number] == 3) {
                    p = number;
                } else if (count[number] == 2) {
                    if (p == 0) {
                        p = number;
                    } else {
                        q = number;
                    }
                } else if (count[number] == 1) {
                    if (q == 0) {
                        q = number;
                    } else {
                        r = number;
                    }
                }
            }

            if (p != 0 && count[p] == 3) {
                return (10 * p + q) * (10 * p + q);
            }

            if (p != 0 && q != 0 && count[p] == 2 && count[q] == 2) {
                return (p + q) * Math.abs(p - q);
            }

            if (p != 0 && count[p] == 2) {
                return q * r;
            }

            return Math.min(Math.min(a, b), Math.min(c, d));
        }
    }
}