package level0;
/*
문제: 접미사인지 확인하기

로직
- my_string이 is_suffix로 끝나는지 확인한다.
- 접미사이면 1, 아니면 0을 반환한다.

핵심 구현
- String의 endsWith() 메서드를 사용한다.
- return my_string.endsWith(is_suffix) ? 1 : 0;

포인트
- 접미사는 문자열의 마지막 부분과 일치해야 한다.
- contains()는 문자열 중간에 포함된 경우도 true이므로 적합하지 않다.
- endsWith()를 사용하면 접미사 여부를 간단하게 확인할 수 있다.

회고
- Java의 endsWith() 메서드를 활용해 반복문 없이 간결하게 해결했다.
*/
public class No99 {
    public static void main(String[] args) {
        class Solution {
            public int solution(String my_string, String is_suffix) {
                return my_string.endsWith(is_suffix) ? 1 : 0;
            }
        }

        Solution solution = new Solution();
        System.out.println(solution.solution("banana", "ana"));
    }
}