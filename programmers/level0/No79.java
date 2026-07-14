package level0;
/*
문제: 문자열의 뒤의 n글자

로직
- 문자열의 마지막 n글자가 시작되는 위치를 계산한다.
- substring()을 이용해 해당 위치부터 끝까지 잘라 반환한다.

핵심 구현
- my_string.substring(my_string.length() - n);
- 문자열의 길이에서 n을 뺀 인덱스부터 마지막까지 추출했다.

포인트
- substring()을 활용해 간단하게 해결했다.
- 문자열의 길이를 먼저 구해 시작 인덱스를 계산했다.

회고
- substring()은 원하는 구간의 문자열을 쉽게 추출할 수 있어 문자열 문제에서 자주 활용된다는 것을 다시 익혔다.
*/
public class No79 {
    public static void main(String[] args) {
        String my_string = "He110W0r1d";
        int n = 5;

        System.out.println(my_string.substring(my_string.length() - n));
    }
}
