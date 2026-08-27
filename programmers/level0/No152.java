package level0;
/*
문제: 9로 나눈 나머지

로직
- 문자열 number의 각 문자를 숫자로 변환한다.
- 모든 자리 숫자를 더하면서 9로 나눈 나머지를 계산한다.
- 최종 나머지를 반환한다.

핵심 구현
- number.charAt(i) - '0': 숫자 문자를 정수로 변환
- remainder %= 9: 합이 커지지 않도록 반복마다 나머지만 저장

포인트
- number의 길이가 최대 100,000이므로 정수형으로 직접 변환할 수 없다.
- 각 자리 숫자의 합을 9로 나눈 나머지는 원래 수를 9로 나눈 나머지와 같다.

회고
- 큰 숫자를 직접 변환하지 않고 숫자의 성질을 이용해 해결할 수 있었다.
*/
public class No152 {
    class Solution {
        public int solution(String number) {
            int remainder = 0;

            for (int i = 0; i < number.length(); i++) {
                remainder += number.charAt(i) - '0';
                remainder %= 9;
            }

            return remainder;
        }
    }
}
