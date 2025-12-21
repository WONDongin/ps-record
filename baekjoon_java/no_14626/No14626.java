package no_14626;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
문제-14626 (실버1): ISBN

주요 메서드

`BufferedReader.readLine()`
- ISBN 문자열(길이 13)을 한 줄로 입력받기 위한 메서드
- 불필요한 공백 제거 후 문자 단위 처리에 사용

`String.charAt(int index)`
- ISBN 각 자리 문자를 순회하며 숫자 또는 * 여부를 판별

`for` 반복문
- `ISBN` 13자리를 한 번 순회하며
- * 위치 탐색 + 나머지 자리의 가중 합 계산

주요 알고리즘

1. ISBN-13 가중치 합 계산
- 인덱스 기준
    - 짝수 인덱스 → 가중치 1
    - 홀수 인덱스 → 가중치 3
- *를 제외한 숫자들만 가중치를 곱해 knownSum 누적

2. 미확정 자리(*) 탐색
- *가 위치한 인덱스를 저장하여
- 해당 위치의 가중치(1 또는 3) 결정

3. 완전 탐색(Brute Force)
- * 자리에 0~9를 차례대로 대입
- knownSum + 후보값 × 가중치가
- 10으로 나누어 떨어지는 값을 찾음

4. 검증 조건
- 전체 가중치 합 sum % 10 == 0 만족 시
- 해당 숫자를 정답으로 출력하고 종료
 */
public class No14626 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().trim();

        int knownSum = 0;
        int starIdx = -1;

        // '*'를 제외한 합 계산
        for (int i = 0; i < 13; i++) {
            char ch = s.charAt(i);
            if (ch == '*') {
                starIdx = i;
                continue;
            }
            int digit = ch - '0';
            int weight = (i % 2 == 0) ? 1 : 3;
            knownSum += digit * weight;
        }

        // '*' 자리에 들어갈 숫자 찾기
        int starWeight = (starIdx % 2 == 0) ? 1 : 3;
        for (int x = 0; x <= 9; x++) {
            int total = knownSum + x * starWeight;
            if (total % 10 == 0) {
                System.out.println(x);
                break;
            }
        }
    }
}
