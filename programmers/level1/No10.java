package level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
/*
문제 : a, b 사이의 모든수의 합

가우스의 합 공식 활용
합 =((end−start+1)×(start+end)) / 2
*/
public class No10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        int start = Math.min(a, b);
        int end = Math.max(a, b);

        System.out.print((end - start +1) * (start + end) / 2);
    }
}
