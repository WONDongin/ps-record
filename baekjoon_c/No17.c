#include <stdio.h>
/*
문제-2775 (브론즈1): 부녀회장이 퇼테야
- 주어지는 양의 정수 k와 n에 대해 k층에 n호에는 몇 명이 살고 있는지 출력
- 아파트에는 0층부터 있고 각층에는 1호부터 있으며, 0층의 i호에는 i명이 산다.

주요 메서드 및 알고리즘
1. 0층 i호에는 i명이 산다.
- `apt[0][i] = i`

2. a층 b호에는 (a-1층 1호부터 b호까지의 사람 수 합) 만큼 사람이 산다.
- 이전 층과 같은 층의 바로 왼쪽 집 값을 이용해 누적
- 점화식 : `apt[a][b] = apt[a][b-1] + apt[a-1][b]`
0층: 1 2 3 4 5 ...
1층: 1 3 6 10 15 ...
2층: 1 4 10 20 35 ...
*/
#include <stdio.h>

int main(void) {
    int T;
    scanf("%d", &T);

    while (T--) {
        int k, n;
        scanf("%d %d", &k, &n);

        // 최대 14층, 14호까지 충분
        int apt[15][15] = {0};

        // 0층 초기화
        for (int i = 1; i <= n; i++) {
            apt[0][i] = i;
        }

        // 층별 사람 수 계산
        for (int i = 1; i <= k; i++) {
            for (int j = 1; j <= n; j++) {
                apt[i][j] = apt[i][j - 1] + apt[i - 1][j];
            }
        }
        printf("%d\n", apt[k][n]);
    }
    return 0;
}