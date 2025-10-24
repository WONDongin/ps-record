package no_11723;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/*
문제 (실버5) : 집합

명령어 종류:
1️. add x    : 집합 S에 x 추가 (이미 있으면 무시)
2️. remove x : 집합 S에서 x 제거 (없으면 무시)
3️. check x  : S에 x가 있으면 1, 없으면 0 출력
4️. toggle x : S에 x가 있으면 제거, 없으면 추가
5. all      : S를 {1, 2, ..., 20}으로 설정
6.️ empty    : S를 공집합으로 설정

구현 포인트:
- Set<Integer>를 사용하여 중복 자동 관리
- StringBuilder로 출력 성능 최적화
*/
public class No11723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int M = Integer.parseInt(br.readLine());
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < M; i++) {
            String[] command = br.readLine().split(" ");

            switch (command[0]) {
                case "add":
                    set.add(Integer.parseInt(command[1]));
                    break;
                case "remove":
                    set.remove(Integer.parseInt(command[1]));
                    break;
                case "check":
                    sb.append(set.contains(Integer.parseInt(command[1])) ? "1\n" : "0\n");
                    break;
                case "toggle":
                    int x = Integer.parseInt(command[1]);
                    if (set.contains(x)) set.remove(x);
                    else set.add(x);
                    break;
                case "all":
                    set.clear();
                    for (int j = 1; j <= 20; j++) {
                        set.add(j);
                    }
                    break;
                case "empty":
                    set.clear();
                    break;
            }
        }
        System.out.print(sb);
    }
}
