package no_11651;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
/*
문제 :  좌표 정렬하기 2
N개의 좌표 (x, y)가 주어질 때,
- y좌표 오름차순,
- y가 같다면 x좌표 오름차순으로 정렬하여 출력.

입력 처리
- BufferedReader로 입력 속도 최적화
- int[][] arr에 x, y 저장

정렬 (Arrays.sort + 람다식 Comparator)
Arrays.sort(arr, (a, b) -> {
    if (a[1] == b[1]) return a[0] - b[0]; // y가 같으면 x 오름차순
    return a[1] - b[1];                   // y 오름차순
});
- a[1] - b[1]: y 오름차순
- a[0] - b[0]: x 오름차순
- Comparator는 “음수 → a가 먼저”, “양수 → b가 먼저” 규칙

출력 최적화
- StringBuilder 사용해 결과 문자열 한 번에 출력 (시간 단축)
*/
public class No11651 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];

        for(int i = 0; i < N; i++){
            String[] input = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(input[0]); // x축
            arr[i][1] = Integer.parseInt(input[1]); // y축
        }

        // 정렬
        Arrays.sort(arr, (a, b) -> {
            // y같으면  x오름차순(비교 규칙 정의 (음수, 0, 양수 반환))
            if (a[1] == b[1]) return a[0] - b[0];
            // y 오름차순
            return a[1] - b[1];
        });

        // 출력
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i ++){
            sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
        }
        System.out.println(sb);
    }
}
