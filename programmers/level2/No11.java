package level2;
/*
문제: 이진 변환 반복하기

로직
- 문자열이 "1"이 될 때까지 이진 변환을 반복한다.
- 현재 문자열에서 1의 개수를 센다.
- 전체 길이에서 1의 개수를 빼 제거할 0의 개수를 누적한다.
- 1의 개수를 이진 문자열로 변환하고 변환 횟수를 증가시킨다.

핵심 구현
- charAt()으로 각 문자를 확인해 1의 개수를 계산한다.
- Integer.toBinaryString()으로 0을 제거한 문자열의 길이를 이진수로 변환한다.
- 변환 횟수와 제거한 0의 총개수를 배열로 반환한다.

포인트
- 0을 제거한 문자열을 직접 만들지 않고 1의 개수만 계산한다.
- 처음부터 문자열이 "1"이면 변환하지 않고 [0, 0]을 반환한다.
- 0이 없는 문자열도 "1"이 아니라면 이진 변환을 진행한다.

회고
- 문자열을 직접 수정하는 대신 필요한 개수만 계산해 변환을 구현했다.
*/
public class No11 {
    class Solution {
        public int[] solution(String s) {
            int count = 0;
            int removedZeros = 0;

            while (!s.equals("1")) {
                int ones = 0;

                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) == '1') {
                        ones++;
                    }
                }

                removedZeros += s.length() - ones;
                s = Integer.toBinaryString(ones);
                count++;
            }

            return new int[]{count, removedZeros};
        }
    }
}
