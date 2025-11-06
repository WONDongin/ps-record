"""
문제-9020 (실버2): 골드바흐의 추측
- 소수 판별 + 두 소수의 합 찾기

주요 메서드 및 알고리즘
1. 소수(Prime Number) 구하기
- 2부터 주어진 최댓값(예: 10,000)까지의 소수를 미리 구해놓으면 효율적입니다.

2. 에라토스테네스의 체(Sieve of Eratosthenes) 알고리즘 사용.
- 골드바흐 파티션 찾기
- 입력받은 짝수 n에 대해 `a + b = n (단, a ≤ b, a,b 모두 소수)`
- a는 n // 2부터 2까지 내려가며 탐색 > 두 소수의 차이가 가장 작은 조합이 먼저 나옴.

3. 여러 테스트 케이스 처리
- 입력받은 짝수들 각각에 대해 결과 출력.

# 실버문제 난이도 부터는 다소 심오하다
"""

def sieve(max_num):                       # 에라토스테네스의 체: 0~max_num 범위의 소수 여부를 미리 계산하는 함수
    is_prime = [True] * (max_num + 1)     # 길이 max_num+1의 리스트를 True로 초기화 (인덱스 = 그 수)
    is_prime[0], is_prime[1] = False, False  # 0과 1은 소수가 아니므로 False로 설정

    for i in range(2, int(max_num ** 0.5) + 1):  # i는 2부터 sqrt(max_num)까지 반복 (소수 판정 상한)
        if is_prime[i]:                          # i가 소수라면
            for j in range(i * i, max_num + 1, i):  # i의 제곱부터 i 배수들을 모두 소수가 아님으로 표시
                is_prime[j] = False                 # 배수는 합성수 → False
    return is_prime                              # 인덱스가 수, 값이 소수여부인 리스트 반환


def goldbach(n, is_prime):                # 주어진 짝수 n의 골드바흐 파티션(차이가 최소인 두 소수) 찾는 함수
    for a in range(n // 2, 1, -1):        # 중앙(n//2)에서 2까지 내려가며 탐색 (차이가 가장 작은 조합이 먼저 걸림)
        b = n - a                         # b는 n - a
        if is_prime[a] and is_prime[b]:   # a와 b가 모두 소수면
            return a, b                   # 바로 그 쌍을 반환 (차이 최소 조건 자동 충족)


if __name__ == "__main__":                # 이 파일을 직접 실행할 때만 아래 코드 실행
    T = int(input())                      # 테스트 케이스 개수 입력
    is_prime = sieve(10000)               # 10,000 이하 모든 수에 대한 소수 여부 미리 계산 (문제 조건 상 한 번만 하면 됨)

    for _ in range(T):                    # T번 반복
        n = int(input())                  # 짝수 n 입력
        a, b = goldbach(n, is_prime)      # n의 골드바흐 파티션 구하기
        print(a, b)                       # 결과 출력 (작은 수 a, 큰 수 b 형태)
