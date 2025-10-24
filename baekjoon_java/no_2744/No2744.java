package no_2744;

import java.util.Scanner;
// 문제 : 대소문자 바꾸기
// 영어 소문자와 대문자로 이루어진 단어를 입력받은 뒤, 대문자는 소문자로, 소문자는 대문자로 바꾸어 출력하는 프로그램을 작성
public class No2744 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        // 대,소문자 비교
        for(int i = 0; i < line.length(); i++){
            char ch = line.charAt(i);
            if(Character.isUpperCase(ch)){
                sb.append(Character.toLowerCase(ch));
            }else  {
                sb.append(Character.toUpperCase(ch));
            }
        }
        System.out.println(sb);
        sc.close();
    }
}
