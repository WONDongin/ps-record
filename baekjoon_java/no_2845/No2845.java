package no_2845;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
문제-2845 (브론즈4): 파티가 끝나고 난 뒤
- 신문 기사에 실린 사람 수와 실제 파티장 면적(L × P) 기준 인원 수의 차이 출력

주요 메서드

`BufferedReader`
- 표준 입력을 빠르게 처리하기 위해 사용

`StringTokenizer`
- 한 줄에 여러 개의 정수를 공백 기준으로 분리

`StringBuilder`
- 결과 문자열을 효율적으로 누적 후 한 번에 출력

핵심 로직

- 면적당 인원 수 계산 : `int num = L * P;`
- 기사 인원 수와의 차이 계산: 문제 요구사항에 맞게 차이값(음수 가능) 출력 `기사 인원 - 실제 인원`
- 반복 처리 : 기사 인원 수는 항상 5개 → `for` 문으로 처리
*/
public class No2845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        int L = Integer.parseInt(str.nextToken());
        int P = Integer.parseInt(str.nextToken());
        int num  = L * P;

        StringBuilder sb = new StringBuilder();
        StringTokenizer str2 = new StringTokenizer(br.readLine());
        for(int i = 0; i < 5; i++){
            sb.append(Integer.parseInt(str2.nextToken()) - num).append(" ");
        }

        System.out.println(sb);
    }
}
