package level0;
import java.util.ArrayList;
import java.util.List;

/*
문제: 배열 만들기 2

로직
- l부터 r까지의 모든 정수를 순서대로 확인한다.
- 각 정수를 문자열로 변환한다.
- 문자열에서 "0"과 "5"를 제거했을 때 빈 문자열인지 확인한다.
- 조건을 만족하는 숫자를 리스트에 저장한다.
- 조건을 만족하는 숫자가 없다면 -1이 담긴 배열을 반환한다.

핵심 구현
- replace("0", "").replace("5", "")를 사용해 0과 5를 제거한다.
- 제거한 결과가 빈 문자열이면 0과 5로만 이루어진 숫자이다.
- 리스트가 비어 있으면 new int[]{-1}을 반환한다.
- stream과 mapToInt를 사용해 리스트를 int 배열로 변환한다.

포인트
- l부터 r까지 오름차순으로 확인하므로 별도의 정렬이 필요하지 않다.
- 숫자에 0과 5 이외의 문자가 하나라도 남으면 조건을 만족하지 않는다.
- 조건을 만족하는 숫자가 없는 경우 반드시 [-1]을 반환해야 한다.

회고
- 숫자를 문자열로 변환하여 각 자리의 조건을 간단하게 확인했다.
- replace()를 활용하면 별도의 문자 반복문 없이 조건을 검사할 수 있었다.
*/
public class No180 {
    class Solution {
        public int[] solution(int l, int r) {
            List<Integer> list = new ArrayList<>();

            for (int i = l; i <= r; i++) {
                String number = String.valueOf(i);

                if (number.replace("0", "")
                        .replace("5", "")
                        .isEmpty()) {
                    list.add(i);
                }
            }

            if (list.isEmpty()) {
                return new int[]{-1};
            }

            return list.stream()
                    .mapToInt(Integer::intValue)
                    .toArray();
        }
    }
}
