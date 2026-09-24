package level0;
/*
문제: 간단한 논리 연산

로직
- x1과 x2 중 하나라도 true인지 확인한다.
- x3과 x4 중 하나라도 true인지 확인한다.
- 두 결과가 모두 true일 때 true를 반환한다.

핵심 구현
- (x1 || x2) && (x3 || x4)

포인트
- ∨는 OR(||), ∧는 AND(&&)에 해당한다.

회고
- 주어진 논리식을 자바의 논리 연산자로 그대로 표현했다.
*/
public class No208 {
    class Solution {
        public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
            return (x1 || x2) && (x3 || x4);
        }
    }
}
