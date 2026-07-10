package level0;
/*
문제: 옷가게 할인 받기

로직
- 구매 금액에 따라 할인율을 적용한다.
- 50만 원 이상은 20%, 30만 원 이상은 10%, 10만 원 이상은 5%를 할인한다.
- 할인 금액을 적용한 후 정수형으로 변환하여 반환한다.

핵심 구현
- 핵심 코드
  if (price >= 500000) {
      return (int)(price * 0.8);
  } else if (price >= 300000) {
      return (int)(price * 0.9);
  } else if (price >= 100000) {
      return (int)(price * 0.95);
  }

- 핵심 코드 설명
  - 할인율이 높은 조건부터 검사해야 올바른 할인이 적용된다.
  - 할인 적용 후 (int)로 형변환하여 소수점을 버린다.

포인트
- 조건문의 순서는 높은 할인율부터 검사해야 한다.
- (int) 캐스팅을 이용해 소수점 이하를 제거한다.

회고
- 조건문의 순서가 결과에 큰 영향을 미치는 문제였다.
- 할인율 계산 시 형변환이 필요한 이유를 다시 확인할 수 있었다.
*/
public class No71 {
    class Solution {
        public int solution(int price) {
            if (price >= 500000) {
                return (int)(price * 0.8);
            } else if (price >= 300000) {
                return (int)(price * 0.9);
            } else if (price >= 100000) {
                return (int)(price * 0.95);
            }

            return price;
        }
    }
}
