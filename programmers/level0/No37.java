package level0;
/*
문제: 더 크게 합치기

문제 요약
- 두 정수 a, b를 이어 붙인 값을 구한다.
- a ⊕ b 와 b ⊕ a 중 더 큰 값을 반환한다.
- 두 값이 같다면 a ⊕ b를 반환한다.

접근 방법
- 문자열 결합을 이용해 a+b, b+a 형태의 숫자를 만든다.
- Integer.parseInt()로 문자열을 정수로 변환한다.
- 삼항 연산자를 사용해 더 큰 값을 선택한다.

핵심 아이디어
- "" + a + b 를 사용하면 두 숫자를 문자열로 이어 붙일 수 있다.
- Integer.parseInt()를 이용해 이어 붙인 문자열을 정수로 변환한다.
- a⊕b 와 b⊕a 를 비교하여 큰 값을 반환한다.

주의할 점
- 숫자를 더하는 것이 아니라 문자열로 이어 붙여야 한다.
- 문자열 결합 후 반드시 정수형으로 변환해야 비교가 가능하다.
- 문제 조건상 두 값이 같아도 a⊕b를 반환해야 하므로 > 비교만 사용해도 된다.

배운 점
- 문자열 결합만으로 숫자를 이어 붙인 값을 쉽게 만들 수 있다.
- Integer.parseInt()를 활용해 문자열과 정수 변환을 연습할 수 있었다.
*/
public class No37 {
    public static void main(String[] args) {
        int a = 9;
        int b = 91;

        int aLong = Integer.parseInt(""+a+b);
        int bLong = Integer.parseInt(""+b+a);

        System.out.println(aLong > bLong ? aLong : bLong);

    }
}
