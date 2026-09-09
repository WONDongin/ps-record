package level0;
import java.util.Arrays;
/*
문제: 배열 조각하기

로직
- 남아 있는 배열의 시작 인덱스와 끝 인덱스를 관리한다.
- query의 짝수 인덱스에서는 query[i] 뒤의 부분을 제거한다.
- query의 홀수 인덱스에서는 query[i] 앞의 부분을 제거한다.
- 모든 작업이 끝나면 남은 구간을 새로운 배열로 복사한다.

핵심 구현
- 짝수 인덱스: end = start + query[i]
- 홀수 인덱스: start += query[i]
- Arrays.copyOfRange(arr, start, end + 1)로 남은 구간을 반환한다.

포인트
- query[i]는 원본 배열이 아니라 현재 남아 있는 배열을 기준으로 한 인덱스다.
- 끝 인덱스까지 포함해야 하므로 copyOfRange의 종료 위치에 1을 더한다.
- 매번 새로운 배열을 만들지 않고 start와 end만 변경하여 처리할 수 있다.

회고
- 배열을 매번 잘라내는 대신 시작점과 끝점만 관리하여 효율적으로 해결했다.
*/
public class No174 {
    class Solution {
        public int[] solution(int[] arr, int[] query) {
            int start = 0;
            int end = arr.length - 1;

            for (int i = 0; i < query.length; i++) {
                if (i % 2 == 0) {
                    end = start + query[i];
                } else {
                    start += query[i];
                }
            }

            return Arrays.copyOfRange(arr, start, end + 1);
        }
    }
}
