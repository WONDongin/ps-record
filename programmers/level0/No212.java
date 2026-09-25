package level0;
/*
문제: 그림 확대
로직 - 각 행의 문자를 k번씩 이어 붙여 가로로 확대한 뒤, 완성된 행을 k번 저장해 세로로 확대한다.
핵심 구현 - StringBuilder로 확대한 행을 만들고 answer 배열에 같은 행을 k번 넣는다.
포인트 - 결과 배열의 행 개수는 picture.length * k이다.
회고 - 가로 확대와 세로 확대를 순서대로 처리하면 인덱스 계산이 단순해진다.
*/
public class No212 {
    class Solution {
        public String[] solution(String[] picture, int k) {
            String[] answer = new String[picture.length * k];
            int index = 0;

            for (String row : picture) {
                StringBuilder expanded = new StringBuilder();

                for (int i = 0; i < row.length(); i++) {
                    for (int j = 0; j < k; j++) {
                        expanded.append(row.charAt(i));
                    }
                }

                String expandedRow = expanded.toString();

                for (int i = 0; i < k; i++) {
                    answer[index++] = expandedRow;
                }
            }

            return answer;
        }
    }
}
