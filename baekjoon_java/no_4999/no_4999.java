package no_4999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
문제-4999: 아!

[문제 요약]
- 재환이가 낼 수 있는 "a" 문자열과
  의사가 요구하는 "a" 문자열이 주어진다
- 재환이의 "a" 길이가 더 길거나 같으면 "go"
- 아니면 "no" 출력

[접근 방법]
- 두 문자열 입력
- 길이 비교

[핵심 아이디어]
- 문자열 내용은 중요하지 않고 길이만 중요
- A.length() >= B.length() 조건으로 판단

[처리 흐름]
입력 → 문자열 길이 비교 → 조건 분기 → 결과 출력

[시간복잡도]
- O(1)
*/
public class no_4999 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String A = br.readLine();
        String B = br.readLine();

        if(A.length() >= B.length()){
            System.out.println("go");
        } else {
            System.out.println("no");
        }
    }
}
