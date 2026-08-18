package level0;
/*
## 문제

정수 리스트를 n번째 원소 이후의 구간과 n번째까지의 구간으로 나눈 후,
두 구간의 순서를 바꾼 배열을 반환한다.

## 풀이

- `n`번 인덱스부터 마지막 원소까지 결과 배열에 저장한다.
- 이후 `0`번 인덱스부터 `n - 1`번 인덱스까지 저장한다.
- 별도의 `index` 변수를 사용해 결과 배열의 위치를 관리했다.

## 핵심 구현

```java
for (int i = n; i < num_list.length; i++) {
    answer[index++] = num_list[i];
}

for (int i = 0; i < n; i++) {
    answer[index++] = num_list[i];
}

## 회고

배열의 n번째 원소와 n번 인덱스를 구분하는 것이 중요했다.
두 구간을 순서대로 복사하여 배열의 위치를 변경했다.
*/
public class No141 {
    class Solution {
        public int[] solution(int[] num_list, int n) {
            int[] answer = new int[num_list.length];
            int index = 0;

            // n번째 원소 이후부터 마지막 원소까지 추가
            for (int i = n; i < num_list.length; i++) {
                answer[index++] = num_list[i];
            }

            // 첫 번째 원소부터 n번째 원소까지 추가
            for (int i = 0; i < n; i++) {
                answer[index++] = num_list[i];
            }

            return answer;
        }
    }
}
