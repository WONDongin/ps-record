package no_10431;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
문제-10431 (실버5): 줄세우기
- 학생들이 순서대로 줄에 들어온다
- 현재 학생보다 키가 큰 학생 앞에 위치해야 한다
- 학생이 들어올 때마다 이동 횟수를 누적하여 총 이동 횟수를 구하는 문제

접근 방법
- 학생들이 들어올 때마다 앞에 있는 학생들과 비교
- 현재 학생보다 큰 학생의 수를 카운트
- 해당 개수를 누적하여 이동 횟수 계산

핵심 아이디어
- "앞에 있는 나보다 큰 학생 수 = 이동 횟수"
- 실제로 배열을 이동시키지 않아도 됨
- 단순 비교로 해결 가능 (O(N^2))

처리 흐름
- 테스트 케이스 수 입력
- 각 케이스마다
  → 케이스 번호 입력
  → 학생 20명 입력
  → 앞쪽 학생들과 비교하며 이동 횟수 누적
- 결과 출력 (케이스번호 + 이동횟수)
*/
public class No10431 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int caseNum = Integer.parseInt(st.nextToken());
            int[] arr = new int[20];

            for (int i = 0; i < 20; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            int count = 0;

            for (int i = 0; i < 20; i++) {
                for (int j = 0; j < i; j++) {
                    if (arr[j] > arr[i]) {
                        count++;
                    }
                }
            }

            System.out.println(caseNum + " " + count);
        }
    }
}
