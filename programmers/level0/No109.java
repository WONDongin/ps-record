package level0;
/*
문제: 인덱스 바꾸기

로직
- 문자열을 수정할 수 있도록 char 배열로 변환한다.
- num1 위치의 문자를 임시 변수에 저장한다.
- num1과 num2 위치의 문자를 서로 교환한다.
- 변경된 char 배열을 문자열로 변환해 반환한다.

핵심 구현
- my_string.toCharArray()로 문자열을 char 배열로 변환한다.
- temp 변수를 사용해 num1 위치의 문자를 임시 저장한다.
- chars[num1]과 chars[num2]의 값을 교환한다.
- new String(chars)로 char 배열을 문자열로 변환한다.

포인트
- Java의 String은 불변 객체이므로 특정 위치의 문자를 직접 변경할 수 없다.
- 두 값을 안전하게 교환하려면 임시 변수 temp가 필요하다.
- 문자열의 인덱스는 0부터 시작한다.

회고
- 문자열을 char 배열로 변환하면 원하는 인덱스의 문자를 쉽게 변경할 수 있다.
- 임시 변수를 이용한 두 값의 교환 방법을 복습했다.
*/
public class No109 {
    public static void main(String[] args) {
        class Solution {
            public String solution(String my_string, int num1, int num2) {
                char[] chars = my_string.toCharArray();

                char temp = chars[num1];
                chars[num1] = chars[num2];
                chars[num2] = temp;

                return new String(chars);
            }
        }

        Solution solution = new Solution();

        System.out.println(
                solution.solution("hello", 1, 2)
        ); // hlelo
    }
}