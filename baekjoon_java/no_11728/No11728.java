package no_11728;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
문제-11728: 배열 합치기
- 정렬된 두 배열 A와 B가 주어질 때 두 배열을 합쳐 정렬된 상태로 출력하는 문제.

주요 메서드
- Two Pointer 방식으로 두 배열을 병합(Merge)

주요 알고리즘
- Merge (투포인터)
- 두 배열의 현재 값을 비교하면서 작은 값을 결과에 추가

탐색/처리 흐름
1. 배열 A, B의 크기를 입력받고 각각의 배열 생성
2. 두 배열의 값을 입력받아 저장
3. 포인터 i(A), j(B)를 0으로 초기화
4. while(i < A.length && j < B.length)
   → A[i]와 B[j] 비교
   → 더 작은 값을 StringBuilder에 추가
   → 해당 포인터 증가
5. 한 배열이 끝나면
   → 남은 배열 요소들을 모두 추가
6. StringBuilder에 저장된 결과를 한번에 출력

핵심 포인트
- 이미 정렬된 배열이기 때문에 Arrays.sort()가 필요 없음
- Merge 방식으로 O(A + B)에 해결 가능
- 출력이 많기 때문에 StringBuilder 사용
*/
public class No11728 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] A = new int[Integer.parseInt(st.nextToken())];
        int[] B = new int[Integer.parseInt(st.nextToken())];

        StringTokenizer st1 = new StringTokenizer(br.readLine());

        for(int i = 0; i < A.length; i++){
            A[i] = Integer.parseInt(st1.nextToken());
        }

        StringTokenizer st2 = new StringTokenizer(br.readLine());

        for(int j = 0; j < B.length; j++){
            B[j] = Integer.parseInt(st2.nextToken());
        }

        StringBuilder sb = new StringBuilder();

        int i = 0;
        int j = 0;

        while(i < A.length && j < B.length){
            if(A[i] <= B[j]){
                sb.append(A[i++]).append(" ");
            }else{
                sb.append(B[j++]).append(" ");
            }
        }

        while(i < A.length){
            sb.append(A[i++]).append(" ");
        }

        while(j < B.length){
            sb.append(B[j++]).append(" ");
        }

        System.out.print(sb);
    }
}