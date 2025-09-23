package no_5597;

import java.util.Scanner;
// 문제 : 과제 안 내신분?
// 출력 : 출력은 2줄이다. 1번째 줄엔 제출하지 않은 학생의 출석번호 중 가장 작은 것을 출력하고, 2번째 줄에선 그 다음 출석번호를 출력한다.
public class No5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1~30까지
        boolean[] submitted = new boolean[31];

        // 제출한 번호체크
        for(int i = 0; i < 28; i++){
            int num = sc.nextInt();
            submitted[num] = true;
        }
        // 제출 안 한 학생 찾기
        for(int i = 1; i <= 30; i++){
            if(!submitted[i]){
                System.out.println(i);
            }
        }
    }
}