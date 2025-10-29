#include <stdio.h>
/*
문제-4344 (브론즈1): 평균은 넘겠지
- 각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다. 정답과 출력값의 절대/상대 오차는 10-3이하이면 정답

알고리즘
1. 테스트 케이스 수(C) 입력
- 여러 반의 데이터를 처리하기 위한 반복문 시작

2. 각 반의 학생 수(sub) 입력
- sub 크기의 배열(num) 생성

3. 점수 입력 및 총합 계산
- `sum += num[j];`
- 반복문을 통해 모든 점수를 입력받으며 합계 구함

4. 평균 계산
- `avg = (float)sum / sub;`
- 정수 나눗셈 오류 방지를 위해 `float` 캐스팅 사용

5. 평균 초과 학생 수 세기
- `if (num[j] > avg)` 조건으로 카운트 증가

6. 비율 계산 및 출력
- `result = (float)cnt / sub * 100;`
- 평균을 넘는 학생 비율을 %로 계산.
- `printf("%.3f%%\n", result);` ← % 출력 시 `%%` 사용
*/
int main(void) {
    int C;
    scanf("%d", &C);

    for (int i = 0; i < C; i++) {
        int sub;
        scanf("%d", &sub);

        int num[sub];  // 배열선언
        int sum = 0;   // 각 반의 총점 초기화

        // 평균 구하기
        for (int j = 0; j < sub; j++) {
            scanf("%d", &num[j]);
            sum += num[j];
        }
        float avg = (float)sum / sub;

        // 평균 이상인 학생수 카운트
        int cnt = 0;
        for (int j = 0; j < sub; j++) {
            if (num[j] > avg) cnt++;
        }

        // 출력
        float result = (float)cnt / sub * 100;
        printf("%.3f%%\n", result);
    }

    return 0;
}
