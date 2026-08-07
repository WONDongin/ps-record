package level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
문제: 배열의 원소 삭제하기

로직
- arr의 원소를 순서대로 확인한다.
- 현재 원소가 delete_list에 포함되어 있는지 검사한다.
- delete_list에 없는 원소만 결과 리스트에 추가한다.
- 결과 리스트를 int 배열로 변환해 반환한다.

핵심 구현
- 향상된 for문으로 arr와 delete_list를 순회한다.
- num == deleteNum으로 삭제 대상인지 비교한다.
- 삭제 대상을 발견하면 shouldDelete를 true로 변경하고 break한다.
- 삭제 대상이 아닌 경우에만 answer.add(num)을 실행한다.
- stream(), mapToInt(), toArray()를 이용해 List<Integer>를 int[]로 변환한다.

포인트
- arr를 처음부터 순회하며 결과에 추가하므로 기존 원소의 순서가 유지된다.
- 삭제할 원소를 발견한 후에는 delete_list를 더 확인할 필요가 없으므로 break를 사용한다.
- delete_list에 존재하지 않는 값은 결과 배열에 그대로 남긴다.

회고
- 중첩 반복문을 사용해 삭제할 원소가 포함되어 있는지 확인했다.
- arr의 순서대로 필요한 원소만 추가해 기존 순서를 유지할 수 있었다.
- List<Integer>를 기본형 배열인 int[]로 변환하는 방법을 복습했다.
*/
public class No114 {
    public static void main(String[] args) {
        class Solution {
            public int[] solution(int[] arr, int[] delete_list) {
                List<Integer> answer = new ArrayList<>();

                for (int num : arr) {
                    boolean shouldDelete = false;

                    for (int deleteNum : delete_list) {
                        if (num == deleteNum) {
                            shouldDelete = true;
                            break;
                        }
                    }

                    if (!shouldDelete) {
                        answer.add(num);
                    }
                }

                return answer.stream()
                        .mapToInt(Integer::intValue)
                        .toArray();
            }
        }

        Solution solution = new Solution();

        int[] arr = {293, 1000, 395, 678, 94};
        int[] deleteList = {94, 777, 104, 1000, 1, 12};

        System.out.println(
                Arrays.toString(solution.solution(arr, deleteList))
        ); // [293, 395, 678]
    }
}
