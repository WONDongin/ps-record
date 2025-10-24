package no_18110;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
/*
문제 :  solved.ac (절사평균 계산)
- 절사평균(Trimmed Mean) 계산 알고리즘

1. 입력 처리 (BufferedReader)
- 빠른 입력을 위해 `BufferedReader` 사용
- 첫 줄: 평가 인원 수 N
- 다음 줄부터 N개의 정수 입력

2. 예외 처리
`N == 0`인 경우, 출력은 0 (예외 케이스 방지)

3. 정렬 (Arrays.sort)
점수를 오름차순 정렬
절사평균은 상·하위 15%를 제외하고 계산하므로 필수 단계

4. 절사 비율 계산 (Math.round)
- `trim = Math.round(N * 0.15f);`
- 상위 15%, 하위 15% 각각 반올림하여 제외

5. 합계 및 평균 계산
- `sum ← arr[trim]`부터 `arr[N - trim - 1]`까지 합산
- `count ← N - (trim * 2)`
- 평균 = `sum / count`
- 결과는 `Math.round()`로 반올림하여 출력

주요 메서드 정리
`BufferedReader` : 빠른 입력 처리
`Integer.parseInt()` : 문자열 → 정수 변환
`Arrays.sort()` : 배열 정렬
`Math.round(float a)` : 반올림하여 int 반환
`System.out.println()` : 결과 출력
*/
public class No18110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 예외처리(0)
        if (N == 0) {
            System.out.println(0);
            return;
        }

        // 배열 생성 & 저장 & 정렬
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        // 절사평균 & 총합
        int trim = Math.round(N * 0.15f);
        int sum = 0;
        for (int i = trim; i < N - trim; i++) {
            sum += arr[i];
        }

        // 평균 & 출력
        int count = N - (trim * 2);
        System.out.println(Math.round((float) sum / count));
    }
}