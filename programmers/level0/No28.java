package level0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// 문제 : 서비스
public class No28 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());
        int service = n / 10;

        System.out.println(n * 12000 + k * 2000 - service * 2000);
    }
}
