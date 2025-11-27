package no_1003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
문제-1003 (실버3): 피보나치 함수
- 각 테스트 케이스마다 0이 출력되는 횟수와 1이 출력되는 횟수를 공백으로 구분해서 출력

주요 메서드
- `zero[n]` : fibonacci(n)을 호출했을 때 0이 출력되는 횟수
- `one[n]` : fibonacci(n)을 호출했을 때 1이 출력되는 횟수
- N의 최대값이 40이므로 크기를 41로 선언 (0 ~ 40)

```
int[] zero = new int[41];
int[] one = new int[41];

zero[0] = 1;  one[0] = 0;
zero[1] = 0;  one[1] = 1;
```

주요 알고리즘

- DP 점화식 : n = 2부터 40까지 반복문으로 누적 계산
```
zero[n] = zero[n-1] + zero[n-2]
one[n]  = one[n-1]  + one[n-2]
```
*/
public class No1003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        int[] zero = new int[41];
        int[] one = new int[41];

        zero[0] = 1;  one[0] = 0;
        zero[1] = 0;  one[1] = 1;

        for(int i = 2; i < 41; i++){
            zero[i] = zero[i-1] + zero[i-2];
            one[i] = one[i-1] + one[i-2];
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < T; i++){
            int N = Integer.parseInt(br.readLine());
            sb.append(zero[N]).append(" ").append(one[N]).append("\n");
        }

        System.out.println(sb);
    }
}
