package level0;
/*
문제: 공배수

로직
- number가 n과 m으로 모두 나누어 떨어지는지 확인한다.
- 두 조건을 모두 만족하면 1, 아니면 0을 반환한다.

핵심 구현
- 핵심 코드
  if (number % n == 0 && number % m == 0) {
      System.out.println(1);
  } else {
      System.out.println(0);
  }

- `%` 연산자를 이용해 나누어 떨어지는지 확인한다.
- `&&` 연산자를 사용하여 두 조건을 모두 만족하는지 검사한다.

포인트
- 배수 판별은 `%` 연산으로 쉽게 확인할 수 있다.
- 여러 조건을 동시에 만족해야 하는 경우 `&&` 연산자를 활용한다.
- 시간복잡도는 O(1)로 입력 크기와 관계없이 일정하다.

회고
- 배수 판별은 `%` 연산만 이해하면 쉽게 해결할 수 있는 구현 문제였다.
- `&&`를 이용해 여러 조건을 한 번에 검사하는 방법을 다시 익힐 수 있었다.
- 조건이 단순한 문제일수록 핵심 연산자를 정확하게 사용하는 것이 중요하다는 점을 느꼈다.
*/
public class No81 {
    public static void main(String[] args) {
        int number = 55;
        int n = 10;
        int m = 5;

        if(number % n == 0 && number % m == 0){
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
