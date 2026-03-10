package no_1384;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
문제-1384: 메시지
- 원형으로 앉아 있는 사람들이 서로에 대해 평가를 남긴다.
- 각 사람의 줄에는 자신에 대한 다른 사람들의 평가(P 또는 N)가 주어진다.
- N은 누군가가 해당 사람에 대해 나쁜 말을 했다는 의미이다.
- 누가 말했는지를 찾아 "A was nasty about B" 형식으로 출력한다.
- 만약 N이 하나도 없으면 "Nobody was nasty"를 출력한다.

주요 메서드
- BufferedReader : 입력 처리
- StringTokenizer : 이름과 평가(P/N) 분리
- char[][] 배열 : 평가 저장

주요 알고리즘
- 구현 / 시뮬레이션
- 원형 인덱스 계산 (mod 연산)

탐색/처리 흐름
1. 그룹 인원 n 입력 (0이면 종료)
2. 각 사람의 이름과 평가(P/N) 입력
3. arr[i][j] == 'N' 인 경우 발견
4. speaker = (i - j - 1 + n) % n 로 발언자 계산
5. "speaker was nasty about victim" 출력
6. N이 하나도 없으면 "Nobody was nasty" 출력

핵심 포인트
- 사람들은 원형으로 앉아 있기 때문에 인덱스가 음수가 되면 mod 연산으로 순환 처리
- speaker = (i - j - 1 + n) % n
- 출력 형식: Group 번호 + 결과 + 빈 줄
*/
public class No1384 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int group = 1;

        while (true){

            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;

            String[] name = new String[n];
            char[][] arr = new char[n][n - 1];

            for(int i = 0; i < n; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());

                name[i] = st.nextToken();

                for(int j = 0; j < n - 1; j++){
                    arr[i][j] = st.nextToken().charAt(0);
                }
            }

            System.out.println("Group " + group);
            boolean flag = false;

            for(int i = 0; i < n; i++){
                for(int j = 0; j < n - 1; j++){

                    if(arr[i][j] == 'N'){
                        int speaker = (i - j - 1 + n) % n;
                        System.out.println(name[speaker] + " was nasty about " + name[i]);
                        flag = true;
                    }
                }
            }

            if (!flag) System.out.println("Nobody was nasty");

            System.out.println();

            group++;
        }
    }
}
