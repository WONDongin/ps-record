package level2;
/*
문제: 카펫

로직
- 갈색 격자와 노란색 격자의 합으로 카펫의 전체 넓이를 구한다.
- 세로 길이를 3부터 증가시키면서 전체 넓이를 나누어 가로 길이를 구한다.
- 테두리를 제외한 내부 넓이가 노란색 격자 수와 같으면 가로와 세로를 반환한다.

핵심 구현
- 전체 넓이는 brown + yellow이다.
- 전체 넓이를 세로 길이로 나누어떨어질 때만 가로 길이를 계산한다.
- (가로 - 2) * (세로 - 2)가 yellow와 같은지 확인한다.

포인트
- 노란색 영역이 존재하므로 가로와 세로는 최소 3이다.
- 가로가 세로보다 크거나 같으므로 세로는 전체 넓이의 제곱근까지만 확인한다.
- 테두리가 한 줄이므로 내부 영역은 가로와 세로에서 각각 2를 뺀 크기이다.

회고
- 전체 넓이의 약수 쌍을 탐색하여 카펫의 크기를 구했다.
- 테두리를 제외한 내부 넓이를 조건으로 활용해 정답을 찾았다.
*/
public class No13 {
    class Solution {
        public int[] solution(int brown, int yellow) {
            int total = brown + yellow;

            for (int height = 3; height * height <= total; height++) {
                if (total % height != 0) {
                    continue;
                }

                int width = total / height;

                if ((width - 2) * (height - 2) == yellow) {
                    return new int[]{width, height};
                }
            }

            return new int[0];
        }
    }
}
