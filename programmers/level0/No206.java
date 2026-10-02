package level0;
import java.util.Arrays;
/*
문제: 2의 영역

로직
- 배열을 순회하며 2가 처음 등장한 위치와 마지막으로 등장한 위치를 찾는다.
- 2가 없다면 [-1]을 반환한다.
- 2가 있다면 첫 번째 2부터 마지막 2까지의 부분 배열을 반환한다.

핵심 구현
- first는 첫 번째 2를 찾았을 때 한 번만 저장한다.
- last는 2를 찾을 때마다 갱신한다.
- Arrays.copyOfRange(arr, first, last + 1)로 마지막 2까지 포함한다.

포인트
- 배열 안의 모든 2를 포함하는 가장 작은 연속 구간은 첫 번째 2부터 마지막 2까지이다.
- 2가 하나뿐이라면 해당 원소 하나만 담긴 배열이 반환된다.

회고
- 첫 위치와 마지막 위치만 찾으면 중간 원소를 따로 검사하지 않아도 구간을 결정할 수 있었다.
*/
public class No206 {
    class Solution {
        public int[] solution(int[] arr) {
            int first = -1;
            int last = -1;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 2) {
                    if (first == -1) {
                        first = i;
                    }
                    last = i;
                }
            }

            if (first == -1) {
                return new int[] {-1};
            }

            return Arrays.copyOfRange(arr, first, last + 1);
        }
    }
}
