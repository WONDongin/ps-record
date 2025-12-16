package no_2261;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

/*
문제-2261 (플래티넘2): 가장 가까운 두 점
- 2차원 평면상에 n개의 점이 주어졌을 때, 이 점들 중 가장 가까운 두 점을 구하는 프로그램
- 첫째 줄에 가장 가까운 두 점의 거리의 제곱을 출력

주요 메서드

`main()`
- 입력된 좌표를 Point 객체로 저장
- 전체 점을 x좌표 기준으로 정렬
- 분할정복 시작점으로 solve(0, n-1) 호출
- 가장 가까운 두 점의 거리 제곱 출력

`solve(int left, int right)`
- [left, right] 구간에서 가장 가까운 두 점의 거리 제곱을 반환하는 분할정복 함수
- 점 개수가 3개 이하일 경우 브루트포스로 직접 계산
- 중앙 기준으로 좌/우를 나누어 재귀적으로 최소 거리 계산
- 중앙 경계 근처(strip)에서 발생할 수 있는 더 가까운 쌍을 추가로 검사

주요 알고리즘

분할정복 (Divide and Conquer)
- 점들을 x좌표 기준으로 정렬한 뒤 절반씩 분할
- 각 구간에서의 최소 거리 계산 결과를 병합

브루트포스 종료 조건
- 점 개수가 3개 이하인 경우
- 모든 점 쌍을 직접 비교하여 최소 거리 계산
- 재귀 종료 조건으로 사용

Strip 구성 (경계 후보군 추출)
- 좌/우 구간의 최소 거리 d를 기준으로
- 중앙선과의 x좌표 차이가 √d 미만인 점만 후보로 선택
- 불필요한 비교를 제거하여 성능 최적화

Y좌표 기준 정렬 및 제한 비교
- strip 내부 점들을 y좌표 기준으로 정렬
- y좌표 차이가 √d 이상이면 이후 점은 더 멀어지므로 비교 중단
- 기하학적 성질에 의해 한 점당 최대 7개까지만 비교됨

시간 복잡도
- 전체 알고리즘: O(N log N)
- strip 내부 비교는 상수 시간으로 제한됨

*/
public class No2261 {
    static class Point{
        int x, y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    static Point[] point;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        point = new Point[n];

        // 입력을 받아 Point 배열에 저장
        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            point[i] = new Point(x, y);
        }

        // x좌표 기준으로 정렬
        Arrays.sort(point, (a, b) -> a.x - b.x);

        long answer = solve(0, n - 1);
        System.out.println(answer);
    }
    // 분할정복 함수
    static long solve(int left, int right){
        // 종료 조건: 점이 2~3개
        if(right - left <= 2){
            long min = Long.MAX_VALUE;

            for (int i = left; i <= right; i++) {
                for (int j = i + 1; j <= right; j++) {
                    long dx = point[i].x - point[j].x;
                    long dy = point[i].y - point[j].y;
                    long dist = dx * dx + dy * dy;
                    min = Math.min(min, dist);
                }
            }
            return min;
        }

        int mid = (left + right) / 2;
        long dLeft = solve(left, mid);
        long dRight = solve(mid + 1, right);
        long d = Math.min(dLeft, dRight);

        int midX = point[mid].x;
        List<Point> strip = new ArrayList<>();

        // strip 구성
        for (int i = left; i <= right; i++) {
            long dx = point[i].x - midX;
            if (dx * dx < d) {
                strip.add(point[i]);
            }
        }

        // y 기준 정렬
        strip.sort((a, b) -> a.y - b.y);

        // strip 내부 비교
        for (int i = 0; i < strip.size(); i++) {
            for (int j = i + 1; j < strip.size(); j++) {

                long dy = strip.get(j).y - strip.get(i).y;
                if (dy * dy >= d) break;

                long dx = strip.get(j).x - strip.get(i).x;
                long dist = dx * dx + dy * dy;

                d = Math.min(d, dist);
            }
        }

        return d;
    }
}