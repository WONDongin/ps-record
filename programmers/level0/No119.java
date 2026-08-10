package level0;

import java.util.Arrays;
/*
문제: 할 일 목록

로직
- num_list를 오름차순으로 정렬한다.
- 정렬된 배열에서 가장 작은 수 5개를 제외한다.
- 인덱스 5부터 마지막 원소까지 새로운 배열로 복사해 반환한다.

핵심 구현
- Arrays.sort(num_list)로 배열을 오름차순 정렬한다.
- Arrays.copyOfRange()를 사용해 필요한 범위만 복사한다.
- 시작 인덱스를 5로 지정해 가장 작은 수 5개를 제외한다.
- 끝 인덱스에 num_list.length를 지정해 마지막 원소까지 복사한다.

포인트
- 오름차순 정렬 후 가장 작은 수 5개는 인덱스 0부터 4에 위치한다.
- Arrays.copyOfRange()의 시작 인덱스는 포함되고 끝 인덱스는 포함되지 않는다.
- 제한사항에 따라 num_list의 길이는 최소 6이므로 가장 작은 수 5개를 제외해도 원소가 남는다.
- Arrays.sort()는 전달받은 원본 배열의 순서를 직접 변경한다.

회고
- 배열을 정렬한 뒤 필요한 범위만 복사하는 방법으로 간단하게 해결했다.
- Arrays.copyOfRange()의 시작 인덱스와 끝 인덱스 처리 방법을 복습했다.
*/
public class No119 {
    public static void main(String[] args) {
        class Solution {
            public int[] solution(int[] num_list) {
                Arrays.sort(num_list);

                return Arrays.copyOfRange(
                        num_list,
                        5,
                        num_list.length
                );
            }
        }

        Solution solution = new Solution();

        int[] numList = {
                12, 4, 15, 46, 38,
                1, 14, 56, 32, 10
        };

        System.out.println(
                Arrays.toString(solution.solution(numList))
        ); // [15, 32, 38, 46, 56]
    }
}