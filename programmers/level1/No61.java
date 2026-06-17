package level1;
/*
문제: 둘만의 암호

로직
- 문자열의 각 문자를 순회하며 index만큼 이동
- skip에 포함된 문자는 건너뛰며 이동 횟수 계산
- z를 넘어가면 다시 a부터 순환

핵심 구현
- skip 문자인지 확인
  ex) skip.indexOf(ch) == -1
- 이동 횟수 충족 시까지 반복
  ex) while (count < index)

포인트
- z 다음 문자는 a로 변경해야 함
- skip 문자는 이동 횟수에 포함하지 않음
- 모든 문자를 변환한 뒤 문자열로 조합

회고
- 문자 연산(char++)과 아스키코드 활용에 익숙해질 수 있었다.
- 특정 문자를 제외하며 순환하는 구현 문제를 연습할 수 있었다.
*/
public class No61 {
    public static void main(String[] args) {
        String s = "aukks";
        String skip = "wbqd";
        int index = 5;
        String answer = "";

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            int count = 0;

            while (count < index){
                ch++;

                if(ch > 'z'){
                    ch = 'a';
                }

                if(skip.indexOf(ch) == -1){
                    count++;
                }
            }

            answer += ch;
        }

        System.out.println(answer);
    }
}
