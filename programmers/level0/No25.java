package level0;
// 문제 : 정수 num1, num2가 매개변수로 주어질 때, num1을 num2로 나눈 몫/나머지 값을 return 하도록 solution 함수를 완성
public class No25 {
    public int solution(int num1, int num2) {
        int answer = num1 / num2;
        int answer2 = num1 % num2;
        return answer;
    }
}