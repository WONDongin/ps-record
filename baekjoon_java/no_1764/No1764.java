package no_1764;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
/*
문제(실버4) : 듣보잡 문제 해결

듣도 못한 사람 저장 : `HashSet` 삽입, O(N)
보도 못한 사람 중 교집합 탐색 : `HashSet` 탐색, O(M)
교집합(K명) 사전순 정렬 : `Collections.sort`, O(K log K)
총합 : 효율적인 전체 처리, O(N + M + K log K)

주요 알고리즘
1. `Set` 교집합 알고리즘 (HashSet 기반)
- 빠른 검색과 중복 제거에 최적

2. 정렬 (`Collections.sort`)
- 사전순 요구사항 충족

| 자료구조      | 중복   | 순서          | 접근방식              | 대표 사용 예시         |
| --------- | ---- | ----------- | ----------------- | ---------------- |
| **Set**   | ❌ 불가 | ❌ 없음 / 정렬가능 | 값 중심 (`contains`) | 중복 제거, 교집합       |
| **List**  | ✅ 가능 | ✅ 있음        | 인덱스 기반            | 순서 유지, 중복 허용 데이터 |
| **Stack** | ✅ 가능 | ✅ 있음 (LIFO) | `push`/`pop`      | 되돌리기, 괄호검사, DFS  |


| 상황             | 사용할 자료구조      | 이유           |
| -------------- | ------------- | ------------ |
| 중복 없는 이름 목록    | `HashSet`     | 빠른 검색, 중복 제거 |
| 순서대로 저장된 점수 목록 | `ArrayList`   | 인덱스 접근       |
| 괄호 짝 검사        | `Stack`       | LIFO 구조 필요   |
| DFS 탐색         | `Stack` or 재귀 | 깊이 우선 구조     |
| 방문 여부 체크       | `HashSet`     | 빠른 포함 검사     |

**Tip:**
- `Set` → “중복 제거용”
- `List` → “순서 유지 및 인덱스 접근용”
- `Stack` → “LIFO(후입선출) 구조 필요할 때”
*/
public class No1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = br.readLine().split(" ");
        // 입력처리
        int N = Integer.parseInt(nm[0]);
        int M = Integer.parseInt(nm[1]);

        Set<String> heard = new HashSet<>(); // 듣도 못한 사람
        List<String> result = new ArrayList<>(); // 교집합 저장

        // 듣도 못한 사람 저장
        for(int i = 0; i < N; i++){
            heard.add(br.readLine());
        }

        // 보도 못한 사람 입력 + 교집합 찾기
        for(int i = 0; i < M; i++){
            String name = br.readLine();
            if(heard.contains(name)){
                result.add(name);
            }
        }
        // 사전순 정렬
        Collections.sort(result);

        // 갯수 + 이름 출력 (N, M이 50만)
        StringBuilder sb = new StringBuilder();
        sb.append(result.size()).append('\n');
        for (String name : result) {
            sb.append(name).append('\n');
        }
        System.out.print(sb);
    }
}
