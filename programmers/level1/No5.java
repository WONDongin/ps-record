package level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
문제 : 핸드폰 번호 가리기

[정규식(Regex) 기반 마스킹 (가독성 + 다양한 포맷 대응)]
public static String maskPhone(String phone) {
    if (phone == null) return "";
    return phone.replaceAll("(\\d{3})\\d{3,4}(\\d{4})", "$1****$2");
}

[자바 11 +]
"*".repeat(len - 4) + phone_number.substring(len - 4)
- 앞부분 len-4개를 *로 채우고, 뒷 4자리를 그대로 붙인다.
*/
public class No5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String phone_number = br.readLine();
//        StringBuilder sb = new StringBuilder();
//        int len = phone_number.length();
//        // 앞부분 마스킹
//        for(int i = 0; i < len - 4; i++){
//            sb.append("*");
//        }
//        // 뒷 4자리 그대로 추가
//        sb.append(phone_number.substring(len - 4));
//        // 출력
//        System.out.println(sb);
          System.out.println(maskPhone(phone_number));
    }

    public static String maskPhone(String phone) {
        if (phone == null || phone.length() < 4) {
            return phone;
        }
        int len = phone.length();
        return "*".repeat(len - 4) + phone.substring(len - 4);
    }
}
