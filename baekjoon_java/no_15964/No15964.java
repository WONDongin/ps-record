package no_15964;

import java.util.Scanner;
/*
try (Scanner sc = new Scanner(System.in)) {..}
- 자바 7부터 도입된 문법
- 괄호 ( ... ) 안에 작성된 객체(Scanner, BufferedReader, FileInputStream 등)는 자동으로 닫힘(close 호출)
- try 블록이 끝나면 finally 구문 없이도 sc.close()가 실행됨
*/
public class No15964 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            System.out.println((a + b) * (a - b));
        }
    }
}