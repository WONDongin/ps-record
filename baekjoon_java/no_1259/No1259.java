package no_1259;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
문제-1259 (브론즈1): 팰린드롬수
- 어떤 단어를 뒤에서부터 읽어도 똑같다면 그 단어를 팰린드롬이라고 한다.
- ex) 'radar', 'sees', '12421', 01
- 010이 되어 팰린드롬수로 취급할 수도 있지만, 특별히 이번 문제에서는 무의미한 0이 앞에 올 수 없다고 하자.

주요 메서드 및 알고리즘
- 입력: BufferedReader를 사용해 한 줄씩 문자열로 입력받음
- 종료 조건: 입력값이 "0"이면 종료
- 알고리즘:
    1. 문자열을 StringBuilder로 뒤집기
    2. 원본 문자열과 비교해 같으면 'yes', 아니면 'no' 출력
*/
public class No1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String str = br.readLine();
            // 0 이면 반복문 종료
            if(str.equals("0")) break;

            // 입력받은 입력값 리버스
            String re = new StringBuilder(str).reverse().toString();

            // 팰린트롬 확인
            if(str.equals(re)){
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
