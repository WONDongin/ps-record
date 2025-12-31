package no_1002;

import java.util.Scanner;
/*
문제-1002 (실버3): 터렛
- 각 테스트 케이스마다 류재명이 있을 수 있는 위치의 수를 출력한다.
- 만약 류재명이 있을 수 있는 위치의 개수가 무한대일 경우에는 -1 출력한다.
*/
public class No1002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // 테스트 케이스 수

        for (int i = 0; i < T; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int r1 = sc.nextInt();

            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int r2 = sc.nextInt();

            int dx = x2 - x1;
            int dy = y2 - y1;
            double d = Math.sqrt(dx * dx + dy * dy); // 두 점 사이 거리

            if (d == 0 && r1 == r2) {
                System.out.println(-1); // 무한히 많은 점에서 만남
            } else if (d > r1 + r2 || d < Math.abs(r1 - r2)) {
                System.out.println(0); // 만나지 않음
            } else if (d == r1 + r2 || d == Math.abs(r1 - r2)) {
                System.out.println(1); // 한 점에서 만남
            } else {
                System.out.println(2); // 두 점에서 만남
            }
        }

        sc.close();
    }
}
