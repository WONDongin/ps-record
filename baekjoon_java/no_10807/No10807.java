package no_10807;

import java.util.Scanner;
// 문제 : 총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램
public class No10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 정수의 갯수, 갯수에 맞는 배열 생성
        int n = sc.nextInt();
        int[] arr = new int[n];
        // 정수 입력
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        // 찾을 정수 값 입력, 합산 카운트
        int v = sc.nextInt();
        int cnt = 0;
        // 배열 순환 및 확인
        for(int num : arr){
            if(num == v) cnt++;
        }
        // 결과 출력
        System.out.println(cnt);
    }
}
