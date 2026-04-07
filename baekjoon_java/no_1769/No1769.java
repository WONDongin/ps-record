package no_1769;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
문제-1769 (실버5): 3의 배수
- 숫자 X가 주어진다 (자릿수 매우 큼)
- 각 자리 숫자의 합을 반복하여 한 자리 수가 될 때까지 진행
- 이 과정의 횟수를 출력
- 최종 숫자가 3의 배수인지 판별

접근 방법
- 숫자를 문자열(String)로 입력받아 처리
- while문을 이용해 길이가 1이 될 때까지 반복
- 각 자리 숫자를 더한 값을 다시 문자열로 변환
- 반복 횟수 카운트

핵심 아이디어
- 각 자리수 합을 반복하면 결국 한 자리 수로 수렴 (디지털 루트)
- 최종 값이 3으로 나누어 떨어지면 3의 배수
- 큰 수이므로 숫자 타입이 아닌 문자열 처리 필수

처리 흐름
- 입력 (String)
→ while (길이 > 1)
    → 각 자리수 합 계산
    → 문자열로 변환
    → count++
→ count 출력
→ 마지막 값 % 3 == 0 판단
→ YES / NO 출력
*/
public class No1769 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String X = br.readLine();
        int cnt = 0;

        while (X.length() > 1){
            int sum = 0;

            for(int i = 0; i < X.length(); i++){
                sum += X.charAt(i) - '0';
            }

            X = String.valueOf(sum);
            cnt++;
        }

        System.out.println(cnt);

        int num = Integer.parseInt(X);

        System.out.println(num % 3 == 0 ? "YES" : "NO");
    }
}
