package level0;
/*
문제: 치킨 쿠폰

로직
- 처음 주문한 치킨의 수만큼 쿠폰을 가지고 시작한다.
- 쿠폰이 10장 이상이면 서비스 치킨으로 교환한다.
- 사용하고 남은 쿠폰과 서비스 치킨으로 받은 쿠폰을 합친다.
- 더 이상 교환할 수 없을 때까지 반복한다.

핵심 구현
- coupon / 10으로 받을 수 있는 서비스 치킨의 수를 구한다.
- coupon % 10으로 교환 후 남는 쿠폰의 수를 구한다.
- 서비스 치킨에서도 쿠폰이 나오므로 남은 쿠폰에 serviceChicken을 더한다.

포인트
- 서비스 치킨 한 마리에서도 쿠폰 한 장을 받을 수 있다.
- 한 번 교환한 뒤 생긴 쿠폰으로 다시 서비스 치킨을 받을 수 있다.
- 쿠폰이 10장 미만이 될 때까지 반복해야 한다.

회고
- 서비스 치킨에서 다시 쿠폰이 발급되는 과정을 반복문으로 구현하여 최대 서비스 치킨 수를 구했다.
*/
public class No191 {
    class Solution {
        public int solution(int chicken) {
            int answer = 0;
            int coupon = chicken;

            while (coupon >= 10) {
                int serviceChicken = coupon / 10;

                answer += serviceChicken;
                coupon = coupon % 10 + serviceChicken;
            }

            return answer;
        }
    }
}
