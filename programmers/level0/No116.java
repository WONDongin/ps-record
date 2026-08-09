package level0;
/*
문제: 0 떼기

로직
- 숫자로 이루어진 문자열 n_str을 정수로 변환한다.
- 정수로 변환하면서 문자열 왼쪽의 0을 제거한다.
- 정수를 다시 문자열로 변환해 반환한다.

핵심 구현
- Integer.parseInt(n_str)로 문자열을 정수로 변환한다.
- String.valueOf()로 변환된 정수를 다시 문자열로 만든다.
- 두 메서드를 조합해 한 줄로 결과를 반환한다.

포인트
- 정수에는 앞쪽에 불필요한 0이 존재하지 않으므로 숫자로 변환하면 자동으로 제거된다.
- n_str이 0으로만 이루어진 경우는 없으므로 빈 문자열이 반환될 걱정이 없다.
- 제한사항의 숫자 범위가 작아 int 자료형으로 안전하게 변환할 수 있다.

회고
- 문자열을 직접 순회하지 않고 문자열과 정수의 형 변환을 이용해 간단하게 해결했다.
- Integer.parseInt()와 String.valueOf()의 사용 방법을 복습했다.
*/
public class No116 {
    public static void main(String[] args) {
        class Solution {
            public String solution(String n_str) {
                return String.valueOf(Integer.parseInt(n_str));
            }
        }

        Solution solution = new Solution();

        System.out.println(solution.solution("0010"));   // 10
        System.out.println(solution.solution("854020")); // 854020
    }
}