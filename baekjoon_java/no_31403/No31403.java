package no_31403;

import java.util.Scanner;
// 문제 : A + B - C
// 출력 : A + B - C , 'A' + 'B' - 'C' = 'AB' - 'C'

public class No31403 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        String sum = Integer.toString(a) +  Integer.toString(b);

        System.out.println(a + b - c);
        System.out.println(Integer.parseInt(sum) - c);
        sc.close();
    }
}
