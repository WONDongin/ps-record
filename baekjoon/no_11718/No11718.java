package no_11718;

import java.util.Scanner;
// 문제 : 그대로 출력하기
// 출력 : 입력받은 그대로 출력한다.
public class No11718 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // sc.hasNextLine() → 입력이 남아 있는지 확인
        // 종료 조건: EOF (입력 끝날 때까지) : Ctrl + D (또는 Ctrl + Z)
        // Process finished with exit code 0 : 오류없이 종료됨
        while (sc.hasNextLine()){
            String input = sc.nextLine();
            System.out.println(input);
        }
    }
}
