package level0;
/*
문제: 로그인 성공?

로직
- db에 저장된 회원 정보를 순서대로 확인한다.
- 입력한 아이디와 회원의 아이디가 같은지 비교한다.
- 아이디와 비밀번호가 모두 같으면 "login"을 반환한다.
- 아이디는 같지만 비밀번호가 다르면 "wrong pw"를 반환한다.
- 일치하는 아이디가 없으면 "fail"을 반환한다.

핵심 구현
- 향상된 for문을 사용해 db의 회원 정보를 하나씩 확인한다.
- equals()를 사용해 아이디와 비밀번호를 비교한다.
- 아이디를 찾은 경우 비밀번호 비교 결과에 따라 즉시 값을 반환한다.

포인트
- 문자열의 내용은 == 연산자가 아니라 equals()를 사용해 비교해야 한다.
- 회원들의 아이디는 중복되지 않으므로 같은 아이디를 찾으면 반복을 계속할 필요가 없다.
- 아이디와 비밀번호의 일치 여부에 따라 반환값이 달라진다.

회고
- 아이디를 먼저 확인하고 비밀번호를 비교하여 로그인 결과를 간단하게 구분했다.
*/
public class No194 {
    class Solution {
        public String solution(String[] id_pw, String[][] db) {
            for (String[] member : db) {
                if (member[0].equals(id_pw[0])) {
                    if (member[1].equals(id_pw[1])) {
                        return "login";
                    }

                    return "wrong pw";
                }
            }

            return "fail";
        }
    }
}
