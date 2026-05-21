package level1;
/*
문제-12930: 이상한 문자 만들기

[문제 요약]
- 문자열의 각 단어를 기준으로
  짝수 인덱스는 대문자,
  홀수 인덱스는 소문자로 변환하는 문제

[접근 방법]
- 문자열을 한 글자씩 순회
- 공백을 만나면 단어 인덱스를 0으로 초기화
- 공백이 아닐 경우:
  - 짝수 인덱스 → 대문자 변환
  - 홀수 인덱스 → 소문자 변환

[핵심 아이디어]
- 문자열 전체 기준이 아니라
  "단어별 인덱스" 기준으로 처리해야 함
- 공백이 나오면 index를 다시 0으로 초기화하는 것이 핵심
- StringBuilder를 사용해 문자열을 효율적으로 생성

[처리 흐름]
문자 순회
→ 공백 확인
→ 공백이면 index 초기화
→ 짝/홀 인덱스 판별
→ 대소문자 변환
→ 결과 문자열 저장

[시간복잡도]
- O(N)
  (문자열 전체를 한 번만 순회)
*/
public class No37 {
    public static void main(String[] args) {
        String s = "try hello world";
        int index = 0;
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++){

            if(s.charAt(i) == ' '){
                sb.append(" ");
                index = 0;
            } else if(index % 2 == 0){
                sb.append(Character.toUpperCase(s.charAt(i)));
                index++;
            } else {
                sb.append(Character.toLowerCase(s.charAt(i)));
                index++;
            }
        }

        System.out.println(sb);
    }
}
