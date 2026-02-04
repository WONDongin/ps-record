package no_2083;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
문제-2083 (브론즈4): 럭비 클럽
- 이름, 나이, 몸무게가 주어짐
- 나이가 17세 초과이거나 몸무게가 80 이상이면 Senior
- 그렇지 않으면 Junior 출력
- 이름이 "#" 이면 입력 종료

주요 메서드
- BufferedReader.readLine() : 입력 처리
- StringTokenizer : 문자열 분리
- while(true) : 종료 조건이 나올 때까지 반복

주요 알고리즘
- 조건 분기(if)
- age > 17 OR weight >= 80 → Senior
- 그 외 → Junior

시간 복잡도
- O(N) (입력 줄 수만큼)

공간 복잡도
- O(1)
*/

public class No2083 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String line = br.readLine();
            StringTokenizer st = new StringTokenizer(line);

            String name = st.nextToken();
            int age = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());

            // 종료 조건
            if (name.equals("#")) break;

            if (age > 17 || weight >= 80) {
                System.out.println(name + " Senior");
            } else {
                System.out.println(name + " Junior");
            }
        }
    }
}
