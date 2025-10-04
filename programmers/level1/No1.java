package level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// 문제 : 자릿수 더하기
/* 
자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return
예를들어 N = 123이면 1 + 2 + 3 = 6을 return
*/
public class No1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 한 줄 전체 입력 (예: "123")
        String str = br.readLine();
        int answer = 0;

        for (int i = 0; i < str.length(); i++) {
            // 각 자리 숫자로 변환 후 더하기
            answer += str.charAt(i) - '0';
        }

        System.out.println(answer);
    }
}
