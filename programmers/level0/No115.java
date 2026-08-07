package level0;
/*
문제: 정수를 문자열로 변환하기

로직
- 정수 n을 문자열로 변환한다.
- 변환된 문자열을 결과로 반환한다.

핵심 구현
- Integer.toString(n)을 사용하면 정수를 문자열로 변환할 수 있다.
- String.valueOf(n)을 사용해도 동일한 결과를 얻을 수 있다.
- 빈 문자열과 정수를 연결하는 "" + n 방식도 가능하지만, 의도가 명확한 String.valueOf(n)을 사용했다.

포인트
- Integer.toString(n), String.valueOf(n), "" + n 모두 정수를 문자열로 변환할 수 있다.
- String.valueOf(n)은 코드만 보고도 형 변환의 의도를 쉽게 알 수 있다.
- 문자열로 변환한 결과는 숫자 계산이 아닌 문자열 처리에 사용된다.

회고
- 정수를 문자열로 변환하는 여러 방법을 확인했다.
- 동작은 같지만 가독성과 의도가 명확한 String.valueOf(n)을 사용하는 것이 좋다고 생각했다.
*/
public class No115 {
    public static void main(String[] args) {
        int n = 123;
        String answer_1 = Integer.toString(n);
        String answer_2 = String.valueOf(n);

        System.out.println("" + n);
    }
}
