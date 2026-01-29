package no_1001;

import java.util.Scanner;
/*
문제 : 두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.
출력 : 첫째 줄에 A-B를 출력한다.
*/
public class No1001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.println(A - B);

//        int balance = 0;
//
//        while (true) {
//            System.out.println("-----------------------------------");
//            System.out.println("1. 입금 | 2. 출금 | 3. 잔액확인 |4.종료");
//            System.out.println("-----------------------------------");
//            System.out.print("선택:");
//            int num = sc.nextInt();
//
//            if(num == 1){
//                System.out.print("입금액을 입력하세요.: ");
//                int amount = sc.nextInt();
//                balance = deposit(balance, amount);
//                System.out.println(amount + "원을 입금하였습니다. 현재 잔액: " + balance);
//            }else if (num == 2){
//                System.out.print("출금액을 입력하세요.: ");
//                int amount = sc.nextInt();
//                balance = withdrew(balance, amount);
//            }else if (num == 3){
//                System.out.println("현재 잔액: " + balance);
//            }else if (num == 4){
//                System.out.println("시스템을 종료합니다.");
//                break;
//            }else{
//                System.out.println("잘못 입력한 값 입니다.");
//            }
//        }
    }
//    //입금
//    public static int deposit(int balance, int amount){
//        balance += amount;
//        return balance;
//    }
//    //출금
//    public static int withdrew(int balance, int amount){
//        if (balance > amount){
//            balance -= amount;
//            System.out.println(amount + "원을 출금하였습니다. 현재 잔액: " + balance);
//        }else{
//            System.out.println(amount + "원을 출금하려 했으나 잔액이 부족합니다.");
//        }
//        return balance;
//    }
}