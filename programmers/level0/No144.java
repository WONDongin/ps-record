package level0;
/*
문제: 카운트 다운

로직
- start_num부터 end_num까지의 숫자를 1씩 감소시키며 배열에 저장한다.
- 모든 숫자를 저장한 배열을 반환한다.

핵심 구현
- 배열의 길이를 start_num - end_num + 1로 설정한다.
- start_num - i를 사용하여 감소하는 숫자를 차례대로 저장한다.

포인트
- start_num과 end_num을 모두 포함하므로 배열 길이에 +1이 필요하다.
- 반복문의 인덱스를 이용하면 별도의 감소 변수를 만들지 않아도 된다.

회고
- 시작값과 인덱스의 차이를 활용하여 감소하는 숫자 배열을 간단하게 만들 수 있었다.
*/
public class No144 {
    class Solution {
        public int[] solution(int start_num, int end_num) {
            int[] answer = new int[start_num - end_num + 1];

            for (int i = 0; i < answer.length; i++) {
                answer[i] = start_num - i;
            }

            return answer;
        }
    }
}
