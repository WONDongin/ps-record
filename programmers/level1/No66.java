package level1;
/*
문제: 평행

문제 요약
- 네 개의 점을 두 개씩 연결하여 만들 수 있는 두 직선 중 평행한 경우가 있는지 판단한다.
- 평행한 경우 1, 없으면 0을 반환한다.

접근 방법
- 가능한 점의 조합은 총 3가지이다.
- 각 조합마다 두 직선의 기울기가 같은지 비교한다.
- 기울기는 실수 계산 대신 교차 곱으로 비교하여 오차를 방지한다.

핵심 아이디어
- 가능한 조합
  (0,1)-(2,3)
  (0,2)-(1,3)
  (0,3)-(1,2)
- 기울기 비교
  (y2-y1) * (x4-x3) == (y4-y3) * (x2-x1)

주의할 점
- double로 기울기를 비교하면 오차가 발생할 수 있다.
- 가능한 세 가지 조합만 확인하면 모든 경우를 검사할 수 있다.

배운 점
- 분수 비교는 나눗셈보다 교차 곱을 이용하는 것이 더 안전하다.
- 경우의 수가 적은 문제는 모든 조합을 직접 검사하는 것이 가장 간단하다.
*/
public class No66 {
    class Solution {
        public int solution(int[][] dots) {

            if (isParallel(dots[0], dots[1], dots[2], dots[3])) return 1;
            if (isParallel(dots[0], dots[2], dots[1], dots[3])) return 1;
            if (isParallel(dots[0], dots[3], dots[1], dots[2])) return 1;

            return 0;
        }

        private boolean isParallel(int[] a, int[] b, int[] c, int[] d) {
            return (b[1] - a[1]) * (d[0] - c[0])
                    == (d[1] - c[1]) * (b[0] - a[0]);
        }
    }
}
