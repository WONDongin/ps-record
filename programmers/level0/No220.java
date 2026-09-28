package level0;
/*
문제: 알파벳 대소문자별 등장 횟수 세기

로직
- 길이 52의 배열을 준비한다.
- 문자열의 각 문자가 대문자인지 소문자인지 확인한다.
- 문자에 해당하는 배열 위치의 값을 1 증가시킨다.

핵심 구현
- 대문자는 ch - 'A'로 0~25번 인덱스에 대응시킨다.
- 소문자는 ch - 'a' + 26으로 26~51번 인덱스에 대응시킨다.

포인트
- 대문자와 소문자는 서로 다른 위치에 집계한다.
- 등장하지 않은 문자의 개수는 배열의 기본값인 0으로 유지된다.

회고
- 문자 간의 코드값 차이를 이용해 각 알파벳의 위치를 계산했다.
- 별도의 정렬 없이 문제에서 요구하는 순서대로 결과를 만들었다.
*/
public class No220 {
    class Solution {
        public int[] solution(String my_string) {
            int[] answer = new int[52];

            for (char ch : my_string.toCharArray()) {
                if (ch >= 'A' && ch <= 'Z') {
                    answer[ch - 'A']++;
                } else {
                    answer[ch - 'a' + 26]++;
                }
            }

            return answer;
        }
    }
}
