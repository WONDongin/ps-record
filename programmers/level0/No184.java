package level0;
import java.util.ArrayList;
import java.util.List;
/*
문제: 세로 읽기

로직
- intStrs의 문자열을 하나씩 확인한다.
- 각 문자열의 s번 인덱스부터 길이가 l인 부분 문자열을 자른다.
- 부분 문자열을 정수로 변환한 뒤 k보다 큰 경우 결과에 추가한다.

핵심 구현
- substring(s, s + l)을 사용해 원하는 범위의 문자열을 추출한다.
- Integer.parseInt()를 사용해 부분 문자열을 정수로 변환한다.
- 조건을 만족하는 값만 List에 저장한 뒤 int 배열로 변환한다.

포인트
- substring의 두 번째 인덱스는 범위에 포함되지 않으므로 s + l을 전달한다.
- 숫자 문자열 앞에 0이 있어도 정수로 변환하면 자동으로 제거된다.
- 변환한 값이 k와 같은 경우는 포함하지 않고, k보다 큰 경우만 포함한다.

회고
- substring과 Integer.parseInt를 활용해 필요한 숫자만 간단하게 추출했다.
*/
public class No184 {
    class Solution {
        public int[] solution(String[] intStrs, int k, int s, int l) {
            List<Integer> result = new ArrayList<>();

            for (String intStr : intStrs) {
                int number = Integer.parseInt(
                        intStr.substring(s, s + l)
                );

                if (number > k) {
                    result.add(number);
                }
            }

            return result.stream()
                    .mapToInt(Integer::intValue)
                    .toArray();
        }
    }
}
