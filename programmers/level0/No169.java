package level0;
/*
문제: 날짜 비교하기

로직
- 연도, 월, 일을 순서대로 비교한다.
- date1의 값이 더 작으면 앞서는 날짜이므로 1을 반환한다.
- date1의 값이 더 크면 늦은 날짜이므로 0을 반환한다.
- 모든 값이 같으면 같은 날짜이므로 0을 반환한다.

핵심 구현
- 인덱스 0부터 순회하며 연도, 월, 일을 차례대로 비교한다.
- 차이가 발생하는 순간 결과를 반환한다.

포인트
- 날짜가 [year, month, day] 순서로 주어지므로 앞에서부터 비교할 수 있다.
- date1과 date2가 같은 날짜인 경우에는 0을 반환한다.

회고
- 날짜 객체로 변환하지 않고 배열의 원소를 순서대로 비교하여 간단하게 해결했다.
*/
public class No169 {
    class Solution {
        public int solution(int[] date1, int[] date2) {
            for (int i = 0; i < date1.length; i++) {
                if (date1[i] < date2[i]) {
                    return 1;
                }

                if (date1[i] > date2[i]) {
                    return 0;
                }
            }

            return 0;
        }
    }

}
