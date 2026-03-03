package no_1418;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
문제-1418: K-세준수
<<<<<<< Updated upstream
=======
- 1부터 N까지의 수 중에서
- 가장 큰 소인수가 K 이하인 수(K-세준수)의 개수를 구하는 문제
>>>>>>> Stashed changes

주요 메서드
- 에라토스테네스 변형을 이용한 spf(가장 작은 소인수) 계산
- 점화식을 이용한 maxPF(가장 큰 소인수) 계산

주요 알고리즘
- 에라토스테네스의 체 (O(N log log N))
- 소인수 분해 점화식 활용

접근 방법
- spf[i] = i의 가장 작은 소인수 배열 생성

점화식 이용:
- maxPF[i] = max(spf[i], maxPF[i / spf[i]])
- maxPF[i] <= K 인 수 개수 카운트
*/
public class No1418 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());

        int[] spf = new int[N + 1];

<<<<<<< Updated upstream
        // 1. spf(가장 작은 소인수) 계산
        for(int i = 2; i <= N; i++){
            if(spf[i] == 0){
                spf[i]= i;
=======
        for(int i = 2; i <= N; i++){
            if(spf[i] == 0){
                spf[i]= i;

>>>>>>> Stashed changes
                for(int j = i * 2; j <= N; j += i){
                    if(spf[j] == 0){
                        spf[j] = i;
                    }
                }
            }
        }

<<<<<<< Updated upstream
        // 2. maxPF(가장 큰 소인수) 계산
=======
>>>>>>> Stashed changes
        int[] maxPF = new int[N + 1];
        maxPF[1] = 1;

        for (int i = 2; i <= N; i++) {
            maxPF[i] = Math.max(spf[i], maxPF[i / spf[i]]);
        }

<<<<<<< Updated upstream
        // 3. 조건 만족 개수 카운트
=======
>>>>>>> Stashed changes
        int count = 0;
        for(int i = 1; i <= N; i++){
            if(maxPF[i] <= K){
                count++;
            }
        }

        System.out.println(count);
<<<<<<< Updated upstream
    }
}
=======

    }
}
>>>>>>> Stashed changes
