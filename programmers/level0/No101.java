package level0;
/*
문제: 주사위의 개수

로직
- 상자의 가로, 세로, 높이에 각각 주사위가 몇 개씩 들어가는지 계산한다.
- 각 방향에 들어가는 주사위의 개수를 모두 곱해 최대 개수를 구한다.

핵심 구현
- 가로에 들어가는 개수: box[0] / n
- 세로에 들어가는 개수: box[1] / n
- 높이에 들어가는 개수: box[2] / n
- 전체 개수: (box[0] / n) * (box[1] / n) * (box[2] / n)

포인트
- 주사위는 상자와 평행하게 넣으므로 각 방향을 독립적으로 계산할 수 있다.
- 정수 나눗셈을 사용하면 주사위가 완전히 들어가는 개수만 구할 수 있다.
- 남는 공간에는 주사위를 추가로 넣을 수 없으므로 나머지는 고려하지 않는다.

회고
- 각 방향에 들어가는 주사위의 개수를 정수 나눗셈으로 구한 뒤,
  세 값을 곱해 간단하게 해결했다.
*/
public class No101 {
    public static void main(String[] args) {
        class Solution {
            public int solution(int[] box, int n) {
                return (box[0] / n)
                        * (box[1] / n)
                        * (box[2] / n);
            }
        }

        Solution solution = new Solution();
        int[] box = {10, 8, 6};

        System.out.println(solution.solution(box, 3));
    }
}
