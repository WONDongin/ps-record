package level0;
import java.util.Arrays;
/*
문제: 왼쪽 오른쪽

로직
- 문자열 배열을 앞에서부터 순회한다.
- 처음 만난 "l" 또는 "r"을 기준으로 반환할 범위를 결정한다.

핵심 구현
- "l"이면 0번 인덱스부터 현재 인덱스 직전까지 복사한다.
- "r"이면 현재 인덱스 다음부터 배열 끝까지 복사한다.

포인트
- 먼저 등장한 "l" 또는 "r"만 처리하면 되므로 발견 즉시 반환한다.
- 둘 다 없다면 빈 배열을 반환한다.

회고
- Arrays.copyOfRange를 사용해 필요한 구간을 간단하게 추출했다.
*/
public class No217 {
    class Solution {
        public String[] solution(String[] str_list) {
            for (int i = 0; i < str_list.length; i++) {
                if (str_list[i].equals("l")) {
                    return Arrays.copyOfRange(str_list, 0, i);
                }

                if (str_list[i].equals("r")) {
                    return Arrays.copyOfRange(str_list, i + 1, str_list.length);
                }
            }

            return new String[0];
        }
    }
}
