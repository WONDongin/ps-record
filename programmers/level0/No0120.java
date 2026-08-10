package level0;

import java.util.Arrays;

/*
문제: 배열의 길이에 따라 다른 연산하기

로직
- arr의 길이가 홀수인지 짝수인지 확인한다.
- 길이가 홀수라면 짝수 인덱스에 n을 더한다.
- 길이가 짝수라면 홀수 인덱스에 n을 더한다.
- 변경된 arr를 반환한다.

핵심 구현
- arr.length % 2로 배열 길이의 홀짝을 판별한다.
- 삼항 연산자를 사용해 반복문의 시작 인덱스를 결정한다.
- 배열 길이가 홀수면 0, 짝수면 1부터 순회한다.
- i를 2씩 증가시켜 필요한 인덱스에만 접근한다.
- arr[i] += n으로 기존 원소에 n을 더한다.

포인트
- 배열의 인덱스는 0부터 시작하므로 0은 짝수 인덱스이다.
- 배열 길이의 홀짝과 수정할 인덱스의 홀짝이 반대라는 점에 주의한다.
- i += 2를 사용하면 모든 인덱스를 순회하면서 조건을 검사할 필요가 없다.
- 전달받은 원본 배열을 직접 수정해 반환한다.

회고
- 배열 길이의 홀짝에 따라 시작 인덱스를 다르게 설정했다.
- 반복문의 증가 폭을 2로 지정해 필요한 위치만 효율적으로 수정했다.
- 삼항 연산자를 사용해 중복되는 반복문을 하나로 합칠 수 있었다.
*/
public class No0120 {
    public static void main(String[] args) {
        class Solution {
            public int[] solution(int[] arr, int n) {
                int startIndex = arr.length % 2 == 0 ? 1 : 0;

                for (int i = startIndex; i < arr.length; i += 2) {
                    arr[i] += n;
                }

                return arr;
            }
        }

        Solution solution = new Solution();

        int[] arr = {49, 12, 100, 276, 33};
        int n = 27;

        System.out.println(
                Arrays.toString(solution.solution(arr, n))
        ); // [76, 12, 127, 276, 60]
    }
}
