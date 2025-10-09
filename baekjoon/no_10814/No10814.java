package no_10814;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
// 문제 : 나이순 정렬
/*
- BufferedReader 사용하여 빠른 입력 처리
-- `BufferedReader` → 빠른 입력 (Scanner보다 효율적)
-- `split(" ")` → 한 줄을 나이/이름으로 분리

- 회원 정보를 String 2차원 배열로 저장 (나이, 이름)

- Arrays.sort() + Comparator.comparingInt() 로 나이 기준 오름차순 정렬
-- `Comparator.comparingInt()` → 비교 기준을 int 값으로 지정
-- `Integer.parseInt()` → 문자열 나이를 숫자로 변환
-- `Arrays.sort()`→ TimSort(안정 정렬) 사용 → 나이가 같으면 입력 순서 유지

- TimSort의 stable sort 특성으로 같은 나이일 경우 입력 순서 유지
- StringBuilder 로 결과 문자열 효율적으로 출력

핵심 메서드:
- Arrays.sort()
- Comparator.comparingInt()
- Integer.parseInt()
- StringBuilder.append()
*/
public class No10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[][] arr = new String[N][2];

        // 회원 리스트 입력
        for(int i = 0; i < N; i++){
            String[] input = br.readLine().split(" ");
            arr[i][0] = input[0]; // 나이
            arr[i][1] = input[1]; // 이름
        }

        // 정렬: 나이 오름차순 + 나이가 같으면 입력 순서 유지 (Stable sort 안정 정렬)
        Arrays.sort(arr, Comparator.comparingInt(a -> Integer.parseInt(a[0])));

        // 출력
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i ++){
            sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
        }
        System.out.println(sb);
    }
}
