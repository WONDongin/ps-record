package level0;
/*
문제: 숫자 찾기

로직
- 정수 num과 k를 문자열로 변환한다.
- indexOf()를 사용하여 k가 처음 나타나는 인덱스를 찾는다.
- 문제의 자리 수는 1부터 시작하므로 인덱스에 1을 더한다.
- k가 존재하지 않으면 -1을 반환한다.

핵심 구현
- String.valueOf(num): 정수를 문자열로 변환
- indexOf(): 특정 문자가 처음 나타나는 위치를 반환
- index == -1 ? -1 : index + 1: 존재 여부와 자리 수 처리

포인트
- 문자열의 인덱스는 0부터 시작하지만 문제의 자리 수는 1부터 시작한다.
- indexOf()는 찾는 값이 없으면 -1을 반환한다.

회고
- 숫자를 문자열로 변환하면 각 자릿수를 간단하게 탐색할 수 있다.
*/
public class No110 {
    public static void main(String[] args) {
        class Solution {
            public int solution(int num, int k) {
                String number = String.valueOf(num);
                int index = number.indexOf(String.valueOf(k));

                return index == -1 ? -1 : index + 1;
            }
        }

        Solution solution = new Solution();
        System.out.println(solution.solution(29183, 1)); // 3
    }
}
