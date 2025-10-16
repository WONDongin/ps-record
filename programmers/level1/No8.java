package level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
문제 :  문자열 s를 숫자로 변환한 결과를 반환하는 함수, solution을 완성
*/
public class No8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println(Integer.parseInt(s));
    }
}
