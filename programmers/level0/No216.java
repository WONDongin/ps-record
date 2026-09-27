package level0;
/*
문제: 배열 만들기 6

로직
- 배열을 순서대로 확인하며 스택처럼 처리한다.
- 마지막 원소가 현재 값과 같으면 제거하고, 다르면 추가한다.

핵심 구현
- int 배열과 size 변수로 스택을 구현한다.
- size가 0이면 [-1]을 반환한다.

포인트
- 입력 길이가 최대 1,000,000이므로 원소마다 전체 배열을 복사하지 않는다.
- 시간 복잡도는 O(arr.length)이다.

회고
- 마지막 원소만 비교하면 되므로 스택 구조로 간단하게 해결했다.
*/
public class No216 {
    class Solution {
        public int[] solution(int[] arr) {
            int[] stack = new int[arr.length];
            int size = 0;

            for (int value : arr) {
                if (size > 0 && stack[size - 1] == value) {
                    size--;
                } else {
                    stack[size++] = value;
                }
            }

            if (size == 0) {
                return new int[]{-1};
            }

            int[] answer = new int[size];
            System.arraycopy(stack, 0, answer, 0, size);
            return answer;
        }
    }
}
