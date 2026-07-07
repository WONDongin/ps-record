package level1;
/*
문제: 택배 상자 꺼내기

로직
- 상자의 행(row)과 열(column)을 계산한다.
- 지그재그 배치 방향(정방향/역방향)에 따라 실제 열 위치를 구한다.
- 같은 열에 있는 상자들 중 현재 상자 위에 존재하는 상자의 개수를 계산한다.
- 현재 상자를 포함한 총 꺼내야 하는 상자의 개수를 반환한다.

핵심 구현
- 핵심 코드
  ex)
  int row = (num - 1) / w;
  int col = (num - 1) % w;

- 짝수 행은 왼쪽 → 오른쪽, 홀수 행은 오른쪽 → 왼쪽으로 배치되므로
  행의 방향에 따라 실제 열 위치를 변환한다.
- 같은 열에 존재하는 상자만 현재 상자를 막고 있으므로
  위쪽 행을 순회하며 개수를 계산한다.

포인트
- 지그재그 배치를 좌표(row, column)로 변환하는 것이 핵심이다.
- 마지막 행은 상자가 모두 채워져 있지 않을 수 있으므로 범위를 반드시 확인해야 한다.
- 같은 열에 있는 상자만 꺼내면 되므로 전체 창고를 탐색할 필요가 없다.

회고
- 단순 구현 문제가 아니라 좌표 변환을 정확하게 하는 것이 중요했다.
- 행의 방향과 마지막 행의 예외 처리를 꼼꼼히 고려해야 올바른 결과를 얻을 수 있었다.
*/
public class No71 {
    class Solution {
        public int solution(int n, int w, int num) {
            int row = (num - 1) / w;
            int col = (num - 1) % w;

            // 현재 상자의 실제 열 위치
            if (row % 2 == 1) {
                col = w - 1 - col;
            }

            int answer = 1; // 현재 상자 포함

            int lastRow = (n - 1) / w;

            // 현재 상자 위의 행만 확인
            for (int r = row + 1; r <= lastRow; r++) {
                int box;

                if (r % 2 == 0) {
                    box = r * w + col + 1;
                } else {
                    box = r * w + (w - col);
                }

                if (box <= n) {
                    answer++;
                }
            }

            return answer;
        }
    }
}
