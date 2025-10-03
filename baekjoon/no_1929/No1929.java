package no_1929;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// 문제 : 소수 구하기
/*
- 한 줄에 하나씩, 증가하는 순서대로 소수를 출력
- 소수 : 1보다 큰 자연수 중에서 1과 자기 자신만을 약수로 가지는 수

에라토스테네스의 체
- 가장 빠르게 많은 수의 소수를 판별할 수 있는 고전 알고리즘

나의정리 : 소수의 배수만 범위 내에서 지우면, 남은 수들이 모두 소수
* */

public class No1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 한 줄 입력 받아서 공백 기준으로 나누기
        String[] arr = br.readLine().split(" ");
        int M = Integer.parseInt(arr[0]);
        int N = Integer.parseInt(arr[1]);

        // 에라토스테네스의 체
        boolean[] isNoPrime = new boolean[N + 1];
        isNoPrime[0] = true;
        isNoPrime[1] = true;

        for(int i = 2; i * i <= N; i++){
            if(!isNoPrime[i]){
                for(int j = i * i; j <= N; j += i){
                    isNoPrime[j] = true;
                }
            }
        }

        for(int i = M; i <= N; i++){
            if(!isNoPrime[i]) System.out.println(i);
        }
    }
}
