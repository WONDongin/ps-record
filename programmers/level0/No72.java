package level0;
/*
문제: 첫 번째로 나오는 음수

로직
- 배열을 처음부터 순회한다.
- 음수를 발견하면 해당 인덱스를 즉시 반환한다.
- 끝까지 음수가 없다면 -1을 반환한다.

핵심 구현
- if (num_list[i] < 0)
- return i;
- return -1;

- 배열을 앞에서부터 탐색하며 첫 번째 음수를 찾는다.
- 첫 번째 음수를 찾는 즉시 return하여 불필요한 탐색을 하지 않는다.

포인트
- 첫 번째 음수만 찾으면 되므로 break 대신 return을 사용해 함수를 종료했다.
- 배열을 한 번만 순회하므로 시간 복잡도는 O(n)이다.
- 음수가 존재하지 않는 경우를 위해 마지막에 -1을 반환한다.

회고
- 조건을 만족하는 첫 번째 원소를 찾는 문제는 return을 활용하면 가장 간단하게 구현할 수 있다.
- 불필요한 반복을 줄이는 조기 종료(Early Return)의 장점을 다시 한번 익힐 수 있었다.
*/
public class No72 {
    class Solution {
        public int solution(int[] num_list) {

            for (int i = 0; i < num_list.length; i++) {
                if (num_list[i] < 0) {
                    return i;
                }
            }

            return -1;
        }
    }
}
