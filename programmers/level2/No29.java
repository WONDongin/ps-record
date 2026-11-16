package level2;
/*
문제: 전화번호 목록

로직
- 전화번호 배열을 사전순으로 정렬한다.
- 인접한 두 전화번호를 순서대로 비교한다.
- 앞 번호가 뒤 번호의 접두어이면 false를 반환한다.
- 접두어 관계가 없으면 true를 반환한다.

핵심 구현
- Arrays.sort()로 같은 접두어를 가진 번호들이 모이도록 정렬한다.
- startsWith()로 뒤 번호가 앞 번호로 시작하는지 확인한다.

포인트
- 길이순이 아닌 사전순으로 정렬한다.
- 접두어 관계가 존재하면 정렬 후 인접한 번호 사이에서도 발견된다.
- 전화번호를 문자열로 처리하여 앞자리 0을 유지한다.

회고
- 사전순 정렬의 특성을 활용해 모든 번호 쌍을 비교하지 않고 해결했다.
*/
public class No29 {
    import java.util.Arrays;

    class Solution {
        public boolean solution(String[] phone_book) {
            Arrays.sort(phone_book);

            for (int i = 0; i < phone_book.length - 1; i++) {
                if (phone_book[i + 1].startsWith(phone_book[i])) {
                    return false;
                }
            }

            return true;
        }
    }
}
