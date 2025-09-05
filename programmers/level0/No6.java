package level0;
/*
문제 : 주어진 초기 코드는 변수에 데이터를 저장하고 출력하는 코드입니다.
아래와 같이 출력되도록 빈칸을 채워 코드를 완성해 주세요.

출력 예시 :
Spring is beginning
13
310
*/
public class No6 {
    public static void main(String[] args) {
        String msg = "Spring is beginning";
        int val1 = 3;
        // msg.split(" ").length; 참신한 방법..:D
        String val2 ="3";
        // String.valueOf(val1);

        System.out.println(msg);
        System.out.println(val1 + 10);
        System.out.println(val2 + "10");
    }
}
