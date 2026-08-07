package level0;
/*
문제: 정수 찾기

로직
- num_list의 원소를 순서대로 확인한다.
- 현재 원소가 n과 같으면 즉시 1을 반환한다.
- 배열을 모두 확인해도 n이 없으면 0을 반환한다.

핵심 구현
- 향상된 for문을 사용해 num_list의 원소를 순회한다.
- num == n 조건으로 찾으려는 정수와 같은지 비교한다.
- 값을 찾은 순간 return 1로 반복을 종료한다.
- 반복문이 끝날 때까지 찾지 못하면 return 0을 실행한다.

포인트
- 정수 배열이므로 == 연산자로 값을 비교할 수 있다.
- n을 찾은 이후에는 나머지 원소를 확인할 필요가 없다.
- 별도의 결과 변수를 만들지 않고 즉시 반환할 수 있다.

회고
- 향상된 for문으로 배열의 원소를 간단하게 탐색했다.
- 원하는 값을 찾은 순간 즉시 반환해 불필요한 반복을 줄였다.
*/
public class No113 {
    public static void main(String[] args) {
        class Solution {
            public int solution(int[] num_list, int n) {
                for (int num : num_list) {
                    if (num == n) {
                        return 1;
                    }
                }

                return 0;
            }
        }

        Solution solution = new Solution();
        int[] numList = {1, 2, 3, 4, 5};

        System.out.println(solution.solution(numList, 3)); // 1
    }
}
