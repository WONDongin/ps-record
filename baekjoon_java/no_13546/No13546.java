package no_13546;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
/*
문제: 수열과 쿼리 4

로직
- Mo's 알고리즘을 이용해 쿼리의 처리 순서를 정렬한다.
- 현재 탐색 구간의 양 끝을 이동하면서 원소를 추가하거나 제거한다.
- 각 숫자의 최초 등장 위치와 마지막 등장 위치를 관리한다.
- 두 위치의 차이 중 최댓값을 구해 쿼리의 정답으로 저장한다.

핵심 구현
- prev와 next 배열에 같은 숫자의 이전 및 다음 등장 위치를 저장한다.
- first와 last 배열로 현재 구간에 포함된 숫자의 양 끝 위치를 관리한다.
- distanceCount 배열로 거리별 등장 횟수를 관리한다.
- 제곱근 분할을 활용해 가장 큰 거리를 효율적으로 탐색한다.

포인트
- 같은 숫자 사이의 최대 거리는 마지막 등장 위치에서
  최초 등장 위치를 빼면 구할 수 있다.
- 원소를 추가하거나 제거하기 전에 기존 거리 정보를 제거한다.
- 쿼리를 정렬하여 처리하므로 기존 입력 순서에 맞게 결과를 출력한다.

회고
- Mo's 알고리즘과 제곱근 분할을 활용해 반복적인 구간 탐색을 줄였다.
- 같은 숫자의 등장 위치를 미리 연결하여 구간 변경 시
  위치 정보를 효율적으로 갱신할 수 있었다.
*/
public class No13546 {
    public class Main {

        static int n, blockSize;
        static int[] arr, prev, next;
        static int[] first, last;
        static int[] distanceCount, bucketCount;

        static class Query {
            int left, right, index, block;

            Query(int left, int right, int index) {
                this.left = left;
                this.right = right;
                this.index = index;
                this.block = (left - 1) / blockSize;
            }
        }

        public static void main(String[] args) throws IOException {
            BufferedReader br =
                    new BufferedReader(new InputStreamReader(System.in));

            StringTokenizer st = new StringTokenizer(br.readLine());

            n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            blockSize = (int) Math.sqrt(n);

            arr = new int[n + 1];
            prev = new int[n + 1];
            next = new int[n + 1];

            first = new int[k + 1];
            last = new int[k + 1];

            distanceCount = new int[n];
            bucketCount = new int[(n - 1) / blockSize + 1];

            int[] lastSeen = new int[k + 1];

            st = new StringTokenizer(br.readLine());

            for (int i = 1; i <= n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
                int value = arr[i];

                prev[i] = lastSeen[value];

                if (lastSeen[value] != 0) {
                    next[lastSeen[value]] = i;
                }

                lastSeen[value] = i;
            }

            int m = Integer.parseInt(br.readLine());

            Query[] queries = new Query[m];
            int[] answer = new int[m];

            for (int i = 0; i < m; i++) {
                st = new StringTokenizer(br.readLine());

                int left = Integer.parseInt(st.nextToken());
                int right = Integer.parseInt(st.nextToken());

                queries[i] = new Query(left, right, i);
            }

            Arrays.sort(queries, (a, b) -> {
                if (a.block != b.block) {
                    return Integer.compare(a.block, b.block);
                }

                if (a.block % 2 == 0) {
                    return Integer.compare(a.right, b.right);
                }

                return Integer.compare(b.right, a.right);
            });

            int left = 1;
            int right = 0;

            for (Query query : queries) {

                while (left > query.left) {
                    add(--left, true);
                }

                while (right < query.right) {
                    add(++right, false);
                }

                while (left < query.left) {
                    remove(left++, true);
                }

                while (right > query.right) {
                    remove(right--, false);
                }

                answer[query.index] = getMaxDistance();
            }

            StringBuilder sb = new StringBuilder();

            for (int result : answer) {
                sb.append(result).append('\n');
            }

            System.out.print(sb);
        }

        static void add(int index, boolean fromLeft) {
            int value = arr[index];

            updateDistance(value, -1);

            if (first[value] == 0) {
                first[value] = index;
                last[value] = index;
            } else if (fromLeft) {
                first[value] = index;
            } else {
                last[value] = index;
            }

            updateDistance(value, 1);
        }

        static void remove(int index, boolean fromLeft) {
            int value = arr[index];

            updateDistance(value, -1);

            if (first[value] == last[value]) {
                first[value] = 0;
                last[value] = 0;
            } else if (fromLeft) {
                first[value] = next[index];
            } else {
                last[value] = prev[index];
            }

            updateDistance(value, 1);
        }

        static void updateDistance(int value, int delta) {
            int distance = last[value] - first[value];

            if (distance > 0) {
                distanceCount[distance] += delta;
                bucketCount[distance / blockSize] += delta;
            }
        }

        static int getMaxDistance() {
            for (int bucket = bucketCount.length - 1;
                 bucket >= 0; bucket--) {

                if (bucketCount[bucket] == 0) {
                    continue;
                }

                int start = bucket * blockSize;
                int end = Math.min(n - 1,
                        (bucket + 1) * blockSize - 1);

                for (int distance = end; distance >= start; distance--) {
                    if (distanceCount[distance] > 0) {
                        return distance;
                    }
                }
            }

            return 0;
        }
    }
}
