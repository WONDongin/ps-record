package level1;

import java.util.Arrays;
/*
문제 번호: Programmers - K번째수
문제 유형: 배열, 정렬
사용 알고리즘: 구현(Implementation), Sorting

[문제 설명]
배열의 특정 구간을 잘라 정렬한 뒤,
k번째 숫자를 구하는 문제.

[접근 방법]
1. commands 배열을 순회
2. i ~ j 구간을 잘라 새로운 배열 생성
3. Arrays.sort()로 정렬
4. k번째 값 추출 후 answer 배열에 저장

[핵심 포인트]
- Arrays.copyOfRange() 사용
- copyOfRange의 끝 인덱스는 포함되지 않음
- 문제는 1-based index 이므로 -1 처리 필요

[처리 흐름]
commands 순회
→ 배열 자르기
→ 정렬
→ k번째 값 저장
→ 결과 반환
*/
public class No44 {
    class Solution {
        public int[] solution(int[] array, int[][] commands) {

            int[] answer = new int[commands.length];

            for (int i = 0; i < commands.length; i++) {

                int start = commands[i][0] - 1;
                int end = commands[i][1];
                int k = commands[i][2] - 1;

                int[] temp = Arrays.copyOfRange(array, start, end);

                Arrays.sort(temp);

                answer[i] = temp[k];
            }

            return answer;
        }
    }
}
