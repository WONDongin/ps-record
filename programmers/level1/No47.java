package level1;
/*
문제: 132267 콜라 문제

문제 요약
- 빈 병 a개를 가져다주면 콜라 b병을 받을 수 있다.
- 빈 병 n개로 받을 수 있는 총 콜라 수를 구한다.

접근 방법
- 교환 가능한 동안 반복 수행
- 교환 횟수(n / a) 계산
- 획득한 콜라 수 누적
- 남은 빈 병 수 갱신

핵심 아이디어
- 받은 콜라는 모두 마신다고 가정
- 교환 후 빈 병 수 = 받은 콜라 수 + 남은 빈 병 수

주의할 점
- n = exchange + (n % a) 는 b가 1일 때만 동작
- n = (exchange * b) + (n % a) 로 계산해야 함

배운 점
- 시뮬레이션 문제는 실제 과정을 그대로 구현하면 해결 가능
*/
public class No47 {
    public static void main(String[] args) {
        int a = 2;
        int b = 1;
        int n = 20;
        int answer = 0;

        while (n >= a){
            int exchange = n / a;
            answer += exchange * b;
            n = (exchange * b) + (n % a);
        }

        System.out.println(answer);
    }
}
