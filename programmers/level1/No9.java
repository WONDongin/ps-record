package level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
/*
문제 : 정수 내림차순으로 배치하기
- 입력된 숫자를 자릿수 기준으로 내림차순 정렬하여 출력하는 프로그램
- ex) 2143 → 4321

`toCharArray()` : 문자열을 문자 배열로 변환하여 각 자릿수에 접근 가능하게 처리
`Arrays.sort()` : 자릿수를 오름차순 정렬
*/
public class No9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        char[] arr = n.toCharArray();
        Arrays.sort(arr);

        for(int i = arr.length - 1; i >= 0; i--){
            System.out.print(arr[i]);
        }
    }
}
