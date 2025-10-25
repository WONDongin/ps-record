#include <stdio.h>
/*
문제-2753  (브론즈5): 윤년
- 4로 나누어지고, 100으로는 나누어떨어지지 않거나 400으로 나누어떨어지면 윤년 → printf("1"), 아니면 printf("0")
*/
int main(void) {
    int a;
    scanf("%d",&a);

    if(a % 4 == 0){
        if((a % 100 != 0) || (a % 400 == 0)){
            printf("1");
        } else {
            printf("0");
        }
    } else {
        printf("0");
    }
    return 0;
}