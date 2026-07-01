package level0;
/*
문제: 문자 반복 출력하기

로직
- StringBuilder를 생성하여 결과 문자열을 저장한다.
- 문자열을 한 글자씩 순회한다.
- 각 문자를 n번 반복하여 StringBuilder에 추가한다.
- 최종 문자열을 반환한다.

핵심 구현
- 핵심 코드
  for (int j = 0; j < n; j++) {
      sb.append(my_string.charAt(i));
  }
- 현재 문자를 내부 반복문을 통해 n번 추가하여 반복 문자열을 생성한다.

포인트
- StringBuilder를 사용하여 문자열을 효율적으로 이어 붙였다.
- 이중 반복문으로 각 문자를 원하는 횟수만큼 반복했다.
- 문자열을 직접 더하는 것보다 성능이 좋은 구현이다.

회고
- 문자열을 반복해서 이어 붙이는 경우 StringBuilder를 사용하는 것이 효율적이라는 점을 다시 한번 익혔다.
- 문자 단위로 접근할 때 charAt()을 활용하는 방법을 복습할 수 있었다.
*/
public class No50 {
    public static void main(String[] args) {
        String my_string = "hello";
        int n = 3;

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < my_string.length(); i++){
            for(int j = 0; j < n; j++){
                sb.append(my_string.charAt(i));
            }
        }

        System.out.println(sb);
    }
}
