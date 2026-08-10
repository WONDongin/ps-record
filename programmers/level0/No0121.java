package level0;
/*
문제: 배열 비교하기

로직
- arr1과 arr2의 길이를 먼저 비교한다.
- 두 배열의 길이가 다르면 더 긴 배열을 큰 배열로 판단한다.
- 두 배열의 길이가 같으면 각각의 원소 합을 구한다.
- 두 배열의 합을 비교해 -1, 0, 1 중 하나를 반환한다.

핵심 구현
- arr1.length != arr2.length 조건으로 길이가 다른지 확인한다.
- Integer.compare(arr1.length, arr2.length)로 배열 길이를 비교한다.
- 하나의 반복문에서 arr1과 arr2의 원소 합을 각각 구한다.
- Integer.compare(sum1, sum2)로 두 배열의 합을 비교한다.

포인트
- 배열의 길이가 다르면 원소의 합은 비교하지 않는다.
- 배열의 길이가 같을 때만 모든 원소의 합을 비교한다.
- Integer.compare()의 반환값은 문제에서 요구하는 -1, 0, 1과 일치한다.
- 두 배열의 길이가 같으므로 하나의 반복문에서 두 배열의 합을 함께 계산할 수 있다.

회고
- 문제에서 정한 배열 비교 순서에 따라 길이를 먼저 비교했다.
- 길이가 같은 경우에만 합을 계산해 불필요한 연산을 줄였다.
- Integer.compare()를 활용해 여러 조건문 없이 간결하게 결과를 반환했다.
*/
public class No0121 {
    public static void main(String[] args) {
        class Solution {
            public int solution(int[] arr1, int[] arr2) {
                if (arr1.length != arr2.length) {
                    return Integer.compare(arr1.length, arr2.length);
                }

                int sum1 = 0;
                int sum2 = 0;

                for (int i = 0; i < arr1.length; i++) {
                    sum1 += arr1[i];
                    sum2 += arr2[i];
                }

                return Integer.compare(sum1, sum2);
            }
        }

        Solution solution = new Solution();

        int[] arr1 = {49, 13};
        int[] arr2 = {70, 11, 2};

        System.out.println(solution.solution(arr1, arr2)); // -1
    }
}
