package level0;

import java.util.Arrays;
/*
문제: n번째 원소부터

- Arrays.copyOfRange()를 사용하여 n번째 원소부터 배열의 끝까지 잘라 새로운 배열을 반환하도록 구현

주요 메서드
- Arrays.copyOfRange(int[] original, int from, int to)

주요 알고리즘
- 배열 복사(Array Copy)

시간복잡도: O(n)
*/
public class No83 {
    public static void main(String[] args) {
        int[] numList = {5,2,1,7,5};
        int n = 2;

        System.out.println(
                Arrays.toString(Arrays.copyOfRange(numList, n - 1, numList.length))
        );
    }
}
