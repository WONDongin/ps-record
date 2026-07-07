package level0;
/*
문제: 편지

로직
- 한 글자를 작성하는 데 필요한 가로 길이는 2cm이다.
- 문자열의 길이를 구한 뒤 2를 곱해 필요한 편지지의 최소 가로 길이를 계산한다.

핵심 구현
- 핵심 코드
  ex) message.length() * 2
- 문자열의 길이를 length()로 구하고, 글자당 2cm를 곱해 결과를 출력한다.

포인트
- String.length()를 사용하면 문자열의 길이를 쉽게 구할 수 있다.
- 문제에서 글자당 길이가 고정되어 있으므로 별도의 반복문 없이 계산할 수 있다.

회고
- 문자열의 길이를 구하는 기본 메서드인 length()의 사용법을 다시 확인할 수 있었다.
- 단순 계산 문제는 반복문보다 내장 메서드를 활용하면 더 간결하게 해결할 수 있었다.
*/
public class No63 {
    public static void main(String[] args) {
        String message = "happy birthday!";

        System.out.println(message.length() * 2);
    }
}
