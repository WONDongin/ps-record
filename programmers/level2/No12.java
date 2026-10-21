package level2;
/*
문제: 짝지어 제거하기

로직
- 문자열의 문자를 앞에서부터 순서대로 확인한다.
- 스택의 마지막 문자와 현재 문자가 같으면 마지막 문자를 제거한다.
- 스택이 비어 있거나 마지막 문자가 다르면 현재 문자를 추가한다.
- 모든 문자를 확인한 뒤 스택이 비어 있으면 1, 아니면 0을 반환한다.

핵심 구현
- char 배열을 스택으로 사용하여 문자를 저장한다.
- size 변수로 스택에 저장된 문자의 개수를 관리한다.
- stack[size - 1]과 현재 문자가 같으면 size를 감소시켜 제거한다.

포인트
- 문자를 제거한 뒤 새롭게 인접한 문자도 비교해야 한다.
- 문자열을 매번 수정하지 않고 스택으로 처리하여 시간 복잡도를 줄인다.
- 최대 1,000,000개의 문자를 한 번씩 확인하여 O(N)으로 해결한다.

회고
- 인접한 문자를 제거하는 문제에 스택을 활용했다.
- 배열과 인덱스만으로 스택의 추가와 제거를 구현할 수 있었다.
*/
public class No12 {
    class Solution {
        public int solution(String s) {
            char[] stack = new char[s.length()];
            int size = 0;

            for (int i = 0; i < s.length(); i++) {
                char current = s.charAt(i);

                if (size > 0 && stack[size - 1] == current) {
                    size--;
                } else {
                    stack[size++] = current;
                }
            }

            return size == 0 ? 1 : 0;
        }
    }
}
