package no_1402;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
문제-1402: 아무래도이문제는A번난이도인것같다
- 여러 연산을 통해 주어진 수 N을 만들 수 있는지 판단하는 문제

주요 메서드
- 입력 테스트케이스 T만큼 반복
- N 값은 읽기만 하고 결과는 항상 동일

주요 알고리즘
- 수학적 성질 (곱셈의 결합법칙)

탐색/처리 흐름
1. 테스트케이스 개수 T 입력
2. T번 반복
3. N 입력
4. 항상 "yes" 출력

핵심 포인트
- 모든 자연수 N은 항상 1 × N 형태로 표현 가능
- 곱셈의 결합법칙 ((a×b)×c = a×(b×c)) 때문에 어떤 수든 다시 만들 수 있음
- 따라서 불가능한 경우가 존재하지 않음
*/
public class No1402 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++){
            br.readLine();
            System.out.println("yes");
        }

    }
}
