package level0;
import java.util.Arrays;
/*
문제: 배열의 길이를 2의 거듭제곱으로 만들기

로직
- 1부터 시작하여 배열의 길이 이상이 될 때까지 2를 곱한다.
- 구한 길이는 arr의 길이 이상인 가장 작은 2의 거듭제곱이다.
- 배열을 해당 길이로 복사하여 반환한다.

핵심 구현
- while문을 사용해 1, 2, 4, 8 순서로 길이를 증가시킨다.
- Arrays.copyOf()를 사용해 기존 배열을 새로운 길이로 복사한다.
- 추가된 배열 공간은 int의 기본값인 0으로 채워진다.

포인트
- arr의 길이가 이미 2의 거듭제곱이면 길이가 증가하지 않는다.
- 기존 원소의 순서는 그대로 유지된다.
- 필요한 최소 개수의 0만 배열 뒤에 추가해야 한다.

회고
- 2의 거듭제곱 길이를 구한 뒤 Arrays.copyOf를 활용해 간단하게 배열을 확장했다.
*/
public class No185 {
    class Solution {
        public int[] solution(int[] arr) {
            int length = 1;

            while (length < arr.length) {
                length *= 2;
            }

            return Arrays.copyOf(arr, length);
        }
    }
}
