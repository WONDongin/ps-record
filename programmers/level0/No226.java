package level0;
/*
문제: 문자열 여러 번 뒤집기

로직
- 문자열을 char 배열로 변환한다.
- queries를 순서대로 순회하며 각 구간의 문자를 뒤집는다.
- 모든 명령을 처리한 배열을 문자열로 변환하여 반환한다.

핵심 구현
- 구간의 양 끝 인덱스 s와 e에서 시작한다.
- 양쪽 문자를 교환하고 두 인덱스를 안쪽으로 이동한다.
- s가 e보다 작은 동안 교환을 반복한다.

포인트
- 각 명령은 이전 명령으로 변경된 문자열에 적용한다.
- s와 e에 위치한 문자도 뒤집는 구간에 포함된다.

회고
- char 배열과 투 포인터를 활용해 문자열의 특정 구간을 뒤집었다.
*/
public class No226 {
    class Solution {
        public String solution(String my_string, int[][] queries) {
            char[] chars = my_string.toCharArray();

            for (int[] query : queries) {
                int s = query[0];
                int e = query[1];

                while (s < e) {
                    char temp = chars[s];
                    chars[s] = chars[e];
                    chars[e] = temp;

                    s++;
                    e--;
                }
            }

            return new String(chars);
        }
    }
}
