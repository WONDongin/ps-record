package level0;
/*
문제: A 강조하기

로직
- myString의 모든 알파벳을 소문자로 변환한다.
- 소문자 "a"를 모두 대문자 "A"로 변환한다.
- 변환이 완료된 문자열을 반환한다.

핵심 구현
- toLowerCase()로 모든 대문자를 소문자로 변환한다.
- replace("a", "A")로 모든 "a"를 "A"로 변경한다.

포인트
- 먼저 전체 문자열을 소문자로 통일하면 조건 처리가 간단해진다.
- 기존의 "A"도 소문자 "a"가 된 후 다시 "A"로 변경된다.
- replace()는 문자열에 포함된 모든 대상 문자를 변경한다.

회고
- 조건문과 반복문을 사용하지 않고 문자열 메서드를 조합하여
  간결하게 문제를 해결할 수 있었다.
*/
public class No132 {
    class Solution {
        public String solution(String myString) {
            return myString.toLowerCase()
                    .replace("a", "A");
        }
    }
}
