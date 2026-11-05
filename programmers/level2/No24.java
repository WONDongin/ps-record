package level2;
/*
문제: n^2 배열 자르기

로직
- left부터 right까지 필요한 인덱스만 확인한다.
- 각 인덱스를 2차원 배열의 행과 열로 변환한다.
- 행과 열 중 큰 값에 1을 더해 결과 배열에 저장한다.

핵심 구현
- index / n으로 행 번호를 구한다.
- index % n으로 열 번호를 구한다.
- Math.max(row, col) + 1로 해당 칸의 값을 계산한다.

포인트
- 전체 배열을 만들면 n이 클 때 메모리가 부족하다.
- left와 right는 int 범위를 넘을 수 있으므로 long으로 처리한다.
- 결과 배열의 길이는 right - left + 1이다.

회고
- 각 칸이 채워지는 시점은 행과 열 중 큰 번호로 결정된다.
- 이 규칙을 사용하면 필요한 구간의 값만 바로 구할 수 있다.
*/
public class No24 {
    class Solution {
        public int[] solution(int n, long left, long right) {
            int length = (int) (right - left + 1);
            int[] answer = new int[length];

            for (int i = 0; i < length; i++) {
                long index = left + i;

                long row = index / n;
                long col = index % n;

                answer[i] = (int) (Math.max(row, col) + 1);
            }

            return answer;
        }
    }
}
