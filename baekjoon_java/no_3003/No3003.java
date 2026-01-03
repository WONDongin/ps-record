package no_3003;

import java.io.IOException;
import java.util.Scanner;
/*
문제-3003(브론즈5): 킹, 퀸, 룩, 비숍, 나이트, 폰
- 입력으로 현재 가지고 있는 말의 개수가 주어질 때,
- 각 말마다 더하거나 빼야 할 개수를 출력

주요 메서드

- 기준 배열(correct) : 체스 말의 올바른 개수 저장
- 입력 값과 차이 계산 : correct[i] - input

주요 알고리즘

- 배열 순회 1회
- 시간 복잡도: O(1) (고정 길이 6)
- 공간 복잡도: O(1)
*/
public class No3003 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int[] correct = {1, 1, 2, 2, 2, 8};

        for (int i = 0; i < 6; i++) {
            int current = sc.nextInt();
            System.out.print((correct[i] - current) + " ");
        }
    }
}
