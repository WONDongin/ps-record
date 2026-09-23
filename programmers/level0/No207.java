package level0;
/*
문제: 리스트 자르기

로직
- n에 따라 시작 인덱스, 끝 인덱스, 이동 간격을 정한다.
- 시작 인덱스부터 끝 인덱스까지 정해진 간격으로 순회한다.
- 방문한 원소를 결과 배열에 순서대로 담는다.

핵심 구현
- n이 1이면 0부터, n이 2이면 배열의 마지막까지 선택한다.
- n이 4일 때만 slicer[2]를 간격으로 사용한다.
- 결과 배열의 길이는 (end - start) / step + 1로 계산한다.

포인트
- b번 인덱스까지 포함해야 하므로 반복 조건은 i <= end이다.
- n이 1, 2, 3인 경우 이동 간격은 1이다.

회고
- 네 가지 경우를 각각 반복문으로 작성하지 않고 시작점, 끝점, 간격으로 정리해 처리했다.
*/
public class No207 {
    class Solution {
        public int[] solution(int n, int[] slicer, int[] num_list) {
            int start = (n == 1) ? 0 : slicer[0];
            int end = (n == 2) ? num_list.length - 1 : slicer[1];
            int step = (n == 4) ? slicer[2] : 1;

            int[] answer = new int[(end - start) / step + 1];

            for (int i = start, index = 0; i <= end; i += step) {
                answer[index++] = num_list[i];
            }

            return answer;
        }
    }
}
