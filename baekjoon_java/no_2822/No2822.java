package no_2822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
/*
문제-2822: 점수 계산
- 8개의 점수 중 상위 5개의 점수 합과 해당 문제 번호를 출력하는 문제

주요 메서드
- Arrays.sort() + Comparator → 점수 기준 내림차순 정렬
- Arrays.sort() → 선택된 번호 오름차순 정렬

주요 알고리즘
- 정렬 (Sorting)
- 객체 배열 + Comparator

탐색/처리 흐름
1. (점수, 번호) 형태로 객체 배열 저장
2. 점수 기준 내림차순 정렬
3. 상위 5개 선택 → 합계 계산 + 번호 저장
4. 번호 배열 오름차순 정렬
5. 합계 + 번호 출력

핵심 포인트
- 점수 기준 정렬과 출력 기준(번호)이 다름
- 따라서 번호를 따로 배열에 저장 후 정렬 필요
- Comparator를 활용한 객체 정렬
*/
public class No2822 {
    static class Score {
        int value;
        int index;

        public Score(int value, int index){
            this.value = value;
            this.index = index;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Score[] arr = new Score[8];

        for(int i = 0; i < 8; i++){
            arr[i] = new Score(Integer.parseInt(br.readLine()), i + 1);
        }

        // 점수 기준 내림차순 정렬
        Arrays.sort(arr, (a, b) -> Integer.compare(b.value, a.value));

        int sum = 0;
        int[] selected = new int[5];

        // 상위 5개 선택
        for(int i = 0; i < 5; i++){
            sum += arr[i].value;
            selected[i] = arr[i].index;
        }

        // 번호 오름차순 정렬
        Arrays.sort(selected);

        StringBuilder sb = new StringBuilder();
        for(int num : selected){
            sb.append(num).append(" ");
        }

        System.out.println(sum);
        System.out.println(sb);
    }
}