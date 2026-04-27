package no_15680;

import java.util.Scanner;
/*
문제-15680: 연세대학교

[문제 요약]
- 정수 N이 주어짐 (0 또는 1)
- N이 0이면 "YONSEI" 출력
- N이 1이면 "Leading the Way to the Future" 출력

[접근 방법]
- 입력값에 따라 조건문으로 문자열 분기

[핵심 아이디어]
- 단순 조건 분기 문제
- if문 하나로 해결 가능

[처리 흐름]
입력 → 조건 분기 → 문자열 출력

[시간복잡도]
- O(1)
*/
public class No15680 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n == 0){
            System.out.println("YONSEI");
        } else {
            System.out.println("Leading the Way to the Future");
        }
    }
}
