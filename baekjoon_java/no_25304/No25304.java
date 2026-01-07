package no_25304;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
문제-25304 (브론즈4): 영수증
- 구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하면 Yes를 출력한다. 일치하지 않는다면 No를 출력

주요 메서드

`BufferedReader.readLine()`
- 총 금액, 물건 개수, 각 물건의 가격 개수를 한 줄씩 입력받기 위한 메서드

`StringTokenizer`
- 한 줄에 입력된 "가격 개수"를 공백 기준으로 분리
- 가격과 수량을 각각 정수로 변환하기 위함

Integer.parseInt()
- 문자열 형태의 입력 값을 정수형으로 변환
- 계산을 위한 필수 처리

삼항 연산자 (조건 ? 참 : 거짓)
- 계산 결과와 영수증 금액 비교 후 "Yes" 또는 "No"를 간결하게 출력

주요 알고리즘

1. 입력 처리
- 첫 줄에서 영수증에 적힌 총 금액 result 입력
- 두 번째 줄에서 구매한 물건 개수 n 입력

2. 누적 합 계산
- n번 반복하며 각 물건의 가격 × 개수를 계산, 결과를 sum 변수에 누적

3. 검증 조건
- 모든 물건의 합계 sum과 영수증 금액 result 비교 `result == sum`

4. 결과 출력
- 조건이 참이면 "Yes", 거짓이면 "No" 출력
*/
public class No25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int sum = 0;

        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int price = Integer.parseInt(st.nextToken());
            int cnt = Integer.parseInt(st.nextToken());
            sum += price * cnt;
        }

        System.out.println(result == sum ? "Yes" : "No");
    }
}
