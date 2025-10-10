package no_7568;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
문제 : 덩치
- 어떤 사람보다 몸무게와 키가 모두 큰 사람이 몇 명 있는지 세서 `등수 = (그 사람 수 + 1)`

입력 저장 : 각 사람의 (몸무게, 키)를 2차원 배열에 저장
- `arr[i][0] = 몸무게;`
- `arr[i][1] = 키;`

덩치 비교 알고리즘(이중 반복문)
- 모든 사람 쌍을 비교한다.
- arr[j]가 arr[i]보다 몸무게도 크고 키도 크면 → i의 등수를 +1 증가.
`for (int i = 0; i < N; i++) {
    int rank = 1; // 기본 등수 1부터
    for (int j = 0; j < N; j++) {
        if (i == j) continue; // 자기 자신은 비교 X
        if (arr[j][0] > arr[i][0] && arr[j][1] > arr[i][1]) {
            rank++; // 자신보다 큰 사람이 있으면 등수 +1
        }
    }
    arr[i][2] = rank; // 최종 등수 저장`
}

출력 : 각 사람의 등수를 순서대로 출력.
`for (int i = 0; i < N; i++) {
    System.out.print(arr[i][2] + " ");
}`

시간의 복잡도
- 모든 사람을 서로 비교하므로 → O(N²)
- 하지만 N ≤ 50 이므로 충분히 빠름.
*/
public class No7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][3];

        // 입력받기
        for(int i = 0; i < N; i++){
            String[] input = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(input[0]); // 몸무게
            arr[i][1] = Integer.parseInt(input[1]); // 키
        }

        // 등수계산
        for(int i = 0; i < N; i++){
            int rank = 1; // 기본 등수 1등부터 시작
            for(int j = 0; j < N; j++){
                // (몸무게, 키) 둘 다 더 큰 사람이 있으면 랭크 +1
                if(arr[j][0] > arr[i][0] && arr[j][1] > arr[i][1]){
                    rank++;
                }
            }
            arr[i][2] = rank;
        }
        // 출력
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < arr.length; i++){
            sb.append(arr[i][2]).append(" ");
        }
        System.out.println(sb);
    }
}
