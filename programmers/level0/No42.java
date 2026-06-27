package level0;
/*
문제: 배열 뒤집기

로직
- 결과를 저장할 answer 배열을 생성한다.
- num_list를 앞에서부터 순회하면서 뒤에서부터 값을 꺼내 answer에 저장한다.

핵심 구현
- 핵심 코드
  answer[i] = num_list[num_list.length - 1 - i];

- 핵심 코드 설명
  현재 인덱스 i에 대해 원본 배열의 마지막 원소부터 차례대로 접근하여
  answer 배열에 저장한다.
  (배열 길이 - 1 - i)를 사용하면 역순 인덱스를 쉽게 구할 수 있다.

포인트
- 새로운 배열을 생성하여 역순으로 저장한다.
- 역순 인덱스는 (배열 길이 - 1 - i) 공식을 사용하면 간단하게 계산할 수 있다.
- 배열을 한 번만 순회하므로 효율적으로 구현할 수 있다.

회고
- 배열의 인덱스를 반대로 계산하는 방법을 연습할 수 있었다.
- 역순 문제에서는 (length - 1 - i) 공식을 기억해두면 다양한 문제에 활용할 수 있다.
*/
public class No42 {
    class Solution {
        public int[] solution(int[] num_list) {
            int[] answer = new int[num_list.length];

            for (int i = 0; i < num_list.length; i++) {
                answer[i] = num_list[num_list.length - 1 - i];
            }

            return answer;
        }
    }
}
