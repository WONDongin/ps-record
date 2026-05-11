package level1;
/*
문제-12903: 가운데 글자 가져오기

[문제 요약]
- 문자열의 길이가 홀수이면 가운데 문자 1개 반환
- 문자열의 길이가 짝수이면 가운데 문자 2개 반환

[접근 방법]
- 문자열 길이의 중간 인덱스를 계산
- substring()을 사용하여 가운데 문자열 추출

[핵심 아이디어]
- substring(begin, end)는 begin 이상 ~ end 미만 범위를 자름
- 짝수:
  mid - 1 ~ mid + 1 범위 추출
- 홀수:
  mid ~ mid + 1 범위 추출

[처리 흐름]
문자열 길이 계산
→ 가운데 인덱스(mid) 계산
→ 짝수/홀수 판별
→ substring()으로 가운데 문자 반환

[시간복잡도]
- O(1)
*/
public class No23 {
    class Solution {
        public String solution(String s) {
            int min = s.length() / 2;

            return s.length() % 2 == 0
                    ? s.substring(min - 1, min + 1)
                    : s.substring(min, min + 1);
        }
    }
}
