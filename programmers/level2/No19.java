package level2;
import java.util.HashSet;
import java.util.Set;
/*
문제: 연속 부분 수열 합의 개수

로직
- 각 인덱스를 부분 수열의 시작 위치로 설정한다.
- 시작 위치부터 길이 1부터 전체 길이까지 원소를 누적한다.
- 계산한 합을 HashSet에 저장한다.
- 중복을 제거한 합의 개수를 반환한다.

핵심 구현
- (start + length - 1) % n으로 원형 수열의 인덱스를 계산한다.
- 이전 합에 다음 원소를 더하여 부분 수열의 합을 구한다.
- HashSet으로 같은 합이 중복 저장되지 않도록 처리한다.

포인트
- 부분 수열은 끝에서 처음으로 이어질 수 있다.
- 부분 수열의 길이는 1부터 원본 배열의 길이까지이다.
- 부분 수열이 달라도 합이 같으면 한 가지로 센다.

회고
- 나머지 연산으로 배열을 복사하지 않고 원형 구조를 구현했다.
- 누적 계산과 HashSet을 활용해 모든 합을 구하고 중복을 제거했다.
*/
public class No19 {
    class Solution {
        public int solution(int[] elements) {
            int n = elements.length;
            Set<Integer> sums = new HashSet<>();

            for (int start = 0; start < n; start++) {
                int sum = 0;

                for (int length = 1; length <= n; length++) {
                    int index = (start + length - 1) % n;
                    sum += elements[index];
                    sums.add(sum);
                }
            }

            return sums.size();
        }
    }
}
