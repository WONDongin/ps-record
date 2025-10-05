package level1;

import java.util.Arrays;
// 문제 : 평균 구하기
// 정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution
public class No2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        double result = solution(arr);
        System.out.println(result);
    }
    public static double solution(int[] arr) {
        // 배열의 평균을 계산, 값이 없을 경우 기본값 0 반환
        double answer = Arrays.stream(arr).average().orElse(0);
        return answer;
    }
}
