package level0;

import java.util.Arrays;
/*
문제: n의 배수 고르기

로직
- Arrays.stream()으로 배열을 스트림으로 변환한다.
- filter()를 사용해 n으로 나누어 떨어지는 값만 추출한다.
- toArray()로 int[] 배열로 변환하여 반환한다.

핵심 구현
- 핵심 코드
  Arrays.stream(numlist)
        .filter(num -> num % n == 0)
        .toArray();

- 핵심 코드 설명
  - filter()에서 num % n == 0 조건을 만족하는 원소만 남긴다.
  - toArray()를 통해 필터링된 결과를 int 배열로 반환한다.

포인트
- IntStream을 사용하면 별도의 리스트 생성 없이 간결하게 구현할 수 있다.
- n의 배수 판별은 나머지 연산(%)을 이용한다.

회고
- Stream API의 filter()를 활용하면 반복문 없이도 조건에 맞는 배열을 쉽게 만들 수 있었다.
- 단순 필터링 문제는 Stream을 사용하면 가독성이 더욱 좋아진다.
*/
public class No66 {
    class Solution {
        public int[] solution(int n, int[] numlist) {
            return Arrays.stream(numlist)
                    .filter(num -> num % n == 0)
                    .toArray();
        }
    }
}
