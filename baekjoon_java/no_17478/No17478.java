package no_17478;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
문제-17478(실버5): 재귀함수가 뭔가요?
- 재귀 호출의 구조를 그대로 출력하는 문제
- 깊이에 따라 들여쓰기를 적용하여 대화 형식 출력

주요 메서드

- `jh(int depth)` : 재귀 깊이를 기준으로 대화 출력
- 들여쓰기 처리 : for문으로 depth만큼 "____" 출력
- `StringBuilder` : 문자열 누적 출력 최적화

주요 알고리즘

- 재귀 호출 (DFS 구조)
- 기저 조건: `depth == n`
- 호출 후 복귀 시 마무리 문장 출력

시간 복잡도: O(n²) (문자열 누적 포함)
공간 복잡도: O(n) (재귀 스택)
*/
public class No17478 {
    static int n;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        sb = new StringBuilder();
        sb.append("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.\n");

        dfs(0);

        System.out.print(sb);
    }

    static void dfs(int depth) {

        for (int i = 0; i < depth; i++) {
            sb.append("____");
        }
        sb.append("\"재귀함수가 뭔가요?\"\n");

        if (depth == n) {

            for (int i = 0; i < depth; i++) {
                sb.append("____");
            }
            sb.append("\"재귀함수는 자기 자신을 호출하는 함수라네\"\n");

        } else {

            for (int i = 0; i < depth; i++) {
                sb.append("____");
            }
            sb.append("\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.\n");

            for (int i = 0; i < depth; i++) {
                sb.append("____");
            }
            sb.append("마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.\n");

            for (int i = 0; i < depth; i++) {
                sb.append("____");
            }
            sb.append("그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"\n");

            dfs(depth + 1);
        }

        for (int i = 0; i < depth; i++) {
            sb.append("____");
        }
        sb.append("라고 답변하였지.\n");
    }
}
