package no_1009;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
문제-1009 (브론즈2): 분산처리
- a의 일의 자리만 보면 됨: a %= 10
- a^b의 일의 자리 = a^(b%4)의 일의 자리(0이면 4)
- 결과가 0이면 문제 규칙상 10 출력
*/
public class No1009 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine().trim());
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int base = a % 10;

            // 지수의 반복 주기: 4
            int exp = b % 4;
            if (exp == 0) exp = 4;

            int last = 1;
            for (int k = 0; k < exp; k++) {
                last = (last * base) % 10;
            }

            if (last == 0) last = 10;
            sb.append(last).append('\n');
        }

        System.out.print(sb.toString());
    }
}
