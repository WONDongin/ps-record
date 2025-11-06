#include <stdio.h>
#include <stdbool.h>
/*
문제-2581 (브론즈2): 범위 내 소수찾기
- M=60, N=100인 경우 60이상 100이하의 자연수 중
- 소수는 61, 67, 71, 73, 79, 83, 89, 97 총 8개가 있으므로
- 이들 소수의 합은 620이고, 최솟값은 61이 된다

주요 메서드 및 알고리즘
1. is_prime(int num)
- 2보다 작은 수는 소수 x
- 2부터 num까지 나누어 떨어지는 수가 있는지 확인
- 하나라도 나누어 떨어지면 소수가 아님 (false 반환)
- 그렇지 않으면 소수임 (true 반환)

2. 소수 찾기 반복 (`for (int i = M; i <= N; i++)`)
- M 이상 N 이하의 모든 자연수에 대해 소수 여부를 검사
- is_prime(i)를 이용해 소수이면 누적합에 더하고, 최소값을 기록
- 최소값은 처음 소수를 만났을 때만 저장

3. 출력 및 예외처리
- 소수의 합이 0이면 (즉, 소수가 하나도 없으면) -1 출력
- 아니면 소수들의 합과 최솟값 출력
*/
bool is_prime(int num) {
    if (num < 2) return false;
    for (int i = 2; i * i <= num; i++) {
        if (num % i == 0)
            return false;
    }
    return true;
}

int main() {
    int M, N;
    scanf("%d %d", &M, &N);

    int sum = 0;
    int min_prime = -1;

    for (int i = M; i <= N; i++) {
        if (is_prime(i)) {
            sum += i;
            if (min_prime == -1)
                min_prime = i;
        }
    }

    if (sum == 0) {
        printf("-1\n"); // 소수가 없을 경우
    } else {
        printf("%d\n%d\n", sum, min_prime);
    }

    return 0;
}
