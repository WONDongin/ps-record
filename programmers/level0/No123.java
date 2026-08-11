package level0;
/*
문제: 배열에서 문자열 대소문자 변환하기

로직
- strArr의 모든 원소를 인덱스 순서대로 확인한다.
- 짝수 인덱스의 문자열은 소문자로 변경한다.
- 홀수 인덱스의 문자열은 대문자로 변경한다.

핵심 구현
- i % 2 == 0으로 짝수 인덱스를 판별한다.
- toLowerCase()와 toUpperCase()를 사용해 대소문자를 변환한다.

포인트
- 배열의 인덱스는 0부터 시작한다.
- 문제에서 말하는 홀수·짝수는 문자열의 순서가 아닌 인덱스를 의미한다.

회고
- 인덱스의 홀짝을 판별하여 간단하게 문자열의 대소문자를 변환할 수 있었다.
*/
public class No123 {
    class Solution {
        public String[] solution(String[] strArr) {
            for (int i = 0; i < strArr.length; i++) {
                if (i % 2 == 0) {
                    strArr[i] = strArr[i].toLowerCase();
                } else {
                    strArr[i] = strArr[i].toUpperCase();
                }
            }

            return strArr;
        }
    }
}
