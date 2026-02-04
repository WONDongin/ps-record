package no_1427;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
/*
문제-1427 (실버5): 소트인사이드
- 자연수 N이 주어질 때
- 각 자리 숫자를 내림차순으로 정렬하여 출력한다.

주요 메서드

`BufferedReader.readLine()`
- 숫자를 문자열로 입력받아 자릿수 단위 처리를 쉽게 함

`String.charAt(int index)`
- 문자열의 각 문자를 하나씩 순회
- '0'을 빼서 문자 → 정수 변환

`Arrays.stream(int[])`
- int[] 배열을 스트림으로 변환하여 정렬 처리

`.boxed()`
- int → Integer 변환
- Collections.reverseOrder() 사용을 위해 필요

.sorted(Collections.reverseOrder())
- 숫자를 내림차순 정렬

`.mapToInt(Integer::intValue)`
- Integer 스트림을 다시 int[]로 변환

주요 알고리즘

- 입력값을 문자열로 받는다
- 각 자리 숫자를 int[] 배열에 저장
- 스트림을 이용해 배열을 내림차순 정렬
- 정렬된 숫자를 순서대로 출력
*/
public class No1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int[] num = new int[str.length()];
        for(int i = 0; i < str.length(); i++){
            num[i] = str.charAt(i) - '0';
        }

        num = Arrays.stream(num)
                .boxed().sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue).toArray();

        for(int i : num){
            System.out.print(i);
        }
    }
}
