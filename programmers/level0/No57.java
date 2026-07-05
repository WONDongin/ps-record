package level0;
/*
문제: 문자열 안의 숫자 더하기

로직
- 문자열을 처음부터 끝까지 순회한다.
- 현재 문자가 숫자인지 범위 비교('0' ~ '9')로 확인한다.
- 숫자라면 문자에서 '0'을 빼 실제 정수로 변환하여 누적한다.

핵심 구현
- 핵심 코드
  if (c >= '0' && c <= '9') {
      result += c - '0';
  }
- 문자 '0'부터 '9'까지의 범위를 이용해 숫자를 판별한다.
- 문자에서 '0'을 빼면 해당 숫자의 정수 값으로 변환되어 합계를 구할 수 있다.

포인트
- 숫자를 하나씩 비교하지 않고 범위 비교를 사용해 코드가 간결해졌다.
- char와 int의 아스키 코드 특성을 활용해 별도의 형변환 없이 숫자를 계산할 수 있다.

회고
- 문자를 개별적으로 비교하는 것보다 범위 비교를 사용하면 가독성과 유지보수성이 향상된다.
- 문자 연산(`c - '0'`)은 코딩테스트에서 자주 사용되는 기법이므로 익혀두면 다양한 문자열 문제에 활용할 수 있다.
*/
public class No57 {
    public static void main(String[] args) {
        String my_string = "aAb1B2cC34oOp";
        int result = 0;

        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);

            if (c >= '0' && c <= '9') {
                result += c - '0';
            }
        }

        System.out.println(result);
    }
}
