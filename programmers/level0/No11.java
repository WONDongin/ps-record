package level0;

import java.util.Scanner;
// 문제 : 자연수 n이 입력으로 주어졌을 때 만약 n이 짝수이면 "n is even"을, 홀수이면 "n is odd"를 출력하는 코드를 작성해 보세요.
public class No11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n % 2 == 0 ){
            System.out.println(n + " is even");
        } else {
            System.out.println(n + " is odd");
        }
        // System.out.println(n + "is" +  (n % 2 == 0 ? "even" : "odd"));
    }
}
