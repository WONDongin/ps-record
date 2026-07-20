package level0;
/*
문제: 카운트 업

로직
- start_num부터 end_num까지 담을 수 있도록 배열의 크기를 설정한다.
- 반복문을 사용해 start_num부터 1씩 증가하는 값을 배열에 저장한다.
- 완성된 배열을 반환한다.

핵심 구현
- 배열의 길이는 양 끝 숫자를 모두 포함하므로
  end_num - start_num + 1로 계산한다.
- 배열의 각 위치에 start_num + i를 저장한다.

포인트
- 시작 숫자와 끝 숫자를 모두 포함해야 하므로 배열 길이에 +1이 필요하다.

회고
- 배열의 인덱스와 시작 숫자를 더하면 별도의 증가 변수를 사용하지 않고
  연속된 숫자를 간단하게 저장할 수 있다.
*/
public class No88 {
    class Solution {
        public int[] solution(int start_num, int end_num) {
            int[] answer = new int[end_num - start_num + 1];

            for (int i = 0; i < answer.length; i++) {
                answer[i] = start_num + i;
            }

            return answer;
        }
    }
}
