package no_11047;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
문제 (실버4) : 동전 0

목표 : N종류의 동전으로 K원을 만들되, 동전의 개수 합이 최소가 되도록 한다.
조건 : 동전은 무한히 존재하고, 각 동전은 배수가 아님이 보장

핵심 알고리즘: 그리디(Greedy)
- 매 단계에서 가장 최선의 선택(지역 최적)을 하는 알고리즘
- 가장 큰 동전부터 최대한 사용하는 것이 최적의 방법

그리디는 일반적으로 증명 가능한 조건(배수, 정렬 등)이 있어야 적용 가능
*/
public class No11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] kind = br.readLine().split(" ");
        int N = Integer.parseInt(kind[0]);
        int K = Integer.parseInt(kind[1]);
        int[] arr = new int[N];

        // 동전 배열 입력받기
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        // Greedy 계산 로직
        int cnt = 0;
        for(int i = N - 1; i >= 0; i--){
            if(arr[i] <= K){
                cnt += K / arr[i]; // 해당 동전을 몇 개 쓸 수 있는가
                K %= arr[i]; // 남은 금액 갱신
            }
        }

        System.out.println(cnt);
    }
}
