package level0;
/*
문제: 배열 만들기 3

로직
- queries를 앞에서부터 순서대로 확인한다.
- 각 query에서 교환할 두 인덱스 i와 j를 구한다.
- arr[i]와 arr[j]의 값을 서로 교환한다.

핵심 구현
- 향상된 for문으로 queries의 각 query를 순회한다.
- 임시 변수 temp를 사용하여 두 값을 안전하게 교환한다.
- 모든 query를 처리한 arr을 반환한다.

포인트
- queries는 주어진 순서대로 처리해야 한다.
- 값을 바로 덮어쓰면 기존 값이 사라지므로 임시 변수가 필요하다.

회고
- 각 query의 두 인덱스를 확인하고 배열의 값을 순서대로 교환하여 해결했다.
*/
public class No190 {
    class Solution {
        public int[] solution(int[] arr, int[][] queries) {
            for (int[] query : queries) {
                int i = query[0];
                int j = query[1];

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

            return arr;
        }
    }

}
