package no_4153;

import java.util.Arrays;
import java.util.Scanner;
// 문제 : 직각삼각형
// 출력 : 각 입력에 대해 직각 삼각형이 맞다면 "right", 아니라면 "wrong"을 출력
public class No4153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            String num = sc.nextLine();
            String[] arr = num.split(" ");

            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            int c = Integer.parseInt(arr[2]);
            // 0 0 0 입력 시 종료
            if(a == 0 && b == 0 && c == 0) break;
            // int 배열생성 및 정렬
            int[] sides = {a, b, c};
            Arrays.sort(sides);

            // 피타고라스 정리 검사
            if (sides[0]*sides[0] + sides[1]*sides[1] == sides[2]*sides[2]) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
        sc.close();
    }
}
