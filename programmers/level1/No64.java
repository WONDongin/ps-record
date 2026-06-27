package level1;
/*
문제: 햄버거 만들기

로직
- 재료를 순서대로 스택처럼 저장한다.
- 재료가 추가될 때마다 마지막 4개의 재료가 [1, 2, 3, 1]인지 확인한다.
- 햄버거가 완성되면 마지막 4개의 재료를 제거하고 개수를 증가시킨다.

핵심 구현
- 핵심 코드
  if (idx >= 4 &&
      stack[idx - 4] == 1 &&
      stack[idx - 3] == 2 &&
      stack[idx - 2] == 3 &&
      stack[idx - 1] == 1) {

      idx -= 4;
      answer++;
  }

- 핵심 코드 설명
  새로운 재료가 들어올 때마다 스택의 마지막 4개의 재료만 확인한다.
  햄버거 순서(빵 → 야채 → 고기 → 빵)가 만들어지면
  idx를 4 감소시켜 재료를 제거한 것과 같은 효과를 낸다.

포인트
- ArrayList.remove()를 반복하면 시간 초과가 발생할 수 있다.
- int 배열을 스택처럼 사용하면 O(1)에 삽입과 삭제가 가능하다.
- 마지막 4개의 재료만 확인하면 되므로 전체를 다시 탐색할 필요가 없다.

회고
- 스택을 직접 구현하면 불필요한 삭제 연산을 줄일 수 있다는 점을 배웠다.
- 입력 크기가 큰 문제에서는 자료구조 선택이 성능에 큰 영향을 준다는 것을 다시 확인했다.
*/
public class No64 {
    class Solution {
        public int solution(int[] ingredient) {
            int answer = 0;

            int[] stack = new int[ingredient.length];
            int idx = 0;

            for (int food : ingredient) {
                stack[idx++] = food;

                if (idx >= 4 &&
                        stack[idx - 4] == 1 &&
                        stack[idx - 3] == 2 &&
                        stack[idx - 2] == 3 &&
                        stack[idx - 1] == 1) {

                    idx -= 4;
                    answer++;
                }
            }

            return answer;
        }
    }
}
