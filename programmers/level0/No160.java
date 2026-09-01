package level0;
/*
문제: 특별한 이차원 배열 2

로직
- 대각선을 기준으로 서로 마주 보는 arr[i][j]와 arr[j][i]를 비교한다.
- 두 값이 하나라도 다르면 0을 반환한다.
- 모든 값이 같으면 1을 반환한다.

핵심 구현
- arr[i][j] != arr[j][i]를 이용해 대칭 여부를 확인한다.
- 중복 비교를 피하기 위해 j를 i + 1부터 시작한다.

포인트
- 대각선 원소는 자기 자신과 비교하므로 검사하지 않아도 된다.
- 다른 값을 발견하면 반복을 계속하지 않고 즉시 0을 반환한다.

회고
- 이차원 배열에서 행과 열의 인덱스를 교환하여 대칭 여부를 확인했다.
*/
public class No160 {
    class Solution {
        public int solution(int[][] arr) {
            int n = arr.length;

            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[i][j] != arr[j][i]) {
                        return 0;
                    }
                }
            }

            return 1;
        }
    }
}
