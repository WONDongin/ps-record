package no_1094;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
문제-1094 (실버5): 막대기
- 목표: 길이 X를 만들기 위해 필요한 최소 막대 개수 구하기

주요 메서드

`BufferedReader.readLine()`
- 입력값 X를 문자열로 읽어 정수로 변환

`X & (X - 1)`
- X의 가장 오른쪽 1비트 제거
- 이 연산을 반복하면 이진수의 1 개수를 셀 수 있음

주요 알고리즘

1. 입력값 X를 정수로 받는다.

2. X가 0이 될 때까지 반복:
- 막대 하나 사용 → count++
- X &= (X - 1)로 가장 오른쪽 1비트 제거

3. 반복이 끝나면 count 출력
*/
public class No1094 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        int count = 0;

        while (X > 0){
            count++;
            X &= (X - 1);
        }

        System.out.println(count);
    }
}
