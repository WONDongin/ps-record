package no_5341;

import java.util.Scanner;
/*
문제-5341: Pyramids

[문제 요약]
- 정수 N이 주어짐
- 1부터 N까지의 합을 출력
- N이 0이면 종료

[접근 방법]
- while(true) 반복문으로 입력 처리
- N이 0이면 종료
- 1부터 N까지 합을 구해서 출력

[핵심 아이디어]
- 등차수열 합 공식 사용 가능
  → N * (N + 1) / 2
- 반복문 없이 계산 가능

[처리 흐름]
입력 → 종료 조건 확인 → 합 계산 → 출력 반복

[시간복잡도]
- O(1)
*/
public class No5341 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        while (true){
            int N = sc.nextInt();

            if(N == 0) break;
            sb.append(N * (N + 1) / 2).append("\n");
        }

        System.out.println(sb);
    }
}
