# print("Hello World!")
"""
문제 :  A+B
각 테스트 케이스마다 "Case #x: "를 출력한 다음, A+B를 출력

주요 로직
input() : 사용자 입력받기
map() : 다중 입력값을 한 번에 정수형으로 변환
for i in range(T) : for 반복문
print(f"Case #{i+1}: {a + b}" : 포맷 문자열(f-string)을 이용해 지정된 출력 형식으로 결과 표시
"""
T = int(input())
for i in range(T):
    a, b = map(int, input().split())
    print(f"Case #{i + 1}: {a + b}")
