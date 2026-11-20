package No_12865;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
문제: 평범한 배낭 (백준 12865)

로직
- dp[capacity]에 배낭의 용량이 capacity일 때 얻을 수 있는 최대 가치를 저장한다.
- 물건을 하나씩 확인하며 현재 물건을 넣는 경우와 넣지 않는 경우의 가치를 비교한다.
- 모든 물건을 확인한 뒤 dp[K]를 출력한다.

핵심 구현
- 각 물건의 무게를 weight, 가치를 value로 읽는다.
- 배낭 용량을 K부터 weight까지 역순으로 순회한다.
- dp[capacity]를 기존 값과 dp[capacity - weight] + value 중 큰 값으로 갱신한다.

포인트
- 용량을 큰 값부터 갱신하면 dp[capacity - weight]에 현재 물건을 넣기 전의 값이 남아 있어 같은 물건을 한 번만 사용한다.
- 시간 복잡도는 O(N × K), 공간 복잡도는 O(K)이다.

회고
- 이전 물건까지의 DP 값을 유지하도록 갱신 순서를 정해 배열 하나로 풀이했다.
*/
public class No12865 {
    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int[] dp = new int[k + 1];

            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                int weight = Integer.parseInt(st.nextToken());
                int value = Integer.parseInt(st.nextToken());

                // 같은 물건을 한 번만 사용하도록 큰 용량부터 갱신한다.
                for (int capacity = k; capacity >= weight; capacity--) {
                    dp[capacity] = Math.max(dp[capacity], dp[capacity - weight] + value);
                }
            }

            System.out.println(dp[k]);
        }
    }
}
