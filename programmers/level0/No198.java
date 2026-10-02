package level0;
/*
문제: 모스부호 (1)

로직
- 알파벳 a부터 z까지의 모스부호를 배열에 저장한다.
- letter를 공백을 기준으로 나누어 각각의 모스부호를 확인한다.
- 모스부호 배열에서 일치하는 인덱스를 찾아 알파벳으로 변환한다.
- 변환된 알파벳을 순서대로 이어 붙여 반환한다.

핵심 구현
- split(" ")을 사용해 문자열을 모스부호 단위로 나눈다.
- 각 모스부호를 배열의 값과 비교한다.
- 일치하는 인덱스에 'a'를 더해 해당 알파벳으로 변환한다.
- StringBuilder를 사용해 변환된 문자를 저장한다.

포인트
- 모스부호는 공백을 기준으로 구분되어 있다.
- 모스부호 배열의 인덱스는 알파벳 순서와 동일하다.
- (char) ('a' + i)를 사용하면 인덱스를 알파벳으로 변환할 수 있다.

회고
- 모스부호와 알파벳의 순서가 동일하다는 점을 이용해 별도의 Map 없이 해결했다.
- 문자열을 공백으로 나눈 후 배열의 인덱스를 활용하여 간단하게 해독할 수 있었다.
*/
public class No198 {
    class Solution {
        public String solution(String letter) {
            String[] morse = {
                    ".-", "-...", "-.-.", "-..", ".", "..-.",
                    "--.", "....", "..", ".---", "-.-", ".-..",
                    "--", "-.", "---", ".--.", "--.-", ".-.",
                    "...", "-", "..-", "...-", ".--", "-..-",
                    "-.--", "--.."
            };

            StringBuilder answer = new StringBuilder();
            String[] letters = letter.split(" ");

            for (String code : letters) {
                for (int i = 0; i < morse.length; i++) {
                    if (morse[i].equals(code)) {
                        answer.append((char) ('a' + i));
                        break;
                    }
                }
            }

            return answer.toString();
        }
    }
}
