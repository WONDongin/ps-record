package level0;
/*
문제: 컨트롤 제트
로직 - 공백으로 문자열을 나누어 숫자는 합계에 더하고, Z가 나오면 직전에 더한 숫자를 뺀다.
핵심 구현 - previous에 마지막으로 더한 숫자를 저장하고 Z를 만나면 sum -= previous를 수행한다.
포인트 - 음수도 Integer.parseInt()로 변환할 수 있다.
회고 - 바로 이전 숫자만 필요하므로 별도의 스택 없이 변수 하나로 처리할 수 있다.
*/
public class No211 {
    class Solution {
        public int solution(String s) {
            int sum = 0;
            int previous = 0;

            for (String token : s.split(" ")) {
                if (token.equals("Z")) {
                    sum -= previous;
                } else {
                    previous = Integer.parseInt(token);
                    sum += previous;
                }
            }

            return sum;
        }
    }
}
