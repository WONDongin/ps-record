package level1;
/*
문제-12922: 수박수박수박수박수박수?

[문제 요약]
- 길이 n인 문자열 생성
- 홀수 번째는 "수"
- 짝수 번째는 "박"
- "수박수박..." 형태 문자열 반환

[접근 방법]
- 1부터 n까지 반복
- 홀수/짝수 여부에 따라 문자열 추가
- StringBuilder 사용으로 문자열 누적 최적화

[핵심 아이디어]
- i % 2 를 사용해 홀수/짝수 판별
- 홀수 → "수"
- 짝수 → "박"

[처리 흐름]
1 ~ n 반복
→ 홀수면 "수" 추가
→ 짝수면 "박" 추가
→ 최종 문자열 출력

[시간복잡도]
- O(N)
*/
public class No26 {
    public static void main(String[] args) {
        int N = 5;
        StringBuilder sb = new StringBuilder();

        for(int i = 1; i <= N; i++){
            if(i % 2 != 0){
                sb.append("수");
            } else {
                sb.append("박");
            }
        }

        System.out.println(sb);
    }
}
