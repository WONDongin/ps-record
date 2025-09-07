package level0;

import java.util.Scanner;

public class No8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";

        for(int i=0; i < a.length(); i++){
            char c = a.charAt(i);

            if(Character.isUpperCase(c)){
                answer += Character.toLowerCase(c);
            }else {
                answer += Character.toUpperCase(c);
            }
        }
        System.out.println(answer);
    }
}
