package no_16435;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
/*
문제-16435 (실버5): 스네이크버드
- 과일 높이 배열이 주어짐
- 초기 길이 L에서 시작
- 길이 >= 과일 높이일 때만 먹을 수 있음
- 먹으면 길이 +1 증가
- 최대 길이를 출력

접근 방법
- 과일을 낮은 높이부터 먹어야 유리
- 따라서 배열을 오름차순 정렬
- 작은 과일부터 순차적으로 확인

핵심 아이디어
- 현재 길이 >= 과일 높이이면 먹고 길이 증가
- 한 번 못 먹으면 이후 과일도 모두 못 먹음
- 그리디(Greedy) 방식 적용

처리 흐름
- 입력
- 과일 배열 정렬
- 앞에서부터 순회
    → 먹을 수 있으면 길이 증가
    → 못 먹으면 종료
- 최종 길이 출력
*/
public class No16435 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st1.nextToken());
        }
        Arrays.sort(arr);

        for(int i = 0; i < N; i++){
            if(arr[i] <= L){
                L++;
            }else {
                break;
            }
        }
        System.out.println(L);
    }

}
