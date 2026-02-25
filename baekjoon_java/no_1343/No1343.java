package no_1343;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
문제-1343: 폴리오미노
주요 메서드: replace(), contains()
주요 알고리즘: 그리디(Greedy)

1. 문제 요약
- X로 이루어진 영역을 AAAA(4칸)와 BB(2칸)로 덮어야 한다.
- 모든 X를 덮지 못하면 -1 출력.

2. 접근 방법
- 4칸 블록(AAAA)을 최대한 먼저 채운다.
- 남은 2칸은 BB로 채운다.
- 마지막에 X가 남아있으면 실패(-1).

3. 핵심 아이디어
- "XXXX" → "AAAA" 먼저 치환
- "XX" → "BB" 다음 치환
- 치환 후에도 X가 존재하면 덮을 수 없는 경우

4. 시간복잡도
- O(N) (문자열 전체를 몇 번 순회)
*/
public class No1343 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String board = br.readLine();

        board = board.replace("XXXX", "AAAA");
        board = board.replace("XX", "BB");

        if (board.contains("X")) {
            System.out.println(-1);
        } else {
            System.out.println(board);
        }
    }
}
