#include <stdio.h>
/*
문제-2480 (브론즈4): 주사위 세 개

`scanf("%d %d %d", &a, &b, &c);`
- 세 개의 주사위 눈 입력받기
- &는 변수의 주소 전달 → 입력된 값이 a, b, c에 저장됨

`if ((a == b) && (a == c))`
- 세 주사위 눈이 모두 같은 경우
- 보상금: 10000 + (같은 눈) * 1000

`else if ((a == b) || (a == c) || (b == c))`
- 두 개의 주사위 눈이 같은 경우 공통된 값(same) 찾아서
- 보상금: 1000 + same * 100

`else`
- 세 눈이 모두 다른경우
- max에 세 수 중 가장 큰 값 저장
`max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);`
*/
int main(void){
    int a, b, c;
    int max = 0;
    scanf("%d %d %d", &a, &b, &c);

    if ((a == b) && (a == c)) {
        printf("%d", 10000 + a * 1000);
    }
    else if ((a == b) || (a == c) || (b == c)) {
        int same = (a == b) ? a : (a == c) ? a : c;
        printf("%d", 1000 + same * 100);
    }
    else {
        max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        printf("%d", max * 100);
    }

    return 0;
}
