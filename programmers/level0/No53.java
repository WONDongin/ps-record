package level0;
/*
문제: 점의 위치 구하기

로직
- x좌표와 y좌표의 부호를 확인한다.
- 두 좌표의 부호 조합에 따라 사분면 번호를 출력한다.

핵심 구현
- 핵심 코드
  if(dot[0] > 0 && dot[1] > 0){
      System.out.println(1);
  } else if (dot[0] < 0 && dot[1] > 0) {
      System.out.println(2);
  } else if (dot[0] < 0 && dot[1] < 0) {
      System.out.println(3);
  } else {
      System.out.println(4);
  }

- x좌표와 y좌표의 양수/음수 여부를 && 연산자로 함께 비교하여
  각 사분면에 해당하는 값을 조건문으로 분기한다.

포인트
- 좌표의 부호만 확인하면 사분면을 쉽게 판별할 수 있다.
- if-else if 구조를 사용해 조건을 순서대로 검사하면 된다.
- 문제에서 x와 y는 0이 아니므로 0에 대한 예외 처리가 필요 없다.

회고
- 좌표의 부호를 이용한 기본적인 조건문 문제였다.
- 사분면의 특징을 이해하고 조건을 정확하게 작성하는 연습이 되었다.
*/
public class No53 {
    public static void main(String[] args) {
        int[] dot = {2, 4};

        if(dot[0] > 0 && dot[1] > 0){
            System.out.println(1);
        } else if (dot[0] < 0 && dot[1] > 0) {
            System.out.println(2);
        } else if (dot[0] < 0 && dot[1] < 0) {
            System.out.println(3);
        } else {
            System.out.println(4);
        }
    }
}