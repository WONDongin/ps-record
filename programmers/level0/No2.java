package level0;

import java.util.Scanner;
/*
문제 : 문자열 str과 정수 n이 주어집니다.
str이 n번 반복된 문자열을 만들어 출력하는 코드를 작성해 보세요.

제한사항 :
1 ≤ str의 길이 ≤ 10
1 ≤ n ≤ 5
*/
public class No2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 문자열과 반복횟수 입력받기
        String str = sc.next();
        int n = sc.nextInt();

        // 문자열 반복 출력
        if (str.length() >= 1 && str.length() <= 10 && n >= 1 && n <= 5) {
            System.out.print(str.repeat(n));
        }
        sc.close();
    }
}
