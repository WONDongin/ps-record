package no_1181;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
// 문제 : 단어 정렬
/*
알파벳 소문자로 이루어진 N개의 단어가 들어오면
아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오.
- 길이가 짧은 것부터
- 길이가 같으면 사전 순으로
- 단, 중복된 단어는 하나만 남기고 제거
*/
public class No1181 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 단어 갯수
        int N = Integer.parseInt(br.readLine());
        // 중복제거 + 자동 정렬
        Set<String> set = new TreeSet<>(
                // 짧은 단어순(String::length)
                Comparator.comparingInt(String::length)
                        // 길이 같으면 사전순(Comparator.naturalOrder())
                        .thenComparing(Comparator.naturalOrder())
        );

        for (int i = 0; i < N; i++) set.add(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (String w : set) sb.append(w).append('\n');
        // 출력
        System.out.print(sb.toString());
    }
}
