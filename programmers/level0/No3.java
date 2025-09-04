package level0;
/*
문제 : 정수 num1, num2가 매개변수 주어집니다.
num1과 num2를 곱한 값을 return 하도록 solution 함수를 완성해주세요.

제한사항 : 0 ≤ num1 ≤ 100, 0 ≤ num2 ≤ 100
*/
public class No3 {
    public int solution(int num1, int num2) {
        int answer = 0;
        if(0<=num1 && 100>=num1 && 0<=num2 && 100>=num2){
            answer = num1 * num2;
        }
        return answer;
    }
}
