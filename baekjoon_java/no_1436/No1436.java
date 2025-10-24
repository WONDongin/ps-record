package no_1436;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
문제 : 영화감독 숌

브루트포스 알고리즘(Brute Force Algorithm)
- 가능한 모든 경우의 수를 전부 탐색해서 정답을 찾는 알고리즘

- 핵심 체크: String.valueOf(num).contains("666")
  · int → String 변환 후 부분 문자열 "666" 포함 여부를 O(L)에 판단
  · 내부적으로 indexOf 활용, 성능 충분
  · Integer.toString(num)와 동등, num + ""보다 할당 적음

- 대안(선택): 자리수 검사로 문자열 생성 없이 판정
  · while (x>0)에서 연속된 6이 3개 나오면 true
  · 가독성은 contains가 더 좋음

- 결론: 간단/명확성이 중요해 contains 방식 채택
*/
public class No1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int num = 666;
        int count = 1;

        while (count < N){
            num++;
            if(String.valueOf(num).contains("666")) count++;
        }

        System.out.println(num);
    }
}
