package level0;
/*
문제: 특정한 문자를 대문자로 바꾸기

로직
- my_string에서 alp와 일치하는 모든 문자를 찾는다.
- 해당 문자를 대문자로 변환한 문자열로 교체한다.

핵심 구현
- alp.toUpperCase()를 사용해 alp를 대문자로 변환한다.
- replace()를 사용해 my_string에 포함된 모든 alp를 교체한다.
- return my_string.replace(alp, alp.toUpperCase());

포인트
- replace()는 조건에 일치하는 모든 문자열을 교체한다.
- alp가 my_string에 없다면 기존 문자열이 그대로 반환된다.
- 원본 String은 변경되지 않고 새로운 문자열이 반환된다.

회고
- replace()와 toUpperCase()를 활용해 반복문 없이 간결하게 해결했다.
*/
public class No102 {
    public static void main(String[] args) {
        class Solution {
            public String solution(String my_string, String alp) {
                return my_string.replace(
                        alp,
                        alp.toUpperCase()
                );
            }
        }

        Solution solution = new Solution();

        System.out.println(
                solution.solution("programmers", "p")
        );
    }
}