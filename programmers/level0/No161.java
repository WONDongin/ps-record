package level0;
/*
문제: 다음에 올 숫자

로직
- 첫 번째와 두 번째 원소의 차이와 두 번째와 세 번째 원소의 차이를 비교한다.
- 두 차이가 같으면 등차수열로 판단한다.
- 다르면 등비수열로 판단한다.

핵심 구현
- 등차수열: 마지막 원소에 공차를 더한다.
- 등비수열: 마지막 원소에 공비를 곱한다.

포인트
- common에는 등차수열 또는 등비수열만 주어진다.
- 앞의 세 원소만 비교해 수열의 종류를 판단할 수 있다.

회고
- 공차와 공비를 구분하여 다음 원소를 간단하게 계산했다.
*/
public class No161 {
    class Solution {
        public int solution(int[] common) {
            if (common[1] - common[0] == common[2] - common[1]) {
                int difference = common[1] - common[0];
                return common[common.length - 1] + difference;
            }

            int ratio = common[1] / common[0];
            return common[common.length - 1] * ratio;
        }
    }
}
