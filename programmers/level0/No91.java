package level0;

import java.util.Arrays;
/*
문제: 마지막 두 원소

로직
- Arrays.copyOf()를 사용해 기존 배열보다 길이가 1 큰 배열을 생성한다.
- numList의 마지막 원소와 그전 원소를 구한다.
- 마지막 원소가 그전 원소보다 크면 두 원소의 차를 추가한다.
- 크지 않으면 마지막 원소를 두 배한 값을 추가한다.

핵심 구현
- 배열 확장 및 복사:
  Arrays.copyOf(numList, numList.length + 1)

- 마지막 두 원소:
  int last = numList[numList.length - 1];
  int previous = numList[numList.length - 2];

- 새로운 원소 추가:
  answer[answer.length - 1] =
          last > previous ? last - previous : last * 2;

포인트
- Arrays.copyOf()를 사용하면 반복문 없이 기존 배열을 복사하고 크기를 확장할 수 있다.
- 배열의 마지막 인덱스는 배열 길이에서 1을 뺀 값이다.
- 삼항 연산자를 사용해 조건에 따른 값을 간결하게 저장할 수 있다.

회고
- 배열의 크기는 생성 후 변경할 수 없으므로 길이가 1 큰 새로운 배열이 필요하다.
- Arrays.copyOf()를 활용하면 배열 복사 코드를 간결하고 읽기 쉽게 작성할 수 있다.
*/
public class No91 {
    public static void main(String[] args) {
        int[] num_list = {2, 1, 6};
        int[] answer = Arrays.copyOf(num_list, num_list.length + 1);

        int last = num_list[num_list.length - 1];
        int previous = num_list[num_list.length - 2];

        answer[answer.length - 1] = last > previous ? last - previous : last * 2;

        System.out.println(Arrays.toString(answer));
    }
}
