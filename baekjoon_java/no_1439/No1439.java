package no_1439;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
문제-1439 (실버5): 뒤집기
- 다솜이는 0과 1로만 이루어진 문자열 S를 가지고 있다. 다솜이는 이 문자열 S에 있는 모든 숫자를 전부 같게 만들려고 한다.
- ex) S=0001100 일떄
  전체를 뒤집으면 1110011이 된다.
  4번째 문자부터 5번째 문자까지 뒤집으면 1111111이 되어서 2번 만에 모두 같은 숫자로 만들 수 있다.
  하지만, 처음부터 4번째 문자부터 5번째 문자까지 문자를 뒤집으면 한 번에 0000000이 되어서 1번 만에 모두 같은 숫자로 만들 수 있다.

주요 메서드 및 알고리즘
- 0과 1로 이루어진 문자열에서 모든 숫자를 동일하게 만들기 위해서는
- "연속된 0 그룹의 수" 또는 "연속된 1 그룹의 수" 중 하나를 모두 뒤집기
- 최솟값 = min(0 그룹 수, 1 그룹 수)

전체를 0으로 만들려면 "1 그룹"만 뒤집으면 되고,
전체를 1로 만들려면 "0 그룹"만 뒤집으면 된다.
*/
public class No1439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        int len = S.length();

        int cnt0 = 0;
        int cnt1 = 0;

        // 연속된 문자가 바뀔 때마다 이전 문자가 속한 그룹 개수를 증가
        for(int i = 1; i < len; i++){
            if(S.charAt(i) != S.charAt(i - 1)){
                if(S.charAt(i - 1) == '1'){
                    cnt1++;
                } else {
                    cnt0++;
                }
            }
        }

        // 마지막 문자 그룹 카운트
        if (S.charAt(len - 1) == '1'){
            cnt1++;
        }else {
            cnt0++;
        }

        // 최소 경우의 수 출력
        int result = Math.min(cnt0, cnt1);
        System.out.println(result);
    }
}
