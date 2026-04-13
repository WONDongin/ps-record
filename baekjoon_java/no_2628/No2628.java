package no_2628;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

/*
문제-2628 (실버5): 종이자르기
- 가로 M, 세로 N 크기의 종이가 주어진다
- 여러 번 가로(0), 세로(1)로 자른다
- 가장 큰 직사각형 조각의 넓이를 구하는 문제

접근 방법
- 가로/세로 자르는 위치를 각각 따로 저장
- 시작점(0)과 끝점(전체 길이)도 포함
- 정렬 후 인접한 값 차이를 통해 조각 길이 계산

핵심 아이디어
- 자른 위치들을 기준으로 "구간 길이"가 만들어짐
- 가장 큰 조각 = (최대 가로 길이) × (최대 세로 길이)
- 정렬 후 인접 차이의 최댓값을 찾으면 해결

처리 흐름
- 입력
- 가로선 리스트 / 세로선 리스트 생성
- 0과 끝값 추가
- 각각 정렬
- 인접 차이로 최대 길이 계산
- 결과 = maxWidth * maxHeight 출력
*/
public class No2628 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int width = Integer.parseInt(st.nextToken());   // 가로
        int height = Integer.parseInt(st.nextToken());  // 세로

        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer> row = new ArrayList<>(); // 가로 자르기 (세로 길이)
        ArrayList<Integer> col = new ArrayList<>(); // 세로 자르기 (가로 길이)

        // 시작점, 끝점 추가
        row.add(0);
        row.add(height);
        col.add(0);
        col.add(width);

        for(int i = 0; i < N; i++){
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int type = Integer.parseInt(st1.nextToken());
            int pos = Integer.parseInt(st1.nextToken());

            if(type == 0){
                row.add(pos);
            } else {
                col.add(pos);
            }
        }

        Collections.sort(row);
        Collections.sort(col);

        int maxHeight = 0;
        int maxWidth = 0;

        // 세로 조각 최대
        for(int i = 1; i < row.size(); i++){
            maxHeight = Math.max(maxHeight, row.get(i) - row.get(i - 1));
        }

        // 가로 조각 최대
        for(int i = 1; i < col.size(); i++){
            maxWidth = Math.max(maxWidth, col.get(i) - col.get(i - 1));
        }

        System.out.println(maxWidth * maxHeight);
    }
}
