package level0;

import java.util.Arrays;
/*
문제: 배열에서 가장 작은 5개의 수 구하기

로직
- num_list를 오름차순으로 정렬한다.
- 정렬된 배열의 0번 인덱스부터 4번 인덱스까지 복사한다.
- 가장 작은 5개의 수가 담긴 배열을 반환한다.

핵심 구현
- Arrays.sort(num_list)로 배열을 오름차순 정렬한다.
- Arrays.copyOfRange(num_list, 0, 5)로 앞의 5개 원소를 복사한다.
- copyOfRange()의 마지막 인덱스는 포함되지 않으므로 종료 위치를 5로 지정한다.

포인트
- 오름차순 정렬 후 배열의 앞쪽 5개가 가장 작은 수들이다.
- Arrays.copyOfRange()는 새로운 배열을 생성해 반환한다.
- 원본 배열인 num_list는 Arrays.sort()로 인해 정렬된 상태로 변경된다.

회고
- 배열 정렬과 범위 복사를 활용해 가장 작은 5개의 수를 간결하게 구했다.
- copyOfRange()의 종료 인덱스가 포함되지 않는다는 점을 복습했다.
*/
public class No107 {
    public static void main(String[] args) {
        class Solution {
            public int[] solution(int[] num_list) {
                Arrays.sort(num_list);

                return Arrays.copyOfRange(num_list, 0, 5);
            }
        }

        Solution solution = new Solution();
        int[] numList = {12, 4, 15, 46, 38, 1, 14};

        System.out.println(
                Arrays.toString(solution.solution(numList))
        );
    }
}