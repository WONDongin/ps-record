package no_1251;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
문제-1251 (실버5): 단어 나누기
단어 : arrested
- 세 단어로 나누기 : ar / rest / ed
- 각각 뒤집기 : ra / tser / de
- 합치기 : ratserde
단어가 주어지면, 이렇게 만들 수 있는 단어 중에서 사전순으로 가장 앞서는 단어를 출력하는 프로그램을 작성

문제 요약

- 하나의 문자열이 주어짐
- 문자열을 3개의 부분으로 나눈 뒤
- 각 부분을 뒤집어서 이어붙인 문자열 중
- 사전순으로 가장 앞서는 문자열을 출력

핵심 조건

- 문자열은 반드시 3조각
- 각 조각은 최소 1글자 이상
*/

public class No1251 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int len = s.length();

        // 사전순 최솟값 저장 변수
        // '~'는 소문자 알파벳보다 사전순으로 뒤에 오므로 초기값으로 적합
        String answer = "~";

        // 문자열을 나눌 두 지점 i, j 탐색
        for (int i = 1; i <= len - 2; i++) {
            for (int j = i + 1; j <= len - 1; j++) {

                // 문자열 3조각 분리
                String a = s.substring(0, i);
                String b = s.substring(i, j);
                String c = s.substring(j);

                // 각 조각 뒤집기
                String ra = new StringBuilder(a).reverse().toString();
                String rb = new StringBuilder(b).reverse().toString();
                String rc = new StringBuilder(c).reverse().toString();

                // 뒤집은 문자열 합치기
                String candidate = ra + rb + rc;

                // 사전순 비교 후 최솟값 갱신
                if (candidate.compareTo(answer) < 0) {
                    answer = candidate;
                }
            }
        }

        // 결과 출력
        System.out.println(answer);
    }
}
