package no_2752;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
문제-2752 (브론즈4): 세수정렬
- 제일 작은 수, 그 다음 수, 제일 큰 수를 차례대로 출력

주요 메서드

BufferedReader.readLine()
- 한 줄 입력 처리

StringTokenizer
- 공백 기준으로 정수 분리

조건문 + swap
- 두 변수의 값 교환을 통한 정렬
*/
public class No2752 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        // 정렬을 위한 변수 복사
        int x = a, y = b, z = c;

        // x ≤ y ≤ z 형태로 만들기
        if (x > y) { int t = x; x = y; y = t; }
        if (y > z) { int t = y; y = z; z = t; }
        if (x > y) { int t = x; x = y; y = t; }

        System.out.println(x + " " + y + " " + z);
    }
}
