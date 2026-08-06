package level0;

import java.util.Arrays;
/*
문제: 문자열 정렬하기 (2)

로직
- 주어진 문자열의 모든 문자를 소문자로 변환한다.
- 문자열을 문자 배열로 변환한다.
- 문자 배열을 알파벳 오름차순으로 정렬한다.
- 정렬된 문자 배열을 문자열로 변환하여 반환한다.

핵심 구현
- toLowerCase(): 문자열을 모두 소문자로 변환
- toCharArray(): 문자열을 char 배열로 변환
- Arrays.sort(): 문자 배열을 오름차순으로 정렬
- new String(characters): 문자 배열을 문자열로 변환

포인트
- 대문자와 소문자는 문자 코드가 다르기 때문에 소문자 변환 후 정렬해야 한다.
- String은 직접 정렬할 수 없으므로 char 배열로 변환한다.

회고
- 문자열의 문자를 정렬할 때는 char 배열로 변환하면 Arrays.sort()를 사용할 수 있다.
*/
public class No111 {
    public static void main(String[] args) {
        String my_string = "Bcad";

        char[] c = my_string.toLowerCase().toCharArray();

        Arrays.sort(c);

        System.out.println(c);
    }
}
