package no_5554;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
문제-5554 (브론즈4): 심부름 가는 길
- 네 줄에 걸쳐 초(second) 단위의 시간이 주어진다.
- 네 값을 모두 더한 뒤, 분(minute) 과 초(second) 로 나누어 출력

주요 알고리즘

- 4개의 시간을 모두 더해 총 초(totalSeconds)를 구한다.
- 분 = `totalSeconds / 60`
- 초 = `totalSeconds % 60`
- 각각 한 줄씩 출력
*/
public class No5554 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int totalSeconds = 0;

        // 4개의 이동 시간(초)을 입력받아 합산
        for (int i = 0; i < 4; i++) {
            totalSeconds += Integer.parseInt(br.readLine());
        }

        // 분과 초 계산
        int minutes = totalSeconds / 60;
        int seconds = totalSeconds % 60;

        // 결과 출력
        System.out.println(minutes);
        System.out.println(seconds);
    }
}
