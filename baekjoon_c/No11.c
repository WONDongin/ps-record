#include <stdio.h>
/*
문제-2941 (실버5): 크로아티아 알파벳
- 예를 들어, ljes=njak은 크로아티아 알파벳 6개(lj, e, š, nj, a, k)로 이루어져 있다.
  단어가 주어졌을 때, 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력

- 문자열 순회 중 8가지 크로아티아 조합을 단일 문자로 처리
- switch-case로 알파벳 분기, 인덱스 건너뛰기 방식 적용
- 중복 조건(dz= 등) 우선순위 고려
- 시간복잡도: O(n) / 공간복잡도: O(1)

1.입력 받기
- 문자열을 입력받음, 최대 길이 100

2️. 문자열 순회
- 한 글자씩 확인
- `for (i=0; s[i] != '\0'; i++)`

3️. 조합 검사
- 현재 문자와 다음 문자(또는 다음 2개 문자)를 확인
- `switch`문으로 알파벳별 분기

4️. 카운트 증가
- 유효한 한 글자 단위로 `cnt++`
- 크로아티아 조합 발견 시 인덱스 건너뛰기

5️. 최종 문자 개수 출력
- `printf("%d", cnt);`
*/
int main(void) {
    char s[101];
    scanf("%s", s);

    int cnt = 0;
    for (int i = 0; s[i] != '\0'; i++) {
        switch (s[i]) {
            case 'c':
                if (s[i+1] == '=' || s[i+1] == '-') i++;
                break;
            case 'd':
                if (s[i+1] == '-') i++;
                else if (s[i+1] == 'z' && s[i+2] == '=') i += 2;
                break;
            case 'l':
            case 'n':
                if (s[i+1] == 'j') i++;
                break;
            case 's':
            case 'z':
                if (s[i+1] == '=') i++;
                break;
        }
        cnt++;
    }

    printf("%d\n", cnt);
    return 0;
}
