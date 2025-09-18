package level0;
// 문제 : 문자열 곱하기
// 문자열 my_string과 정수 k가 주어질 때, my_string을 k번 반복한 문자열을 return 하는 solution 함수를 작성
public class No14 {
    public String solution(String my_string, int k) {
        StringBuilder answer = new StringBuilder();

        for(int i = 0; i < k; i++){
            answer.append(my_string);
        }

        return answer.toString();
        //  return my_string.repeat(k);
    }
}
