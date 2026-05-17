package level1;

import java.util.Stack;
/*
문제-12906: 같은 숫자는 싫어

[문제 요약]
- 배열에서 연속으로 중복되는 숫자를 제거
- 단, 연속되지 않은 동일 숫자는 유지
- 결과를 순서대로 반환

[접근 방법]
- Stack을 사용하여 마지막 값 비교
- 현재 숫자와 Stack의 top 값이 다를 때만 push

[핵심 아이디어]
- 연속 중복 제거는 "직전 값"만 비교하면 해결 가능
- stack.peek() 로 마지막 값 조회
- 비어있거나 마지막 값과 다를 때만 저장

[처리 흐름]
배열 순회
→ Stack 비어있는지 확인
→ 마지막 값과 현재 값 비교
→ 다르면 push
→ 결과 출력

[시간복잡도]
- O(N)
*/
public class No32 {
    public static void main(String[] args) {
        int[] arr = {4,4,4,3,3};
        Stack<Integer> stack = new Stack<>();

        for(int num : arr){
            if(stack.size() == 0 || stack.peek() != num){
                stack.push(num);
            }
        }

        System.out.println(stack.toString());
    }
}
