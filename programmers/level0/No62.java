package level0;
/*
문제: 대문자와 소문자

로직
- 문자열을 처음부터 끝까지 순회한다.
- 현재 문자가 대문자인지 확인한다.
- 대문자면 소문자로, 소문자면 대문자로 변환하여 StringBuilder에 추가한다.
- 최종적으로 변환된 문자열을 반환한다.

핵심 구현
- 핵심 코드
  if (Character.isUpperCase(c)) {
      sb.append(Character.toLowerCase(c));
  } else {
      sb.append(Character.toUpperCase(c));
  }

- 핵심 코드 설명
  Character.isUpperCase()로 현재 문자의 대소문자를 판별한 뒤,
  Character.toLowerCase(), Character.toUpperCase()를 사용하여
  반대 대소문자로 변환하고 StringBuilder에 추가한다.

포인트
- Character 클래스의 메서드를 활용하면 아스키 코드 계산 없이 가독성 좋게 구현할 수 있다.
- 문자열은 변경이 불가능하므로 StringBuilder를 사용해 효율적으로 결과를 생성한다.

회고
- Character 클래스에서 제공하는 메서드를 활용하면 직접 문자 범위를 비교하지 않아도 되어 코드가 간결해진다.
- 문자열 변환 문제에서는 StringBuilder를 사용하는 습관을 들이는 것이 성능과 가독성 측면에서 유리하다.
*/
public class No62 {
    public static void main(String[] args) {
        String my_string = "abCdEfghIJ";
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < my_string.length(); i++){
            char c = my_string.charAt(i);

            if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else {
                sb.append(Character.toUpperCase(c));
            }
        }

        System.out.println(sb);
    }
}
