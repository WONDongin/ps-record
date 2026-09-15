package level0;
/*
문제: 문자열 뒤집기

로직
- my_string을 StringBuilder로 변환한다.
- 인덱스 s와 e가 가리키는 문자를 서로 교환한다.
- s는 증가시키고 e는 감소시키면서 지정된 구간을 뒤집는다.

핵심 구현
- charAt()으로 양쪽 문자를 확인한다.
- setCharAt()을 사용하여 두 문자의 위치를 교환한다.
- s가 e보다 작을 동안만 반복한다.

포인트
- 문자열 전체가 아니라 인덱스 s부터 e까지의 구간만 뒤집어야 한다.
- String은 수정할 수 없으므로 StringBuilder를 사용한다.

회고
- 양쪽 끝의 문자를 교환하는 투 포인터 방식으로 구간을 간단하게 뒤집었다.
*/
public class No189 {
    class Solution {
        public String solution(String my_string, int s, int e) {
            StringBuilder answer = new StringBuilder(my_string);

            while (s < e) {
                char temp = answer.charAt(s);
                answer.setCharAt(s, answer.charAt(e));
                answer.setCharAt(e, temp);

                s++;
                e--;
            }

            return answer.toString();
        }
    }
}
