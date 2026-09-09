package level0;
/*
문제: 수열과 구간 쿼리 1

로직
- queries를 순서대로 순회한다.
- 각 query에서 시작 인덱스 s와 끝 인덱스 e를 구한다.
- s부터 e까지의 모든 arr 원소에 1을 더한다.

핵심 구현
- 향상된 for문으로 각 query를 가져온다.
- query[0]부터 query[1]까지 반복하며 arr[i]를 증가시킨다.

포인트
- 시작 인덱스와 끝 인덱스를 모두 포함해야 하므로 i <= end 조건을 사용한다.
- 모든 query는 주어진 순서대로 처리한다.

회고
- 각 쿼리의 범위만큼 배열을 순회하여 값을 증가시키는 방식으로 구현했다.
*/
public class No172 {
    class Solution {
        public int[] solution(int[] arr, int[][] queries) {
            for (int[] query : queries) {
                int start = query[0];
                int end = query[1];

                for (int i = start; i <= end; i++) {
                    arr[i]++;
                }
            }

            return arr;
        }
    }
}
