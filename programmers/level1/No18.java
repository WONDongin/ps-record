package level1;

import java.util.Arrays;
/*
문제-나누어 떨어지는 숫자 배열

[문제 요약]
- 정수 배열 arr와 divisor가 주어진다
- arr 원소 중 divisor로 나누어 떨어지는 값만 추출
- 오름차순 정렬 후 반환
- 없으면 [-1] 반환

[접근 방법]
- Arrays.stream() 사용
- filter()로 divisor 조건 처리
- sorted()로 오름차순 정렬
- toArray()로 int[] 변환

[핵심 아이디어]
- Stream API를 사용하면
  필터링 + 정렬 + 배열 변환을 한 번에 처리 가능
- 결과 배열이 비어있으면 {-1} 반환

[처리 흐름]
배열 스트림 생성
→ divisor로 나누어 떨어지는 값 필터링
→ 오름차순 정렬
→ int[] 변환
→ 빈 배열 여부 확인 후 반환

[시간복잡도]
- O(N log N)
  (정렬 비용)
*/
public class No18 {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = Arrays.stream(arr)
                .filter(num -> num % divisor == 0)
                .sorted()
                .toArray();

        return answer.length == 0 ? new int[]{-1} : answer;
    }
}
