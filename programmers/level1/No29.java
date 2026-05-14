package level1;
/*
문제-12918: 문자열 다루기 기본

[문제 요약]
- 문자열 s의 길이가 4 또는 6인지 확인
- 문자열이 숫자로만 구성되어 있는지 검사
- 조건을 모두 만족하면 true, 아니면 false 반환

[접근 방법]
- 먼저 문자열 길이가 4 또는 6인지 확인
- 반복문으로 각 문자를 순회
- Character.isDigit() 메서드로 숫자 여부 검사
- 숫자가 아닌 문자가 발견되면 즉시 종료

[핵심 아이디어]
- Character.isDigit()을 사용하면 숫자 판별 가능
- 조건 실패 시 return으로 즉시 종료하여 불필요한 변수 제거
- Early Return 방식으로 가독성 향상

[처리 흐름]
문자열 길이 검사
→ 문자 하나씩 순회
→ 숫자인지 확인
→ 하나라도 숫자가 아니면 false
→ 모두 숫자면 true

[시간복잡도]
- O(N)
*/
public class No29 {
    public static void main(String[] args) {
        String s = "a234";

        // 길이 조건 먼저 검사
        if (s.length() != 4 && s.length() != 6) {
            System.out.println(false);
            return;
        }

        // 숫자 여부 검사
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                System.out.println(false);
                return;
            }
        }

        System.out.println(true);
        // System.out.println(s.matches("\\d{4}|\\d{6}"));
    }
}
