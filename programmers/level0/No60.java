package level0;

import java.util.Arrays;
/*
문제: 문자열 길이

로직
- 문자열 배열과 같은 크기의 정수 배열을 생성한다.
- 문자열 배열을 순회하면서 각 문자열의 길이를 length()로 구한다.
- 구한 길이를 정답 배열에 저장한다.

핵심 구현
- 핵심 코드
  answer[i] = strlist[i].length();

- 핵심 코드 설명
  String의 length() 메서드를 이용해 각 문자열의 길이를 구하고,
  같은 인덱스의 정답 배열에 저장한다.

포인트
- 문자열의 길이는 length() 메서드로 간단하게 구할 수 있다.
- 입력 배열과 동일한 크기의 결과 배열을 생성하면 인덱스별로 바로 저장할 수 있다.
- 한 번의 반복문만 사용하여 해결할 수 있다.

회고
- 문자열 배열을 순회하며 값을 다른 배열에 저장하는 기본적인 배열 처리 문제였다.
- String.length()와 배열의 length를 구분해서 사용하는 것이 중요하다는 점을 다시 확인했다.
*/
public class No60 {
    public static void main(String[] args) {
        String[] strlist = {"We", "are", "the", "world!"};

        int[] answer = new int[strlist.length];

        for (int i = 0; i < strlist.length; i++) {
            answer[i] = strlist[i].length();
        }

        System.out.println(Arrays.toString(answer));
    }
}
