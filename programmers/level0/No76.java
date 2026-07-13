package level0;

import java.util.Arrays;
/*
문제: 첫 번째로 나오는 n개의 원소

로직
- 길이가 n인 배열을 생성한다.
- num_list의 앞에서부터 n개의 원소를 순회한다.
- 각 원소를 새로운 배열에 복사한다.
- 완성된 배열을 반환한다.

핵심 구현
- 핵심 코드
  ex)
  int[] answer = new int[n];

  for (int i = 0; i < n; i++) {
      answer[i] = num_list[i];
  }

- 핵심 코드 설명
  - 반환할 배열의 크기를 n으로 생성한다.
  - 인덱스 0부터 n-1까지 반복하면서 num_list의 값을 그대로 복사한다.
  - 반복문이 종료되면 앞의 n개 원소만 담긴 배열이 완성된다.

포인트
- 새로운 배열의 크기는 n으로 생성해야 한다.
- 반복문의 범위는 i < n으로 설정하여 앞의 n개 원소만 복사한다.
- 배열의 앞부분만 필요한 경우 가장 직관적인 구현 방법이다.
- Arrays.copyOf()를 사용해도 동일한 결과를 얻을 수 있다.

회고
- 배열의 일부를 새로운 배열로 복사하는 기본적인 방법을 다시 익힐 수 있었다.
- 반복문을 이용한 복사와 Arrays.copyOf()를 이용한 방법의 차이를 함께 알아두면 다양한 상황에서 활용할 수 있다.
*/
public class No76 {
    public static void main(String[] args) {
        int[] num_list = {5, 2, 1, 7, 5};
        int n = 3;
        int[] answer = new int[n];

        for(int i = 0; i < n; i++){
            answer[i] = num_list[i];
        }

        System.out.println(Arrays.toString(answer));
    }
}
