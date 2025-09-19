package no_15552;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// 문제 : 빠른 A+B
// BufferedReader와 BufferedWriter 사용하여 출력
public class No15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 테스트 케이스 갯수(문자열 )
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < t; i++){
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            sb.append(a + b).append('\n');
        }
        System.out.println(sb);
    }
}