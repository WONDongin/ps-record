package no_11576;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
/*
문제-11576 (브론즈1): Base Conversion
- A진법 수가 자릿수 형태로 주어진다
- 이를 B진법 수로 변환해 출력하는 문제

접근 방법
- 먼저 A진법 수를 10진수로 변환
- 변환된 10진수를 다시 B진법으로 변환
- B진법 변환 과정에서 나온 나머지를 뒤집어서 출력

핵심 아이디어
- A진법 → 10진법 변환은 누적 방식 사용
  = value * A + digit
- 10진법 → B진법 변환은 나눗셈/나머지 방식 사용
- 나머지는 역순으로 구해지므로 스택처럼 뒤에서부터 출력해야 함

처리 흐름
- 입력
- A, B 입력
- 자릿수 개수 m 입력
- A진법 수를 10진수로 변환
- 10진수를 B진법으로 변환하며 나머지 저장
- 역순 출력
*/
public class No11576 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int m = Integer.parseInt(br.readLine());

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int decimal = 0;

        for (int i = 0; i < m; i++) {
            int digit = Integer.parseInt(st2.nextToken());
            decimal = decimal * A + digit;
        }

        ArrayList<Integer> result = new ArrayList<>();

        while (decimal > 0) {
            result.add(decimal % B);
            decimal /= B;
        }

        for (int i = result.size() - 1; i >= 0; i--) {
            System.out.print(result.get(i) + " ");
        }
    }
}