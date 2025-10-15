package level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
문제 : x만큼 간격이 있는 n개의 숫자
정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴

제한조건
- x는 -10000000 이상, 10000000 이하인 정수입니다.
- n은 1000 이하인 자연수입니다.
*/
public class No7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long x = Long.parseLong(br.readLine());
        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            System.out.println(x * i);
        }
    }
}