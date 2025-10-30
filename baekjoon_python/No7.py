"""
문제-2562 (브론즈3): 최댓값
- 9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고
  그 최댓값이 몇 번째 수인지를 구하는 프로그램
"""

my_list = []

for i in range(9):
    T = int(input())
    my_list.append(T)

max_val = max(my_list)                     # 최댓값 계산
position = my_list.index(max_val) + 1      # 인덱스는 0부터 → +1

print(max_val)
print(position)