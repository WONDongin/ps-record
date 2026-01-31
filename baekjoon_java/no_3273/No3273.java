package no_3273;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
/*
문제-3273 (실버3): 두 수의 합
- 정수 배열이 주어질 때,
- 서로 다른 두 수의 합이 X가 되는 쌍의 개수를 구한다.
- (a, b)와 (b, a)는 같은 쌍으로 취급한다.

주요 메서드

- Arrays.sort() : 배열 정렬
- 투 포인터(left, right) : 배열 양 끝에서 시작하여 합 비교
- while(left < right) : 서로 다른 두 인덱스를 보장하며 탐색

주요 알고리즘

- 투 포인터 (Two Pointer)
- 정렬된 배열에서
  - 합 < X → left 증가
  - 합 > X → right 감소
  - 합 == X → count 증가 후 양쪽 포인터 이동
- 시간 복잡도: O(N log N) (정렬)
- 공간 복잡도: O(1) (추가 자료구조 없음)
*/
public class No3273 {
    public static void main(String[] args) throws IOException {
        // 입력 처리
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = Integer.parseInt(st.nextToken());
        }

        // 배열 정렬
        Arrays.sort(list);

        // 목표 합 X
        int X = Integer.parseInt(br.readLine());

        // 투 포인터 초기화 (인덱스 기준)
        int left = 0;
        int right = n - 1;
        int count = 0;

        // 두 포인터가 교차하기 전까지 반복
        while (left < right) {
            int sum = list[left] + list[right];

            if (sum < X) {
                // 합이 작으면 더 큰 값을 만들기 위해 left 이동
                left++;
            } else if (sum > X) {
                // 합이 크면 더 작은 값을 만들기 위해 right 이동
                right--;
            } else {
                // 합이 X인 경우 유효한 쌍 발견
                count++;
                // 중복 방지를 위해 두 포인터 모두 이동
                left++;
                right--;
            }
        }

        // 결과 출력
        System.out.println(count);
    }
}
