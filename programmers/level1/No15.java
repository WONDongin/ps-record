package level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
문제-문자열 p와 y 개수 비교

[문제 요약]
- 문자열에서 'p'와 'y'의 개수를 비교
- 대소문자 구분 없이 동일하게 처리
- 개수가 같으면 true, 다르면 false 반환

[접근 방법]
- 입력 문자열을 모두 대문자로 변환
- 문자열을 순회하면서:
  → 'P'면 +1
  → 'Y'면 -1
- 최종 count 값이 0이면 true, 아니면 false

[핵심 아이디어]
- 굳이 두 개의 변수로 count를 나눌 필요 없음
- 하나의 변수로 증가/감소 처리하면 간결하게 해결 가능

[처리 흐름]
입력 → 대문자 변환 → 문자열 순회 → count 계산 → 결과 출력

[시간복잡도]
- O(N)
*/
public class No15 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().toUpperCase();
        int count = 0;

        for(char c : s.toCharArray()){
            if(c == 'P') count++;
            else if(c == 'Y') count--;
        }

        System.out.println(count == 0 ? "true" : "false");
    }
}
