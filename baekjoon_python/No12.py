"""
문제-1157 (브론즈1): 단어공부
- 알파벳 대소문자로 된 단어가 주어지면,
  이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오.
- 단, 대문자와 소문자를 구분하지 않는다.

주요 메서드 및 알고림즘
`s = input().upper()` : 대소문자 구분 제거 (모두 대문자로 변환)
`count = Counter(s)` : {'A': 3, 'B': 1, ...} 형태로 자동 집계됨

`max_letters = [k for k, v in count.items() if v == max_val]`
- 리스트 컴프리헨션으로 max값과 동일한 문자들 찾기

`count.items()` : Counter 또는 dict에서 (key, value) 쌍을 꺼냄. 예: {'A':3, 'B':1, 'C':3} → [('A',3), ('B',1), ('C',3)]
`for k, v in count.items()`: 각 알파벳(k)과 등장횟수(v)를 하나씩 순회
`if v == max_val` : 등장횟수가 최댓값(max_val)과 같은 경우만 필터링
`[k ...]` :조건을 만족하는 k (알파벳 문자)만 리스트에 담음

count = {'A': 3, 'B': 1, 'C': 3}
max_val = 3

max_letters = [k for k, v in count.items() if v == max_val]
print(max_letters)

# “등장 횟수(v)가 최대값(max_val)인 문자(k)들만 리스트로 모아라.”
"""

s = input().upper()

# 각 알파벳 빈도 세기
from collections import Counter
count = Counter(s)

# 3최댓값(가장 많이 나온 횟수)
max_val = max(count.values())

# 최댓값을 가진 문자가 여러 개면 '?', 하나면 그 문자 출력
max_letters = [k for k, v in count.items() if v == max_val]

if len(max_letters) > 1:
    print('?')
else:
    print(max_letters[0])
