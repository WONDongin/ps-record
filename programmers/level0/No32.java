package level0;
/*
문제: 저수지 물 사용량 예측

문제 요약
- 현재 저수지 저장량 storage가 주어진다.
- 지난달 물 사용량 usage가 주어진다.
- change 배열에는 매달 전월 대비 사용량 변화율이 들어 있다.
- 누적 사용량이 storage를 초과하는 최초 달을 반환한다.
- 끝까지 부족하지 않으면 -1을 반환한다.

접근 방법
- change 배열을 순회하면서 매달 사용량을 갱신한다.
- 갱신된 사용량을 total_usage에 누적한다.
- 누적 사용량이 storage보다 커지는 순간 현재 인덱스를 반환한다.

핵심 아이디어
- 사용량 변화율은 usage * (100 + change[i]) / 100 으로 계산한다.
- change[i]가 양수면 증가, 음수면 감소를 같은 식으로 처리할 수 있다.
- 정수 나눗셈 오차를 줄이기 위해 곱셈을 먼저 수행한다.

주의할 점
- usage / 100 * change[i] 처럼 계산하면 소수점이 먼저 버려져 오답이 될 수 있다.
- change는 배열이므로 반드시 change[i]로 접근해야 한다.

배운 점
- 퍼센트 계산에서는 정수 나눗셈 순서가 중요하다.
- 나눗셈보다 곱셈을 먼저 처리하면 소수점 손실을 줄일 수 있다.
*/
public class No32 {
    class Solution {
        public int solution(int storage, int usage, int[] change) {
            int total_usage = 0;
            for(int i=0; i<change.length; i++){
                usage = usage * (100 + change[i]) / 100;
                total_usage += usage;
                if(total_usage > storage){
                    return i;
                }
            }
            return -1;
        }
    }
}
