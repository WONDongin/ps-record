package level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
문제 :  나머지 1이 되는 가장 작은 수를 찾기

자연수 n이 주어질 때,
n을 어떤 자연수 x로 나눈 나머지가 1이 되도록 하는
**가장 작은 자연수 x**를 구하기

①	1부터 n-1까지의 수를 순차적으로 확인
②	각 수 i에 대해 n % i == 1인지 검사
③	조건을 만족하는 첫 번째 i가 가장 작은 x이므로, 바로 반환
④	시간 복잡도는 O(n), n이 작으므로 효율적
*/
public class No3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int answer = 0;

        for(int i = 1; i < n; i++){
            if(n % i == 1){
                answer = i;
                break;  // 첫 번째 i가 가장 작은 x
            }
        }

        System.out.println(answer);
    }
}