package no_2057;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
문제-2057: 팩토리얼 분해
- 주어진 정수 N을 서로 다른 팩토리얼들의 합으로 표현할 수 있는지 판별하는 문제.

주요 메서드
- 팩토리얼 배열 미리 생성
- 큰 값부터 차례대로 차감

주요 알고리즘
- 그리디 (Greedy)
- 큰 팩토리얼부터 한 번씩만 사용

탐색/처리 흐름
1. 1! ~ 20! 미리 계산
2. 20! → 1! 순으로 확인
3. N >= fact[i] 이면 한 번 빼기
4. 최종적으로 N == 0 이면 YES, 아니면 NO

핵심 포인트
- long 사용
- 같은 팩토리얼은 한 번만 사용
- 시간복잡도 O(20) → 사실상 O(1)
*/
public class No2057 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());
        long[] fact = new long[21];

        if (N == 0) {
            System.out.println("NO");
            return;
        }


        fact[0] = 1L;

        for(int i = 1; i <= 20; i++){
            fact[i] = fact[i - 1] * i;
        }

        for(int j = 20; j >= 1; j--){
            if(N >= fact[j]){
                N -= fact[j];
            }
        }

        if(N == 0){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
