package level0;
/*
문제: 진료 순서 정하기

로직
- emergency의 각 환자를 기준으로 다른 환자들의 응급도를 비교한다.
- 현재 환자보다 응급도가 높은 환자가 있으면 진료 순서를 1씩 증가시킨다.
- 계산된 진료 순서를 원래 환자의 위치에 저장한다.

핵심 구현
- 각 환자의 초기 진료 순서를 1로 설정한다.
- emergency[i]보다 emergency[j]가 크면 rank를 증가시킨다.
- 모든 비교가 끝난 뒤 answer[i]에 rank를 저장한다.

포인트
- 응급도가 높을수록 진료 순서의 숫자는 작아진다.
- 중복된 응급도가 없으므로 같은 순위가 발생하지 않는다.
- 배열의 길이가 최대 10이므로 이중 반복문으로 충분히 해결할 수 있다.

회고
- 현재 값보다 큰 원소의 개수를 이용하면 정렬하지 않고도 순위를 구할 수 있었다.
- 입력 배열의 기존 순서를 유지하면서 각 환자의 진료 순서를 계산했다.
*/
public class No196 {
    class Solution {
        public int[] solution(int[] emergency) {
            int[] answer = new int[emergency.length];

            for (int i = 0; i < emergency.length; i++) {
                int rank = 1;

                for (int j = 0; j < emergency.length; j++) {
                    if (emergency[i] < emergency[j]) {
                        rank++;
                    }
                }

                answer[i] = rank;
            }

            return answer;
        }
    }
}
