package no_1058;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
문제: 1058번 - 친구

로직
- 사람들의 친구 관계를 2차원 배열에 저장한다.
- 각 사람을 기준으로 다른 모든 사람과의 친구 관계를 확인한다.
- 직접 친구이거나 공통 친구가 존재하면 2-친구의 수를 증가시킨다.
- 모든 사람의 2-친구 수 중 최댓값을 출력한다.

핵심 구현
- friends[i][j]가 'Y'이면 직접 친구로 판단한다.
- 직접 친구가 아닌 경우 중간 친구 k를 탐색한다.
- friends[i][k]와 friends[k][j]가 모두 'Y'이면 2-친구로 판단한다.
- Math.max()를 사용하여 가장 많은 2-친구 수를 갱신한다.

포인트
- 자기 자신은 친구 수에 포함하지 않는다.
- 공통 친구가 여러 명이어도 동일한 사람은 한 번만 계산한다.
- 사람의 수가 최대 50명이므로 3중 반복문으로 해결할 수 있다.

회고
- 인접 행렬을 활용하여 직접 연결된 관계와 간접 연결된 관계를 확인했다.
- 그래프에서 최대 두 번의 이동으로 도달할 수 있는 사람의 수를 구했다.
*/
public class No1058 {
    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int n = Integer.parseInt(br.readLine());
            char[][] friends = new char[n][n];

            for (int i = 0; i < n; i++) {
                friends[i] = br.readLine().toCharArray();
            }

            int answer = 0;

            for (int i = 0; i < n; i++) {
                int count = 0;

                for (int j = 0; j < n; j++) {
                    if (i == j) {
                        continue;
                    }

                    if (friends[i][j] == 'Y') {
                        count++;
                        continue;
                    }

                    for (int k = 0; k < n; k++) {
                        if (friends[i][k] == 'Y' && friends[k][j] == 'Y') {
                            count++;
                            break;
                        }
                    }
                }

                answer = Math.max(answer, count);
            }

            System.out.println(answer);
        }
    }
}
