package no_11650;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
/*
Q.좌표 정렬하기
[문제풀이]
입력 처리 : BufferedReader로 빠르게 입력받고, int[][] arr로 좌표 저장

정렬 : Arrays.sort() + Comparator<int[]> 사용해서 (x, y) 오름차순 정렬
Arrays.sort()` | 실제 정렬을 수행하는 메서드     | Arrays.sort(arr, comparator) |
Comparator<T>` | 정렬 기준을 정의하는 인터페이스 | Comparator<int[]>            |
compare()`     | 비교 로직을 정의하는 메서드    | return a[0] - b[0];          |
- 음수(-) : 첫 번째 인자(a)가 두 번째(b)보다 “앞에 와야 함”
- 0 : 두 값이 같다
- 양수(+) : 첫 번째 인자(a)가 두 번째(b)보다 “뒤에 와야 함”

출력 : StringBuilder로 한 번에 출력해서 시간 초과 방지
*/
public class No11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 숫자 입력받기
        int N = Integer.parseInt(br.readLine());

        // 좌표 저장
        int[][] arr = new int[N][2];
        for(int i = 0; i < N; i++){
            String[] input = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(input[0]); // x좌표
            arr[i][1] = Integer.parseInt(input[1]); // y좌표
        }

        // 좌표 정렬
        Arrays.sort(arr, (a, b) -> {
            // x같으면 y 오름차순(비교 규칙 정의 (음수, 0, 양수 반환))
            if (a[0] == b[0]) return a[1] - b[1];
            // x 오름차순
            return a[0] - b[0];
        });

        // 좌표 출력
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++){
            sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
        }
        System.out.println(sb);
    }
}