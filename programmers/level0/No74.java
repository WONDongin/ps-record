package level0;
/*
문제: 실수를 정수 부분만 출력하기

로직
- 실수형(double) 값을 선언한다.
- (int) 캐스팅을 통해 소수점 이하를 제거한다.
- 결과를 출력한다.

핵심 구현
- 핵심 코드
  ex) int result = (int) flo;
- 핵심 코드 설명
  - (int) 캐스팅을 사용하면 소수점 이하가 버려지고 정수 부분만 남는다.
  - 예를 들어 1.42 → 1, 5.99 → 5가 된다.

포인트
- (int) 캐스팅은 반올림이 아니라 소수점 이하를 단순히 버린다.
- 실수 → 정수 형변환의 기본 동작을 이해하는 문제이다.
- 반환 타입이 int이므로 별도의 연산 없이 바로 사용할 수 있다.

회고
- 자바의 형변환(Casting) 개념을 익힐 수 있었다.
- 반올림이 필요하다면 Math.round()와의 차이점도 함께 알아두면 좋다.
*/
public class No74 {
    public static void main(String[] args) {
        double flo = 1.42;
        int result = (int) flo;
        System.out.print(result);
    }

}
