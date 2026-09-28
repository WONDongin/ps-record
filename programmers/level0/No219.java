package level0;
/*
문제: q로 나눈 나머지가 r인 위치의 문자 이어 붙이기

로직
- code의 인덱스 중 q로 나눈 나머지가 r인 위치를 찾는다.
- 해당 위치의 문자를 앞에서부터 순서대로 이어 붙인다.

핵심 구현
- 인덱스 r에서 시작해 q씩 증가시킨다.
- 방문한 위치의 문자를 StringBuilder에 추가한다.

포인트
- r, r + q, r + 2q ... 위치가 모두 조건을 만족한다.
- q가 1이면 code의 모든 문자를 이어 붙인다.

회고
- 모든 인덱스에서 나머지를 계산하는 대신, 조건에 맞는 위치만 방문해 간단하게 해결했다.
*/
public class No219 {
    class Solution {
        public String solution(int q, int r, String code) {
            StringBuilder answer = new StringBuilder();

            for (int i = r; i < code.length(); i += q) {
                answer.append(code.charAt(i));
            }

            return answer.toString();
        }
    }
}
