package no_10757;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;
/*
문제-10757 (브로즌5): 큰 수 A+B
- 첫째 줄에 A+B를 출력
- 첫째 줄에 A와 B가 주어진다. (0 < A,B < 1010000)
*/
public class No10757 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());

        BigInteger a = new BigInteger(str.nextToken());
        BigInteger b = new BigInteger(str.nextToken());

        BigInteger add = a.add(b);

        System.out.println(add);
    }
}
