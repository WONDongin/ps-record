package level1;

import java.util.Arrays;
import java.util.Collections;

/*
문제-문자열 내림차순으로 배치하기

[문제 요약]

문자열의 문자를 내림차순으로 정렬하는 문제
대문자는 소문자보다 작은 것으로 처리
즉, 아스키(유니코드) 기준 내림차순 정렬

[접근 방법]

문자열을 split("")으로 문자 배열처럼 분리
Arrays.sort + Collections.reverseOrder() 사용
정렬된 문자열을 다시 합쳐 반환

[핵심 아이디어]

문자열 자체는 정렬 불가능
→ 배열(String[])로 변환 후 정렬 필요
reverseOrder()는 객체 타입만 가능
→ char[] 불가능
→ String[] 사용

[처리 흐름]
문자열 분리
→ 내림차순 정렬
→ StringBuilder로 합치기
→ 출력

[시간복잡도]

O(N log N)
(정렬 사용)
*/
public class No27 {
    public static void main(String[] args) {
        String s = "Zbcdefg";
        String[] arr = s.split("");

        Arrays.sort(arr, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();

        for(String str : arr){
            sb.append(str);
        }

        System.out.println(sb);
    }
}
