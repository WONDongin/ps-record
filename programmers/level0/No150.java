package level0;
import java.util.Arrays;
/*
문제: 접미사 배열

로직
- 문자열의 각 인덱스부터 끝까지 잘라 모든 접미사를 만든다.
- 생성한 접미사 배열을 사전순으로 정렬한다.

핵심 구현
- substring(i): i번째 인덱스부터 끝까지 문자열 추출
- Arrays.sort(answer): 문자열 배열을 사전순으로 정렬

포인트
- 문자열의 길이가 N이면 접미사도 N개이다.
- substring()의 시작 인덱스를 0부터 N - 1까지 증가시킨다.

회고
- substring()과 Arrays.sort()를 활용해 간단하게 해결할 수 있었다.
*/
public class No150 {
    class Solution {
        public String[] solution(String my_string) {
            String[] answer = new String[my_string.length()];

            for (int i = 0; i < my_string.length(); i++) {
                answer[i] = my_string.substring(i);
            }

            Arrays.sort(answer);
            return answer;
        }
    }
}
