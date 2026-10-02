package level0;
/*
문제: 배열의 원소만큼 추가하기

로직
- queries를 순서대로 확인한다.
- 각 쿼리의 s부터 e까지 인덱스를 순회한다.
- 인덱스가 k의 배수이면 해당 배열 원소를 1 증가시킨다.

핵심 구현
- k가 0이면 0번 인덱스만 처리한다.
- k가 0보다 크면 i % k == 0으로 배수 여부를 확인한다.

포인트
- 배수 조건은 arr[i]의 값이 아닌 인덱스 i에 적용한다.
- 제한사항에 k = 0이 포함되어 있어 0으로 나누는 경우를 별도로 처리한다.

회고
- 각 쿼리의 범위와 인덱스 조건을 그대로 구현했다.
*/
public class No209 {
    class Solution {
        public int[] solution(int[] arr, int[][] queries) {
            for (int[] query : queries) {
                int s = query[0];
                int e = query[1];
                int k = query[2];

                for (int i = s; i <= e; i++) {
                    if ((k == 0 && i == 0) || (k > 0 && i % k == 0)) {
                        arr[i]++;
                    }
                }
            }

            return arr;
        }
    }
}
