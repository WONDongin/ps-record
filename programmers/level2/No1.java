package level2;
/*
문제-프로그래머스: 단어 퍼즐

[문제 요약]
- 주어진 단어 조각들을 이용해 문자열 t를 완성
- 각 조각은 무한히 사용 가능
- 최소 개수의 조각으로 문자열을 구성
- 불가능하면 -1 반환

[접근 방법]
- DP를 이용한 문자열 분할 문제로 접근
- dp[i]를 i까지 문자열을 만들 때 필요한 최소 단어 개수로 정의
- 뒤에서 최대 5글자까지만 확인 (단어 최대 길이 = 5)

[핵심 아이디어]
- dp[i] = min(dp[i - len] + 1)
- substring이 strs에 포함될 때만 갱신
- Set을 사용하여 빠른 탐색

[처리 흐름]
dp 배열 초기화 → 문자열 순회 → 뒤에서 최대 5글자 검사 → 최소값 갱신

[시간복잡도]
- O(N)
*/

import java.util.*;

public class No1 {
    public int solution(String[] strs, String t) {

        int n = t.length();
        int[] dp = new int[n + 1];

        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        Set<String> set = new HashSet<>(Arrays.asList(strs));

        for (int i = 1; i <= n; i++) {

            for (int len = 1; len <= 5; len++) {

                if (i - len < 0) continue;

                String sub = t.substring(i - len, i);

                if (set.contains(sub) && dp[i - len] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], dp[i - len] + 1);
                }
            }
        }

        return dp[n] == Integer.MAX_VALUE ? -1 : dp[n];
    }
}
