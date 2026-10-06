package level0;
/*
문제: 수열과 구간 쿼리 2

로직
- 각 쿼리에서 지정한 시작 인덱스부터 종료 인덱스까지 확인한다.
- k보다 큰 원소 중 가장 작은 값을 찾는다.
- 조건을 만족하는 원소가 없으면 -1을 저장한다.

핵심 구현
- 최솟값을 -1로 초기화하여 답이 없는 경우를 처리한다.
- arr[j]가 k보다 크고, 첫 후보이거나 기존 최솟값보다 작으면 갱신한다.

포인트
- 시작 인덱스와 종료 인덱스를 모두 포함한다.
- k와 같은 값은 후보에 포함하지 않는다.
- 각 쿼리의 결과를 입력 순서대로 저장한다.

회고
- 쿼리마다 지정된 구간을 순회하며 조건에 맞는 최솟값을 구했다.
*/
public class No232 {
    class Solution {
        public int[] solution(int[] arr, int[][] queries) {
            int[] answer = new int[queries.length];

            for (int i = 0; i < queries.length; i++) {
                int s = queries[i][0];
                int e = queries[i][1];
                int k = queries[i][2];
                int min = -1;

                for (int j = s; j <= e; j++) {
                    if (arr[j] > k && (min == -1 || arr[j] < min)) {
                        min = arr[j];
                    }
                }

                answer[i] = min;
            }

            return answer;
        }
    }
}
