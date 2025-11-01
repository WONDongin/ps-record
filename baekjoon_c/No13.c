#include <stdio.h>
/*
문제-1193 (실버5): 분수찾기
- 지그재그 순서로 나열된 분수에서 X번째 분수를 찾는 문제

주요 메서드 및 알고리즘
- 먼저 어느 대각선인지 찾는다. → 누적합으로 찾음
- 그 대각선에서 몇 번째인지 찾는다. → pos
- 그 대각선이 짝수인지 홀수인지로 방향을 정한다.
- 그에 따라 분자/분모 공식을 다르게 넣는다.
*/
int main() {
    int X;
    scanf("%d", &X);

    int line = 1;  // 현재 대각선 번호
    int sum = 0;   // 누적 개수

    // X가 몇 번째 대각선에 속하는지 찾기
    while (X > sum) {
        sum += line;
        line++;
    }

    line--;  // 실제 대각선 번호 조정
    int pos = X - (sum - line);  // 대각선 내에서의 위치

    int numerator, denominator;

    if (line % 2 == 0) {  // 짝수번째 대각선 → 위에서 아래로
        numerator = pos;
        denominator = line - pos + 1;
    } else {               // 홀수번째 대각선 → 아래에서 위로
        numerator = line - pos + 1;
        denominator = pos;
    }

    printf("%d/%d\n", numerator, denominator);

    return 0;
}
