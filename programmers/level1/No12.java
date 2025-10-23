package level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
문제 : [PCCE 기출문제] 8번 / 닉네임 규칙
- 닉네임 문자열을 특정 규칙에 따라 변환한 후, 길이를 4자 이상 8자 이하로 맞춰 반환

주요 알고리즘
1. 문자 치환 (변환 규칙 적용)
- 'l' → "I"
- 'w' → "vv"
- 'W' → "VV"
- 'O' → "0"
- 그 외 → 그대로 유지

2. 길이 보정
- 4자 미만일 경우: "o"를 덧붙여서 4자까지 채움
- 8자 초과일 경우: 앞 8자까지만 잘라서 반환
*/
public class No12 {
    public static void main(String[] args) throws IOException {
        No12 test = new No12();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String result =  test.solution(br.readLine());
        System.out.println(result);
    }

    public String solution(String nickname) {
        String answer = "";
        for(int i=0; i<nickname.length(); i++){
            if(nickname.charAt(i) == 'l'){
                answer += "I";
            }
            else if(nickname.charAt(i) == 'w'){
                answer += "vv";
            }
            else if(nickname.charAt(i) == 'W'){
                answer += "VV";
            }
            else if(nickname.charAt(i) == 'O'){
                answer += "0";
            }
            else{
                answer += nickname.charAt(i);
            }
        }
        while(answer.length() < 4){
            answer += "o";
        }
        if(answer.length() > 8){
            answer = answer.substring(0, 8);
        }
        return answer;
    }
}
