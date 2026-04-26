package no_25314;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
문제-25314: 코딩은 체육과목 입니다

[문제 요약]
- N이 주어짐 (4의 배수)
- int는 4바이트
- N 바이트를 표현하기 위해 필요한 자료형 출력
- long을 N/4번 출력 후 int 출력

[접근 방법]
- N / 4 계산
- 반복문으로 "long " 출력
- 마지막에 "int" 붙이기

[핵심 아이디어]
- long = 4바이트
- 필요한 개수 = N / 4
- 문자열 누적 후 출력

[처리 흐름]
입력 → N / 4 계산 → long 반복 출력 → int 출력 → 결과 출력

[시간복잡도]
- O(N/4) ≈ O(N)

*/
public class No25314 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result = N / 4;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < result; i++){
            sb.append("long").append(" ");
        }
        sb.append("int");

        System.out.println(sb);
    }
}
