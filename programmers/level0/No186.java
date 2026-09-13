package level0;
/*
문제: 등수 매기기

로직
- 각 학생의 영어 점수와 수학 점수의 합을 구한다.
- 현재 학생보다 점수의 합이 높은 학생의 수를 센다.
- 높은 점수를 받은 학생의 수에 1을 더해 현재 학생의 등수를 구한다.

핵심 구현
- 평균은 두 과목의 합을 2로 나눈 값이므로 합만 비교해도 순서가 같다.
- 현재 학생의 등수를 1로 초기화한다.
- 현재 학생보다 합계가 높은 학생이 있을 때마다 등수를 1씩 증가시킨다.

포인트
- 평균을 실수로 계산하지 않고 두 점수의 합으로 비교할 수 있다.
- 점수의 합이 같으면 같은 등수를 받는다.
- 공동 등수가 존재하면 다음 등수는 공동 등수의 인원만큼 건너뛴다.

회고
- 각 학생보다 높은 점수를 받은 학생의 수를 세어 공동 등수까지 간단하게 처리했다.
*/
public class No186 {
    class Solution {
        public int[] solution(int[][] score) {
            int[] result = new int[score.length];

            for (int i = 0; i < score.length; i++) {
                int currentSum = score[i][0] + score[i][1];
                int rank = 1;

                for (int j = 0; j < score.length; j++) {
                    int compareSum = score[j][0] + score[j][1];

                    if (compareSum > currentSum) {
                        rank++;
                    }
                }

                result[i] = rank;
            }

            return result;
        }
    }
}
