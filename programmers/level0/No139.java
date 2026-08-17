package level0;
/*
문제: 5명씩

로직
- 전체 인원을 5명씩 나누어 그룹 수를 계산한다.
- 각 그룹의 첫 번째 사람을 결과 배열에 저장한다.
- 마지막 그룹이 5명 미만이어도 그룹에 포함한다.

핵심 구현
- (names.length + 4) / 5로 필요한 그룹 수를 계산했다.
- names[i * 5]를 사용해 5명 간격으로 이름을 선택했다.

포인트
- 정수 올림 공식을 사용해 마지막 그룹까지 포함했다.
- 시간 복잡도: O(n / 5)
- 공간 복잡도: O(n / 5)

회고
- 모든 원소를 순회하지 않고 인덱스를 5칸씩 이동해
  각 그룹의 첫 번째 사람만 효율적으로 선택할 수 있었다.
*/
public class No139 {
    class Solution {
        public String[] solution(String[] names) {
            int groupCount = (names.length + 4) / 5;
            String[] answer = new String[groupCount];

            for (int i = 0; i < groupCount; i++) {
                answer[i] = names[i * 5];
            }

            return answer;
        }
    }
}