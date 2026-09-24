package level0;
/*
문제: 정사각형으로 만들기

로직
- 행의 수와 열의 수 중 큰 값을 구한다.
- 해당 크기의 정사각형 배열을 만든다.
- 기존 배열의 값을 같은 위치에 복사한다.

핵심 구현
- int size = Math.max(arr.length, arr[0].length);
- System.arraycopy로 각 행의 기존 값을 복사한다.

포인트
- 새로 만든 int 배열의 나머지 칸은 기본값인 0으로 채워진다.

회고
- 행과 열을 따로 추가하는 대신 필요한 크기의 배열을 만들고 기존 값을 옮겼다.
*/
public class No210 {
    class Solution {
        public int[][] solution(int[][] arr) {
            int size = Math.max(arr.length, arr[0].length);
            int[][] answer = new int[size][size];

            for (int i = 0; i < arr.length; i++) {
                System.arraycopy(arr[i], 0, answer[i], 0, arr[i].length);
            }

            return answer;
        }
    }
}
