package no_13301;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
문제-13301 (실버5): 타일 장식물
- 정사각형 타일을 이어 붙여 도형을 만든다
- 타일 변의 길이는 피보나치 수열 형태로 증가
- 최종 도형의 둘레를 구하는 문제

접근 방법
- 타일의 변 길이는 피보나치 수열을 따른다
- N번째 도형의 가로와 세로는 각각
  - F(N), F(N+1) 형태로 구성됨
- 따라서 둘레는 2 * (가로 + 세로)

핵심 아이디어
- 피보나치 수열을 이용하여 변 길이를 구함
- 공간 최적화를 위해 배열 대신 변수 2개만 사용
- a = 이전 값, b = 현재 값 형태로 진행

처리 흐름
- 입력
- a=1, b=1 초기화
- 반복문으로 피보나치 계산
  → temp = a + b
  → a = b
  → b = temp
- 최종 둘레 = 2 * (a + b)
- 출력
*/
public class No13301 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        long a = 1;
        long b = 1;

        for(int i = 2; i <= N; i++){
            long temp = a + b;
            a = b;
            b = temp;
        }

        System.out.println(2 * (a + b));
    }
}
