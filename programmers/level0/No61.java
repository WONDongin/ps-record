package level0;

import java.util.Arrays;
/*
문제: 삼각형의 완성조건 (1)

로직
- 변의 길이를 오름차순으로 정렬한다.
- 가장 긴 변과 나머지 두 변의 합을 비교한다.
- 가장 긴 변이 두 변의 합보다 작으면 1, 아니면 2를 반환한다.

핵심 구현
- 핵심 코드
  Arrays.sort(sides);

  sides[2] < sides[0] + sides[1] ? 1 : 2;

- 핵심 코드 설명
  배열을 정렬하면 마지막 원소가 가장 긴 변이 된다.
  삼각형의 조건인 '가장 긴 변 < 나머지 두 변의 합'을 그대로 비교하여 결과를 반환한다.

포인트
- 정렬을 이용하면 가장 긴 변을 쉽게 찾을 수 있다.
- 삼각형의 성립 조건은 하나만 확인하면 된다.
- 삼항 연산자를 사용해 결과를 간결하게 표현할 수 있다.

회고
- 삼각형의 조건을 그대로 코드로 옮기면 쉽게 해결할 수 있는 문제였다.
- Arrays.sort()를 활용하면 최댓값을 별도로 찾지 않아도 되어 코드가 간결해졌다.
*/
public class No61 {
    public static void main(String[] args) {
        int[] sides = {3, 4, 5};

        Arrays.sort(sides);

        System.out.println(sides[2] < sides[0] + sides[1] ? 1 : 2);
    }
}
