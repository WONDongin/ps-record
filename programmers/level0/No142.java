package level0;
/*
문제 - 배열의 구간 복사하기

주어진 두 개의 닫힌 구간에 해당하는 배열의 원소를 순서대로 복사하여
하나의 새로운 배열을 반환한다.

풀이

- 각 구간의 길이는 `끝 인덱스 - 시작 인덱스 + 1`로 계산한다.
- 두 구간의 길이를 더해 결과 배열을 생성한다.
- 첫 번째 구간과 두 번째 구간을 순서대로 순회하며 값을 저장한다.
- 닫힌 구간이므로 반복문의 조건에 `<=`를 사용한다.

핵심 구현

int firstLength = intervals[0][1] - intervals[0][0] + 1;
int secondLength = intervals[1][1] - intervals[1][0] + 1;
int[] answer = new int[firstLength + secondLength];

회고

- 닫힌 구간은 시작점과 끝점을 모두 포함하므로 구간의 길이를 구할 때
반드시 1을 더해야 한다.
*/
public class No142 {
    class Solution {
        public int[] solution(int[] arr, int[][] intervals) {
            int firstLength = intervals[0][1] - intervals[0][0] + 1;
            int secondLength = intervals[1][1] - intervals[1][0] + 1;

            int[] answer = new int[firstLength + secondLength];
            int index = 0;

            for (int i = intervals[0][0]; i <= intervals[0][1]; i++) {
                answer[index++] = arr[i];
            }

            for (int i = intervals[1][0]; i <= intervals[1][1]; i++) {
                answer[index++] = arr[i];
            }

            return answer;
        }
    }
}
