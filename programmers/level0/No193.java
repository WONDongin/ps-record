package level0;
import java.util.Arrays;
/*
문제: A로 B 만들기

로직
- before와 after를 각각 문자 배열로 변환한다.
- 두 문자 배열을 오름차순으로 정렬한다.
- 정렬된 두 배열이 같으면 1을 반환하고 다르면 0을 반환한다.

핵심 구현
- toCharArray()를 사용해 문자열을 문자 배열로 변환한다.
- Arrays.sort()를 사용해 문자 배열을 오름차순으로 정렬한다.
- Arrays.equals()를 사용해 두 문자 배열이 같은지 비교한다.

포인트
- 문자열의 순서를 바꿀 수 있으므로 문자의 종류와 개수가 같아야 한다.
- 두 문자열을 정렬하면 각 문자의 구성과 개수가 같은지 확인할 수 있다.

회고
- 두 문자열을 정렬한 후 비교하여 문자의 종류와 개수가 같은지 간단하게 확인했다.
*/
public class No193 {

        public int solution(String before, String after) {
            char[] beforeArray = before.toCharArray();
            char[] afterArray = after.toCharArray();

            Arrays.sort(beforeArray);
            Arrays.sort(afterArray);

            return Arrays.equals(beforeArray, afterArray) ? 1 : 0;
        }
    }
}
