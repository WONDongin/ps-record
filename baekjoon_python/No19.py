"""
문제-1018 (실버3): 체스판 다시 칠하기
- M×N 크기의 보드가 있음 (검은색 ‘B’, 흰색 ‘W’)
- 이 보드에서 임의의 8×8 부분을 잘라서
- 체스판 패턴(흑백 교차) 으로 만들고 싶음, 다시 칠해야 하는 최소 칸 수를 구하는 문제

주요 메서드 및 알고리즘
브루트포스 (Brute Force)
- 가능한 모든 8×8 부분보드 탐색

2차원 배열 탐색
- 각 칸의 색상 비교 (x + y) % 2 활용

조건 분기
- (짝수 → 시작색 / 홀수 → 반대색)

`input().split()`	공백으로 구분된 M, N 입력 받기
`list(input().strip())`	문자열을 리스트 형태로 변환 (보드 한 줄 입력)
`range(M - 7)`	가능한 8×8 시작점 탐색 범위
`(x + y) % 2`	체스판 색깔 교차 판별 핵심
`min(a, b, c)`	최소 칠하기 횟수 계산
`for ... in ...:`	2중, 3중 루프로 전체 탐색
"""
M, N = map(int, input().split())
board = [list(input().strip()) for _ in range(M)]

min_count = 64  # 8x8 전체를 다 칠해도 최대 64칸

for i in range(M - 7):        # 세로 시작점
    for j in range(N - 7):    # 가로 시작점
        w_start = 0  # 왼쪽 위가 흰색(W)일 때 다시 칠해야 할 칸 수
        b_start = 0  # 왼쪽 위가 검은색(B)일 때 다시 칠해야 할 칸 수

        for x in range(i, i + 8):      # 8행
            for y in range(j, j + 8):  # 8열
                current = board[x][y]
                # (x + y)의 합이 짝수면 시작색과 같아야 함
                if (x + y) % 2 == 0:
                    if current != 'W':
                        w_start += 1
                    if current != 'B':
                        b_start += 1
                # (x + y)의 합이 홀수면 시작색의 반대여야 함
                else:
                    if current != 'B':
                        w_start += 1
                    if current != 'W':
                        b_start += 1

        # 최소 칠하기 횟수 갱신
        min_count = min(min_count, w_start, b_start)

print(min_count)
