package kakaco;
/*
문제: 비밀지도

문제 요약
- 두 개의 정수 배열로 암호화된 지도를 해독하는 문제
- 각 숫자를 이진수로 변환했을 때 1은 벽, 0은 공백을 의미
- 두 지도 중 하나라도 벽이면 전체 지도에서도 벽으로 처리

접근 방법
- 같은 위치의 arr1[i]와 arr2[i]를 OR 연산으로 합친다
- OR 결과를 이진수 문자열로 변환한다
- 이진수 길이가 n보다 짧으면 앞에 0을 채운다
- 1은 "#", 0은 " "으로 치환한다

핵심 아이디어
- 두 지도 중 하나라도 1이면 벽이므로 비트 OR 연산을 사용한다
- Integer.toBinaryString()으로 숫자를 이진수 문자열로 변환한다
- 앞자리 0은 자동으로 사라지므로 n자리로 맞춰야 한다

주의할 점
- 이진수 문자열 길이가 n보다 짧을 수 있다
- 앞쪽에 0을 채우지 않으면 지도 칸 수가 맞지 않는다
- 공백도 출력 형식의 일부이므로 정확히 유지해야 한다

배운 점
- 비트 OR 연산으로 두 조건 중 하나라도 참인 경우를 처리할 수 있다
- Integer.toBinaryString()을 사용하면 정수를 이진수 문자열로 변환할 수 있다
*/
public class No2 {
    class Solution {
        public String[] solution(int n, int[] arr1, int[] arr2) {
            String[] answer = new String[n];

            for (int i = 0; i < n; i++) {
                String binary = Integer.toBinaryString(arr1[i] | arr2[i]);

                while (binary.length() < n) {
                    binary = "0" + binary;
                }

                answer[i] = binary.replace("1", "#")
                        .replace("0", " ");
            }

            return answer;
        }
    }
}
