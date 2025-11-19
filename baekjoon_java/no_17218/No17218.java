package no_17218;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
문제-17218 (골드4): 비밀번호 만들기
-  두 문자열에서 공통으로 존재하는 가장 긴 부분 문자열을 비밀번호로 하기로 하였다. 수형이가 눈을 감고 만든 두 문자열이 주어졌을 때 비밀번호를 만드는 프로그램

주요 메서드
- `String.charAt()` : 문자열의 각 문자 비교
- `Math.max()` : DP 값 갱신 시 큰 값 선택
- `StringBuilder.append()` / `reverse()` : LCS 문자열을 뒤에서부터 붙인 후 역순으로 변환
- `BufferedReader.readLine()` : 입력 문자열 빠르게 읽기

주요 알고리즘
- LCS(최장 공통 부분 수열) DP 알고리즘
    - dp[i][j]: s1의 i길이, s2의 j길이까지의 LCS 길이 저장
    - 문자가 같으면 → dp[i-1][j-1] + 1
    - 다르면 → max(dp[i-1][j], dp[i][j-1])

- 백트래킹(backtracking)
    - DP 테이블 오른쪽 아래부터 역으로 추적
    - 문자가 같으면 LCS 구성에 포함
    - 다르면 더 큰 값이 있는 방향으로 이동
    - 역순으로 찾기 때문에 마지막에 reverse() 필요
*/
public class No17218 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        String s2 = br.readLine();

        // DP 배열 생성
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];

        // DP 테이블 채우기
        for(int i = 1; i <= s1.length(); i++){
            for(int j = 1; j <= s2.length(); j++){
                if (s1.charAt(i-1) == s2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }

        // LCS 문자열을 거꾸로 추적(백트래킹)
        StringBuilder sb = new StringBuilder();
        int i = s1.length();
        int j = s2.length();

        while (i > 0 && j > 0) {
            if (s1.charAt(i-1) == s2.charAt(j-1)) {
                sb.append(s1.charAt(i-1));
                i--;
                j--;
            } else if (dp[i-1][j] > dp[i][j-1]) {
                i--;
            } else {
                j--;
            }
        }

        System.out.println(sb.reverse().toString());
    }
}
