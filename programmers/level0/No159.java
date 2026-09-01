package level0;
/*
문제: 정사각형으로 만들기

로직
- n × n 크기의 이차원 배열을 생성한다.
- 행과 열의 인덱스가 같은 대각선 위치에만 1을 저장한다.

핵심 구현
- answer[i][i] = 1을 사용해 주대각선 원소를 변경한다.
- int 배열의 나머지 원소는 기본값인 0을 유지한다.

포인트
- 이중 반복문 없이 한 번의 반복문만으로 구현할 수 있다.
- 시간 복잡도는 O(n), 공간 복잡도는 반환 배열을 포함해 O(n²)이다.

회고
- 배열의 기본값이 0이라는 점을 활용해 필요한 위치만 변경했다.
*/
public class No159 {
    class Solution {
        public int[][] solution(int n) {
            int[][] answer = new int[n][n];

            for (int i = 0; i < n; i++) {
                answer[i][i] = 1;
            }

            return answer;
        }
    }
}
