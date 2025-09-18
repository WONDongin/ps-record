package no_2739;

import java.util.Scanner;
// 문제 : 구구단
// 출력 : 출력형식과 같게 N*1부터 N*9까지 출력
public class No2739 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for(int i = 1; i <= 9; i++){
            System.out.printf("%d * %d = %d \n",a, i, a*i);
        }
    }
}
