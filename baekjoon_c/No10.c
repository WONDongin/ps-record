#include <stdio.h>
/*
문제-2908 (브론즈2): 상수
- 734와 893을 칠판에 적었다면,
  상수는 이 수를 437과 398로 읽는다.
  따라서, 상수는 두 수중 큰 수인 437을 큰 수라고 말할 것 이다.

- 입력받은 두 수를 자리 단위로 뒤집은 뒤 비교
- `reverse()` 함수로 정수 뒤집기 구현 (mod 연산 기반)
- 큰 수를 출력
- 시간복잡도: O(1) / 공간복잡도: O(1)
*/
int reverse(int n) {
    int rev = 0;
    while (n > 0) {
        rev = rev * 10 + (n % 10);
        n /= 10;
    }
    return rev;
}

int main(void) {
    int a, b;
    scanf("%d %d", &a, &b);

    int revA = reverse(a);
    int revB = reverse(b);

    if (revA > revB)
        printf("%d\n", revA);
    else
        printf("%d\n", revB);

    return 0;
 }