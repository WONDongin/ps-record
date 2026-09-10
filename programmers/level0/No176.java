package level0;
import java.util.ArrayList;
import java.util.List;
/*
문제: 빈 배열에 추가, 삭제하기

로직
- arr와 flag 배열을 같은 인덱스로 순회한다.
- flag[i]가 true라면 arr[i]를 arr[i] * 2번 리스트에 추가한다.
- flag[i]가 false라면 리스트의 마지막 원소를 arr[i]번 제거한다.
- 모든 작업이 끝난 리스트를 int 배열로 변환하여 반환한다.

핵심 구현
- ArrayList를 사용하여 원소의 추가와 삭제를 처리한다.
- 마지막 원소는 list.remove(list.size() - 1)로 제거한다.
- stream의 mapToInt를 사용하여 List<Integer>를 int[]로 변환한다.

포인트
- false인 경우 값이 아니라 마지막 인덱스의 원소를 제거해야 한다.
- 현재 배열보다 더 많은 원소를 제거하는 입력은 주어지지 않는다.

회고
- 크기가 계속 변하는 배열이므로 ArrayList를 사용해 추가와 삭제를 간단하게 구현했다.
*/
public class No176 {
    class Solution {
        public int[] solution(int[] arr, boolean[] flag) {
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < arr.length; i++) {
                if (flag[i]) {
                    for (int j = 0; j < arr[i] * 2; j++) {
                        list.add(arr[i]);
                    }
                } else {
                    for (int j = 0; j < arr[i]; j++) {
                        list.remove(list.size() - 1);
                    }
                }
            }

            return list.stream()
                    .mapToInt(Integer::intValue)
                    .toArray();
        }
    }
}
