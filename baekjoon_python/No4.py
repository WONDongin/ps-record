"""
문제-2884 (브론즈3): 알림시계
- 현재 시각을 분으로 변환 → 45분 빼기 → 음수면 24시간 더하기 → 시/분 재계산
"""
a, b = map(int, input().split())
total = a * 60 + b - 45

# 음수가 되면 하루 전으로 이동
if total < 0:
    total += 24 * 60

# // 정수 나눗셈
a = total // 60
b = total % 60
print(a, b)