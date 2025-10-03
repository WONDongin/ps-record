package level0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 : 나이 출력
public class No26 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int age = br.read();
        int nowAge = 2022 - age + 1;
        System.out.println(nowAge);
    }
}
