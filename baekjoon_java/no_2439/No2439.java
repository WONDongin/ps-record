package no_2439;

import java.util.Scanner;
// 별찍기
public class No2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            // 공백 출력
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // 별 출력
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            // 줄바꿈
            System.out.println();
        }
    }
}
