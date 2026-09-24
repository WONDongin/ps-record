package level0;
/*
문제: 배열 원소의 길이

로직
- 배열의 모든 원소에 조건에 맞는 연산을 반복하고,
한 번의 반복에서 아무 원소도 바뀌지 않으면 현재 반복 횟수를 반환한다.

핵심 구현
- 각 원소의 변경 전후 값을 비교해 changed를 기록한다.
changed가 false이면 arr(count)와 arr(count + 1)이 같다.

포인트
- 배열이 처음부터 변하지 않는다면 정답은 0이다.

회고
- 배열 전체를 복사해 비교하지 않아도 변경 여부만 확인하면 종료 시점을 알 수 있다.
*/
public class No210 {
    class Solution {
        public int solution(int[] arr) {
            int count = 0;

            while (true) {
                boolean changed = false;

                for (int i = 0; i < arr.length; i++) {
                    int before = arr[i];

                    if (arr[i] >= 50 && arr[i] % 2 == 0) {
                        arr[i] /= 2;
                    } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                        arr[i] = arr[i] * 2 + 1;
                    }

                    if (arr[i] != before) {
                        changed = true;
                    }
                }

                if (!changed) {
                    return count;
                }

                count++;
            }
        }
    }
}
