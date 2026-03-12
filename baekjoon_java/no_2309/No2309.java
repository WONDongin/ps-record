package no_2309;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
/*
문제-2309: 일곱 난쟁이
- 9명의 난쟁이 키가 주어질 때 진짜 난쟁이 7명의 키 합은 100이다.
- 가짜 난쟁이 2명을 찾아 제외하고 나머지 7명을 오름차순으로 출력한다.

주요 메서드
- Arrays.sort() : 난쟁이 키 정렬
- 이중 for문 : 두 명의 가짜 난쟁이 조합 탐색

주요 알고리즘
- 완전탐색 (Brute Force)
- 9명 중 2명을 선택하는 조합 탐색

탐색/처리 흐름
1. 9명의 난쟁이 키 입력
2. 전체 키 합 계산
3. 키 배열 오름차순 정렬
4. 이중 for문으로 두 난쟁이 선택
5. sum - (arr[a] + arr[b]) == 100 확인
6. 조건을 만족하면 해당 두 명을 가짜 난쟁이로 기록
7. 가짜 난쟁이 인덱스를 제외하고 7명 출력

핵심 포인트
- 가짜 난쟁이 두 명의 키 합 = 전체합 - 100
- 정렬을 먼저 해야 출력 조건(오름차순)을 자연스럽게 만족
- 9C2 = 36 이므로 완전탐색으로 충분히 해결 가능
*/
public class No2309 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        int sum = 0;

        for(int i = 0; i < 9; i++){
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        Arrays.sort(arr);

        int fake1 = -1;
        int fake2 = -1;

        for(int a = 0; a < 8; a++){
            for(int b = a + 1; b < 9; b++){
                if(sum - (arr[a] + arr[b]) == 100){
                    fake1 = a;
                    fake2 = b;
                    break;
                }
            }
            if(fake1 != -1) break;
        }

        for(int i = 0; i < 9; i++){
            if(i != fake1 && i != fake2){
                System.out.println(arr[i]);
            }
        }
    }
}