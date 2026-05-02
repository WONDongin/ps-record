package level1;

import java.util.Scanner;
/*
문제-정수 제곱근 판별

[문제 요약]
- 주어진 양의 정수 N이 어떤 정수 X의 제곱인지 판별하는 문제
- 제곱수라면 (X+1)^2을 출력
- 아니라면 -1 출력

[접근 방법]
- Math.sqrt()를 이용해 N의 제곱근을 구함
- long으로 캐스팅하여 정수 부분만 추출
- X * X == N 으로 정확한 제곱수 여부 판별

[핵심 아이디어]
- 제곱수 판별은 "sqrt → 다시 제곱 비교" 방식 사용
- double 오차를 방지하기 위해 반드시 X * X == N 검증 필요

[처리 흐름]
입력 → sqrt(N) 계산 → 정수 캐스팅 → 제곱수 여부 확인 → 결과 출력

[시간복잡도]
- O(1)
*/
public class No14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long X = (long)Math.sqrt(N);

        if(X * X == N){
            System.out.println((X + 1) * (X + 1));
        } else {
            System.out.println(-1);
        }
    }
}
