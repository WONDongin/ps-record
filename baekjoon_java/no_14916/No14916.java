package no_14916;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
문제-14916 (실버5): 거스름돈
- 2원과 5원 동전을 사용하여 n원을 만들 때
- 동전의 최소 개수를 구하는 문제.
- 만들 수 없으면 -1 출력.

[주요 메서드]

- `n / 5` : 5원 최대 사용
- `n % 5` : 남은 금액 계산
- `while (coin >= 0)`
- `n % 2 == 0`

[주요 알고리즘]

그리디(Greedy)

[탐색/처리 흐름]

1. 5원을 최대한 사용
2. 남은 금액이 2원으로 나누어 떨어지는지 확인
3. 안되면 5원을 하나 줄이고 남은 금액 +5
4. coin < 0 되면 -1
*/
public class No14916 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n  = Integer.parseInt(br.readLine());
        int coin = n / 5;
        int result = 0;

        n = n % 5;

        while (coin >= 0){
            if(n % 2 == 0){
                result = coin + (n / 2);
                break;
            }
            coin--;
            n += 5;
        }
        if (coin < 0) {
            System.out.println(-1);
        } else {
            System.out.println(result);
        }
    }
}
