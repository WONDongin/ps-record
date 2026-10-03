package level0;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
/*
제목 : [프로그래머스] 무작위로 K개의 수 뽑기 Java 풀이

문제 설명
- 배열 arr에서 서로 다른 정수를 등장 순서대로 k개 선택합니다.
- 서로 다른 정수가 k개보다 적으면 남은 자리를 -1로 채웁니다.

풀이 방법
- 길이가 k인 결과 배열을 생성하고 -1로 초기화합니다.
- HashSet으로 이미 등장한 정수를 관리합니다.
- seen.add()가 true인 경우에만 결과 배열에 저장합니다.
- k개의 정수를 모두 저장하면 반복문을 종료합니다.

시간 및 공간 복잡도
- 시간 복잡도: 평균 O(n + k), n은 arr의 길이
- 공간 복잡도: O(k)

입출력 예
- arr=[0, 1, 1, 2, 2, 3], k=3 → [0, 1, 2]
- arr=[0, 1, 1, 1, 1], k=4 → [0, 1, -1, -1]
*/
public class No225 {
    class Solution {
        public int[] solution(int[] arr, int k) {
            int[] answer = new int[k];
            Arrays.fill(answer, -1);

            Set<Integer> seen = new HashSet<>();
            int index = 0;

            for (int number : arr) {
                if (seen.add(number)) {
                    answer[index++] = number;

                    if (index == k) {
                        break;
                    }
                }
            }

            return answer;
        }
    }
}
