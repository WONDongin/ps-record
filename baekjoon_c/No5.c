#include <stdio.h>
/*
문제 (브론즈5): A+B
- 각 테스트 케이스마다 "Case #x: A + B = C" 형식으로 출력한다. x는 테스트 케이스 번호이고 1부터 시작하며, C는 A+B이다.

주요 메서드
- `scanf("%d", &T)` : 테스트 케이스 개수 입력받기
- `for (int i = 1; i <= T; i++)` : 1 ~ T까지 반복
- `printf` 서식 : 문자열 안에서 변수 출력시 "%d" 사용 + \n(줄바꿈 처리)
*/
int main(void) {
    int T;
    scanf("%d", &T);

    for (int i = 1; i <= T; i++) {
        int a, b;
        scanf("%d %d", &a, &b);
        printf("Case #%d: %d + %d = %d\n", i, a, b, a + b);
    }

    return 0;
}