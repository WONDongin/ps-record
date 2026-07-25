package level0;
/*
문제: 대문자로 바꾸기

로직
- 문자열의 모든 알파벳을 대문자로 변환한다.
- 변환된 문자열을 반환한다.

핵심 구현
- String 클래스의 toUpperCase() 메서드를 사용한다.

포인트
- 문자열을 문자 단위로 직접 순회하지 않아도 된다.
- toUpperCase()는 원본 문자열을 변경하지 않고 새로운 문자열을 반환한다.

회고
- 자바에서 제공하는 문자열 메서드를 활용해 코드를 간결하게 작성했다.
*/
public class No96 {
    public static void main(String[] args) {
        String myString = "aBcDeFg";
        String answer = myString.toUpperCase();

        System.out.println(answer);
    }
}
