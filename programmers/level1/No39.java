package level1;
/*
문제-86491: 최소직사각형

[문제 요약]
- 여러 명함을 모두 수납할 수 있는 가장 작은 지갑 크기를 구하는 문제
- 명함은 회전 가능
- 모든 명함을 수납 가능한 최소 직사각형 넓이를 반환

[접근 방법]
- 각 명함의 긴 변과 짧은 변을 구분
- 긴 변은 가로(length)
- 짧은 변은 세로(height)로 통일
- 전체 명함 중 가장 큰 가로와 세로를 구해 넓이 계산

[핵심 아이디어]
- 명함은 회전 가능하므로 방향 통일이 중요
- Math.max(), Math.min()을 중첩 사용해 코드 간결화
- 향상된 for문 사용으로 가독성 개선

[처리 흐름]
명함 순회
→ 긴 변 / 짧은 변 구분
→ 최대 가로 갱신
→ 최대 세로 갱신
→ 넓이 계산 후 반환

[시간복잡도]
- O(N)
- 명함 배열을 한 번만 순회
*/
public class No39 {
    public int solution(int[][] sizes) {
        int length = 0, height = 0;
        for (int[] card : sizes) {
            length = Math.max(length, Math.max(card[0], card[1]));
            height = Math.max(height, Math.min(card[0], card[1]));
        }
        int answer = length * height;
        return answer;
    }
}
