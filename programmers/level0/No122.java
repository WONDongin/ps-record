package level0;
/*
문제: rny_string

로직
- 문자열에 포함된 모든 "m"을 "rn"으로 변경한다.

핵심 구현
- replace("m", "rn")을 사용하여 문자열 전체를 치환한다.

포인트
- replace()는 조건에 맞는 모든 문자열을 변경한다.
- 원본 문자열에 "m"이 없다면 기존 문자열이 그대로 반환된다.

회고
- 반복문 없이 replace()를 사용하여 간결하게 해결할 수 있었다.
*/
public class No122 {
    class Solution {
        public String solution(String rny_string) {
            return rny_string.replace("m", "rn");
        }
    }
}
