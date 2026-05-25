package level1;
/*
문제-41: 시저 암호

[문제 요약]
- 문자열의 각 알파벳을 n칸 만큼 밀어 암호화하는 문제
- 대문자와 소문자를 각각 유지해야 함
- 알파벳 범위를 넘어가면 다시 처음으로 순환
- 공백은 그대로 유지

[접근 방법]
- 문자열을 한 글자씩 순회
- 공백이면 그대로 append
- 대문자 / 소문자를 구분하여 처리
- ASCII 범위를 기준으로 알파벳 이동 구현
- % 26 연산으로 알파벳 순환 처리

[핵심 아이디어]
- 알파벳 이동 공식 사용

  대문자:
  (ch - 'A' + n) % 26 + 'A'

  소문자:
  (ch - 'a' + n) % 26 + 'a'

- Z → A
- z → a
  형태의 순환 처리를 위해 % 26 사용

[처리 흐름]
문자열 순회
→ 공백 여부 확인
→ 대문자 처리
→ 소문자 처리
→ StringBuilder 저장
→ 결과 반환

[시간복잡도]
- O(N)
- 문자열 길이만큼 1회 순회
*/
public class No41 {
    public static void main(String[] args) {
        String s = "z";
        int n = 1;
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            // 공백이면 그대로 추가
            if(ch == ' ') {
                sb.append(' ');
            }
            // 대문자 처리
            else if(ch >= 'A' && ch <= 'Z') {
                ch = (char)((ch - 'A' + n) % 26 + 'A');
                sb.append(ch);
            }

            // 소문자 처리
            else if(ch >= 'a' && ch <= 'z') {
                ch = (char)((ch - 'a' + n) % 26 + 'a');
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }
}
