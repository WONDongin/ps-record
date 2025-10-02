package no_2839;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// 문제 : 설탕 배달
/*
3kg / 5kg 봉지
상근이가 배달하는 봉지의 최소 개수를 출력한다.
만약, 정확하게 N킬로그램을 만들 수 없다면 -1을 출력
*/
public class No2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;

        while (true){
            if(N % 5 == 0){
                cnt += N / 5;
                System.out.println(cnt);
                break;
            }
            N -= 3;
            cnt++;

            if(N < 0){
                System.out.println(-1);
                break;
            }
        }
    }
}
