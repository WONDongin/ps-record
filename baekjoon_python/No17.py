"""
문제-2231 (브론즈2): 분해합
- 그 자연수 N의 분해합은 N과 N을 이루는 각 자리수의 합을 의미한다.
- 어떤 자연수 M의 분해합이 N인 경우, M을 N의 생성자
- 245의 분해합은 256(=245+2+4+5)이 된다

주요 메서드 및 알고리즘
`start = max(1, N - 9 * len(str(N)))`
- N의 자리수만큼 9를 곱하면 “최대 자리수 합”을 알 수 있음

`sum(map(int, str(M)))`
- M을 문자열로 바꿔서 각 자리수를 정수로 변환하고 더하기

`if total == N`
- 분해합이 N이면, M이 생성자
- 가장 작은 생성자 이므로 break로 멈춤
"""
N = int(input())

result = 0 # 생성자가 없을 경우, 초기값
start = max(1, N - 9 * len(str(N)))

for M in range(start, N):
    total = M + sum(map(int, str(M)))
    if total == N:
        result = M
        break

print(result)