package level0;
/*
문제: 배열의 평균값

로직
- 배열을 순회하며 모든 원소의 합을 구한다.
- 합계를 배열의 길이로 나누어 평균을 계산한다.

핵심 구현
- 핵심 코드
  sum += number;

- 핵심 코드 설명
  향상된 for문을 이용해 배열의 모든 원소를 더한다.

- 핵심 코드
  double answer = (double) sum / numbers.length;

- 핵심 코드 설명
  정수 나눗셈이 아닌 실수 나눗셈이 되도록 형변환 후 평균을 계산한다.

포인트
- 평균을 구할 때는 double로 형변환해야 소수점이 유지된다.
- 배열의 길이는 numbers.length로 구한다.

회고
- 배열의 합을 구한 뒤 길이로 나누는 기본적인 구현 문제였다.
- 형변환 위치에 따라 결과가 달라질 수 있다는 점을 다시 확인했다.
*/
public class No47 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        double answer = (double) sum / numbers.length;

        System.out.println(answer);
    }
}
