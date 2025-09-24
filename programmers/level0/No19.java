package level0;

import java.util.Scanner;
/*
문제 : 주어진 코드는 각도를 나타내는 두 정수 angle1과 angle2가 주어질 때,
이 두 각의 합을 0도 이상 360도 미만으로 출력하는 코드입니다.
코드가 올바르게 작동하도록 한 줄을 수정해 주세요.
*/
public class No19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angle1 = sc.nextInt();
        int angle2 = sc.nextInt();
        // 수정
        int sum_angle = (angle1 + angle2) % 360;
        System.out.println(sum_angle);
    }
}
