package level0;
/*
문제: 더 크게 합치기

로직
- a와 b를 문자열로 이어 붙여 정수로 변환한다.
- 2 * a * b 값을 계산한다.
- 두 값을 비교하여 더 큰 값을 반환한다.

핵심 구현
- int ab = Integer.parseInt("" + a + b);
- int mul = 2 * a * b;
- return Math.max(ab, mul);

- 문자열 연결을 통해 a ⊕ b를 구현한다.
- Math.max()를 사용하여 두 값 중 큰 값을 반환한다.
- 두 값이 같은 경우에도 문제 조건에 맞게 a ⊕ b가 반환된다.

포인트
- 숫자를 이어 붙이는 연산은 문자열 연결 후 Integer.parseInt()를 사용하면 간단하게 구현할 수 있다.
- Math.max()는 두 값이 같아도 동일한 값을 반환하므로 문제 조건을 만족한다.
- 시간 복잡도는 O(1)로 매우 효율적이다.

회고
- 문자열 연결을 이용하면 새로운 연산(⊕)을 쉽게 구현할 수 있었다.
- Math.max()를 활용해 비교 로직을 간결하게 작성하는 방법을 다시 한번 익힐 수 있었다.
*/
public class No73 {
    public int solution(int a, int b){
        int ab = Integer.parseInt("" + a + b);
        int mul = 2 * a * b;

        return Math.max(ab, mul);

    }
}
