package level0;
import java.util.ArrayDeque;
import java.util.Arrays;
/*
문제: RPG와 쿼리

로직
- 도로 이동과 순간 이동만으로 z² 미만의 금액을 만드는 최소 턴 수를 구한다.
- (도시, 금액)을 상태로 두고 0-1 BFS를 수행한다.
- 같은 나머지의 금액에 대해 보정된 턴 수의 최솟값을 저장한다.
- 각 쿼리는 부족한 금액을 z원씩 얻는 턴을 더해 계산한다.

핵심 구현
- 순간 이동은 금액별 허브를 사용해 도시 간 간선을 압축한다.
- 허브로 들어가는 비용은 0턴, 허브에서 도시로 나오는 비용은 1턴이다.
- prefixMin[money]에 같은 나머지의 이전 금액까지 고려한 최솟값을 저장한다.
- 쿼리 결과는 target / z + prefixMin[candidate]로 계산한다.

포인트
- 쿼리 금액이 최대 10^18이므로 결과와 쿼리에는 long을 사용한다.
- 도시에서 제자리에 머무르는 행동은 마지막에 몰아서 수행할 수 있다.
- 0원 쿼리는 시작 상태에서 바로 달성하므로 결과가 0이다.
- 만들 수 없는 금액은 -1을 반환한다.

회고
- 금액 전체를 탐색하는 대신 z로 나눈 나머지에 주목해야 했다.
- 순간 이동을 허브 상태로 표현해 도시 간 모든 간선을 만들지 않고 처리했다.
- 작은 금액의 최단 경로를 전처리해 큰 쿼리를 O(1)에 계산할 수 있었다.
*/
public class No222 {
    class Solution {
        private static final int INF = 1_000_000_000;

        public long[] solution(int n, int z, int[][] roads, long[] queries) {
            int limit = z * z;
            int totalStates = (n + 1) * limit;

            int[] head = new int[n];
            Arrays.fill(head, -1);

            int[] to = new int[roads.length];
            int[] weight = new int[roads.length];
            int[] next = new int[roads.length];

            for (int i = 0; i < roads.length; i++) {
                int u = roads[i][0];
                to[i] = roads[i][1];
                weight[i] = roads[i][2];
                next[i] = head[u];
                head[u] = i;
            }

            int[] dist = new int[totalStates];
            Arrays.fill(dist, INF);

            ArrayDeque<Integer> deque = new ArrayDeque<>();
            dist[0] = 0; // (0번 도시, 0원)
            deque.add(0);

            int[] minTurns = new int[limit];
            Arrays.fill(minTurns, INF);

            while (!deque.isEmpty()) {
                int state = deque.pollFirst();
                int currentDist = dist[state];
                int city = state / limit;
                int money = state % limit;

                if (city == n) {
                    // 허브 -> 원하는 도시: 순간 이동 1턴
                    for (int nextCity = 0; nextCity < n; nextCity++) {
                        int nextState = nextCity * limit + money;

                        if (dist[nextState] > currentDist + 1) {
                            dist[nextState] = currentDist + 1;
                            deque.addLast(nextState);
                        }
                    }
                    continue;
                }

                minTurns[money] = Math.min(minTurns[money], currentDist);

                // 현재 도시 -> 같은 금액의 허브: 0턴
                int hubState = n * limit + money;
                if (dist[hubState] > currentDist) {
                    dist[hubState] = currentDist;
                    deque.addFirst(hubState);
                }

                // 도로 이동: 1턴
                for (int edge = head[city]; edge != -1; edge = next[edge]) {
                    int nextMoney = money + weight[edge];
                    if (nextMoney >= limit) {
                        continue;
                    }

                    int nextState = to[edge] * limit + nextMoney;
                    if (dist[nextState] > currentDist + 1) {
                        dist[nextState] = currentDist + 1;
                        deque.addLast(nextState);
                    }
                }
            }

            // 같은 나머지의 금액들을 대상으로 구간 최솟값 계산
            int[] prefixMin = new int[limit];
            for (int money = 0; money < limit; money++) {
                int value = minTurns[money] == INF
                        ? INF
                        : minTurns[money] - money / z;

                if (money >= z) {
                    value = Math.min(value, prefixMin[money - z]);
                }

                prefixMin[money] = value;
            }

            long[] answer = new long[queries.length];

            for (int i = 0; i < queries.length; i++) {
                long target = queries[i];

                int candidate = target < limit
                        ? (int) target
                        : limit - z + (int) (target % z);

                answer[i] = prefixMin[candidate] == INF
                        ? -1
                        : target / z + prefixMin[candidate];
            }

            return answer;
        }
    }
}
