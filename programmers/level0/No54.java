package level0;
/*
문제: 배열 두 배 만들기

로직
- 결과를 저장할 배열을 생성한다.
- numbers 배열을 순회하면서 각 원소에 2를 곱해 결과 배열에 저장한다.

핵심 구현
- 핵심 코드
  for(int i = 0; i < numbers.length; i++){
      answer[i] = numbers[i] * 2;
  }

- 배열을 한 번 순회하며 각 원소를 2배로 만든 뒤
  같은 인덱스의 결과 배열에 저장한다.

포인트
- 결과 배열의 크기는 입력 배열과 동일하게 생성한다.
- 인덱스를 그대로 사용하면 원소의 순서를 유지할 수 있다.
- 한 번의 반복문으로 모든 원소를 처리할 수 있다.

회고
- 배열을 순회하며 값을 변환하는 가장 기본적인 패턴을 익힐 수 있었다.
- 입력 배열을 변경하지 않고 새로운 배열에 결과를 저장하는 방법을 연습했다.
*/
import java.util.Arrays;

public class No54 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] answer = new int[numbers.length];

        for(int i = 0; i < numbers.length; i++){
            answer[i] = numbers[i] * 2;
        }

        System.out.println(Arrays.toString(answer));
    }
}
