package no_1074;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
문제-1074 (골드5): Z
+ 한수는 크기가 2N × 2N인 2차원 배열을 Z모양으로 탐색하려고 한다. 예를 들어, 2×2배열을 왼쪽 위칸, 오른쪽 위칸, 왼쪽 아래칸, 오른쪽 아래칸 순서대로 방문하면 Z모양이다.
- r행 c열을 몇 번째로 방문했는지 출력

주요 메서드
- `size = 1 << N` : 2ⁿ 크기의 배열 크기 구하기
- `Z-Order Index` 계산 로직
| 사분면  | 좌표 조건              | 방문 순서 증가량    |
| ---- | ------------------ | ------------ |
| 1사분면 | r < half, c < half | +0           |
| 2사분면 | r < half, c ≥ half | +1 × (half²) |
| 3사분면 | r ≥ half, c < half | +2 × (half²) |
| 4사분면 | r ≥ half, c ≥ half | +3 × (half²) |

주요 알고리즘
- 배열을 반복적으로 절반씩 줄이며, 해당 좌표가 어느 사분면에 속하는지 판단 및 그 사분면을 기준으로 오프셋 누적

1. half = size / 2
2. 현재 좌표 (`r, c)`가 속한 사분면 판별
3. 해당 사분면 기준만큼 answer 더함 (cnt =  half * half)
4. r, c를 해당 사분면 내부 좌표로 변환 (`r -= half`, `c -= half`)
5. size = half, N--  후 반복
*/
public class No1074 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]); // 2
        int r = Integer.parseInt(str[1]); // 1
        int c = Integer.parseInt(str[2]); // 0

        int answer = 0; // 3
        int size = 1 << N; // 2^N (4)

        while (N > 0){
            int half = size / 2; // 1
            int cnt = half * half; // 1

            if(r < half && c < half){ // 1사분면

            } else if (r < half && c >= half) { // 2사분면
                answer += cnt;
                c -= half;
            } else if (r >= half && c < half) { // 3사분면
                answer += cnt * 2;
                r -= half;
            } else {
                answer += cnt * 3;
                r -= half;
                c -= half;
            }

            size = half; // 2
            N--; // 1
        }
        System.out.println(answer);
    }
}
