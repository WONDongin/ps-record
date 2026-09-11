package level0;
/*
문제: 문자열 안에 문자열

로직
- myString에서 pat을 확인할 수 있는 마지막 시작 위치까지 반복한다.
- 각 위치에서 pat으로 시작하는지 확인한다.
- pat과 일치할 때마다 answer를 1 증가시킨다.

핵심 구현
- startsWith(pat, i)를 사용하여 i번째 위치부터 pat과 일치하는지 확인한다.
- 반복 범위를 myString.length() - pat.length()까지 설정한다.

포인트
- 서로 겹치는 문자열도 각각 등장 횟수에 포함해야 한다.
- "aaaa"에서 "aa"는 0, 1, 2번 인덱스에서 등장하므로 결과는 3이다.

회고
- 문자열을 직접 잘라 비교하지 않고 startsWith()를 활용해 간단하게 해결했다.
- 시작 인덱스를 한 칸씩 이동하여 겹치는 문자열도 빠짐없이 확인했다.
*/
public class No178 {
    class Solution {
        public int solution(String myString, String pat) {
            int answer = 0;

            for (int i = 0; i <= myString.length() - pat.length(); i++) {
                if (myString.startsWith(pat, i)) {
                    answer++;
                }
            }

            return answer;
        }
    }
}
