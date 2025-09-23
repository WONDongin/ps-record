package level0;

import java.util.Scanner;
// 문제 : [PCCE 기출문제] 2번/피타고라스의 정의
/*
디버깅(Debugging)은 이미 완성된 코드에서 버그를 찾아 수정하는 문제 타입입니다.
1줄만 수정하여 버그를 고치세요.
2줄 이상 수정할 경우, 실행 결과에 에러 메시지가 표시됩니다.
*/
public class No18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c = sc.nextInt();
        // 해당 줄 수정
        int b_square = (c*c) - (a*a);

        System.out.println(b_square);
    }
}
