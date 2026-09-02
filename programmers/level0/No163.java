package level0;
/*
문제: 외계행성의 나이

로직
- 나이를 문자열로 변환한다.
- 나이를 구성하는 숫자를 하나씩 확인한다.
- 각 숫자를 0은 a, 1은 b, ..., 9는 j로 변환한다.

핵심 구현
- String.valueOf(age)로 나이를 문자열로 변환한다.
- 숫자 문자에서 '0'을 빼 실제 숫자값을 구한다.
- 숫자값에 'a'를 더해 대응하는 알파벳으로 변환한다.

포인트
- 문자도 내부적으로 숫자값을 가지므로 문자 간 연산이 가능하다.
- number - '0'으로 0부터 9까지의 숫자값을 구할 수 있다.
- 변환된 문자는 StringBuilder에 순서대로 추가한다.

회고
- 별도의 알파벳 배열 없이 문자의 숫자값을 활용해 간단하게 변환했다.
*/
public class No163 {
    class Solution {
        public String solution(int age) {
            StringBuilder answer = new StringBuilder();

            for (char number : String.valueOf(age).toCharArray()) {
                answer.append((char) (number - '0' + 'a'));
            }

            return answer.toString();
        }
    }
}
