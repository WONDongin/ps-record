"""
문제 (브론즈3) : A/B
divmod(a, b) : 몫(q)과 나머지(r)를 한 번에 튜플로 반환하는 함수
"""
a, b = map(int, input().split())
q, r = divmod(a, b)

# 유클리드 나눔셈 보정(r은항상 0 이상이어야함)
if r < 0:
    q += 1
    r -= b

print(q)
print(r)