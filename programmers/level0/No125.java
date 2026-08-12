package level0;
/*
문제: 원하는 문자열 찾기

로직
- myString과 pat을 모두 소문자로 변환한다.
- 변환된 myString에 pat이 연속된 부분 문자열로 존재하는지 확인한다.
- 존재하면 1, 존재하지 않으면 0을 반환한다.

핵심 구현
- toLowerCase()를 사용해 대소문자 차이를 제거한다.
- contains()를 사용해 부분 문자열 포함 여부를 확인한다.

포인트
- 문제에서는 알파벳 대문자와 소문자를 구분하지 않는다.
- 두 문자열을 같은 대소문자로 통일한 뒤 비교해야 한다.
- contains()는 문자열이 연속해서 포함되어 있는지 확인한다.

회고
- 대소문자를 통일한 뒤 contains()를 사용하여 간결하게 해결할 수 있었다.
*/
public class No125 {
    class Solution {
        public int solution(String myString, String pat) {
            return myString.toLowerCase()
                    .contains(pat.toLowerCase()) ? 1 : 0;
        }
    }
}
