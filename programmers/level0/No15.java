package level0;
// 문제 : 문자열 겹쳐쓰기
/*
예제 1번의 my_string에서 인덱스 2부터
overwrite_string의 길이만큼에 해당하는 부분은
"11oWor1"이고 이를 "lloWorl"로 바꾼
"HelloWorld"를 return 합니다.
*/
public class No15 {
    public static void main(String[] args) {
        Solution answer = new Solution();
        System.out.println(answer);
    }
}
class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = my_string.substring(0, s)
                + overwrite_string
                + my_string.substring(s + overwrite_string.length());
        return answer;
    }
}
/*
class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        // 1. 원래 문자열을 char 배열로 변환
        char[] my_chars = my_string.toCharArray();

        // 2. 덮어쓸 문자열도 char 배열로 변환
        char[] overwrite_chars = overwrite_string.toCharArray();

        // 3. 덮어쓸 위치(s)부터 overwrite_string의 길이만큼 반복
        for (int i = 0; i < overwrite_chars.length; i++) {
            my_chars[s + i] = overwrite_chars[i];  // 기존 문자 교체
        }

        // 4. 수정된 char 배열을 다시 문자열로 변환하여 반환
        return String.valueOf(my_chars);
    }
}
*/