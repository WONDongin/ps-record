package level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
문제-하샤드 수 (Level 1)

[문제 요약]
- 정수 N이 주어질 때, 각 자릿수의 합으로 N이 나누어 떨어지는지 확인
- 나누어 떨어지면 true, 아니면 false 출력

[접근 방법]
- 입력값 N을 temp 변수에 복사
- while문을 통해 각 자릿수를 분리하여 합(sum) 계산
- 원래 값 N을 sum으로 나누어 떨어지는지 검사

[핵심 아이디어]
- temp % 10 → 마지막 자릿수 추출
- temp /= 10 → 자릿수 제거
- 모든 자릿수 합을 구한 뒤 나눗셈으로 판별

[처리 흐름]
입력 → 자릿수 합 계산 → 나누어 떨어지는지 확인 → 결과 출력

[시간복잡도]
- O(log N) (자릿수 개수만큼 반복)
*/
public class No13 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        int temp = N;

        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        System.out.println(N % sum == 0 ? "true" : "false");
    }
}
