package level0;
/*
문제: 이차원 배열 대각선 순회하기

로직
- 이중 반복문으로 board의 모든 원소를 순회한다.
- 현재 원소의 행 인덱스 i와 열 인덱스 j를 더한다.
- i + j가 k 이하이면 해당 원소를 answer에 더한다.

핵심 구현
- board[i][j]에 접근하면서 i + j <= k 조건을 검사한다.
- 조건을 만족하는 원소만 answer에 누적한다.

포인트
- i와 j는 배열의 값이 아니라 각각 행과 열의 인덱스이다.
- 인덱스는 0부터 시작한다.
- 모든 원소를 한 번씩 확인하므로 시간 복잡도는 O(N × M)이다.

회고
- 이중 반복문과 조건문을 사용하여 조건을 만족하는 원소들의 합을 간단하게 구했다.
*/
public class No168 {
    class Solution {
        public int solution(int[][] board, int k) {
            int answer = 0;

            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    if (i + j <= k) {
                        answer += board[i][j];
                    }
                }
            }

            return answer;
        }
    }
}
