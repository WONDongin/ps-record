"""
문제-10818 (브론즈3): 최소, 최대
- N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램
"""

T = int(input())                          # 정수 개수 입력
my_list = list(map(int, input().split())) # 한 줄에 입력된 정수들 리스트로 변환

print(min(my_list), max(my_list))          # 최소, 최대 출력
