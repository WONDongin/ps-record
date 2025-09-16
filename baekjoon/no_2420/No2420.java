package no_2420;

import java.util.Scanner;
// 문제 : 첫째 줄에 두 유명도의 차이 (|N-M|)을 출력
// 조건 : 첫째 줄에 두 도메인의 유명도 N과 M이 주어진다. (-2,000,000,000 ≤ N, M ≤ 2,000,000,000)
public class No2420 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        // Math.abs(a-b) : 두수의 차이의 절댓값을 구하는 메서드
        System.out.println(Math.abs(a - b));
    }
}
