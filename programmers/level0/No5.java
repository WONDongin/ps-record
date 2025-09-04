package level0;

import java.util.Scanner;
/*
문제 : 문자열 str이 주어질 때, str을 출력하는 코드를 작성해 보세요.

제한사항 :
1 ≤ str의 길이 ≤ 1,000,000
str에는 공백이 없으며, 첫째 줄에 한 줄로만 주어집니다.
*/
public class No5 {
    public static void main(String[] args) {
        final int LEN_INPUT = 1000001;  // 입력 가능한 최대 길이
        Scanner sc = new Scanner(System.in);

        // 문자열 입력받기
        String s1 = sc.next();

        // 제약 조건 검사 (선택)
        if (s1.length() > LEN_INPUT - 1) {
            System.out.println("입력은 최대 1,000,000글자까지 가능합니다.");
            return;
        }

        // 문자열 출력
        System.out.println(s1);
        sc.close();
    }
}
