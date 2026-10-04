package level0;
import java.util.Arrays;
/*
문제: 배열 만들기 4

로직
- arr의 길이만큼 스택으로 사용할 배열을 생성한다.
- 스택이 비어 있거나 마지막 원소가 현재 값보다 작으면 추가한다.
- 마지막 원소가 현재 값보다 크거나 같으면 제거한다.

핵심 구현
- size로 스택에 저장된 원소의 개수를 관리한다.
- 원소를 추가할 때만 i를 증가시킨다.
- 원소를 제거하면 같은 arr[i]로 조건을 다시 확인한다.

포인트
- 같은 값도 제거 대상에 포함된다.
- 각 원소는 한 번 추가되고 최대 한 번 제거되어 시간 복잡도는 O(n)이다.
- 마지막에는 스택에 남은 원소만 복사하여 반환한다.

회고
- 배열과 size 변수를 활용해 스택의 추가와 제거를 구현했다.
*/
public class No227 {
    class Solution {
        public int[] solution(int[] arr) {
            int[] stk = new int[arr.length];
            int size = 0;
            int i = 0;

            while (i < arr.length) {
                if (size == 0 || stk[size - 1] < arr[i]) {
                    stk[size++] = arr[i++];
                } else {
                    size--;
                }
            }

            return Arrays.copyOf(stk, size);
        }
    }
}
