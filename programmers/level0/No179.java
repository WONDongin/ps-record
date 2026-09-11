package level0;
/*
문제: 2차원으로 만들기

로직
- num_list의 길이를 n으로 나누어 2차원 배열의 행 개수를 구한다.
- num_list의 원소를 앞에서부터 순서대로 2차원 배열에 저장한다.
- 몫과 나머지를 이용하여 행과 열의 위치를 계산한다.

핵심 구현
- 행 인덱스는 i / n으로 계산한다.
- 열 인덱스는 i % n으로 계산한다.
- answer[i / n][i % n]에 num_list[i]를 저장한다.

포인트
- num_list의 길이는 n의 배수이므로 모든 원소를 빠짐없이 나눌 수 있다.
- 별도의 행과 열 변수를 사용하지 않고 몫과 나머지로 위치를 구할 수 있다.

회고
- 1차원 배열의 인덱스를 몫과 나머지로 변환하여 2차원 배열에 배치했다.
- 배열 간 인덱스 변환 방법을 익힐 수 있었다.
*/
public class No179 {
    class Solution {
        public int[][] solution(int[] num_list, int n) {
            int[][] answer = new int[num_list.length / n][n];

            for (int i = 0; i < num_list.length; i++) {
                answer[i / n][i % n] = num_list[i];
            }

            return answer;
        }
    }
}
