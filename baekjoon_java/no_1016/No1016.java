package no_1016;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
문제-1016 (골드1): 제곱수 ㄴㄴ
- 어떤 수 X가 있다면, 그 수가 2² = 4, 3² = 9, 4² = 16, ...
  이런 1보다 큰 수의 제곱으로 나누어지지 않는다면, 그 수는 제곱ㄴㄴ수
ex) 6: 6은 4(2²), 9(3²), 16(4²) 등으로 나누어 떨어지지 않는다 (제곱수 ㄴㄴ수 )
ex) 18: 9(3²)로 나누어 떨어진다 (제곱ㄴㄴ수가 아님)

주요 메서드 및 알고리즘
- `((min + pow - 1) / pow) * pow` : + pow - 1은 정수 나눗셈에서 올림(ceil) 처리
min = 10
pow = 4

((10 + 4 - 1) / 4) = (13 / 4) = 3
start = 3 * 4 = 12 → ✔ 올바른 결과

- `isNot[(int)(j - min)] = true;` : j가 제곱수로 나누어지는 수이므로, 해당 인덱스를 true로 마킹해서 제곱 ㄴㄴ 수가 아님을 표시
min = 10, max = 20
pow = 4 (즉, 2²)
pow의 배수 중에서 10~20 사이에 있는 수: 12, 16, 20

→ j = 12 , j - min = 2 → `isNotSquareFree[2] = true`
→ j = 16 , j - min = 6 → `isNotSquareFree[6] = true`
→ j = 20 , j - min = 10 → `isNotSquareFree[10] = true`
*/
public class No1016 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] X = br.readLine().split(" ");
        long min = Long.parseLong(X[0]);
        long max = Long.parseLong(X[1]);

        int size = (int)(max - min + 1);
        boolean[] isNot = new boolean[size];

        for(long i = 2; i * i <= max; i ++){
            long pow = i * i;
            // pow의 배수 중 min 이상 max 이하인 시작점 찾기
            long start = ((min + pow - 1) / pow) * pow;

            for(long j = start; j <= max; j += pow){
                // 제곱수로 나누어지는 수는 제곱 ㄴㄴ 수가 아니므로 true 표시
                isNot[(int)(j - min)] = true;
            }
        }

        int count = 0;
        for (int i = 0; i < size; i++) {
            if (!isNot[i]) count++;
        }

        System.out.println(count);
    }
}
