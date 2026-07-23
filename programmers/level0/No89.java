package level0;

import java.util.Arrays;
/*
문제: 카운트 업

로직
- startNum부터 endNum까지 담을 수 있도록 배열 크기를 설정한다.
- 반복문을 돌면서 startNum에 인덱스 i를 더한 값을 배열에 저장한다.

핵심 구현
- 배열 크기: endNum - startNum + 1
- 연속된 값 저장: answer[i] = startNum + i

포인트
- startNum 값을 직접 증가시키지 않아 원본 값을 유지할 수 있다.
- 시작값과 인덱스를 더해 연속된 정수를 간단하게 구할 수 있다.

회고
- 배열의 크기를 구할 때 시작값과 끝값이 모두 포함되므로 +1이 필요하다.
- 매개변수를 직접 변경하기보다 인덱스를 활용하는 방식이 코드의 의도를 파악하기 쉽다.
*/
public class No89 {
    public static void main(String[] args) {
        int startNum = 3;
        int endNum = 10;
        int[] answer = new int[endNum - startNum + 1];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = startNum + i;
        }

        System.out.println(Arrays.toString(answer));
    }
}