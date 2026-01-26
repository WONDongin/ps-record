package no_1543;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
문제-1543 (실버5): 문서 검색
- 주어진 문자열(문서)에서 특정 단어가 몇 번 등장하는지 출력
- 단, 단어는 서로 겹치지 않게 카운트해야 함

접근 방법

- 문자열을 앞에서부터 순차적으로 탐색
- 현재 위치에서 단어 길이만큼 잘라 비교
- 일치하면 카운트 증가 후 인덱스를 단어 길이만큼 이동
- 불일치하면 인덱스를 1만 이동

핵심 포인트

- substring 범위 초과 방지를 위해 i <= 전체길이 - 단어길이 조건 필요
- 겹치는 경우를 허용하지 않기 위해 i += 단어길이 처리
*/

public class No1543 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 문서 문자열 입력
        String str = br.readLine();
        int n = str.length();

        // 찾을 단어 입력
        String word = br.readLine();
        int m = word.length();

        int i = 0;      // 탐색 인덱스
        int cnt = 0;    // 등장 횟수

        // substring 범위를 벗어나지 않도록 조건 설정
        while (i <= n - m) {

            // 현재 위치에서 단어 길이만큼 비교
            if (str.substring(i, i + m).equals(word)) {
                cnt++;          // 단어 발견
                i += m;         // 겹치지 않도록 단어 길이만큼 이동
            } else {
                i++;            // 불일치 시 한 칸 이동
            }
        }

        System.out.println(cnt);
    }
}
