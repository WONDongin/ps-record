package level0;
/*
문제: 원하는 문자열 찾기

idx보다 크거나 같은 인덱스 중에서 배열의 값이 1인 가장 작은 인덱스를
찾아 반환한다. 조건을 만족하는 인덱스가 없다면 -1을 반환한다.

풀이
- `idx`부터 배열의 마지막 인덱스까지 순회한다.
- 값이 1인 원소를 발견하면 해당 인덱스를 즉시 반환한다.
- 반복문이 끝날 때까지 찾지 못하면 -1을 반환한다.

핵심 구현
```java
for (int i = idx; i < arr.length; i++) {
    if (arr[i] == 1) {
        return i;
    }
}
```

회고
- 가장 작은 인덱스를 찾아야 하므로 idx부터 순서대로 확인했다.
- 조건을 만족하는 값을 발견하는 즉시 반환하여 불필요한 반복을 줄였다.
*/
public class No143 {
    class Solution {
        public int solution(int[] arr, int idx) {
            for (int i = idx; i < arr.length; i++) {
                if (arr[i] == 1) {
                    return i;
                }
            }

            return -1;
        }
    }
}
