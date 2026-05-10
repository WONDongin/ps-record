package level1;

import java.io.IOException;
import java.util.Arrays;
/*
문제-12935: 제일 작은 수 제거하기

[문제 요약]
- 배열에서 가장 작은 값을 제거한 배열 반환
- 배열 길이가 1이면 [-1] 반환

[접근 방법]
- Arrays.stream()을 사용해 최솟값 탐색
- filter()로 최솟값을 제외한 배열 생성
- 길이가 1인 경우 예외 처리

[핵심 아이디어]
- min()으로 배열의 최솟값 추출
- filter(num -> num != min)으로 최솟값 제거
- toArray()로 int[] 변환

[처리 흐름]
배열 길이 검사
→ 최솟값 탐색
→ 최솟값 제외 필터링
→ 결과 배열 반환

[시간복잡도]
- 최솟값 탐색 : O(N)
- 필터링 : O(N)
- 전체 : O(N)
*/
public class No22 {
    public static void main(String[] args) throws IOException {
        int[] arr = {4,3,2,1};

        // 배열 길이가 1이면 [-1] 반환
        if(arr.length == 1){
            System.out.println(Arrays.toString(new int[]{-1}));
            return;
        }

        // 최솟값 찾기
        int min = Arrays.stream(arr)
                .min()
                .getAsInt();

        // 최솟값 제외한 새 배열 생성
        int[] answer = Arrays.stream(arr)
                .filter(num -> num != min)
                .toArray();

        System.out.println(Arrays.toString(answer));
    }
}
