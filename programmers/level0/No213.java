package level0;
/*
문제: 잘라서 배열로 저장하기
로직 - 문자열을 앞에서부터 n글자씩 잘라 배열에 담는다.
핵심 구현 - substring(start, Math.min(start + n, my_str.length()))으로 마지막 조각이 n글자보다 짧아도 처리한다.
포인트 - 필요한 배열 길이는 (문자열 길이 + n - 1) / n이다.
회고 - 마지막 조각의 끝 인덱스가 문자열 길이를 넘지 않도록 처리하는 것이 핵심이다.
*/
public class No213 {
    class Solution {
        public String[] solution(String my_str, int n) {
            int count = (my_str.length() + n - 1) / n;
            String[] answer = new String[count];

            for (int i = 0; i < count; i++) {
                int start = i * n;
                int end = Math.min(start + n, my_str.length());
                answer[i] = my_str.substring(start, end);
            }

            return answer;
        }
    }
}
