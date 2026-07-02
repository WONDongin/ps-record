package level0;
/*
문제: 특정 문자 제거하기

로직
- 문자열에서 제거할 문자를 replace() 메서드를 이용해 빈 문자열로 변경한다.
- 특정 문자가 제거된 문자열을 반환한다.

핵심 구현
- return my_string.replace(letter, "");
- replace()를 사용하여 letter를 빈 문자열("")로 치환해 해당 문자를 모두 제거한다.

포인트
- replace()는 문자열 내의 모든 동일한 문자를 한 번에 치환한다.
- 원본 문자열은 변경되지 않고, 치환된 새로운 문자열을 반환한다.
- 별도의 반복문이나 StringBuilder 없이 간결하게 구현할 수 있다.

회고
- 문자열 치환이 필요한 문제는 replace()를 활용하면 구현을 크게 단순화할 수 있다.
- 자바에서 String은 불변(Immutable) 객체이므로 replace()는 새로운 문자열을 반환한다.
*/
public class No51 {
    public static void main(String[] args) {
        String my_string = "abcdef";
        String letter = "f";

        System.out.println(my_string.replace(letter, ""));
    }
}
