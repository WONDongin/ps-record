package level1;
/*
문제: 지폐 접기

문제 요약
- 지갑 크기와 지폐 크기가 주어진다.
- 지폐는 항상 더 긴 쪽을 반으로 접는다.
- 지폐를 그대로 또는 90도 돌려서 지갑에 넣기 위한 최소 접기 횟수를 구하는 문제이다.

접근 방법
- 지갑의 큰 값과 작은 값을 기준으로 저장한다.
- 지폐도 매번 큰 값과 작은 값을 기준으로 비교한다.
- 지폐의 큰 값이 지갑의 큰 값보다 크거나, 작은 값이 지갑의 작은 값보다 크면 계속 접는다.
- 접을 때는 bill[0]과 bill[1] 중 더 큰 값을 2로 나눈다.

핵심 아이디어
- 지폐는 회전할 수 있으므로 가로, 세로를 그대로 비교하지 않는다.
- 큰 값끼리, 작은 값끼리 비교하면 회전 가능 여부를 함께 판단할 수 있다.
- 지폐 크기는 접을 때마다 바뀌므로 반복문 조건에서 매번 다시 계산해야 한다.

주의할 점
- bill의 큰 값과 작은 값을 반복문 밖에서 한 번만 계산하면 안 된다.
- 지폐를 접은 뒤 크기가 바뀌기 때문에 매 반복마다 Math.max, Math.min으로 다시 비교해야 한다.
- 길이가 홀수인 경우 int 나눗셈으로 소수점 이하는 자동으로 버려진다.

배운 점
- 회전 가능한 사각형 비교는 큰 값과 작은 값 기준으로 단순화할 수 있다.
- 반복 중 값이 바뀌는 경우 조건식도 최신 값을 기준으로 계산해야 한다.
*/
public class No58 {
    public static void main(String[] args) {
        int[] wallet = {30, 15};
        int[] bill = {26, 17};
        int answer = 0;

        int wMax = Math.max(wallet[0], wallet[1]);
        int wMin = Math.min(wallet[0], wallet[1]);

        while (Math.max(bill[0], bill[1]) > wMax || Math.min(bill[0], bill[1]) > wMin) {
            if (bill[0] > bill[1]) {
                bill[0] /= 2;
            } else {
                bill[1] /= 2;
            }

            answer++;
        }
        System.out.println(answer);
    }
}
