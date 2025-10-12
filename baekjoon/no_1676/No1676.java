package no_1676;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
문제 : 팩토리얼 0의 개수
- N!(팩토리얼)의 결과값에서 뒤에서부터 처음 0이 아닌 숫자가 나올 때까지 0의 개수를 구하기

- 0은 “10”이 곱해질 때 생긴다.
- 10은 2 × 5 이므로, 팩토리얼에서 2와 5의 쌍이 생길 때마다 0이 추가됨.
- 하지만 팩토리얼에는 2가 훨씬 많기 때문에, 결국 “5의 개수”가 0의 개수를 결정한다.


알고리즘 / 로직 순서
1. 입력값 N을 받는다.
2. cnt = 0으로 초기화한다.
3. while (N >= 5) 반복:
- cnt += N / 5; → 현재 단계의 5 배수 개수 더하기
- N /= 5; → 다음 단계(25, 125, …)로 진행
4. 반복 종료 후 cnt 출력

시간 복잡도
- O(log₅ N) (5로 계속 나누기 때문에 반복 횟수는 매우 작음)

공간 복잡도
- O(1) (변수 몇 개만 사용)
*/
public class No1676 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;

        while (N >= 5){
            cnt += N / 5;
            N /= 5;
        }
        System.out.println(cnt);
    }
}