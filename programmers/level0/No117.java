package level0;
/*
문제: 문자열의 각 자리수 합 구하기

로직
- num_str의 문자를 처음부터 끝까지 순회한다.
- 각 숫자 문자를 정수로 변환한다.
- 변환한 숫자를 answer에 누적한다.
- 모든 자리수의 합을 반환한다.

핵심 구현
- charAt(i)로 i번째 숫자 문자를 가져온다.
- 숫자 문자에서 '0'을 빼 실제 정숫값으로 변환한다.
- answer += num_str.charAt(i) - '0'으로 변환과 누적을 함께 처리한다.

포인트
- charAt()의 반환형은 char이므로 숫자처럼 보이더라도 문자이다.
- 숫자 문자는 문자 코드가 연속되어 있어 '0'을 빼면 실제 숫자를 구할 수 있다.
- 문자열을 정수 전체로 변환할 필요 없이 각 문자를 바로 처리할 수 있다.

회고
- 숫자 문자에서 '0'을 빼 정수로 변환하는 방법을 복습했다.
- 문자열을 순회하며 각 자리의 숫자를 누적하는 방식으로 간단하게 해결했다.
*/
public class No117 {
    public static void main(String[] args) {
        class Solution {
            public int solution(String num_str) {
                int answer = 0;

                for (int i = 0; i < num_str.length(); i++) {
                    answer += num_str.charAt(i) - '0';
                }

                return answer;
            }
        }

        Solution solution = new Solution();

        System.out.println(solution.solution("123456789")); // 45
    }
}