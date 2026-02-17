package no_10815;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;
/*
문제-10815(실버5): 숫자 카드
- N개의 숫자 카드가 주어진다.
- M개의 숫자가 주어질 때, 각 숫자가 카드에 존재하는지 확인하여
  존재하면 1, 없으면 0을 출력하는 문제

주요 메서드

- `HashSet<Integer> set` : 카드 번호 저장
- `set.contains(target)` : 특정 숫자 존재 여부 확인
- `StringBuilder` : 출력 문자열 누적

주요 알고리즘

- 입력 받은 카드들을 `HashSet`에 저장
- M개의 숫자에 대해 `contains()`로 존재 여부 검사
- 평균 시간 복잡도 `O(1)` 조회
- 전체 시간 복잡도: `O(N + M)`
- 공간 복잡도: `O(N)`
*/
public class No10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Set<Integer> set = new HashSet<>();

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++){
            set.add(Integer.parseInt(st.nextToken()));
        }

        int M = Integer.parseInt(br.readLine());

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < M; i++){
            int target = Integer.parseInt(st2.nextToken());

            if(set.contains(target)){
                sb.append("1 ");
            } else {
                sb.append("0 ");
            }
        }

        System.out.println(sb);
    }
}
