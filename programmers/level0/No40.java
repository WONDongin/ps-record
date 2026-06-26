package level0;

import java.util.ArrayList;
/*
문제: 약수 구하기

로직
- 1부터 √n까지만 순회하며 약수를 탐색한다.
- i가 n의 약수라면 i와 n / i를 함께 리스트에 저장한다.
- 제곱수인 경우 같은 값이 중복되지 않도록 한 번만 저장한다.
- 저장된 약수를 오름차순으로 정렬한 뒤 int[] 배열로 변환하여 반환한다.

핵심 구현
- 핵심 코드
  for (int i = 1; i * i <= n; i++)

- 핵심 코드 설명
  약수는 항상 쌍으로 존재하므로 √n까지만 탐색하고, i와 n / i를 함께 저장하여 탐색 횟수를 줄였다. 이후 ArrayList를 int[]로 변환해 문제에서 요구하는 반환 형식에 맞췄다.

포인트
- √n까지만 탐색하여 시간 낭비를 줄였다.
- 제곱수인 경우(i == n / i) 중복 저장을 방지했다.
- ArrayList에 저장 후 정렬하고, 마지막에 int[]로 변환하여 반환했다.

회고
- 약수의 쌍을 활용하면 효율적으로 문제를 해결할 수 있다는 점을 다시 확인했다.
- 가변 크기 데이터는 ArrayList로 관리하고, 마지막에 배열로 변환하는 방식이 문제 풀이에서 자주 사용된다는 것을 익혔다.
*/
public class No40 {
    class Solution {
        public int[] solution(int n) {
            ArrayList<Integer> divisors  = new ArrayList<>();

            for(int i = 1; i * i <= n; i++){
                if(n % i == 0){
                    divisors .add(i);

                    if(i != n / i){
                        divisors .add(n / i);
                    }
                }
            }

            divisors.sort(Integer::compareTo);

            int[] answer = new int[divisors.size()];

            for (int i = 0; i < divisors.size(); i++) {
                answer[i] = divisors.get(i);
            }

            return answer;
        }
    }
}
