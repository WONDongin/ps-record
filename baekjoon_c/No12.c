#include <stdio.h>
#include <string.h>
/*
문제-1316 (실버5): 그룹 단어 체커 구현
- 단어를 한 글자씩 읽으면서 같은 문자가 연속해서 나올 수는 있지만,
  다른 문자가 등장한 뒤 다시 나오면 X

- 입력 단어마다 중복 문자를 검사
- 연속 문자는 허용, 떨어져서 다시 나오면 제외
- visited[26] 배열로 알파벳 사용 상태 추적
- 시간복잡도: O(n*m) (n=단어 수, m=단어 길이)
- 공간복잡도: O(1)

주요 메서드 및 알고리즘

1.입력받은 단어를 한 글자씩 검사
- `aabbbccb`

2. visited[26] = {0} 초기화
- 알파벳 사용 여부 저장

3. 이전 문자와 다를때만 `visited` 확인
- 'a' > 'b' > 'c'

4. 이미 등장한 문자면 그룹 단어 x
- 'b' 가 다시 나오면 faile

5. 끝가지 통화하면 cnt ++
*/
int main(void) {
    int N;
    scanf("%d", &N);
    int cnt = 0;

    for(int t = 0; t < N; t++){
        char word[101];
        scanf("%s", word);
        // 아직 안나온 상태 - 초기화
        int visited[26] = {0};
        // 그룹단어 체크용
        int isGroup = 1;
        // 이전 문자 기억용
        char prev = 0;

        for(int i = 0; word[i] != '\0'; i++){
            char now = word[i];
            int idx = now - 'a';

            if (now != prev) { // 새로운 문자가 나오면
                if (visited[idx]) { // idx == 1, 이미 나왔던 문자면 그룹단어 x
                    isGroup = 0;
                    break;
                }
                visited[idx] = 1; // 처음 나온문자라면 체크
            }
            prev = now; // 이전 문자 갱신
        }
        if (isGroup) cnt++;
    }
    printf("%d\n", cnt);
    return 0;
}
