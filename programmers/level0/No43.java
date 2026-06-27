package level0;
/*
문제: 배열 자르기

로직
- 잘라낼 배열의 크기(num2 - num1 + 1)만큼 answer 배열을 생성한다.
- answer를 순회하며 numbers의 num1부터 num2까지의 값을 순서대로 복사한다.

핵심 구현
- 핵심 코드
  answer[i] = numbers[num1 + i];

- 핵심 코드 설명
  answer의 인덱스(i)에 대응되는 원본 배열의 인덱스는
  num1 + i가 된다.
  시작 인덱스(num1)부터 마지막 인덱스(num2)까지
  순서대로 값을 복사하여 새로운 배열을 만든다.

포인트
- 잘라낼 배열의 길이는 (num2 - num1 + 1)로 계산한다.
- 시작 위치(num1)에 현재 반복 인덱스(i)를 더해 원하는 값을 가져온다.
- 한 번의 반복문으로 배열을 복사할 수 있다.

회고
- 배열의 특정 구간을 새로운 배열로 복사하는 방법을 익힐 수 있었다.
- 시작 인덱스를 기준으로 상대적인 위치를 계산하는 방식은 다양한 배열 문제에서 활용할 수 있다.
*/
public class No43 {
    class Solution {
        public int[] solution(int[] numbers, int num1, int num2) {
            int[] answer = new int[num2 - num1 + 1];

            for (int i = 0; i < answer.length; i++) {
                answer[i] = numbers[num1 + i];
            }

            return answer;
        }
    }
}
