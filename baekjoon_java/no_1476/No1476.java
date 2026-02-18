package no_1476;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
문제-1476(실버5): 날짜 계산
- E(1~15), S(1~28), M(1~19)가 각각 주어진다.
- 세 수가 동시에 일치하는 가장 빠른 연도를 구하는 문제.

주요 메서드

- `ec`, `sc`, `mc` : 현재 연도의 `E`, `S`, `M` 값을 저장
- year : 현재 연도 카운트
- 반복문 `while(true)` : 조건이 맞을 때까지 1년씩 증가

주요 알고리즘

- 브루트포스(완전 탐색)
- 세 개의 주기를 동시에 증가시키며 비교
- 범위 초과 시 1로 초기화
  - `ec > 15` → 1
  - `sc > 28` → 1
  - `mc > 19` → 1
- 시간 복잡도: `O(7980) ≈ O(1)`
- 공간 복잡도: `O(1)`
*/
public class No1476 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int e = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int year = 1;
        int ec = 1;
        int sc = 1;
        int mc = 1;
        
        while (true){


            if(ec == e && sc == s && mc == m){
                System.out.println(year);
                break;
            }


            ec++;
            sc++;
            mc++;
            year++;

            if(ec > 15) ec = 1;
            if(sc > 28) sc = 1;
            if(mc > 19) mc = 1;
        }

    }
}
