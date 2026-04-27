package no_5717;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
문제-5717: 상근이의 친구들

[문제 요약]
- 두 정수 A, B 입력
- 각 줄마다 A + B 출력
- "0 0" 입력 시 종료

[접근 방법]
- while(true) 반복문으로 입력 처리
- StringTokenizer로 두 수 분리
- StringBuilder로 결과 저장

[핵심 아이디어]
- 종료 조건: (0, 0)
- 출력 최적화를 위해 StringBuilder 사용

[처리 흐름]
입력 → 파싱 → 합 계산 → 저장 → 종료 시 출력

[시간복잡도]
- O(N)
 */
public class No5717 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());

            if (num1 == 0 && num2 == 0){
                break;
            }

            sb.append(num1 + num2).append("\n");
        }

        System.out.println(sb);
    }
}
