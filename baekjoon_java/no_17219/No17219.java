package no_17219;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
문제 : 문자열 섞기
- 두 문자열의 각 문자가 앞에서부터 서로 번갈아가면서 한 번씩 등장하는 문자열을 만들어 return 하는 solution 함수를 완성

주요 메서드 및 알고리즘
- `StringBuilder` : 객체 $sb$를 생성하여 결과를 저장할 공간을 마련
- `sb.append(value)` : i번째 문자를 추가

*X·챗GPT 등 대규모 접속 오류···클라우드플레어 장애 발생
*/
public class No17219 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String str1 = "aaaaa";
        String str2 = "bbbbb";

//        if(str.equals("joonas")){
//            System.out.println("joonas" + "??!");
//        } else if (str.equals("baekjoon")) {
//            System.out.println("baekjoon" + "??!");
//        }
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < str1.length(); i++){
            sb.append(str1.charAt(i));
            sb.append(str2.charAt(i));
        }
        System.out.println(sb);
    }
}
