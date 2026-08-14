package level0;
import java.util.Arrays;
/*
문제: 배열에서 문자열 대소문자 변환하기

로직
- strArr의 각 문자열을 순서대로 확인한다.
- "ad"라는 부분 문자열을 포함한 문자열을 제외한다.
- 남은 문자열을 기존 순서대로 배열에 저장하여 반환한다.

핵심 구현
- Arrays.stream(strArr)로 배열을 Stream으로 변환한다.
- filter(str -> !str.contains("ad"))로 "ad"가 없는 문자열만 남긴다.
- toArray(String[]::new)로 String 배열을 생성한다.

포인트
- contains("ad")는 문자열에 "ad"가 연속해서 포함되어 있는지 확인한다.
- 앞에 !를 붙이면 "ad"를 포함하지 않는 문자열만 선택할 수 있다.
- Stream의 filter()는 기존 요소의 순서를 유지한다.

회고
- filter()와 contains()를 활용하여 특정 부분 문자열을 포함한
  요소를 간결하게 제거할 수 있었다.
*/
public class No131 {
    class Solution {
        public String[] solution(String[] strArr) {
            return Arrays.stream(strArr)
                    .filter(str -> !str.contains("ad"))
                    .toArray(String[]::new);
        }
    }
}
