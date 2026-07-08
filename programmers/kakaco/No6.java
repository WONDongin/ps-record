package kakaco;

import java.util.Stack;
/*
문제: 크레인 인형뽑기 게임

로직
- moves 배열을 순회하며 크레인을 이동시킨다.
- 선택한 열의 가장 위에 있는 인형을 찾아 바구니에 담는다.
- 바구니의 가장 위 인형과 같은 모양이면 제거하고 사라진 인형 개수를 증가시킨다.

핵심 구현
- Stack<Integer> basket = new Stack<>();
- if (!basket.isEmpty() && basket.peek() == doll)
- basket.pop();
- answer += 2;

- Stack을 이용해 바구니의 마지막 인형과 새로 뽑은 인형을 비교한다.
- 같은 인형이면 pop()으로 제거하고 answer를 2 증가시킨다.
- 인형을 하나 뽑은 후에는 break로 해당 열 탐색을 종료한다.

포인트
- moves는 1부터 시작하므로 배열 인덱스로 사용할 때는 move - 1로 변환해야 한다.
- 인형을 뽑은 위치는 0으로 변경하여 중복으로 뽑히지 않도록 처리한다.
- Stack의 peek()를 활용하면 가장 위 인형을 O(1)에 비교할 수 있다.

회고
- 바구니를 Stack으로 생각하면 문제를 자연스럽게 해결할 수 있었다.
- 인형을 뽑은 뒤 break를 하지 않으면 같은 열의 여러 인형을 한 번에 처리하는 오류가 발생할 수 있다는 점을 다시 한번 확인했다.
*/
public class No6 {
    class Solution {
        public int solution(int[][] board, int[] moves) {
            int answer = 0;
            Stack<Integer> basket = new Stack<>();

            for(int move : moves){
                int col = move - 1;

                for(int row = 0; row < board.length; row++){
                    if(board[row][col] != 0){
                        int doll = board[row][col];
                        board[row][col] = 0;

                        if(!basket.isEmpty() && basket.peek() == doll){
                            basket.pop();
                            answer += 2;
                        } else {
                            basket.push(doll);
                        }

                        break;
                    }
                }
            }
            return answer;
        }
    }
}
