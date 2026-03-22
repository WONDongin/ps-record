package no_9093;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
문제-9093: 단어 뒤집기
- 여러 줄의 문자열이 주어질 때, 각 줄마다 단어 단위로 뒤집어 출력하는 문제

주요 메서드
- String.split(" ") → 단어 분리
- StringBuilder.reverse() → 문자열 뒤집기

주요 알고리즘
- 문자열 처리 (String Manipulation)

탐색/처리 흐름
1. 테스트 케이스 T 입력
2. 각 줄 문자열 입력
3. 공백 기준으로 단어 분리
4. 각 단어를 StringBuilder.reverse()로 뒤집기
5. 뒤집은 단어를 공백으로 이어 출력

핵심 포인트
- 문장 전체가 아니라 "단어 단위"로 뒤집기
- split 후 reverse 하는 것이 가장 간단
*/
public class No9093 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder result = new StringBuilder();

        while (T-- > 0) {
            String[] words = br.readLine().split(" ");

            for (String word : words) {
                StringBuilder sb = new StringBuilder(word);
                result.append(sb.reverse()).append(" ");
            }
            result.append("\n");
        }

        System.out.print(result);
    }
}