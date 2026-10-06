package kakaco;
/*
문제: 성격 유형 검사하기

로직
- 질문별 선택지를 확인하여 해당 성격 유형의 점수를 누적한다.
- 비동의는 첫 번째 유형, 동의는 두 번째 유형에 점수를 더한다.
- 각 지표에서 점수가 높은 유형을 선택하여 결과 문자열을 만든다.

핵심 구현
- 알파벳을 인덱스로 변환하여 정수 배열에 유형별 점수를 저장한다.
- 선택지가 4보다 작으면 첫 번째 유형에 4 - choice점을 더한다.
- 선택지가 4보다 크면 두 번째 유형에 choice - 4점을 더한다.

포인트
- 선택지가 4이면 어떤 유형에도 점수를 더하지 않는다.
- 질문마다 두 유형의 순서가 달라질 수 있다.
- 점수가 같으면 사전 순으로 빠른 유형을 선택한다.

회고
- 선택지와 4의 차이로 점수를 계산하고, 배열로 유형별 점수를 관리했다.
*/
public class No7 {
    class Solution {
        public String solution(String[] survey, int[] choices) {
            int[] scores = new int[26];

            for (int i = 0; i < survey.length; i++) {
                int choice = choices[i];

                if (choice < 4) {
                    scores[survey[i].charAt(0) - 'A'] += 4 - choice;
                } else if (choice > 4) {
                    scores[survey[i].charAt(1) - 'A'] += choice - 4;
                }
            }

            String[] types = {"RT", "CF", "JM", "AN"};
            StringBuilder answer = new StringBuilder();

            for (String type : types) {
                char first = type.charAt(0);
                char second = type.charAt(1);

                if (scores[first - 'A'] >= scores[second - 'A']) {
                    answer.append(first);
                } else {
                    answer.append(second);
                }
            }

            return answer.toString();
        }
    }
}
