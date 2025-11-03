#include <stdio.h>
/*
문제-2750 (브론즈2): 수 정렬하기
- N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성
*/
int main(void){
    int N;
    scanf("%d", &N);
    int num[N];

    for(int i = 0; i < N; i++){
        scanf("%d", &num[i]);
    }

    int temp;
    for(int i = 0; i < N - 1; i++){
        for(int j = i + 1; j < N; j++){
            if(num[i] > num[j]){
                temp = num[i];
                num[i] = num[j];
                num[j] = temp;
            }
        }
    }
    for(int i = 0; i < N; i++){
        printf("%d\n", num[i]);
    }
    return 0;
}
