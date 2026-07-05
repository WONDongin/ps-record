package level0;
/*
문제: 제곱수 판별하기

로직
- Math.sqrt()를 이용해 n의 제곱근을 구한다.
- 제곱근을 정수형으로 변환한다.
- 제곱근을 다시 제곱한 값이 n과 같으면 1, 아니면 2를 반환한다.

핵심 구현
- 핵심 코드
  int sqrt = (int) Math.sqrt(n);

  System.out.println(sqrt * sqrt == n ? 1 : 2);
- Math.sqrt()는 제곱근을 반환한다.
- 제곱근을 다시 제곱했을 때 원래 값과 같다면 완전제곱수로 판단할 수 있다.

포인트
- 반복문 없이 Math.sqrt()를 활용해 간결하게 구현할 수 있다.
- Math.pow()보다 정수 연산을 사용해 불필요한 실수 계산을 피할 수 있다.
- 완전제곱수 판별 시 `sqrt * sqrt == n` 방식이 직관적이고 효율적이다.

회고
- 수학 함수를 활용하면 반복문 없이도 문제를 간단하게 해결할 수 있다는 점을 배웠다.
- 제곱근을 정수로 변환한 뒤 다시 제곱하여 비교하는 방식은 완전제곱수 판별에 자주 사용되는 패턴이므로 기억해두면 좋겠다.
*/
public class No59 {
    public static void main(String[] args) {
        int n = 976;

        int sqrt = (int) Math.sqrt(n);

        System.out.println(sqrt * sqrt == n ? 1 : 2);
    }
}
