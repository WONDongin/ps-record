package level0;
/*
문제: 커피 심부름
로직 - 주문마다 카페 라테면 5000원, 그 외에는 4500원을 더한다.
핵심 구현 - menu.contains("cafelatte")로 온도와 단어 순서에 관계없이 카페 라테를 구분한다.
포인트 - "anything"은 아메리카노 가격인 4500원으로 계산한다.
회고 - 가격은 온도와 무관하므로 메뉴 종류만 확인하면 된다.
*/
public class No214 {
    class Solution {
        public int solution(String[] order) {
            int answer = 0;

            for (String menu : order) {
                answer += menu.contains("cafelatte") ? 5000 : 4500;
            }

            return answer;
        }
    }
}
