package level1;
/*
문제-147355: 크기가 작은 부분문자열

[문제 요약]
- 문자열 t에서 p와 길이가 같은 부분문자열을 추출
- 해당 부분문자열의 숫자가 p보다 작거나 같은 개수를 구하는 문제

[접근 방법]
- p 길이만큼 substring으로 문자열 자르기
- 잘라낸 문자열을 Long 타입으로 변환 후 비교
- 조건 만족 시 count 증가

[핵심 아이디어]
- substring(i, i + len)을 이용해 고정 길이 문자열 추출
- p 길이가 최대 18이므로 int 대신 Long 사용
- 슬라이딩 윈도우처럼 한 칸씩 이동하며 검사

[처리 흐름]
p 길이 저장
→ substring으로 부분문자열 추출
→ Long 변환 후 비교
→ count 증가

[시간복잡도]
- O(N)
*/
public class No34 {
    public static void main(String[] args) {
        String T = "500220839878";
        String P = "7";
        int len = P.length();
        int cnt = 0;

        for(int i = 0; i <= T.length() - len; i++){
            String str = T.substring(i, i + len);

            if(Long.parseLong(str) <= Long.parseLong(P)){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
