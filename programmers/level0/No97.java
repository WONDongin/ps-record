package level0;

import java.util.Arrays;

/*
문제: 조건에 따라 수열 변환하기 3

로직
- k를 2로 나눈 나머지를 이용해 홀수와 짝수를 구분한다.
- k가 홀수이면 배열의 각 원소에 k를 곱한다.
- k가 짝수이면 배열의 각 원소에 k를 더한다.

핵심 구현
- k % 2 == 1로 홀수 여부를 확인한다.
- 반복문을 이용해 arr의 모든 원소를 직접 변경한다.

포인트
- 배열을 직접 수정하므로 새로운 배열을 만들 필요가 없다.
- 시간 복잡도는 O(n), 추가 공간 복잡도는 O(1)이다.

회고
- 나머지 연산자를 활용해 홀수와 짝수에 따라 서로 다른 연산을 적용했다.
*/
public class No97 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 100, 99, 98};
        int k = 3;

        for (int i = 0; i < arr.length; i++) {
            if (k % 2 == 1) {
                arr[i] *= k;
            } else {
                arr[i] += k;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
