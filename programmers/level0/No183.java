package level0;
/*
문제: 문자열 묶기

로직
- strArr의 문자열을 하나씩 확인한다.
- 문자열의 길이를 인덱스로 사용하여 해당 길이의 문자열 개수를 센다.
- 각 그룹의 개수 중 가장 큰 값을 구한다.

핵심 구현
- 문자열의 최대 길이가 30이므로 크기가 31인 배열을 생성한다.
- counts[str.length()]를 증가시켜 길이별 문자열 개수를 저장한다.
- Math.max()를 사용하여 가장 큰 그룹의 크기를 갱신한다.

포인트
- 문자열의 내용이 아니라 길이가 같으면 같은 그룹에 포함된다.
- 배열을 한 번만 순회하므로 시간 복잡도는 O(N)이다.

회고
- 문자열 길이의 범위가 작고 정해져 있어 Map 대신 배열로 간단하게 그룹의 개수를 계산했다.
*/
public class No183 {
    class Solution {
        public int solution(String[] strArr) {
            int[] counts = new int[31];
            int answer = 0;

            for (String str : strArr) {
                int length = str.length();
                counts[length]++;

                answer = Math.max(answer, counts[length]);
            }

            return answer;
        }
    }
}
