package level0;
/*
문제: 모음 제거

로직
- 문자열을 처음부터 끝까지 순회한다.
- 현재 문자가 모음(a, e, i, o, u)인지 확인한다.
- 모음이 아니면 StringBuilder에 추가한다.
- 완성된 문자열을 반환한다.

핵심 구현
- 핵심 코드
  ex) char c = my_string.charAt(i);
- 문자열을 한 글자씩 꺼내 모음 여부를 검사한다.
- 핵심 코드
  ex) if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
- 현재 문자가 모음이면 추가하지 않고 건너뛴다.
- 핵심 코드
  ex) sb.append(c);
- 자음과 공백 등 모음이 아닌 문자만 StringBuilder에 추가한다.

포인트
- 문자열을 직접 수정할 수 없으므로 StringBuilder를 사용해 새로운 문자열을 만든다.
- 모음만 제외하고 나머지 문자는 그대로 유지한다.
- StringBuilder를 사용하면 문자열을 반복해서 이어 붙이는 것보다 효율적이다.

회고
- 문자열을 한 글자씩 순회하며 조건에 맞는 문자만 저장하는 방법을 익힐 수 있었다.
- StringBuilder를 활용하면 문자열 가공 문제를 간결하고 효율적으로 해결할 수 있었다.
*/
public class No56 {
    public static void main(String[] args) {
        String my_string = "nice to meet you";
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < my_string.length(); i++){
            char c = my_string.charAt(i);

            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                sb.append("");
            } else {
                sb.append(c);
            }
        }

        System.out.println(sb);
        // answer = my_string.replaceAll("[aeiou]", "");
    }
}
