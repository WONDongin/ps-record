package level0;
/*
문제: 문자열 밀기

로직
- A와 B가 같은지 확인한다.
- 두 문자열이 다르면 A의 마지막 문자를 맨 앞으로 이동시킨다.
- 문자열의 길이만큼 반복하면서 B와 같아지는 최소 횟수를 찾는다.

핵심 구현
- charAt(A.length() - 1)로 마지막 문자를 가져온다.
- substring(0, A.length() - 1)로 마지막 문자를 제외한 문자열을 구한다.
- 두 값을 이어 붙여 문자열을 오른쪽으로 한 칸 민다.

포인트
- 처음부터 A와 B가 같으면 0을 반환한다.
- 문자열 길이만큼 밀었는데도 같아지지 않으면 원래 문자열로 돌아오므로 -1을 반환한다.

회고
- 마지막 문자와 나머지 문자열을 분리하여 문자열을 오른쪽으로 미는 동작을 구현했다.
*/
public class No181 {
    class Solution {
        public int solution(String A, String B) {
            for (int count = 0; count < A.length(); count++) {
                if (A.equals(B)) {
                    return count;
                }

                A = A.charAt(A.length() - 1)
                        + A.substring(0, A.length() - 1);
            }

            return -1;
        }
    }
}
