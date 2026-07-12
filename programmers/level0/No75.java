package level0;
/*
문제: flag에 따라 다른 값 반환하기

로직
- 정수 a, b와 boolean 타입 flag를 선언한다.
- flag가 true이면 a + b를 출력한다.
- flag가 false이면 a - b를 출력한다.

핵심 구현
- 핵심 코드
  ex)
  if (flag) {
      System.out.println(a + b);
  } else {
      System.out.println(a - b);
  }

- 핵심 코드 설명
  - boolean 값(flag)을 조건으로 분기한다.
  - true일 경우 덧셈을 수행하고, false일 경우 뺄셈을 수행한다.

포인트
- boolean 타입은 true 또는 false 두 가지 값만 가진다.
- if-else 문을 사용해 조건에 따라 다른 연산을 수행할 수 있다.
- 문제 조건이 단순한 경우 삼항 연산자로도 구현 가능하다.
  ex) System.out.println(flag ? a + b : a - b);

회고
- boolean 값을 이용한 조건 분기와 if-else 문의 기본 사용법을 다시 확인할 수 있었다.
- 간단한 조건이라면 삼항 연산자를 활용해 코드를 더 간결하게 작성할 수도 있다.
*/
public class No75 {
    public static void main(String[] args) {
        int a = -4;
        int b = 7;
        boolean flag = true;

        if(flag){
            System.out.println(a + b);
        } else {
            System.out.println(a - b);
        }
    }
}
