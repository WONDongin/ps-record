package level2;

/*
문제-순위

- 선수 간 경기 결과가 주어진다
- A가 B를 이기면 항상 이긴다는 전제
- 일부 결과가 누락된 상태에서 순위를 정확히 알 수 있는 선수 수를 구하는 문제

[접근 방법]

- 그래프를 이용하여 선수 간 승패 관계를 저장
- 플로이드-워셜 알고리즘으로 간접 승패 관계까지 전파
- 각 선수 기준으로 자신을 제외한 모든 선수와의 승패 여부를 확인

[핵심 아이디어]

- i가 j를 이기거나, j가 i를 이기면 관계가 확정됨
- (이긴 수 + 진 수 == n - 1) → 순위 확정 가능
- 직접 결과뿐 아니라 간접 결과까지 고려해야 함

[처리 흐름]

입력 → graph 초기화 → 플로이드-워셜로 관계 확장 →
각 선수별 승/패 count → 조건 만족 시 answer++

[시간복잡도]

- O(n^3) (플로이드-워셜)
- n ≤ 100 → 충분히 가능
*/
public class No2 {
    public int solution(int n, int[][] results){
        boolean[][] graph = new boolean[n + 1][n + 1];

        // 결과 입력
        for(int[] r : results){
            graph[r[0]][r[1]] = true;
        }

        // 플로이드-워셀
        for(int k = 1; k <= n; k++){
            for(int i = 1; i <= n; i++){
                for(int j = 1; j <= n; j++){
                    if(graph[i][k] && graph[k][j]){
                        graph[i][j] = true;
                    }
                }
            }
        }

        int answer = 0;

        // 순위 확정 체크
        for (int i = 1; i <= n; i++) {
            int win = 0;
            int lose = 0;

            for (int j = 1; j <= n; j++) {
                if (graph[i][j]) win++;
                if (graph[j][i]) lose++;
            }

            if (win + lose == n - 1) {
                answer++;
            }
        }

        return answer;
    }
}
