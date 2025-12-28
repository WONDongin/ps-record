package no_1271;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;
/*
문제-1271 (브론즈5): 엄청난 부자2
- 입력: n m (아주 큰 정수)
- 출력: n / m(몫), n % m(나머지) 를 각각 한 줄씩
*/
public class No1271 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        BigInteger n = new BigInteger(st.nextToken());
        BigInteger m = new BigInteger(st.nextToken());

        System.out.println(n.divide(m));
        System.out.println(n.remainder(m));
    }
}
