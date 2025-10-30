"""
문제-2920 (브론즈2): 음계
- 다장조는 c d e f g a b C, 총 8개 음으로 이루어져있다.
- 1부터 8까지 차례대로 연주한다면 ascending,
- 8부터 1까지 차례대로 연주한다면 descending,
- 둘 다 아니라면 mixed

`input().split()` :	입력값을 공백 단위로 나누어 리스트로 반환
`map(int, ...)` : 문자열을 정수로 변환
`sorted()` : 리스트를 오름차순 정렬
`sorted(..., reverse=True)` : 리스트를 내림차순 정렬
`==` : 두 리스트가 동일한지 비교
`if / elif / else` : 조건문을 통한 분기 처리
"""
s = list(map(int, input().split()))

asc = sorted(s)
des = sorted(s, reverse=True)

if s == asc:
    print("ascending")
elif s == des:
    print("descending")
else:
    print("mixed")
