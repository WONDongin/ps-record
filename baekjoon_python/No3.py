"""
문제-14681 (브론즈5): 사분면 고르기
- if, elif 문 활용
"""
a = int(input())
b = int(input())

if a > 0 and b > 0:
    print("1")
elif a < 0 and b > 0:
    print("2")
elif a < 0 and b < 0:
    print("3")
else:
    print("4")