package level1;
/*
문제-82612: 부족한 금액 계산하기

[문제 요약]
- 놀이기구를 count번 이용할 때 필요한 총 금액 계산
- 이용 횟수가 증가할수록 가격도 증가
- 현재 가진 money로 부족한 금액 반환
- 부족하지 않다면 0 반환

[접근 방법]
- 놀이기구 가격은 price * i 형태로 증가
- 1 ~ count까지의 합을 등차수열 공식으로 계산
- 총 금액에서 가진 돈(money)을 차감하여 부족한 금액 계산

[핵심 아이디어]
- 반복문 대신 등차수열 합 공식 사용
- 1 + 2 + ... + n = n(n + 1) / 2
- 시간복잡도를 O(N) → O(1)로 개선 가능

[처리 흐름]
총 이용 금액 계산
→ 가진 돈과 비교
→ 부족하면 차액 반환
→ 부족하지 않으면 0 반환

[시간복잡도]
- O(1)
*/
public class No28 {
    class Solution {
        public long solution(int price, int money, int count) {

            long total = (long) price * count * (count + 1) / 2;

            return total <= money ? 0 : total - money;
        }
    }
}
