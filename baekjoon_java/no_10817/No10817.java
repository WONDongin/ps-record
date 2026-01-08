package no_10817;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
/*
문제-10817 (브론즈4): 세수
- 세 정수 A, B, C가 주어진다. 이때, 두 번째로 큰 정수를 출력하는 프로그램

주요 메서드

`BufferedReader.readLine()`
- 한 줄 입력을 빠르게 처리

`StringTokenizer`
- 공백 기준으로 세 정수를 분리

`List<Integer>`
- 세 정수를 저장하기 위한 자료구조

`Collections.sort()`
- 리스트를 오름차순으로 정렬

`List.get(int index)`
- 두 번째로 큰 값 접근 (index = 1)

주요 알고리즘

- 세 정수를 리스트에 저장
- 리스트를 오름차순 정렬
- 정렬된 결과의 가운데 값 출력
*/
public class No10817 {
    public static void main(String[] args) throws IOException {
        // 입력 처리
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 세 수 저장
        List<Integer> list = new ArrayList<>(3);
        for (int i = 0; i < 3; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        // 오름차순 정렬
        Collections.sort(list);

        // 두 번째로 큰 수 출력
        System.out.println(list.get(1));
    }
}
