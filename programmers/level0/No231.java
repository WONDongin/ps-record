package level0;
/*
문제: 이진수 더하기

로직
- 두 이진수 문자열을 정수로 변환한다.
- 변환한 두 정수의 합을 계산한다.
- 계산 결과를 이진수 문자열로 변환하여 반환한다.

핵심 구현
- Integer.parseInt(bin1, 2)로 문자열을 2진수 기준으로 해석한다.
- Integer.toBinaryString()으로 합을 이진수 문자열로 변환한다.

포인트
- 입력은 최대 10자리 이진수이므로 int 범위 내에서 계산할 수 있다.
- 두 입력이 모두 "0"인 경우에도 "0"을 반환한다.

회고
- Java의 진수 변환 메서드를 활용해 간결하게 구현했다.
*/
public class No231 {
    class Solution {
        public String solution(String bin1, String bin2) {
            int number1 = Integer.parseInt(bin1, 2);
            int number2 = Integer.parseInt(bin2, 2);

            return Integer.toBinaryString(number1 + number2);
        }
    }
}
