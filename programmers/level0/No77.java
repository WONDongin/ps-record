package level0;
/*
문제: 문자열의 앞의 n글자

로직
- 문자열의 앞에서부터 n개의 문자를 순회한다.
- StringBuilder에 문자를 추가한다.
- 완성된 문자열을 반환한다.

핵심 구현
- for문으로 0 ~ n-1까지 문자 추가

포인트
- charAt()으로 문자 접근
- StringBuilder로 문자열 생성

회고
- 문자열의 일부를 추출하는 기본적인 방법을 익혔다.
*/
public class No77 {
    public static void main(String[] args) {
        String my_string = "ProgrammerS123";
        int n = 11;
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++){
            sb.append(my_string.charAt(i));
        }

        System.out.println(sb);
    }
}
