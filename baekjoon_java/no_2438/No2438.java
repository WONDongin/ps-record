package no_2438;

import java.util.Scanner;
// 문제 : 별찍기
// 출력 : 첫째 줄부터 N번째 줄까지 차례대로 별을 출력
public class No2438 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();

        for(int i= 0; i < a; i++){
            for(int j = 0; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}