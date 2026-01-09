package no_18108;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
문제-18108 (브론즈5): 1998년생인 내가 태국에서는 2541년생?!
- 불기 연도를 서기 연도로 변환한 결과를 출력

주요 알고리즘

1. 불기 연도 입력
2. 불기 연도 - 543 계산

- 시간 복잡도: O(1)
- 공간 복잡도: O(1)
*/
public class No18108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 불기 연도 입력
        int year = Integer.parseInt(br.readLine());
        // 서기 연도로 변환 후 출력
        System.out.println(year - 543);
    }
}
