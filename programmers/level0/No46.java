package level0;
/*
문제: 피자 나눠 먹기 (3)

로직
- 한 판의 피자는 slice조각으로 나뉜다.
- 모든 사람이 한 조각 이상 먹기 위해 필요한 최소 피자 판 수를 계산한다.
- (n + (slice - 1)) / slice 공식을 사용해 정수 나눗셈으로 올림 효과를 구현한다.

핵심 구현
- 핵심 코드
  int answer = (n + (slice - 1)) / slice;
- (값 + 나누는 수 - 1) / 나누는 수 공식을 사용하여
  나머지가 있는 경우에도 필요한 피자 판 수를 올림 계산한다.

포인트
- slice 값이 고정이 아닌 변수여도 동일한 정수 올림 공식을 적용할 수 있다.
- Math.ceil()이나 조건문 없이 한 줄로 구현할 수 있다.

회고
- 이전 문제에서 사용한 (n + 6) / 7 공식을 일반화하여
  (n + (slice - 1)) / slice 형태로 다양한 조각 수에도 적용할 수 있다는 점을 배웠다.
*/
public class No46 {
    public static void main(String[] args) {
        int n = 12;
        int slice = 4;

        System.out.println((n + (slice - 1)) / slice);
    }
}
