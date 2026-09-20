package level0;
/*
문제: 전국 대회 선발 고사

로직
- 등수는 1등부터 rank 배열의 길이까지 순서대로 확인한다.
- 현재 등수에 해당하는 학생 번호를 찾는다.
- 해당 학생이 대회에 참석할 수 있다면 선발 배열에 저장한다.
- 참석 가능한 학생 3명을 선발하면 정해진 계산식으로 결과를 반환한다.

핵심 구현
- currentRank를 1부터 증가시키며 등수가 높은 학생부터 확인한다.
- rank[student]와 currentRank가 같고 attendance[student]가 true인지 검사한다.
- 선발된 학생 번호를 selected 배열에 순서대로 저장한다.
- 10000 * a + 100 * b + c를 계산해 반환한다.

포인트
- rank의 값이 작을수록 등수가 높은 학생이다.
- 학생 번호는 rank 배열의 인덱스를 사용한다.
- 참석할 수 없는 학생은 등수가 높더라도 선발 대상에서 제외한다.
- rank의 원소가 모두 다르기 때문에 같은 등수의 학생은 존재하지 않는다.

회고
- 등수를 1등부터 차례대로 확인하여 별도의 객체나 정렬 없이 선발 학생을 구했다.
- 참석 가능 여부를 함께 검사하여 조건에 맞는 상위 3명의 학생 번호를 계산식에 적용했다.
*/
public class No204 {
    class Solution {
        public int solution(int[] rank, boolean[] attendance) {
            int[] selected = new int[3];
            int count = 0;

            for (int currentRank = 1; currentRank <= rank.length; currentRank++) {
                for (int student = 0; student < rank.length; student++) {
                    if (rank[student] == currentRank && attendance[student]) {
                        selected[count++] = student;

                        if (count == 3) {
                            return 10000 * selected[0]
                                    + 100 * selected[1]
                                    + selected[2];
                        }
                    }
                }
            }

            return 0;
        }
    }
}
