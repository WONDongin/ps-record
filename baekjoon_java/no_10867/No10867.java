package no_10867;

import java.io.*;
import java.util.*;
import java.util.stream.*;
/*
문제-10867: 중복 빼고 정렬하기
- N개의 정수가 주어질 때, 중복을 제거하고 오름차순으로 정렬하여 출력하는 문제.

주요 메서드

- Arrays.stream() : 배열 → 스트림 변환
- mapToInt() : 문자열 → 정수 변환
- distinct() : 중복 제거
- sorted() : 정렬

주요 알고리즘

- Stream 기반 데이터 처리
- 중복 제거 + 정렬

탐색/처리 흐름

- 입력 문자열을 공백 기준으로 split
- Arrays.stream()으로 스트림 생성
- mapToInt()로 int 변환
- distinct()로 중복 제거
- sorted()로 오름차순 정렬
- toArray()로 배열 반환
- StringBuilder로 결과 출력

핵심 포인트

- Stream을 활용한 간결한 데이터 처리
- distinct()로 중복 제거 가능
- sorted()로 별도 정렬 코드 없이 처리
*/
public class No10867 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .distinct()
                .sorted()
                .toArray();

        StringBuilder sb = new StringBuilder();
        for (int num : arr) {
            sb.append(num).append(" ");
        }

        System.out.println(sb.toString().trim());
    }
}