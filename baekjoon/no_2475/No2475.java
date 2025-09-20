package no_2475;

import java.util.Scanner;
// 문제 : 검증수를 출력
/*
예를 들어 고유번호의 처음 5자리의 숫자들이 04256이면,
각 숫자를 제곱한 수들의 합 0+16+4+25+36 = 81 을
10으로 나눈 나머지인 1이 검증수
*/
public class No2475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 사용자로부터 한 줄 입력받고, 공백 기준으로 나누어 문자열 배열로 저장
        String[] input = sc.nextLine().split(" ");
        int sum = 0;

        // 배열의 각 요소(문자열 숫자)를 정수로 변환하고 제곱하여 누적
        for (String numStr : input) {
            int num = Integer.parseInt(numStr); // 문자열을 정수로 변환
            sum += num * num;
        }

        // 누적 합을 10으로 나눈 나머지를 출력 (검증 수)
        System.out.println(sum % 10);
    }
}