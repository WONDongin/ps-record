package level0;
/*
문제: 직사각형 넓이 구하기

로직
- 네 꼭짓점의 x좌표 중 최솟값과 최댓값을 구한다.
- 네 꼭짓점의 y좌표 중 최솟값과 최댓값을 구한다.
- x좌표의 차이로 가로 길이를 계산한다.
- y좌표의 차이로 세로 길이를 계산한다.
- 가로 길이와 세로 길이를 곱해 직사각형의 넓이를 구한다.

핵심 구현
- Math.min()과 Math.max()를 사용해 좌표별 최솟값과 최댓값을 갱신한다.
- 가로 길이는 maxX - minX로 계산한다.
- 세로 길이는 maxY - minY로 계산한다.

포인트
- 직사각형의 변이 좌표축과 평행하므로 좌표의 최댓값과 최솟값만 알면 된다.
- 좌표에 음수가 포함되어 있어도 최댓값과 최솟값의 차이로 길이를 구할 수 있다.
- 꼭짓점이 입력되는 순서와 관계없이 같은 방식으로 넓이를 계산할 수 있다.

회고
- 꼭짓점 사이의 위치 관계를 직접 비교하지 않고 좌표의 범위를 이용해 간단하게 해결했다.
- 최댓값과 최솟값을 활용하면 음수 좌표가 포함된 경우에도 정확한 넓이를 계산할 수 있었다.
*/
public class No197 {
    class Solution {
        public int solution(int[][] dots) {
            int minX = dots[0][0];
            int maxX = dots[0][0];
            int minY = dots[0][1];
            int maxY = dots[0][1];

            for (int[] dot : dots) {
                minX = Math.min(minX, dot[0]);
                maxX = Math.max(maxX, dot[0]);
                minY = Math.min(minY, dot[1]);
                maxY = Math.max(maxY, dot[1]);
            }

            int width = maxX - minX;
            int height = maxY - minY;

            return width * height;
        }
    }
}
