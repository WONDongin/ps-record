package no_5635;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
/*
문제-5635 (실버5): 생일
- N명의 이름과 생년월일이 주어진다
- 가장 나이가 많은 사람과 가장 어린 사람을 출력

접근 방법
- 사람 정보를 객체(Person)로 관리
- 생년월일 기준으로 정렬 수행
- 정렬 결과에서
  - 첫 번째 → 가장 나이 많은 사람
  - 마지막 → 가장 어린 사람

핵심 아이디어
- 나이 비교는 **년 → 월 → 일 순서로 비교**
- 오래된 날짜일수록 나이가 많음
- 정렬 후 인덱스로 바로 해결 가능

처리 흐름
- 입력
- Person 객체 배열 저장
- 생년월일 기준 정렬 (년 → 월 → 일)
- arr[0] = 가장 나이 많은 사람
- arr[N-1] = 가장 어린 사람
- 출력
*/

public class No5635 {
    static class Person {
        String name;
        int d, m, y;

        public Person (String name, int d, int m, int y){
            this.name = name;
            this.d = d;
            this.m = m;
            this.y = y;
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Person[] arr = new Person[N];

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int d = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            arr[i] = new Person(name, d, m, y);
        }

        Arrays.sort(arr, (a, b) -> {
            if(a.y != b.y) return a.y - b.y;
            if(a.m != b.m) return a.m - b.m;
            return a.d - b.d;
        });

        System.out.println(arr[N-1].name); // youngest
        System.out.println(arr[0].name);   // oldest
    }
}
