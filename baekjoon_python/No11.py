"""
문제-8958 (브론즈2): OX퀴즈
- "OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점
"""
T = int(input())

for i in range(T):
    s = input()      # "OOXXOXXOOO"
    cnt = 0          # 연속된 O의 개수
    score = 0        # 총 점수

    for ch in s:
        if ch == 'O':    # 알파벳 O
            cnt += 1
            score += cnt
        else:
            cnt = 0      # X면 연속 끊김
    print(score)
