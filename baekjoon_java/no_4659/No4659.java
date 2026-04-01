package no_4659;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
백준 4659번 (실버5): 비밀번호 발음하기

- 문자열이 좋은 비밀번호인지 판별하는 문제
- 입력은 여러 줄로 주어지며 "end"가 나오면 종료
- 좋은 비밀번호 조건
    - 모음(a,e,i,o,u)이 최소 1개 포함되어야 함
    - 모음 3개 연속 불가
    - 자음 3개 연속 불가
    - 같은 글자 2번 연속 불가, 단 ee, oo는 허용

접근 방법

- 문자열을 앞에서부터 한 글자씩 확인하면서 조건을 검사
- 모음 연속 개수, 자음 연속 개수 를 각각 관리
- 동시에 이전 문자와 현재 문자를 비교해 연속된 같은 문자인지도 검사
- 문자열 전체를 확인한 뒤, 모음이 한 번도 없었다면 좋은 비밀번호가 아니므로 false 처리

핵심 아이디어

- 모음/자음 연속 개수를 따로 관리하면 3연속 조건을 쉽게 확인
- 이전 문자와 현재 문자 비교로 연속 중복 문자 조건을 처리
- ee, oo만 예외이므로 같은 문자가 연속될 때 해당 문자가 e 또는 o인지 확인
*/
public class No4659 {

    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static boolean isAcceptable(String str) {
        boolean hasVowel = false;
        int vowelCnt = 0;
        int consonantCnt = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (isVowel(ch)) {
                hasVowel = true;
                vowelCnt++;
                consonantCnt = 0;
            } else {
                consonantCnt++;
                vowelCnt = 0;
            }

            if (vowelCnt >= 3 || consonantCnt >= 3) {
                return false;
            }

            if (i > 0) {
                char prev = str.charAt(i - 1);
                if (prev == ch && ch != 'e' && ch != 'o') {
                    return false;
                }
            }
        }

        return hasVowel;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String str = br.readLine();

            if (str.equals("end")) {
                break;
            }

            if (isAcceptable(str)) {
                sb.append("<").append(str).append("> is acceptable.").append("\n");
            } else {
                sb.append("<").append(str).append("> is not acceptable.").append("\n");
            }
        }

        System.out.print(sb);
    }
}