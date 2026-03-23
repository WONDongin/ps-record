package no_8979;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
/*
문제-8979: 올림픽

주요 메서드
- Arrays.sort() + Comparator
- 등수 계산 로직 (이전 값 비교)

주요 알고리즘
- 정렬 (금 → 은 → 동 내림차순)
- 구현 (같은 메달이면 같은 등수 처리)

탐색/처리 흐름
1. Country 객체 배열 생성 (번호, 금, 은, 동)
2. 금 → 은 → 동 기준 내림차순 정렬
3. 앞에서부터 순회하며 등수 계산
   → 이전 나라와 메달 수 비교
   → 같으면 rank 유지
   → 다르면 rank = i + 1
4. 목표 국가 K를 찾으면 rank 출력 후 종료

핵심 포인트
- 단순 index 기반 등수 X
- "같은 메달 = 같은 등수" 처리 필수
- Comparator로 다중 조건 정렬 구현
*/
public class No8979 {
    static class Country{
        int num, gold, silver, bronze;

        public Country(int num, int gold, int silver, int bronze){
            this.num = num;
            this.gold = gold;
            this.silver = silver;
            this.bronze = bronze;
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Country[] arr = new Country[N];

        for(int i = 0; i < N; i++){
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st1.nextToken());
            int gold = Integer.parseInt(st1.nextToken());
            int silver = Integer.parseInt(st1.nextToken());
            int bronze = Integer.parseInt(st1.nextToken());

            arr[i] = new Country(num, gold, silver, bronze);
        }

        Arrays.sort(arr, (a, b) -> {
            if (a.gold != b.gold) return Integer.compare(b.gold, a.gold);
            if (a.silver != b.silver) return Integer.compare(b.silver, a.silver);
            return Integer.compare(b.bronze, a.bronze);
        });

        int rank = 1;
        for(int i = 0; i < N; i++) {
            if (i > 0 &&
                    arr[i].gold == arr[i - 1].gold &&
                    arr[i].silver == arr[i - 1].silver &&
                    arr[i].bronze == arr[i - 1].bronze) {
                // 같은 등수 → rank 그대로
            } else {
                rank = i + 1;
            }

            if (arr[i].num == K) {
                System.out.println(rank);
                break;
            }
        }

    }
}
