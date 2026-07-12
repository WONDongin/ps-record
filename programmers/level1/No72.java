package level1;
/*
문제: 바탕화면 정리

로직
- wallpaper의 모든 칸을 순회한다.
- 파일을 의미하는 '#' 문자를 찾는다.
- 파일이 있는 행과 열을 기준으로 드래그 시작점의 최솟값을 구한다.
- 파일이 있는 행과 열에 1을 더해 드래그 끝점의 최댓값을 구한다.
- [lux, luy, rdx, rdy] 형태의 배열을 반환한다.

핵심 구현
- 핵심 코드
  ex)
  lux = Math.min(lux, i);
  luy = Math.min(luy, j);
  rdx = Math.max(rdx, i + 1);
  rdy = Math.max(rdy, j + 1);

- 핵심 코드 설명
  - lux는 파일이 존재하는 가장 위쪽 행을 저장한다.
  - luy는 파일이 존재하는 가장 왼쪽 열을 저장한다.
  - rdx는 파일이 존재하는 가장 아래쪽 칸의 다음 격자점이므로 i + 1을 저장한다.
  - rdy는 파일이 존재하는 가장 오른쪽 칸의 다음 격자점이므로 j + 1을 저장한다.
  - Math.min()과 Math.max()를 사용해 모든 파일을 포함하는 최소 직사각형을 구한다.

포인트
- 파일의 위치는 격자 칸의 좌표이고 드래그 좌표는 격자점의 좌표이다.
- 드래그 끝점에는 파일이 있는 칸 전체를 포함해야 하므로 행과 열에 각각 1을 더한다.
- 모든 파일을 포함하는 최소 직사각형의 왼쪽 위와 오른쪽 아래 좌표를 구하는 문제이다.
- wallpaper에는 파일이 적어도 하나 존재하므로 별도의 빈 파일 예외 처리는 필요하지 않다.

회고
- 이차원 문자열 배열을 순회하면서 특정 문자의 위치를 찾는 방법을 연습할 수 있었다.
- 여러 좌표를 포함하는 최소 범위를 구할 때 최솟값과 최댓값을 갱신하는 방식이 유용하다는 것을 알게 되었다.
- 격자 칸의 좌표와 격자점의 좌표가 다르므로 끝점에 1을 더해야 한다는 점이 핵심이었다.
*/

public class No72 {
    class Solution {
        public int[] solution(String[] wallpaper) {
            int lux = wallpaper.length;
            int luy = wallpaper[0].length();
            int rdx = 0;
            int rdy = 0;

            for (int i = 0; i < wallpaper.length; i++) {
                for (int j = 0; j < wallpaper[i].length(); j++) {
                    if (wallpaper[i].charAt(j) == '#') {
                        lux = Math.min(lux, i);
                        luy = Math.min(luy, j);
                        rdx = Math.max(rdx, i + 1);
                        rdy = Math.max(rdy, j + 1);
                    }
                }
            }

            return new int[]{lux, luy, rdx, rdy};
        }
    }
}
