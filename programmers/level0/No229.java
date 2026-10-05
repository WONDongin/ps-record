package level0;
/*
문제: 두 수의 합

로직
- 두 문자열의 마지막 자리부터 숫자를 하나씩 읽는다.
- 두 숫자와 이전 자리에서 발생한 올림을 더한다.
- 현재 자리의 숫자를 저장하고 다음 자리의 올림을 계산한다.
- 모든 자리와 마지막 올림을 처리한 뒤 결과를 뒤집어 반환한다.

핵심 구현
- charAt()으로 읽은 문자에서 '0'을 빼 숫자로 변환한다.
- sum % 10으로 현재 자리의 숫자를 구한다.
- sum / 10으로 다음 자리로 넘길 올림을 구한다.
- StringBuilder에 저장한 결과를 reverse()로 뒤집는다.

포인트
- 입력이 최대 100,000자리이므로 int나 long으로 변환할 수 없다.
- 두 문자열의 길이가 달라도 남은 자리를 계속 계산한다.
- 마지막 올림이 남아 있으면 추가로 처리한다.

회고
- 직접 자리별 덧셈을 구현해 정수 자료형의 범위를 넘는 수를 처리했다.
*/
public class No229 {
    class Solution {
        public String solution(String a, String b) {
            StringBuilder answer = new StringBuilder();

            int i = a.length() - 1;
            int j = b.length() - 1;
            int carry = 0;

            while (i >= 0 || j >= 0 || carry > 0) {
                int sum = carry;

                if (i >= 0) {
                    sum += a.charAt(i--) - '0';
                }

                if (j >= 0) {
                    sum += b.charAt(j--) - '0';
                }

                answer.append(sum % 10);
                carry = sum / 10;
            }

            return answer.reverse().toString();
        }
    }
}
