package level0;
/*
문제: 짝수 홀수 개수

로직
- 결과를 저장할 크기 2의 배열을 생성한다.
- 배열을 순회하며 각 숫자를 2로 나눈 나머지를 인덱스로 사용한다.
- 짝수와 홀수의 개수를 각각 증가시킨다.

핵심 구현
- 핵심 코드
  answer[num_list[i] % 2]++;
- 나머지가 0이면 짝수, 1이면 홀수이므로 이를 배열의 인덱스로 활용해 개수를 카운트한다.

포인트
- 나머지 연산을 배열 인덱스로 활용하여 조건문 없이 구현했다.
- answer[0]은 짝수의 개수, answer[1]은 홀수의 개수를 의미한다.
- 코드가 간결하고 한 번의 순회만으로 결과를 구할 수 있다.

회고
- 나머지 연산의 결과를 배열 인덱스로 활용하면 조건문을 줄이고 코드를 더욱 간결하게 작성할 수 있다는 점을 배웠다.
*/
public class No49 {
    class Solution {
        public int[] solution(int[] num_list) {
            int[] answer = new int[2];

            for(int i = 0; i < num_list.length; i++)
                answer[num_list[i] % 2]++;

            return answer;
        }
    }
}
