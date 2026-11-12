package level2;
import java.util.Arrays;
/*
문제: H-Index

로직
- 논문의 인용 횟수를 오름차순으로 정렬한다.
- 현재 위치부터 마지막까지 남은 논문의 개수를 h로 계산한다.
- 현재 논문의 인용 횟수가 h 이상이면 h를 반환한다.
- 조건을 만족하는 값이 없으면 0을 반환한다.

핵심 구현
- citations.length - i로 h번 이상 인용되었는지 확인할 논문의 개수를 구한다.
- 정렬된 배열에서 citations[i] >= h이면 이후 논문도 모두 h번 이상 인용되었다.

포인트
- H-Index는 배열에 존재하지 않는 값일 수도 있다.
- h를 큰 값부터 확인하므로 처음 조건을 만족하는 값이 최댓값이다.

회고
- 정렬을 활용해 인용 횟수와 논문 수를 비교하는 방식으로 구현했다.
*/
public class No26 {
    class Solution {
        public int solution(int[] citations) {
            Arrays.sort(citations);

            for (int i = 0; i < citations.length; i++) {
                int h = citations.length - i;

                if (citations[i] >= h) {
                    return h;
                }
            }

            return 0;
        }
    }
}
