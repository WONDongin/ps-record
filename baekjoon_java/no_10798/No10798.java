package no_10798;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
문제-10798: 세로읽기
- 5개의 문자열이 주어질 때, 이를 세로 방향으로 읽어서 하나의 문자열로 출력하는 문제.
- 각 문자열의 길이는 서로 다를 수 있다.

주요 메서드
- String.charAt()
- String.length()

주요 알고리즘
- 2차원 배열 탐색 (세로 순회)

탐색/처리 흐름
1. 문자열 5개를 배열에 저장
2. 가장 긴 문자열 길이만큼 열 반복 수행
3. 각 열에서 행(0~4)을 순회
4. 현재 문자열 길이보다 열 인덱스가 작다면
   → 해당 문자 출력
5. 모든 열을 순회할 때까지 반복

핵심 포인트
- 문자열 길이가 서로 다르기 때문에
  charAt() 사용 전에 length() 체크 필요
- 일반적인 행 우선 탐색이 아니라
  열 → 행 순서로 탐색해야 함
*/
public class No10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = new String[5];

        for(int i = 0; i < 5; i++){
            arr[i] = br.readLine();
        }

        for(int j = 0; j < 15; j++){
            for(int i = 0; i < 5; i++){
                if(j < arr[i].length()){
                    System.out.print(arr[i].charAt(j));
                }
            }
        }
    }
}
