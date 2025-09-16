package level0;

import java.util.Scanner;
// 문제 : 문자열을 시계방향으로 90도 돌려서 아래 입출력 예와 같이 출력하는 코드를 작성
/*
abc
a
b
c
*/
public class No12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        for(int i = 0; i < a.length(); i++){
            System.out.println(a.charAt(i));
        }
    }
}
