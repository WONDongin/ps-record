package level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class No10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        int[] arr = new int[2];
        arr[0] = a;
        arr[1] = b;
        Arrays.sort(arr);

        int sum = 0;
        for(int i = arr[0]; i <= arr[1]; i++){
            sum += i;
        }

        System.out.println(sum);
    }
}
