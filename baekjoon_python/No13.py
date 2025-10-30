"""
문제-2675 (브론즈2): 문자열 반복

주요 메서드 및 알고리즘
- `input().split()` : 한 줄에서 공백 기준으로 분리 (반복횟수 R, 문자열 S)
- `int(R)` : 문자열을 정수로 변환
- `for ch in S` : 문자열의 각 문자 순회
- `ch * R` : 문자를 R번 반복
- `print(..., end='')` : 줄바꿈 없이 출력
- `print()` : 테스트 케이스 간 줄바꿈
"""
T = int(input())

for i in range(T):
    R, S = input().split()
    R = int(R)

    for ch in S:
        print(ch * R, end='')  # 문자 R번 반복
    print()  # 한 케이스 끝날 때 줄바꿈
