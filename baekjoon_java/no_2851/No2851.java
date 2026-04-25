package no_2851;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
문제-2851 (브론즈1): 슈퍼 마리오
- 10개의 버섯 점수가 주어진다
- 순서대로 점수를 더해가며 100에 가장 가까운 점수를 출력
- 100과의 차이가 같다면 더 큰 점수를 선택

접근 방법
- 버섯 점수를 순서대로 누적합으로 계산
- 매번 현재 합이 100에 더 가까운지 비교
- 차이가 같을 경우 더 큰 값을 저장

핵심 아이디어
- 모든 버섯은 순서대로 먹어야 하므로 누적합만 확인하면 됨
- 기준값은 100
- 비교 기준:
  - |100 - 현재합|이 더 작으면 갱신
  - 차이가 같으면 더 큰 점수로 갱신

처리 흐름
- 입력
- sum에 버섯 점수 누적
- 현재 sum과 answer의 100과의 차이 비교
- 더 가까운 값으로 answer 갱신
- answer 출력
*/
public class No2851 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        int answer = 0;

        for (int i = 0; i < 10; i++) {
            int score = Integer.parseInt(br.readLine());
            sum += score;

            int currentDiff = Math.abs(100 - sum);
            int answerDiff = Math.abs(100 - answer);

            if (currentDiff < answerDiff) {
                answer = sum;
            } else if (currentDiff == answerDiff && sum > answer) {
                answer = sum;
            }
        }

        System.out.println(answer);
    }
}
