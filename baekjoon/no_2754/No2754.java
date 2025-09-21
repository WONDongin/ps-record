package no_2754;

import java.util.Scanner;

public class No2754 {
    public static void main(String[] args) {
        // Scanner 객체를 사용하여 사용자로부터 성적 입력 받기
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.nextLine();
        
        // 성적에 따른 평점 계산
        double point;
        switch (grade) {
            case "A+":
                point = 4.3;
                break;
            case "A0":
                point = 4.0;
                break;
            case "A-":
                point = 3.7;
                break;
            case "B+":
                point = 3.3;
                break;
            case "B0":
                point = 3.0;
                break;
            case "B-":
                point = 2.7;
                break;
            case "C+":
                point = 2.3;
                break;
            case "C0":
                point = 2.0;
                break;
            case "C-":
                point = 1.7;
                break;
            case "D+":
                point = 1.3;
                break;
            case "D0":
                point = 1.0;
                break;
            case "D-":
                point = 0.7;
                break;
            case "F":
                point = 0.0;
                break;
            default:
                point = -1;  // 잘못된 성적이 입력된 경우
                break;
        }
        
        // 잘못된 성적이 입력되었을 경우 처리
        if (point == -1) {
            System.out.println("잘못된 성적 입력");
        } else {
            System.out.printf("%.1f\n", point);
        }
        
        scanner.close();
    }
}
