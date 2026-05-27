package level1;
/*
문제-푸드 파이트 대회

문제 요약
- 두 선수가 같은 음식 종류와 개수를 같은 순서로 먹어야 한다.
- 가운데에는 물인 0을 배치한다.
- 각 음식은 양쪽에 같은 개수로 배치해야 하므로 food[i] / 2개만 사용한다.

접근 방법
- 1번 음식부터 순서대로 확인한다.
- 각 음식 개수를 2로 나눈 몫만큼 왼쪽 문자열에 추가한다.
- 왼쪽 문자열 + 0 + 왼쪽 문자열을 뒤집은 값으로 최종 배치를 만든다.

핵심 아이디어
- 대회 음식 배치는 항상 좌우 대칭이다.
- 따라서 한쪽 문자열만 먼저 만들고, 이를 뒤집어 오른쪽에 붙이면 된다.

처리 흐름
1. StringBuilder left 생성
2. food[1]부터 food 끝까지 순회
3. food[i] / 2만큼 음식 번호 i 추가
4. left + "0" + reverse(left) 반환
*/
public class No43 {
    class Solution {
        public String solution(int[] food) {
            StringBuilder left = new StringBuilder();

            for (int i = 1; i < food.length; i++) {
                for (int j = 0; j < food[i] / 2; j++) {
                    left.append(i);
                }
            }

            String right = new StringBuilder(left).reverse().toString();

            return left.toString() + "0" + right;
        }
    }
}
