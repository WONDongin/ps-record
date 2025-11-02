"""
문제-2798 (브론즈2): 블랙잭
- 세 카드의 합이 M을 넘지 않으면서 가능한 한 M에 가까운 값 찾기
N : 카드 개수
M : 최대 합 한도
N개의 카드에 적힌 수

주요 메서드 및 알고리즘
- cards 리스트 입력받기
- 모든 카드 3장의 조합 탐색
- 합이 M보다 작거나 같으면 최대값 갱신
- 최종 최대 합 출력
"""
N, M = map(int, input().split())
cards = list(map(int, input().split()))

max_sum = 0 # 최댓값 저장 변수

# 첫 번째 카드 선택
for i in range(N):
    # 두 번째 카드 선택(중복x)
    for j in range(i + 1, N):
        for k in range(j + 1, N):
            total = cards[i] + cards[j] + cards[k]
            if total <= M:
                max_sum = max(max_sum, total)

print(max_sum)