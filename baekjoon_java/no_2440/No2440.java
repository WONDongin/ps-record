package no_2440;
/*
문제-2440 (브론즈4): 별찍기-3

*****
****
***
**
*
*/
public class No2440 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 입력받은 줄 수만큼 별 출력

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // 줄 바꿈
        }

        sc.close();
    }
}
