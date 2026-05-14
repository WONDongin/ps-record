package level1;

import java.util.Arrays;
/*
문제-12950: 행렬의 덧셈

[문제 요약]
- 같은 크기의 두 2차원 배열(arr1, arr2)이 주어짐
- 같은 위치의 값을 더한 결과 행렬 반환

[접근 방법]
- 결과를 저장할 2차원 배열 생성
- 이중 반복문으로 모든 요소 순회
- 같은 인덱스의 값을 더하여 저장

[핵심 아이디어]
- 2차원 배열은 [행][열] 구조
- arr1[i][j] + arr2[i][j] 형태로 계산
- 결과 배열은 기존 배열 크기와 동일하게 생성해야 함

[처리 흐름]
결과 배열 생성
→ 행 반복
→ 열 반복
→ 같은 위치 값 덧셈
→ 결과 저장

[시간복잡도]
- O(N × M)
*/
public class No30 {
    public static void main(String[] args) {
        int[][] arr1 =  {{1,2},{2,3}};
        int[][] arr2 =  {{3,4},{5,6}};
        int[][] answer = new int[arr1.length][arr1[0].length];

        for(int i = 0; i < arr1.length; i++){
            for (int j = 0; j < arr1[i].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        System.out.println(Arrays.deepToString(answer));
    }
}
