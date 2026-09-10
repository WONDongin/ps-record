package level0;
/*
문제: 등차수열의 특정한 항만 더하기

로직
- included 배열을 처음부터 순회한다.
- included[i]가 true라면 등차수열의 i + 1번째 항을 구한다.
- 선택된 항들을 answer에 누적하여 반환한다.

핵심 구현
- 등차수열의 i + 1번째 항은 a + (d * i)로 계산한다.
- included[i]가 true인 경우에만 계산한 항을 더한다.

포인트
- 배열의 인덱스는 0부터 시작하므로 현재 항은 a + (d * i)이다.
- false에 해당하는 항은 결과에 포함하지 않는다.

회고
- 등차수열의 일반항과 배열의 인덱스를 연결하여 간단하게 해결했다.
*/
public class No175 {
    class Solution {
        public int solution(int a, int d, boolean[] included) {
            int answer = 0;

            for (int i = 0; i < included.length; i++) {
                if (included[i]) {
                    answer += a + (d * i);
                }
            }

            return answer;
        }
    }
}
