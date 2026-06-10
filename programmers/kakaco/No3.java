package kakaco;
/*
문제: 시험장 나누기

문제 요약

* 시험장들이 하나의 이진 트리 구조로 연결되어 있다
* 간선을 끊어 총 k개의 그룹으로 나누어야 한다
* 각 그룹의 응시자 수 합을 계산한다
* 그룹들 중 가장 큰 그룹의 인원 수를 최소화해야 한다
* 최소화된 최대 그룹 인원 수를 반환한다

접근 방법

* 가능한 최대 그룹 인원 수를 이분 탐색으로 찾는다
* left는 num 배열의 최댓값으로 설정한다
* right는 전체 응시자 수의 합으로 설정한다
* mid를 최대 그룹 인원 제한값(limit)으로 가정한다
* DFS를 통해 limit 내에서 몇 개의 그룹이 필요한지 계산한다
* 필요한 그룹 수가 k 이하라면 더 작은 limit를 탐색한다
* 필요한 그룹 수가 k보다 크다면 limit를 증가시킨다

핵심 아이디어

* 정답 자체를 찾는 것이 아니라 최대 그룹 인원 수를 이분 탐색한다
* DFS는 현재 서브트리를 하나의 그룹으로 유지할 수 있는지 판단한다
* 왼쪽 + 오른쪽 + 현재 노드가 limit 이하이면 하나의 그룹으로 유지한다
* 둘 다 포함할 수 없으면 간선을 끊어 그룹 수를 증가시킨다
* limit가 주어졌을 때 필요한 최소 그룹 수를 계산하는 방식이다

주의할 점

* 루트 노드가 주어지지 않으므로 직접 찾아야 한다
* 부모가 없는 노드를 찾아 루트로 사용한다
* DFS는 그룹 개수를 세기 위해 후위 순회(Post Order) 방식으로 처리해야 한다
* left의 시작값은 반드시 num 배열의 최댓값이어야 한다
* 어떤 그룹도 단일 노드보다 작을 수 없기 때문이다
* 그룹 수는 DFS 시작 전에 1로 초기화해야 한다

배운 점

* 트리 문제도 이분 탐색과 결합하여 해결할 수 있다
* 정답 범위를 탐색하는 Parametric Search 유형을 경험할 수 있었다
* DFS 결과를 이용해 그룹 개수를 계산하는 방법을 익힐 수 있었다
* "최대값의 최솟값" 문제는 이분 탐색을 우선 의심해볼 수 있다
*/
public class No3 {
    class Solution {

        int[] num;
        int[][] links;
        int k;
        int groupCount;

        public int solution(int k, int[] num, int[][] links) {
            this.num = num;
            this.links = links;
            this.k = k;

            int root = findRoot();

            int left = 0;
            int right = 0;

            for (int n : num) {
                left = Math.max(left, n);
                right += n;
            }

            int answer = right;

            while (left <= right) {
                int mid = (left + right) / 2;

                groupCount = 1;
                dfs(root, mid);

                if (groupCount <= k) {
                    answer = mid;
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

            return answer;
        }

        int dfs(int cur, int limit) {
            if (cur == -1) return 0;

            int left = dfs(links[cur][0], limit);
            int right = dfs(links[cur][1], limit);

            // 둘 다 포함 가능
            if (left + right + num[cur] <= limit) {
                return left + right + num[cur];
            }

            // 하나만 포함 가능 → 작은 쪽 먼저 유지
            if (Math.min(left, right) + num[cur] <= limit) {
                groupCount++;
                return Math.min(left, right) + num[cur];
            }

            // 둘 다 안되면 둘 다 끊기
            groupCount += 2;
            return num[cur];
        }

        int findRoot() {
            boolean[] isChild = new boolean[num.length];

            for (int[] link : links) {
                if (link[0] != -1) isChild[link[0]] = true;
                if (link[1] != -1) isChild[link[1]] = true;
            }

            for (int i = 0; i < num.length; i++) {
                if (!isChild[i]) return i;
            }

            return -1;
        }
    }
}
