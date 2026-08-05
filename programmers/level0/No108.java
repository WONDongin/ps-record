package level0;
/*
문제: 암호 해독

로직
- code의 배수 번째 문자를 순서대로 확인한다.
- 해당 위치의 문자를 StringBuilder에 추가한다.
- 완성된 문자열을 반환한다.

핵심 구현
- 문자열의 인덱스는 0부터 시작하므로 code - 1에서 반복을 시작한다.
- i += code를 사용해 code 간격으로 인덱스를 이동한다.
- cipher.charAt(i)로 해당 위치의 문자를 가져온다.
- StringBuilder의 toString()으로 결과 문자열을 반환한다.

포인트
- 문제에서 말하는 번째 위치는 1부터 시작하지만 문자열 인덱스는 0부터 시작한다.
- 따라서 code의 배수 번째 문자에 해당하는 첫 인덱스는 code - 1이다.
- 공백도 하나의 문자이므로 별도로 제외하지 않고 동일하게 처리한다.

회고
- 1부터 시작하는 문자 위치와 0부터 시작하는 문자열 인덱스의 차이를 고려했다.
- 반복문의 시작 위치와 증가 값을 조절해 필요한 문자만 간단하게 추출했다.
*/
public class No108 {
    public static void main(String[] args) {
        class Solution {
            public String solution(String cipher, int code) {
                StringBuilder answer = new StringBuilder();

                for (int i = code - 1; i < cipher.length(); i += code) {
                    answer.append(cipher.charAt(i));
                }

                return answer.toString();
            }
        }

        Solution solution = new Solution();

        System.out.println(
                solution.solution("dfjardstddetckdaccccdegk", 4)
        ); // attack
    }
}