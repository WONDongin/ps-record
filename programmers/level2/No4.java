package level2;
/*
문제: 최댓값과 최솟값

문제 요약
- 공백으로 구분된 정수들이 문자열로 주어진다.
- 문자열에 포함된 숫자들 중 최솟값과 최댓값을 찾는다.
- "최솟값 최댓값" 형태의 문자열을 반환한다.

접근 방법
- split(" ")을 사용해 문자열을 공백 기준으로 분리한다.
- 각 문자열을 정수로 변환하며 최솟값과 최댓값을 갱신한다.
- 최종적으로 "min max" 형태의 문자열을 반환한다.

핵심 아이디어
- 문자열을 숫자로 변환하면서 한 번의 순회로 최소값과 최대값을 동시에 구한다.
- Math.min(), Math.max()를 사용하면 비교 로직을 간단하게 작성할 수 있다.

주의할 점
- 음수가 포함될 수 있으므로 Integer.parseInt()를 사용해야 한다.
- 최솟값과 최댓값의 초기값은 첫 번째 숫자로 설정하는 것이 안전하다.

배운 점
- 문자열을 split()으로 분리한 뒤 숫자로 변환하여 처리하는 방법을 익힐 수 있다.
- 최소값과 최대값은 한 번의 반복문으로 동시에 구할 수 있다.
*/
public class No4 {
    class Solution {
        public String solution(String s) {
            String[] arr = s.split(" ");

            int min = Integer.parseInt(arr[0]);
            int max = Integer.parseInt(arr[0]);

            for (String str : arr) {
                int num = Integer.parseInt(str);

                min = Math.min(min, num);
                max = Math.max(max, num);
            }

            return min + " " + max;
        }
    }
}
