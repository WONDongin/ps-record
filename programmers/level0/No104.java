package level0;

import java.util.Arrays;
/*
문제: 숨어있는 숫자의 덧셈 (2)

로직
- 문자열의 각 문자를 순회한다.
- 숫자인 문자만 필터링한다.
- 숫자 문자를 정수로 변환한다.
- 오름차순으로 정렬한 뒤 int 배열로 반환한다.

핵심 구현
- chars()로 문자열의 문자를 순회한다.
- Character.isDigit()으로 숫자인 문자만 필터링한다.
- c - '0'을 통해 숫자 문자를 정수로 변환한다.
- sorted()로 오름차순 정렬 후 toArray()로 배열을 생성한다.

포인트
- 문자 '0'을 빼면 숫자 문자를 실제 정수로 변환할 수 있다.
- 스트림을 사용하면 필터링, 변환, 정렬을 한 흐름으로 처리할 수 있다.
- 별도의 리스트나 중간 문자열을 생성할 필요가 없다.

회고
- 문자열 스트림을 활용해 숫자 추출부터 정렬까지 간결하게 구현했다.
- Character.isDigit()과 문자-숫자 변환 방법을 복습할 수 있었다.
*/
public class No104 {
    public static void main(String[] args) {
        String myString = "hi12392";

        int[] answer = myString.chars()
                .filter(Character::isDigit)
                .map(c -> c - '0')
                .sorted()
                .toArray();

        System.out.println(Arrays.toString(answer));
    }
}
