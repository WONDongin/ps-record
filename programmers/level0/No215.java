package level0;
/*
문제: 삼각형의 완성조건 (2)
로직 - 나머지 변 x는 두 변의 차보다 크고 두 변의 합보다 작아야 한다.
핵심 구현 - |a - b| < x < a + b를 만족하는 정수의 개수는 2 * min(a, b) - 1이다.
포인트 - 나머지 변이 가장 긴 경우와 기존 변이 가장 긴 경우를 한 번에 계산할 수 있다.
회고 - 삼각형 부등식을 x의 범위로 바꾸면 반복문 없이 답을 구할 수 있다.
*/
public class No215 {
    class Solution {
        public int solution(int[] sides) {
            return 2 * Math.min(sides[0], sides[1]) - 1;
        }
    }
}
