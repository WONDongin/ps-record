package level2;
/*
문제: 숫자의 표현

문제 요약
- 자연수 n을 연속된 자연수의 합으로 표현하는 방법의 개수를 구한다.
- 자기 자신만 사용하는 경우도 포함한다.

접근 방법
- 투 포인터(슬라이딩 윈도우)를 사용한다.
- start, end를 이용해 연속된 자연수 구간을 표현한다.
- 현재 구간의 합(sum)을 관리하면서 범위를 확장하거나 축소한다.

핵심 아이디어
- sum이 n보다 작으면 end를 증가시켜 구간을 확장한다.
- sum이 n보다 크면 start를 증가시켜 구간을 축소한다.
- sum이 n과 같으면 answer를 증가시키고 다음 경우를 탐색한다.
- 연속된 자연수의 합을 매번 다시 계산하지 않고 sum으로 관리하여 효율적으로 해결한다.

주의할 점
- n 자기 자신도 하나의 경우로 포함해야 한다.
- sum == n인 경우 정답을 증가시킨 뒤에도 다음 경우를 탐색해야 한다.
- 구간 합을 매번 계산하면 비효율적이므로 누적 합(sum)을 사용한다.

배운 점
- 투 포인터는 연속된 구간의 합을 구하는 문제에서 매우 유용하다.
- 구간을 늘릴지 줄일지 조건에 따라 결정하면 모든 경우를 효율적으로 탐색할 수 있다.
*/
public class No9 {
    public static void main(String[] args) {
        int n = 15;
        int start = 1;
        int end = 1;
        int sum = 1;
        int result = 0;

        while (start <= n){
            if(sum == n){
                result++;
                sum -= start;
                start++;
            } else if (sum < n) {
                end++;
                sum += end;
            } else {
                sum -= start;
                start++;
            }
        }

        System.out.println(result);
    }
}
