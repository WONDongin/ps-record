package no_11931;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
/*
문제-11931 (실버5): 수 정렬하기 4
- N개의 정수가 주어진다
- 이를 내림차순으로 정렬하여 출력

접근 방법
- 배열에 입력값 저장
- Arrays.sort()로 오름차순 정렬
- 뒤에서부터 출력하여 내림차순 구현

핵심 아이디어
- 기본형 int 배열은 Comparator 사용 불가
- 대신 오름차순 정렬 후 역순 출력으로 해결
- 불필요한 객체 생성 없이 성능 최적화 가능

처리 흐름
- 입력
- int 배열 저장
- Arrays.sort() 오름차순 정렬
- 뒤에서부터 순회 (N-1 → 0)
- 출력
*/
public class No11931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();

        for(int i = N - 1 ; i >= 0; i--){
            sb.append(arr[i]).append("\n");
        }

        System.out.println(sb);
    }
}
