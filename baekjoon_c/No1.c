#include <stdio.h>
/*
문제-10430 (브론즈5): 나머지
- 연산 결과 출력 시 반드시 형식 지정자 사용 : prinrf("%d",값 or (식))
*/
int main(void){
    int a, b, c;
    scanf("%d %d %d", &a, &b, &c);

    printf("%d\n", ((a + b) % c));
    printf("%d\n", ((a % c) + (b % c)) % c);
    printf("%d\n", ((a * b) % c));
    printf("%d", ((a % c) * (b % c)) % c);

    return 0;
}