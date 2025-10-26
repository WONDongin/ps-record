"""
문제 (브로즌5): 합
- 끝값은 포함되지 않는다

(start, end)의 규칙
- start: 시작값 (포함)
- end: 끝값 (제외)

`range(1, 5)` → 1, 2, 3, 4
`range(0, 5)` → 0, 1, 2, 3, 4
"""
T = int(input())
sum = 0
for i in range(1, T + 1):
    sum += i
# (T*(T+1)//2) - 수학공식
print(sum)