package kakaco;
/*
문제-프로그래머스: 스타 수열

[문제 요약]
- 배열에서 조건을 만족하는 가장 긴 스타 수열의 길이를 구하는 문제
- 스타 수열 조건:
  1) 길이는 짝수
  2) 각 쌍은 서로 다른 값
  3) 모든 쌍에 공통으로 포함되는 값 존재

[접근 방법]
- 특정 값 v를 기준으로 스타 수열 구성
- v를 포함하는 쌍을 최대한 많이 선택
- 인접한 두 원소를 확인하며 조건 만족 시 쌍 구성

[핵심 아이디어]
- 스타 수열은 반드시 "공통 원소 1개" 존재
- 따라서 모든 경우 탐색이 아닌 "각 값 기준 greedy" 접근
- 한 번 사용한 원소는 재사용 불가 → i++

[처리 흐름]
값 등장 횟수 count → 기준값 선택 → 인접 쌍 탐색 → 최대 길이 갱신

[시간복잡도]
- O(N)
*/
public class No1 {
    public int solution(int[] a) {

        int n = a.length;
        if (n < 2) return 0;

        int[] count = new int[n];
        for (int num : a) {
            count[num]++;
        }

        int answer = 0;

        for (int v = 0; v < n; v++) {

            // 가지치기: 이미 최대보다 작으면 skip
            if (count[v] * 2 <= answer) continue;

            int pair = 0;

            for (int i = 0; i < n - 1; i++) {

                if ((a[i] == v || a[i + 1] == v) && a[i] != a[i + 1]) {
                    pair++;
                    i++; // 쌍 사용 → 다음 skip
                }
            }

            answer = Math.max(answer, pair * 2);
        }

        return answer;
    }
}
