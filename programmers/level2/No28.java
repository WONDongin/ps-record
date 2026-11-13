package level2;
/*
문제: 행렬의 곱셈

로직
- 첫 번째 행렬의 행 개수와 두 번째 행렬의 열 개수로 결과 배열을 생성한다.
- 첫 번째 행렬의 각 행과 두 번째 행렬의 각 열을 확인한다.
- 대응하는 원소끼리 곱한 값을 누적하여 결과 배열에 저장한다.

핵심 구현
- i는 첫 번째 행렬의 행, j는 두 번째 행렬의 열을 나타낸다.
- k는 첫 번째 행렬의 열과 두 번째 행렬의 행을 연결한다.
- arr1[i][k] * arr2[k][j]를 answer[i][j]에 누적한다.

포인트
- 결과 행렬의 크기는 arr1의 행 개수 × arr2의 열 개수이다.
- 첫 번째 행렬의 열 개수와 두 번째 행렬의 행 개수가 같아야 곱할 수 있다.
- 행렬 원소에 음수가 포함될 수 있으므로 int 자료형으로 계산한다.

회고
- 행렬 곱셈의 행과 열 관계를 삼중 반복문으로 구현했다.
*/
public class No28 {
    class Solution {
        public int[][] solution(int[][] arr1, int[][] arr2) {
            int[][] answer = new int[arr1.length][arr2[0].length];

            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr2[0].length; j++) {
                    for (int k = 0; k < arr1[0].length; k++) {
                        answer[i][j] += arr1[i][k] * arr2[k][j];
                    }
                }
            }

            return answer;
        }
    }
}
