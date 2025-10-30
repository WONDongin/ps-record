"""
문제-2577 (브론즈2): 숫자의 개수
- A = 150, B = 266, C = 427 이라면
- A × B × C = 150 × 266 × 427 = 17037300 이 되고,
  계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.

`int(input())` : 사용자로부터 정수를 입력받음
`str()` : 정수를 문자열로 변환 (자릿수 순회용)
`for i in range(10)` : 0~9까지 반복
`count()` : 문자열 내 특정 문자의 개수를 반환
`print()` : 각 숫자의 등장 횟수를 출력
"""
A = int(input())
B = int(input())
C = int(input())

sum = int(A * B * C)
s = str(sum)

for i in range(10):
    print(s.count(str(i)))
