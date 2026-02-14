package no_1085;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
문제-1085(브론즈3): 직사각형에서 탈출
- 점 (x, y)가 직사각형 내부에 있을 때,
- 네 변 중 가장 가까운 변까지의 최소 거리를 구하는 문제

주요 메서드

- Math.min() : 두 값 중 최소값 반환
- 중첩 Math.min() : 4개 값 중 최소값 계산

주요 알고리즘

- 왼쪽 거리 : x
- 오른쪽 거리 : w - x
- 아래 거리 : y
- 위쪽 거리 : h - y
- 네 값 중 최소값 출력
- 시간 복잡도: O(1)
- 공간 복잡도: O(1)

*/
public class No1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int min = Math.min(Math.min(x, w - x), Math.min(y, h - y));

        System.out.println(min);
    }
}
