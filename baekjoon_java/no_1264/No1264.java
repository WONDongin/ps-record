package no_1264;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
문제-1264 (브론즈4): 모음의 개수
- 영문 문장을 입력받아 모음의 개수를 세는 프로그램을 작성
- 모음은 'a', 'e', 'i', 'o', 'u'이며 대문자 또는 소문자
-각 줄마다 모음의 개수를 세서 출력

주요 메서드
`isVowel(char c)`
- 주어진 문자가 모음인지 여부를 판단
- `String.indexOf()`를 활용해 간결하게 구현

주요 알고리즘
- 입력을 한 줄씩 읽으며 #이 나올 때까지 반복
- 각 문자열을 `char[]`로 순회
- 모음일 경우 카운트 증가
- 시간 복잡도: `O(N)` (문자열 길이 기준)
*/
public class No1264 {
    // 모음 판별 메서드
    private static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String line = br.readLine();
            if (line.equals("#")) break;

            int count = 0;
            for (char c : line.toCharArray()) {
                if (isVowel(c)) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}
