package level1;
/*
문제-68935: 3진법 뒤집기

[문제 요약]
- 자연수 n을 3진법으로 변환
- 변환된 3진수 문자열을 뒤집은 뒤
- 다시 10진수로 변환하여 반환하는 문제

[접근 방법]
- Integer.toString(n, 3) 사용
  → 10진수를 3진수 문자열로 변환
- StringBuilder.reverse() 사용
  → 3진수 문자열 뒤집기
- Integer.parseInt(str, 3) 사용
  → 뒤집힌 3진수를 다시 10진수로 변환

[핵심 아이디어]
- Integer.parseInt()는 기본적으로 10진수로 처리됨
- 따라서 3진수 변환 시 반드시 radix(진법) 값 3을 지정해야 함
- reverse()를 활용하면 문자열 뒤집기를 간단하게 처리 가능

[처리 흐름]
10진수 → 3진수 변환
→ 문자열 뒤집기
→ 뒤집힌 3진수를 10진수로 변환
→ 결과 반환

[시간복잡도]
- O(log₃N)
- 3진수 변환 및 뒤집기 과정 모두 자릿수만큼 수행
*/
public class No38 {
    public static void main(String[] args) {
        int n = 45;

        // 10진수 → 3진수 문자열
        String ternary = Integer.toString(n, 3);

        // 뒤집기
        String reversed = new StringBuilder(ternary)
                .reverse()
                .toString();

        // 뒤집힌 3진수 → 10진수
        int answer = Integer.parseInt(reversed, 3);

        System.out.println(answer);
    }
}
