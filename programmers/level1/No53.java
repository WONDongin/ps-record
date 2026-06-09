package level1;
/*
문제: 문자열 나누기

문제 요약

* 문자열을 왼쪽부터 읽으면서 첫 글자와 같은 문자, 다른 문자의 개수를 센다
* 두 개수가 같아지는 순간 문자열을 분리한다
* 남은 문자열에 대해 같은 과정을 반복하고, 분리된 문자열의 개수를 반환한다

접근 방법

* 현재 분리 기준이 되는 문자를 c에 저장한다
* c와 같은 문자는 same, 다른 문자는 diff에 카운트한다
* same과 diff가 같아지면 문자열 하나가 분리된 것이므로 answer를 증가시킨다
* 다음 문자가 존재하면 그 문자를 새로운 기준 문자 c로 설정한다
* 반복이 끝난 뒤 남은 문자열이 있으면 answer를 한 번 더 증가시킨다

핵심 아이디어

* 문자열을 실제로 자르지 않고 카운트만으로 분리 개수를 구한다
* 기준 문자는 현재 남은 문자열의 첫 글자이다
* same == diff가 되는 순간 하나의 문자열이 완성된다

주의할 점

* 마지막 문자 이후에는 charAt(i + 1)을 하면 인덱스 오류가 발생할 수 있다
* 따라서 i + 1 < s.length() 조건으로 다음 문자가 있는지 확인해야 한다
* 반복문이 끝났을 때 same 또는 diff가 남아 있으면 마지막 문자열도 개수에 포함해야 한다

배운 점

* 문자열을 직접 substring으로 자르지 않아도 카운트 방식으로 문제를 해결할 수 있다
* 기준 문자가 분리 시점마다 새롭게 바뀌는 흐름을 이해하는 것이 중요하다
*/

public class No53 {
    class Solution {
        public int solution(String s) {
            char c = s.charAt(0);
            int same = 0;
            int diff = 0;
            int answer = 0;

            for(int i = 0; i < s.length(); i++){
                if (c == s.charAt(i)){
                    same++;
                } else {
                    diff++;
                }

                if(same == diff){
                    answer++;

                    if(i + 1 < s.length()){
                        c = s.charAt(i + 1);
                    }
                    same = 0;
                    diff = 0;
                }
            }

            if(diff != 0 || same != 0){
                answer++;
            }

            return answer;
        }
    }
}
