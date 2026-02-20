package no_9655;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
문제-9655: 돌 게임
돌 N개가 있다.
상근(SK)과 창영(CY)이 번갈아가며 1개 또는 3개를 가져간다.
마지막 돌을 가져가는 사람이 승리한다.

핵심 아이디어

- 1개 또는 3개를 가져가면 항상 돌 개수의 "홀짝"이 바뀐다.
- 직접 작은 수부터 나열해보면:
`
N=1 → SK 승
N=2 → CY 승
N=3 → SK 승
N=4 → CY 승
N=5 → SK 승
...
`

→ 홀수 = SK 승
→ 짝수 = CY 승

따라서 N % 2 로 승자가 결정된다.

- 시간복잡도 : O(1)
- 공간복잡도 : O(1)
*/
public class No9655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        if(N % 2 != 0){
            System.out.println("SK");
        } else {
            System.out.println("CY");
        }
    }
}
